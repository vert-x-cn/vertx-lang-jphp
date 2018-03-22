package io.vertx.php.core.dns;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.dns.MxRecord;
import io.vertx.php.core.dns.SrvRecord;
@Name("DnsClient")
@Namespace("io\\vertx\\php\\core\\dns")
public interface DnsClient<S extends io.vertx.core.dns.DnsClient> extends IWrapper<S>{

    @Signature
    default Memory lookup(Environment __env__, Memory... args) {
        this.getWrappedObject().lookup(name, handler)
    }

    @Signature
    default Memory lookup4(Environment __env__, Memory... args) {
        this.getWrappedObject().lookup4(name, handler)
    }

    @Signature
    default Memory lookup6(Environment __env__, Memory... args) {
        this.getWrappedObject().lookup6(name, handler)
    }

    @Signature
    default Memory resolveA(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveA(name, handler)
    }

    @Signature
    default Memory resolveAAAA(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveAAAA(name, handler)
    }

    @Signature
    default Memory resolveCNAME(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveCNAME(name, handler)
    }

    @Signature
    default Memory resolveMX(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveMX(name, handler)
    }

    @Signature
    default Memory resolveTXT(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveTXT(name, handler)
    }

    @Signature
    default Memory resolvePTR(Environment __env__, Memory... args) {
        this.getWrappedObject().resolvePTR(name, handler)
    }

    @Signature
    default Memory resolveNS(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveNS(name, handler)
    }

    @Signature
    default Memory resolveSRV(Environment __env__, Memory... args) {
        this.getWrappedObject().resolveSRV(name, handler)
    }

    @Signature
    default Memory reverseLookup(Environment __env__, Memory... args) {
        this.getWrappedObject().reverseLookup(ipaddress, handler)
    }

}
