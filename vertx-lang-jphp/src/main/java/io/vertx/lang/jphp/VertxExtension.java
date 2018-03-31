package io.vertx.lang.jphp;

import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class VertxExtension extends Extension {
    @Override
    public Status getStatus() {
        return Status.BETA;
    }

    @Override
    public void onRegister(CompileScope scope) {
        InputStream s = getClass().getClassLoader().getResourceAsStream("jphp-vertx-extension.properties");
        Properties properties = new Properties();
        try {
            properties.load(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        properties.forEach((key, value) -> {
            try {
                registerClass(scope, Class.forName(value.toString()));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });
    }
}
