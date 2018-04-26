package io.vertx.lang.jphp;

import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.lang.jphp.wrapper.extension.AsyncHandler;
import io.vertx.lang.jphp.wrapper.extension.BaseThrowable;
import io.vertx.lang.jphp.wrapper.extension.Handler;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class VertxExtension extends Extension {
    private static final Logger logger = LoggerFactory.getLogger(VertxExtension.class);
    private static final List<Class> classList = new ArrayList<>();

    static {
        try {
            Properties properties = new Properties();
            Enumeration<URL> urls = VertxExtension.class.getClassLoader().getResources("jphp-vertx-extension.properties");
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                properties.clear();
                properties.load(url.openStream());
                properties.forEach((key, value) -> {
                    try {
                        classList.add(Class.forName(value.toString()));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                });
            }
        } catch (IOException e) {
            logger.error("vertx extension load fail!", e);
        }
    }

    @Override
    public Status getStatus() {
        return Status.BETA;
    }

    @Override
    public void onRegister(CompileScope scope) {
        registerClass(scope, AsyncHandler.class);
        registerClass(scope, Handler.class);
        registerClass(scope, BaseThrowable.class);
        for (Class clazz : classList) {
            registerClass(scope, clazz);
        }
    }
}
