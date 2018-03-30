package io.vertx.php.ext.mail;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.mail.LoginOption;
import io.vertx.ext.mail.StartTLSOptions;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("MailConfig")
@Namespace("io\\vertx\\php\\ext\\mail")
//false
public  class MailConfig extends DataObjectWrapper<io.vertx.ext.mail.MailConfig> { 
    public MailConfig(Environment env, io.vertx.ext.mail.MailConfig wrappedObject) {
        super(env, wrappedObject);
    }

    public MailConfig(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.mail.MailConfig();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.mail.MailConfig(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isAllowRcptErrors(){ 
        return this.getWrappedObject().isAllowRcptErrors();
    }

    @Signature
    public MailConfig setAllowRcptErrors(boolean allowRcptErrors){ 
        this.getWrappedObject().setAllowRcptErrors(allowRcptErrors);
        return this;
    }

    @Signature
    public String getAuthMethods(){ 
        return this.getWrappedObject().getAuthMethods();
    }

    @Signature
    public MailConfig setAuthMethods(String authMethods){ 
        this.getWrappedObject().setAuthMethods(authMethods);
        return this;
    }

    @Signature
    public boolean isDisableEsmtp(){ 
        return this.getWrappedObject().isDisableEsmtp();
    }

    @Signature
    public MailConfig setDisableEsmtp(boolean disableEsmtp){ 
        this.getWrappedObject().setDisableEsmtp(disableEsmtp);
        return this;
    }

    @Signature
    public String getHostname(){ 
        return this.getWrappedObject().getHostname();
    }

    @Signature
    public MailConfig setHostname(String hostname){ 
        this.getWrappedObject().setHostname(hostname);
        return this;
    }

    @Signature
    public boolean isKeepAlive(){ 
        return this.getWrappedObject().isKeepAlive();
    }

    @Signature
    public MailConfig setKeepAlive(boolean keepAlive){ 
        this.getWrappedObject().setKeepAlive(keepAlive);
        return this;
    }

    @Signature
    public String getKeyStore(){ 
        return this.getWrappedObject().getKeyStore();
    }

    @Signature
    public MailConfig setKeyStore(String keyStore){ 
        this.getWrappedObject().setKeyStore(keyStore);
        return this;
    }

    @Signature
    public String getKeyStorePassword(){ 
        return this.getWrappedObject().getKeyStorePassword();
    }

    @Signature
    public MailConfig setKeyStorePassword(String keyStorePassword){ 
        this.getWrappedObject().setKeyStorePassword(keyStorePassword);
        return this;
    }

    @Signature
    public LoginOption getLogin(){ 
        return this.getWrappedObject().getLogin();
    }

    @Signature
    public MailConfig setLogin(LoginOption login){ 
        this.getWrappedObject().setLogin(login);
        return this;
    }

    @Signature
    public int getMaxPoolSize(){ 
        return this.getWrappedObject().getMaxPoolSize();
    }

    @Signature
    public MailConfig setMaxPoolSize(int maxPoolSize){ 
        this.getWrappedObject().setMaxPoolSize(maxPoolSize);
        return this;
    }

    @Signature
    public String getOwnHostname(){ 
        return this.getWrappedObject().getOwnHostname();
    }

    @Signature
    public MailConfig setOwnHostname(String ownHostname){ 
        this.getWrappedObject().setOwnHostname(ownHostname);
        return this;
    }

    @Signature
    public String getPassword(){ 
        return this.getWrappedObject().getPassword();
    }

    @Signature
    public MailConfig setPassword(String password){ 
        this.getWrappedObject().setPassword(password);
        return this;
    }

    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }

    @Signature
    public MailConfig setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }

    @Signature
    public boolean isSsl(){ 
        return this.getWrappedObject().isSsl();
    }

    @Signature
    public MailConfig setSsl(boolean ssl){ 
        this.getWrappedObject().setSsl(ssl);
        return this;
    }

    @Signature
    public StartTLSOptions getStarttls(){ 
        return this.getWrappedObject().getStarttls();
    }

    @Signature
    public MailConfig setStarttls(StartTLSOptions starttls){ 
        this.getWrappedObject().setStarttls(starttls);
        return this;
    }

    @Signature
    public boolean isTrustAll(){ 
        return this.getWrappedObject().isTrustAll();
    }

    @Signature
    public MailConfig setTrustAll(boolean trustAll){ 
        this.getWrappedObject().setTrustAll(trustAll);
        return this;
    }

    @Signature
    public String getUsername(){ 
        return this.getWrappedObject().getUsername();
    }

    @Signature
    public MailConfig setUsername(String username){ 
        this.getWrappedObject().setUsername(username);
        return this;
    }
}
