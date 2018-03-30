package io.vertx.php.ext.shell.term;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.php.core.net.JksOptions;
import io.vertx.php.core.net.PemKeyCertOptions;
import io.vertx.php.core.net.PfxOptions;
import io.vertx.php.ext.auth.AuthOptions;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("SSHTermOptions")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
//false
public  class SSHTermOptions extends DataObjectWrapper<io.vertx.ext.shell.term.SSHTermOptions> { 
    public SSHTermOptions(Environment env, io.vertx.ext.shell.term.SSHTermOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public SSHTermOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.shell.term.SSHTermOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.shell.term.SSHTermOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public AuthOptions getAuthOptions(){ 
        return new AuthOptions(__env__, this.getWrappedObject().getAuthOptions());
    }

    @Signature
    public String getDefaultCharset(){ 
        return this.getWrappedObject().getDefaultCharset();
    }

    @Signature
    public SSHTermOptions setDefaultCharset(String defaultCharset){ 
        this.getWrappedObject().setDefaultCharset(defaultCharset);
        return this;
    }

    @Signature
    public String getHost(){ 
        return this.getWrappedObject().getHost();
    }

    @Signature
    public SSHTermOptions setHost(String host){ 
        this.getWrappedObject().setHost(host);
        return this;
    }

    @Signature
    public String getIntputrc(){ 
        return this.getWrappedObject().getIntputrc();
    }

    @Signature
    public SSHTermOptions setIntputrc(String intputrc){ 
        this.getWrappedObject().setIntputrc(intputrc);
        return this;
    }

    @Signature
    public SSHTermOptions setKeyPairOptions(JksOptions keyPairOptions){ 
        this.getWrappedObject().setKeyPairOptions(keyPairOptions.getWrappedObject());
        return this;
    }

    @Signature
    public SSHTermOptions setPemKeyPairOptions(PemKeyCertOptions pemKeyPairOptions){ 
        this.getWrappedObject().setPemKeyPairOptions(pemKeyPairOptions.getWrappedObject());
        return this;
    }

    @Signature
    public SSHTermOptions setPfxKeyPairOptions(PfxOptions pfxKeyPairOptions){ 
        this.getWrappedObject().setPfxKeyPairOptions(pfxKeyPairOptions.getWrappedObject());
        return this;
    }

    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }

    @Signature
    public SSHTermOptions setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }
}
