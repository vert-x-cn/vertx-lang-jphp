package io.vertx.php.ext.consul.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.consul.ConsulClient;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ConsulClientImpl")
@Namespace("io\\vertx\\php\\ext\\consul\\impl")
public class ConsulClientImpl extends VertxGenWrapper<io.vertx.ext.consul.ConsulClient> implements ConsulClient<io.vertx.ext.consul.ConsulClient>{
    
    public ConsulClientImpl(Environment env, io.vertx.ext.consul.ConsulClient wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ConsulClientImpl::new, io.vertx.ext.consul.ConsulClient.create(vertx)
    }

    @Signature
    public Memory agentInfo(Environment __env__, Memory... args) {
        this.getWrappedObject().agentInfo(resultHandler)
    }

    @Signature
    public Memory coordinateNodes(Environment __env__, Memory... args) {
        this.getWrappedObject().coordinateNodes(resultHandler)
    }

    @Signature
    public Memory coordinateNodesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().coordinateNodesWithOptions(options, resultHandler)
    }

    @Signature
    public Memory coordinateDatacenters(Environment __env__, Memory... args) {
        this.getWrappedObject().coordinateDatacenters(resultHandler)
    }

    @Signature
    public Memory getKeys(Environment __env__, Memory... args) {
        this.getWrappedObject().getKeys(keyPrefix, resultHandler)
    }

    @Signature
    public Memory getKeysWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().getKeysWithOptions(keyPrefix, options, resultHandler)
    }

    @Signature
    public Memory getValue(Environment __env__, Memory... args) {
        this.getWrappedObject().getValue(key, resultHandler)
    }

    @Signature
    public Memory getValueWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().getValueWithOptions(key, options, resultHandler)
    }

    @Signature
    public Memory deleteValue(Environment __env__, Memory... args) {
        this.getWrappedObject().deleteValue(key, resultHandler)
    }

    @Signature
    public Memory getValues(Environment __env__, Memory... args) {
        this.getWrappedObject().getValues(keyPrefix, resultHandler)
    }

    @Signature
    public Memory getValuesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().getValuesWithOptions(keyPrefix, options, resultHandler)
    }

    @Signature
    public Memory deleteValues(Environment __env__, Memory... args) {
        this.getWrappedObject().deleteValues(keyPrefix, resultHandler)
    }

    @Signature
    public Memory putValue(Environment __env__, Memory... args) {
        this.getWrappedObject().putValue(key, value, resultHandler)
    }

    @Signature
    public Memory putValueWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().putValueWithOptions(key, value, options, resultHandler)
    }

    @Signature
    public Memory transaction(Environment __env__, Memory... args) {
        this.getWrappedObject().transaction(request, resultHandler)
    }

    @Signature
    public Memory createAclToken(Environment __env__, Memory... args) {
        this.getWrappedObject().createAclToken(token, idHandler)
    }

    @Signature
    public Memory updateAclToken(Environment __env__, Memory... args) {
        this.getWrappedObject().updateAclToken(token, idHandler)
    }

    @Signature
    public Memory cloneAclToken(Environment __env__, Memory... args) {
        this.getWrappedObject().cloneAclToken(id, idHandler)
    }

    @Signature
    public Memory listAclTokens(Environment __env__, Memory... args) {
        this.getWrappedObject().listAclTokens(resultHandler)
    }

    @Signature
    public Memory infoAclToken(Environment __env__, Memory... args) {
        this.getWrappedObject().infoAclToken(id, tokenHandler)
    }

    @Signature
    public Memory destroyAclToken(Environment __env__, Memory... args) {
        this.getWrappedObject().destroyAclToken(id, resultHandler)
    }

    @Signature
    public Memory fireEvent(Environment __env__, Memory... args) {
        this.getWrappedObject().fireEvent(name, resultHandler)
    }

    @Signature
    public Memory fireEventWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().fireEventWithOptions(name, options, resultHandler)
    }

    @Signature
    public Memory listEvents(Environment __env__, Memory... args) {
        this.getWrappedObject().listEvents(resultHandler)
    }

    @Signature
    public Memory listEventsWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().listEventsWithOptions(options, resultHandler)
    }

    @Signature
    public Memory registerService(Environment __env__, Memory... args) {
        this.getWrappedObject().registerService(serviceOptions, resultHandler)
    }

    @Signature
    public Memory maintenanceService(Environment __env__, Memory... args) {
        this.getWrappedObject().maintenanceService(maintenanceOptions, resultHandler)
    }

    @Signature
    public Memory deregisterService(Environment __env__, Memory... args) {
        this.getWrappedObject().deregisterService(id, resultHandler)
    }

    @Signature
    public Memory catalogServiceNodes(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogServiceNodes(service, resultHandler)
    }

    @Signature
    public Memory catalogServiceNodesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogServiceNodesWithOptions(service, options, resultHandler)
    }

    @Signature
    public Memory catalogDatacenters(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogDatacenters(resultHandler)
    }

    @Signature
    public Memory catalogNodes(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogNodes(resultHandler)
    }

    @Signature
    public Memory catalogNodesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogNodesWithOptions(options, resultHandler)
    }

    @Signature
    public Memory healthChecks(Environment __env__, Memory... args) {
        this.getWrappedObject().healthChecks(service, resultHandler)
    }

    @Signature
    public Memory healthChecksWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().healthChecksWithOptions(service, options, resultHandler)
    }

    @Signature
    public Memory healthState(Environment __env__, Memory... args) {
        this.getWrappedObject().healthState(checkStatus, resultHandler)
    }

    @Signature
    public Memory healthStateWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().healthStateWithOptions(checkStatus, options, resultHandler)
    }

    @Signature
    public Memory healthServiceNodes(Environment __env__, Memory... args) {
        this.getWrappedObject().healthServiceNodes(service, passing, resultHandler)
    }

    @Signature
    public Memory healthServiceNodesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().healthServiceNodesWithOptions(service, passing, options, resultHandler)
    }

    @Signature
    public Memory catalogServices(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogServices(resultHandler)
    }

    @Signature
    public Memory catalogServicesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogServicesWithOptions(options, resultHandler)
    }

    @Signature
    public Memory catalogNodeServices(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogNodeServices(node, resultHandler)
    }

    @Signature
    public Memory catalogNodeServicesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogNodeServicesWithOptions(node, options, resultHandler)
    }

    @Signature
    public Memory localServices(Environment __env__, Memory... args) {
        this.getWrappedObject().localServices(resultHandler)
    }

    @Signature
    public Memory localChecks(Environment __env__, Memory... args) {
        this.getWrappedObject().localChecks(resultHandler)
    }

    @Signature
    public Memory registerCheck(Environment __env__, Memory... args) {
        this.getWrappedObject().registerCheck(checkOptions, resultHandler)
    }

    @Signature
    public Memory deregisterCheck(Environment __env__, Memory... args) {
        this.getWrappedObject().deregisterCheck(checkId, resultHandler)
    }

    @Signature
    public Memory passCheck(Environment __env__, Memory... args) {
        this.getWrappedObject().passCheck(checkId, resultHandler)
    }

    @Signature
    public Memory passCheckWithNote(Environment __env__, Memory... args) {
        this.getWrappedObject().passCheckWithNote(checkId, note, resultHandler)
    }

    @Signature
    public Memory warnCheck(Environment __env__, Memory... args) {
        this.getWrappedObject().warnCheck(checkId, resultHandler)
    }

    @Signature
    public Memory warnCheckWithNote(Environment __env__, Memory... args) {
        this.getWrappedObject().warnCheckWithNote(checkId, note, resultHandler)
    }

    @Signature
    public Memory failCheck(Environment __env__, Memory... args) {
        this.getWrappedObject().failCheck(checkId, resultHandler)
    }

    @Signature
    public Memory failCheckWithNote(Environment __env__, Memory... args) {
        this.getWrappedObject().failCheckWithNote(checkId, note, resultHandler)
    }

    @Signature
    public Memory updateCheck(Environment __env__, Memory... args) {
        this.getWrappedObject().updateCheck(checkId, status, resultHandler)
    }

    @Signature
    public Memory updateCheckWithNote(Environment __env__, Memory... args) {
        this.getWrappedObject().updateCheckWithNote(checkId, status, note, resultHandler)
    }

    @Signature
    public Memory leaderStatus(Environment __env__, Memory... args) {
        this.getWrappedObject().leaderStatus(resultHandler)
    }

    @Signature
    public Memory peersStatus(Environment __env__, Memory... args) {
        this.getWrappedObject().peersStatus(resultHandler)
    }

    @Signature
    public Memory createSession(Environment __env__, Memory... args) {
        this.getWrappedObject().createSession(idHandler)
    }

    @Signature
    public Memory createSessionWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().createSessionWithOptions(options, idHandler)
    }

    @Signature
    public Memory infoSession(Environment __env__, Memory... args) {
        this.getWrappedObject().infoSession(id, resultHandler)
    }

    @Signature
    public Memory infoSessionWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().infoSessionWithOptions(id, options, resultHandler)
    }

    @Signature
    public Memory renewSession(Environment __env__, Memory... args) {
        this.getWrappedObject().renewSession(id, resultHandler)
    }

    @Signature
    public Memory listSessions(Environment __env__, Memory... args) {
        this.getWrappedObject().listSessions(resultHandler)
    }

    @Signature
    public Memory listSessionsWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().listSessionsWithOptions(options, resultHandler)
    }

    @Signature
    public Memory listNodeSessions(Environment __env__, Memory... args) {
        this.getWrappedObject().listNodeSessions(nodeId, resultHandler)
    }

    @Signature
    public Memory listNodeSessionsWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().listNodeSessionsWithOptions(nodeId, options, resultHandler)
    }

    @Signature
    public Memory destroySession(Environment __env__, Memory... args) {
        this.getWrappedObject().destroySession(id, resultHandler)
    }

    @Signature
    public Memory createPreparedQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().createPreparedQuery(definition, resultHandler)
    }

    @Signature
    public Memory getPreparedQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().getPreparedQuery(id, resultHandler)
    }

    @Signature
    public Memory getAllPreparedQueries(Environment __env__, Memory... args) {
        this.getWrappedObject().getAllPreparedQueries(resultHandler)
    }

    @Signature
    public Memory updatePreparedQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().updatePreparedQuery(definition, resultHandler)
    }

    @Signature
    public Memory deletePreparedQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().deletePreparedQuery(id, resultHandler)
    }

    @Signature
    public Memory executePreparedQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().executePreparedQuery(query, resultHandler)
    }

    @Signature
    public Memory executePreparedQueryWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().executePreparedQueryWithOptions(query, options, resultHandler)
    }

}
