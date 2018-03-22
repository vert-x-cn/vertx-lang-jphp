package io.vertx.php.ext.consul;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
@Name("ConsulClient")
@Namespace("io\\vertx\\php\\ext\\consul")
public interface ConsulClient<S extends io.vertx.ext.consul.ConsulClient> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ConsulClientImpl::new, io.vertx.ext.consul.ConsulClient.create(vertx)
    }

    @Signature
    default Memory agentInfo(Environment __env__, Memory... args) {
        this.getWrappedObject().agentInfo(resultHandler)
    }

    @Signature
    default Memory coordinateNodes(Environment __env__, Memory... args) {
        this.getWrappedObject().coordinateNodes(resultHandler)
    }

    @Signature
    default Memory coordinateNodesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().coordinateNodesWithOptions(options, resultHandler)
    }

    @Signature
    default Memory coordinateDatacenters(Environment __env__, Memory... args) {
        this.getWrappedObject().coordinateDatacenters(resultHandler)
    }

    @Signature
    default Memory getKeys(Environment __env__, Memory... args) {
        this.getWrappedObject().getKeys(keyPrefix, resultHandler)
    }

    @Signature
    default Memory getKeysWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().getKeysWithOptions(keyPrefix, options, resultHandler)
    }

    @Signature
    default Memory getValue(Environment __env__, Memory... args) {
        this.getWrappedObject().getValue(key, resultHandler)
    }

    @Signature
    default Memory getValueWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().getValueWithOptions(key, options, resultHandler)
    }

    @Signature
    default Memory deleteValue(Environment __env__, Memory... args) {
        this.getWrappedObject().deleteValue(key, resultHandler)
    }

    @Signature
    default Memory getValues(Environment __env__, Memory... args) {
        this.getWrappedObject().getValues(keyPrefix, resultHandler)
    }

    @Signature
    default Memory getValuesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().getValuesWithOptions(keyPrefix, options, resultHandler)
    }

    @Signature
    default Memory deleteValues(Environment __env__, Memory... args) {
        this.getWrappedObject().deleteValues(keyPrefix, resultHandler)
    }

    @Signature
    default Memory putValue(Environment __env__, Memory... args) {
        this.getWrappedObject().putValue(key, value, resultHandler)
    }

    @Signature
    default Memory putValueWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().putValueWithOptions(key, value, options, resultHandler)
    }

    @Signature
    default Memory transaction(Environment __env__, Memory... args) {
        this.getWrappedObject().transaction(request, resultHandler)
    }

    @Signature
    default Memory createAclToken(Environment __env__, Memory... args) {
        this.getWrappedObject().createAclToken(token, idHandler)
    }

    @Signature
    default Memory updateAclToken(Environment __env__, Memory... args) {
        this.getWrappedObject().updateAclToken(token, idHandler)
    }

    @Signature
    default Memory cloneAclToken(Environment __env__, Memory... args) {
        this.getWrappedObject().cloneAclToken(id, idHandler)
    }

    @Signature
    default Memory listAclTokens(Environment __env__, Memory... args) {
        this.getWrappedObject().listAclTokens(resultHandler)
    }

    @Signature
    default Memory infoAclToken(Environment __env__, Memory... args) {
        this.getWrappedObject().infoAclToken(id, tokenHandler)
    }

    @Signature
    default Memory destroyAclToken(Environment __env__, Memory... args) {
        this.getWrappedObject().destroyAclToken(id, resultHandler)
    }

    @Signature
    default Memory fireEvent(Environment __env__, Memory... args) {
        this.getWrappedObject().fireEvent(name, resultHandler)
    }

    @Signature
    default Memory fireEventWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().fireEventWithOptions(name, options, resultHandler)
    }

    @Signature
    default Memory listEvents(Environment __env__, Memory... args) {
        this.getWrappedObject().listEvents(resultHandler)
    }

    @Signature
    default Memory listEventsWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().listEventsWithOptions(options, resultHandler)
    }

    @Signature
    default Memory registerService(Environment __env__, Memory... args) {
        this.getWrappedObject().registerService(serviceOptions, resultHandler)
    }

    @Signature
    default Memory maintenanceService(Environment __env__, Memory... args) {
        this.getWrappedObject().maintenanceService(maintenanceOptions, resultHandler)
    }

    @Signature
    default Memory deregisterService(Environment __env__, Memory... args) {
        this.getWrappedObject().deregisterService(id, resultHandler)
    }

    @Signature
    default Memory catalogServiceNodes(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogServiceNodes(service, resultHandler)
    }

    @Signature
    default Memory catalogServiceNodesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogServiceNodesWithOptions(service, options, resultHandler)
    }

    @Signature
    default Memory catalogDatacenters(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogDatacenters(resultHandler)
    }

    @Signature
    default Memory catalogNodes(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogNodes(resultHandler)
    }

    @Signature
    default Memory catalogNodesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogNodesWithOptions(options, resultHandler)
    }

    @Signature
    default Memory healthChecks(Environment __env__, Memory... args) {
        this.getWrappedObject().healthChecks(service, resultHandler)
    }

    @Signature
    default Memory healthChecksWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().healthChecksWithOptions(service, options, resultHandler)
    }

    @Signature
    default Memory healthState(Environment __env__, Memory... args) {
        this.getWrappedObject().healthState(checkStatus, resultHandler)
    }

    @Signature
    default Memory healthStateWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().healthStateWithOptions(checkStatus, options, resultHandler)
    }

    @Signature
    default Memory healthServiceNodes(Environment __env__, Memory... args) {
        this.getWrappedObject().healthServiceNodes(service, passing, resultHandler)
    }

    @Signature
    default Memory healthServiceNodesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().healthServiceNodesWithOptions(service, passing, options, resultHandler)
    }

    @Signature
    default Memory catalogServices(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogServices(resultHandler)
    }

    @Signature
    default Memory catalogServicesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogServicesWithOptions(options, resultHandler)
    }

    @Signature
    default Memory catalogNodeServices(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogNodeServices(node, resultHandler)
    }

    @Signature
    default Memory catalogNodeServicesWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().catalogNodeServicesWithOptions(node, options, resultHandler)
    }

    @Signature
    default Memory localServices(Environment __env__, Memory... args) {
        this.getWrappedObject().localServices(resultHandler)
    }

    @Signature
    default Memory localChecks(Environment __env__, Memory... args) {
        this.getWrappedObject().localChecks(resultHandler)
    }

    @Signature
    default Memory registerCheck(Environment __env__, Memory... args) {
        this.getWrappedObject().registerCheck(checkOptions, resultHandler)
    }

    @Signature
    default Memory deregisterCheck(Environment __env__, Memory... args) {
        this.getWrappedObject().deregisterCheck(checkId, resultHandler)
    }

    @Signature
    default Memory passCheck(Environment __env__, Memory... args) {
        this.getWrappedObject().passCheck(checkId, resultHandler)
    }

    @Signature
    default Memory passCheckWithNote(Environment __env__, Memory... args) {
        this.getWrappedObject().passCheckWithNote(checkId, note, resultHandler)
    }

    @Signature
    default Memory warnCheck(Environment __env__, Memory... args) {
        this.getWrappedObject().warnCheck(checkId, resultHandler)
    }

    @Signature
    default Memory warnCheckWithNote(Environment __env__, Memory... args) {
        this.getWrappedObject().warnCheckWithNote(checkId, note, resultHandler)
    }

    @Signature
    default Memory failCheck(Environment __env__, Memory... args) {
        this.getWrappedObject().failCheck(checkId, resultHandler)
    }

    @Signature
    default Memory failCheckWithNote(Environment __env__, Memory... args) {
        this.getWrappedObject().failCheckWithNote(checkId, note, resultHandler)
    }

    @Signature
    default Memory updateCheck(Environment __env__, Memory... args) {
        this.getWrappedObject().updateCheck(checkId, status, resultHandler)
    }

    @Signature
    default Memory updateCheckWithNote(Environment __env__, Memory... args) {
        this.getWrappedObject().updateCheckWithNote(checkId, status, note, resultHandler)
    }

    @Signature
    default Memory leaderStatus(Environment __env__, Memory... args) {
        this.getWrappedObject().leaderStatus(resultHandler)
    }

    @Signature
    default Memory peersStatus(Environment __env__, Memory... args) {
        this.getWrappedObject().peersStatus(resultHandler)
    }

    @Signature
    default Memory createSession(Environment __env__, Memory... args) {
        this.getWrappedObject().createSession(idHandler)
    }

    @Signature
    default Memory createSessionWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().createSessionWithOptions(options, idHandler)
    }

    @Signature
    default Memory infoSession(Environment __env__, Memory... args) {
        this.getWrappedObject().infoSession(id, resultHandler)
    }

    @Signature
    default Memory infoSessionWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().infoSessionWithOptions(id, options, resultHandler)
    }

    @Signature
    default Memory renewSession(Environment __env__, Memory... args) {
        this.getWrappedObject().renewSession(id, resultHandler)
    }

    @Signature
    default Memory listSessions(Environment __env__, Memory... args) {
        this.getWrappedObject().listSessions(resultHandler)
    }

    @Signature
    default Memory listSessionsWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().listSessionsWithOptions(options, resultHandler)
    }

    @Signature
    default Memory listNodeSessions(Environment __env__, Memory... args) {
        this.getWrappedObject().listNodeSessions(nodeId, resultHandler)
    }

    @Signature
    default Memory listNodeSessionsWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().listNodeSessionsWithOptions(nodeId, options, resultHandler)
    }

    @Signature
    default Memory destroySession(Environment __env__, Memory... args) {
        this.getWrappedObject().destroySession(id, resultHandler)
    }

    @Signature
    default Memory createPreparedQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().createPreparedQuery(definition, resultHandler)
    }

    @Signature
    default Memory getPreparedQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().getPreparedQuery(id, resultHandler)
    }

    @Signature
    default Memory getAllPreparedQueries(Environment __env__, Memory... args) {
        this.getWrappedObject().getAllPreparedQueries(resultHandler)
    }

    @Signature
    default Memory updatePreparedQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().updatePreparedQuery(definition, resultHandler)
    }

    @Signature
    default Memory deletePreparedQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().deletePreparedQuery(id, resultHandler)
    }

    @Signature
    default Memory executePreparedQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().executePreparedQuery(query, resultHandler)
    }

    @Signature
    default Memory executePreparedQueryWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().executePreparedQueryWithOptions(query, options, resultHandler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
