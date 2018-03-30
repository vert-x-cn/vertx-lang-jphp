package io.vertx.php.ext.shell;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.php.ext.shell.term.HttpTermOptions;
import io.vertx.php.ext.shell.term.SSHTermOptions;
import io.vertx.php.ext.shell.term.TelnetTermOptions;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("ShellServiceOptions")
@Namespace("io\\vertx\\php\\ext\\shell")
//false
public  class ShellServiceOptions extends DataObjectWrapper<io.vertx.ext.shell.ShellServiceOptions> { 
    public ShellServiceOptions(Environment env, io.vertx.ext.shell.ShellServiceOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public ShellServiceOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.shell.ShellServiceOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.shell.ShellServiceOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public HttpTermOptions getHttpOptions(){ 
        return new HttpTermOptions(__env__, this.getWrappedObject().getHttpOptions());
    }

    @Signature
    public ShellServiceOptions setHttpOptions(HttpTermOptions httpOptions){ 
        this.getWrappedObject().setHttpOptions(httpOptions.getWrappedObject());
        return this;
    }

    @Signature
    public long getReaperInterval(){ 
        return this.getWrappedObject().getReaperInterval();
    }

    @Signature
    public ShellServiceOptions setReaperInterval(long reaperInterval){ 
        this.getWrappedObject().setReaperInterval(reaperInterval);
        return this;
    }

    @Signature
    public long getSessionTimeout(){ 
        return this.getWrappedObject().getSessionTimeout();
    }

    @Signature
    public ShellServiceOptions setSessionTimeout(long sessionTimeout){ 
        this.getWrappedObject().setSessionTimeout(sessionTimeout);
        return this;
    }

    @Signature
    public SSHTermOptions getSSHOptions(){ 
        return new SSHTermOptions(__env__, this.getWrappedObject().getSSHOptions());
    }

    @Signature
    public ShellServiceOptions setSSHOptions(SSHTermOptions sshOptions){ 
        this.getWrappedObject().setSSHOptions(sshOptions.getWrappedObject());
        return this;
    }

    @Signature
    public TelnetTermOptions getTelnetOptions(){ 
        return new TelnetTermOptions(__env__, this.getWrappedObject().getTelnetOptions());
    }

    @Signature
    public ShellServiceOptions setTelnetOptions(TelnetTermOptions telnetOptions){ 
        this.getWrappedObject().setTelnetOptions(telnetOptions.getWrappedObject());
        return this;
    }

    @Signature
    public String getWelcomeMessage(){ 
        return this.getWrappedObject().getWelcomeMessage();
    }

    @Signature
    public ShellServiceOptions setWelcomeMessage(String welcomeMessage){ 
        this.getWrappedObject().setWelcomeMessage(welcomeMessage);
        return this;
    }
}
