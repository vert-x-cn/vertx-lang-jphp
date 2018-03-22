package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.FormLoginHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("FormLoginHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class FormLoginHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.FormLoginHandler> implements FormLoginHandler<io.vertx.ext.web.handler.FormLoginHandler>{
    
    public FormLoginHandlerImpl(Environment env, io.vertx.ext.web.handler.FormLoginHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FormLoginHandlerImpl::new, io.vertx.ext.web.handler.FormLoginHandler.create(authProvider)
    }

    @Signature
    public Memory setUsernameParam(Environment __env__, Memory... args) {
        this.getWrappedObject().setUsernameParam(usernameParam)
    }

    @Signature
    public Memory setPasswordParam(Environment __env__, Memory... args) {
        this.getWrappedObject().setPasswordParam(passwordParam)
    }

    @Signature
    public Memory setReturnURLParam(Environment __env__, Memory... args) {
        this.getWrappedObject().setReturnURLParam(returnURLParam)
    }

    @Signature
    public Memory setDirectLoggedInOKURL(Environment __env__, Memory... args) {
        this.getWrappedObject().setDirectLoggedInOKURL(directLoggedInOKURL)
    }

}
