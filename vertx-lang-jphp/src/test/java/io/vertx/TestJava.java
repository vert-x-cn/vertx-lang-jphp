package io.vertx;

import io.vertx.codegen.CodeGenProcessor;
import io.vertx.codegen.Compiler;
import io.vertx.docgen.DocGenProcessor;
import io.vertx.lang.php.PhpDocGenerator;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;

public class TestJava {
    @Rule
    public final TestName name = new TestName();

    private File testDir;

    @Before
    public void before() throws Exception {
        testDir = new File(new File("target").getAbsoluteFile(), "00");
//        int count = 0;
//        while (true) {
//            String suffix = "testgen_" + name.getMethodName();
//            if (count > 0) {
//                suffix += "-" + count;
//            }
//            count++;
//            testDir = new File(new File("target").getAbsoluteFile(), suffix);
//            if (!testDir.exists()) {
//                assertTrue(testDir.mkdir());
//                break;
//            }
//        }
    }

    private void assertCompile(String gen, Class... classes) throws Exception {
        Compiler compiler = new Compiler(new CodeGenProcessor());
//        Compiler compiler = new Compiler(new DocGenProcessor(new PhpDocGenerator()));
        compiler.addOption("-Acodegen.generators=" + gen);
        compiler.addOption("-Acodegen.output=" + testDir.getAbsolutePath());
        File[] fs = new File[]{
//                new File("src\\\\test\\\\java\\\\io\\\\vertx\\\\model\\\\TestApi.java"),
                new File("target\\sources\\vertx-core\\io\\vertx\\core\\Future.java"),
                new File("target\\sources\\vertx-core\\io\\vertx\\core\\Vertx.java"),
                new File("target\\sources\\vertx-core\\io\\vertx\\core\\CompositeFuture.java"),
                new File("target\\sources\\vertx-core\\io\\vertx\\core\\http\\HttpClient.java"),
        };
        Stream.of(fs).filter(r -> !r.exists()).map(File::getAbsolutePath).forEach(System.out::println);
//        File f1 = new File("target\\sources\\java\\io\\vertx\\core\\buffer\\Buffer.java");
//        File f2 = new File("target\\sources\\java\\io\\vertx\\core\\eventbus\\EventBus.java");
        boolean b = compiler.compile(fs);
        assertTrue(b);
//        File f = new File(testDir, classes[0].getName().replace('.', '_') + ".properties");
//        Properties props = new Properties();
//        props.load(new FileInputStream(f));
//        return props;
    }
    @Test
    public void test() throws Exception {
//        assertCompile("Php");
    }

}
