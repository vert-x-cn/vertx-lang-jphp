package io.vertx.lang.jphp;

import io.vertx.lang.jphp.wrapper.extension.AsyncHandler;
import io.vertx.lang.jphp.wrapper.extension.BaseThrowable;
import io.vertx.lang.jphp.wrapper.extension.Handler;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

public class VertxExtension extends Extension {
    @Override
    public Status getStatus() {
        return Status.BETA;
    }

    @Override
    public void onRegister(CompileScope scope) {
        registerClass(scope, AsyncHandler.class);
        registerClass(scope, Handler.class);
        registerClass(scope, BaseThrowable.class);
        InputStream s = getClass().getClassLoader().getResourceAsStream("jphp-vertx-extension.properties");
        Properties properties = new Properties();
        try {
            Enumeration<URL> urls = getClass().getClassLoader().getResources("jphp-vertx-extension.properties");
            while(urls.hasMoreElements()) {
                URL url = urls.nextElement();
                properties.clear();
                properties.load(new FileInputStream(url.getPath()));
                properties.forEach((key, value) -> {
                    try {
                        registerClass(scope, Class.forName(value.toString()));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                });
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
