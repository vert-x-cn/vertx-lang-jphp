package io.vertx.php.core.dns.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.dns.DnsClient;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("DnsClientImpl")
@Namespace("io\\vertx\\php\\core\\dns\\impl")
public class DnsClientImpl extends VertxGenWrapper<io.vertx.core.dns.DnsClient> implements DnsClient<io.vertx.core.dns.DnsClient>{
    
    public DnsClientImpl(Environment env, io.vertx.core.dns.DnsClient wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory lookup(Environment __env__, Memory... args) {
        this.getWrappedObject().lookup(name, handler)
    }

    @Signature
    public Memory lookup4(Environment __env__, Memory... args) {
        this.getWrappedObject().lookup4(name, handler)
    }

    @Signature
    public Memory lookup6(Environment __env__, Memory... args) {
        this.getWrappedObject().lookup6(name, handler)
    }

    @Signature
    public Memory resolveA(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveA(name, handler)
    }

    @Signature
    public Memory resolveAAAA(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveAAAA(name, handler)
    }

    @Signature
    public Memory resolveCNAME(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveCNAME(name, handler)
    }

    @Signature
    public Memory resolveMX(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveMX(name, handler)
    }

    @Signature
    public Memory resolveTXT(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveTXT(name, handler)
    }

    @Signature
    public Memory resolvePTR(Environment __env__, Memory... args) {
        this.getWrappedObject().resolvePTR(name, handler)
    }

    @Signature
    public Memory resolveNS(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveNS(name, handler)
    }

    @Signature
    public Memory resolveSRV(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveSRV(name, handler)
    }

    @Signature
    public Memory reverseLookup(Environment __env__, Memory... args) {
        this.getWrappedObject().reverseLookup(ipaddress, handler)
    }

}
