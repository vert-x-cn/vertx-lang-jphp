package io.vertx.php.ext.dropwizard;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import java.util.stream.Collectors;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("DropwizardMetricsOptions")
@Namespace("io\\vertx\\php\\ext\\dropwizard")
//false
public  class DropwizardMetricsOptions extends DataObjectWrapper<io.vertx.ext.dropwizard.DropwizardMetricsOptions> { 
    public DropwizardMetricsOptions(Environment env, io.vertx.ext.dropwizard.DropwizardMetricsOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public DropwizardMetricsOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.dropwizard.DropwizardMetricsOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.dropwizard.DropwizardMetricsOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getBaseName(){ 
        return this.getWrappedObject().getBaseName();
    }

    @Signature
    public DropwizardMetricsOptions setBaseName(String baseName){ 
        this.getWrappedObject().setBaseName(baseName);
        return this;
    }

    @Signature
    public String getConfigPath(){ 
        return this.getWrappedObject().getConfigPath();
    }

    @Signature
    public DropwizardMetricsOptions setConfigPath(String configPath){ 
        this.getWrappedObject().setConfigPath(configPath);
        return this;
    }

    @Signature
    public boolean isEnabled(){ 
        return this.getWrappedObject().isEnabled();
    }

    @Signature
    public DropwizardMetricsOptions setEnabled(boolean enabled){ 
        this.getWrappedObject().setEnabled(enabled);
        return this;
    }

    @Signature
    public String getJmxDomain(){ 
        return this.getWrappedObject().getJmxDomain();
    }

    @Signature
    public DropwizardMetricsOptions setJmxDomain(String jmxDomain){ 
        this.getWrappedObject().setJmxDomain(jmxDomain);
        return this;
    }

    @Signature
    public boolean isJmxEnabled(){ 
        return this.getWrappedObject().isJmxEnabled();
    }

    @Signature
    public DropwizardMetricsOptions setJmxEnabled(boolean jmxEnabled){ 
        this.getWrappedObject().setJmxEnabled(jmxEnabled);
        return this;
    }

    @Signature
    public DropwizardMetricsOptions addMonitoredEventBusHandler(io.vertx.ext.dropwizard.Match monitoredEventBusHandlers){ 
        this.getWrappedObject().addMonitoredEventBusHandler(monitoredEventBusHandlers);
        return this;
    }

    @Signature
    public List<Match> getMonitoredEventBusHandlers(){ 
        return this.getWrappedObject().getMonitoredEventBusHandlers().stream().map(v -> new Match(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public List<Match> getMonitoredHttpClientEndpoint(){ 
        return this.getWrappedObject().getMonitoredHttpClientEndpoint().stream().map(v -> new Match(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public DropwizardMetricsOptions addMonitoredHttpClientEndpoint(io.vertx.ext.dropwizard.Match monitoredHttpClientEndpoints){ 
        this.getWrappedObject().addMonitoredHttpClientEndpoint(monitoredHttpClientEndpoints);
        return this;
    }

    @Signature
    public DropwizardMetricsOptions addMonitoredHttpClientUri(io.vertx.ext.dropwizard.Match monitoredHttpClientUris){ 
        this.getWrappedObject().addMonitoredHttpClientUri(monitoredHttpClientUris);
        return this;
    }

    @Signature
    public List<Match> getMonitoredHttpClientUris(){ 
        return this.getWrappedObject().getMonitoredHttpClientUris().stream().map(v -> new Match(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public DropwizardMetricsOptions addMonitoredHttpServerUri(io.vertx.ext.dropwizard.Match monitoredHttpServerUris){ 
        this.getWrappedObject().addMonitoredHttpServerUri(monitoredHttpServerUris);
        return this;
    }

    @Signature
    public List<Match> getMonitoredHttpServerUris(){ 
        return this.getWrappedObject().getMonitoredHttpServerUris().stream().map(v -> new Match(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public String getRegistryName(){ 
        return this.getWrappedObject().getRegistryName();
    }

    @Signature
    public DropwizardMetricsOptions setRegistryName(String registryName){ 
        this.getWrappedObject().setRegistryName(registryName);
        return this;
    }
}
