package io.vertx.lang.jphp;

import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class VertxExtension extends Extension {
    @Override
    public Status getStatus() {
        return Status.BETA;
    }

    @Override
    public void onRegister(CompileScope scope) {

    }
}
