package io.vertx.php.ext.shell;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("ShellServerOptions")
@Namespace("io\\vertx\\php\\ext\\shell")
//false
public  class ShellServerOptions extends DataObjectWrapper<io.vertx.ext.shell.ShellServerOptions> { 
    public ShellServerOptions(Environment env, io.vertx.ext.shell.ShellServerOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public ShellServerOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.shell.ShellServerOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.shell.ShellServerOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getReaperInterval(){ 
        return this.getWrappedObject().getReaperInterval();
    }

    @Signature
    public ShellServerOptions setReaperInterval(long reaperInterval){ 
        this.getWrappedObject().setReaperInterval(reaperInterval);
        return this;
    }

    @Signature
    public long getSessionTimeout(){ 
        return this.getWrappedObject().getSessionTimeout();
    }

    @Signature
    public ShellServerOptions setSessionTimeout(long sessionTimeout){ 
        this.getWrappedObject().setSessionTimeout(sessionTimeout);
        return this;
    }

    @Signature
    public String getWelcomeMessage(){ 
        return this.getWrappedObject().getWelcomeMessage();
    }

    @Signature
    public ShellServerOptions setWelcomeMessage(String welcomeMessage){ 
        this.getWrappedObject().setWelcomeMessage(welcomeMessage);
        return this;
    }
}
