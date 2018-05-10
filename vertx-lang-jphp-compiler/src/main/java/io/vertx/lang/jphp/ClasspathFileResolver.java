package io.vertx.lang.jphp;


import io.vertx.core.Vertx;
import io.vertx.core.VertxException;
import io.vertx.core.file.impl.FileResolver;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@SuppressWarnings("ALL")
public class ClasspathFileResolver {

    private static List<String> sourceDirs = Arrays.asList("src/main/resources", "src/test/resources", "src/php");
    private static List<File> sourceDirFiles;
    private static boolean enabled;

    private static final String DEFAULT_CACHE_DIR_BASE = ".vertx";
    private static final String CACHE_DIR_BASE = System.getProperty(FileResolver.CACHE_DIR_BASE_PROP_NAME, DEFAULT_CACHE_DIR_BASE);
    private static File DEBUG_PHP_SOURCE_DIR = new File(CACHE_DIR_BASE, "debug-php");

    public static void init() {
        sourceDirFiles = new ArrayList<>(sourceDirs.size());
        for (String dir: sourceDirs) {
            File f = new File(dir);
            if (f.exists()) {
                enabled = true;
                sourceDirFiles.add(f);
            }
        }
        if (enabled) {
            if (DEBUG_PHP_SOURCE_DIR.exists()) {
                Vertx vertx = Vertx.vertx();
                CountDownLatch latch = new CountDownLatch(1);
                vertx.fileSystem().deleteRecursive(DEBUG_PHP_SOURCE_DIR.getAbsolutePath(), true, res -> {
                    if (res.failed()) {
                        res.cause().printStackTrace();
                    }
                    latch.countDown();
                });
                try {
                    latch.await(30, TimeUnit.SECONDS);
                } catch (InterruptedException ignore) {
                }
                vertx.close();
            } else {
                DEBUG_PHP_SOURCE_DIR.mkdirs();
            }
        }
    }

    public static String resolveFilename(String scriptName) {

        if (enabled) {
            // This is a hack to get Nashorn debugging working, as it doesn't work if the script is in the target directory
            // which it will be when running in the IDE as IntelliJ copies
            // src/main/resources and src/test/resources to target/classes during make!!

            // We assume that the JavaScript source is in one of the source dirs

            for (File sourceDir: sourceDirFiles) {
                File source = new File(sourceDir, scriptName);
                if (source.exists()) {
                    return source.getPath();
                }
            }

            // Maybe source file is in a jar?
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            cl = cl == null ? ClasspathFileResolver.class.getClassLoader() : cl;

            URL url = cl.getResource(scriptName);
            if (url != null) {
                try {
                    URI uri = url.toURI();
                    if (uri.getScheme().equals("jar")) {

                        File target = new File(DEBUG_PHP_SOURCE_DIR, scriptName);
                        if (!target.exists()) {
                            target.getParentFile().mkdirs();
                            Path path = target.toPath();
                            try (InputStream is = url.openStream()) {
                                Files.copy(is, path);
                            }
                        }

                        return target.getPath();
                    }
                } catch (Exception e) {
                    throw new VertxException(e);
                }
            }

            return null;
        } else {
            return null;
        }
    }
}
