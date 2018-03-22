package io.vertx.php.redis.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.redis.RedisClient;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("RedisClientImpl")
@Namespace("io\\vertx\\php\\redis\\impl")
public class RedisClientImpl extends VertxGenWrapper<io.vertx.redis.RedisClient> implements RedisClient<io.vertx.redis.RedisClient>{
    
    public RedisClientImpl(Environment env, io.vertx.redis.RedisClient wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RedisClientImpl::new, io.vertx.redis.RedisClient.create(vertx)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close(handler)
    }

    @Signature
    public Memory append(Environment __env__, Memory... args) {
        this.getWrappedObject().append(key, value, handler)
    }

    @Signature
    public Memory auth(Environment __env__, Memory... args) {
        this.getWrappedObject().auth(password, handler)
    }

    @Signature
    public Memory bgrewriteaof(Environment __env__, Memory... args) {
        this.getWrappedObject().bgrewriteaof(handler)
    }

    @Signature
    public Memory bgsave(Environment __env__, Memory... args) {
        this.getWrappedObject().bgsave(handler)
    }

    @Signature
    public Memory bitcount(Environment __env__, Memory... args) {
        this.getWrappedObject().bitcount(key, handler)
    }

    @Signature
    public Memory bitcountRange(Environment __env__, Memory... args) {
        this.getWrappedObject().bitcountRange(key, start, end, handler)
    }

    @Signature
    public Memory bitop(Environment __env__, Memory... args) {
        this.getWrappedObject().bitop(operation, destkey, keys, handler)
    }

    @Signature
    public Memory bitpos(Environment __env__, Memory... args) {
        this.getWrappedObject().bitpos(key, bit, handler)
    }

    @Signature
    public Memory bitposFrom(Environment __env__, Memory... args) {
        this.getWrappedObject().bitposFrom(key, bit, start, handler)
    }

    @Signature
    public Memory bitposRange(Environment __env__, Memory... args) {
        this.getWrappedObject().bitposRange(key, bit, start, stop, handler)
    }

    @Signature
    public Memory blpop(Environment __env__, Memory... args) {
        this.getWrappedObject().blpop(key, seconds, handler)
    }

    @Signature
    public Memory blpopMany(Environment __env__, Memory... args) {
        this.getWrappedObject().blpopMany(keys, seconds, handler)
    }

    @Signature
    public Memory brpop(Environment __env__, Memory... args) {
        this.getWrappedObject().brpop(key, seconds, handler)
    }

    @Signature
    public Memory brpopMany(Environment __env__, Memory... args) {
        this.getWrappedObject().brpopMany(keys, seconds, handler)
    }

    @Signature
    public Memory brpoplpush(Environment __env__, Memory... args) {
        this.getWrappedObject().brpoplpush(key, destkey, seconds, handler)
    }

    @Signature
    public Memory clientKill(Environment __env__, Memory... args) {
        this.getWrappedObject().clientKill(filter, handler)
    }

    @Signature
    public Memory clientList(Environment __env__, Memory... args) {
        this.getWrappedObject().clientList(handler)
    }

    @Signature
    public Memory clientGetname(Environment __env__, Memory... args) {
        this.getWrappedObject().clientGetname(handler)
    }

    @Signature
    public Memory clientPause(Environment __env__, Memory... args) {
        this.getWrappedObject().clientPause(millis, handler)
    }

    @Signature
    public Memory clientSetname(Environment __env__, Memory... args) {
        this.getWrappedObject().clientSetname(name, handler)
    }

    @Signature
    public Memory clusterAddslots(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterAddslots(slots, handler)
    }

    @Signature
    public Memory clusterCountFailureReports(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterCountFailureReports(nodeId, handler)
    }

    @Signature
    public Memory clusterCountkeysinslot(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterCountkeysinslot(slot, handler)
    }

    @Signature
    public Memory clusterDelslots(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterDelslots(slot, handler)
    }

    @Signature
    public Memory clusterDelslotsMany(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterDelslotsMany(slots, handler)
    }

    @Signature
    public Memory clusterFailover(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterFailover(handler)
    }

    @Signature
    public Memory clusterFailOverWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterFailOverWithOptions(options, handler)
    }

    @Signature
    public Memory clusterForget(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterForget(nodeId, handler)
    }

    @Signature
    public Memory clusterGetkeysinslot(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterGetkeysinslot(slot, count, handler)
    }

    @Signature
    public Memory clusterInfo(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterInfo(handler)
    }

    @Signature
    public Memory clusterKeyslot(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterKeyslot(key, handler)
    }

    @Signature
    public Memory clusterMeet(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterMeet(ip, port, handler)
    }

    @Signature
    public Memory clusterNodes(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterNodes(handler)
    }

    @Signature
    public Memory clusterReplicate(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterReplicate(nodeId, handler)
    }

    @Signature
    public Memory clusterReset(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterReset(handler)
    }

    @Signature
    public Memory clusterResetWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterResetWithOptions(options, handler)
    }

    @Signature
    public Memory clusterSaveconfig(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterSaveconfig(handler)
    }

    @Signature
    public Memory clusterSetConfigEpoch(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterSetConfigEpoch(epoch, handler)
    }

    @Signature
    public Memory clusterSetslot(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterSetslot(slot, subcommand, handler)
    }

    @Signature
    public Memory clusterSetslotWithNode(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterSetslotWithNode(slot, subcommand, nodeId, handler)
    }

    @Signature
    public Memory clusterSlaves(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterSlaves(nodeId, handler)
    }

    @Signature
    public Memory clusterSlots(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterSlots(handler)
    }

    @Signature
    public Memory command(Environment __env__, Memory... args) {
        this.getWrappedObject().command(handler)
    }

    @Signature
    public Memory commandCount(Environment __env__, Memory... args) {
        this.getWrappedObject().commandCount(handler)
    }

    @Signature
    public Memory commandGetkeys(Environment __env__, Memory... args) {
        this.getWrappedObject().commandGetkeys(handler)
    }

    @Signature
    public Memory commandInfo(Environment __env__, Memory... args) {
        this.getWrappedObject().commandInfo(commands, handler)
    }

    @Signature
    public Memory configGet(Environment __env__, Memory... args) {
        this.getWrappedObject().configGet(parameter, handler)
    }

    @Signature
    public Memory configRewrite(Environment __env__, Memory... args) {
        this.getWrappedObject().configRewrite(handler)
    }

    @Signature
    public Memory configSet(Environment __env__, Memory... args) {
        this.getWrappedObject().configSet(parameter, value, handler)
    }

    @Signature
    public Memory configResetstat(Environment __env__, Memory... args) {
        this.getWrappedObject().configResetstat(handler)
    }

    @Signature
    public Memory dbsize(Environment __env__, Memory... args) {
        this.getWrappedObject().dbsize(handler)
    }

    @Signature
    public Memory debugObject(Environment __env__, Memory... args) {
        this.getWrappedObject().debugObject(key, handler)
    }

    @Signature
    public Memory debugSegfault(Environment __env__, Memory... args) {
        this.getWrappedObject().debugSegfault(handler)
    }

    @Signature
    public Memory decr(Environment __env__, Memory... args) {
        this.getWrappedObject().decr(key, handler)
    }

    @Signature
    public Memory decrby(Environment __env__, Memory... args) {
        this.getWrappedObject().decrby(key, decrement, handler)
    }

    @Signature
    public Memory del(Environment __env__, Memory... args) {
        this.getWrappedObject().del(key, handler)
    }

    @Signature
    public Memory delMany(Environment __env__, Memory... args) {
        this.getWrappedObject().delMany(keys, handler)
    }

    @Signature
    public Memory dump(Environment __env__, Memory... args) {
        this.getWrappedObject().dump(key, handler)
    }

    @Signature
    public Memory echo(Environment __env__, Memory... args) {
        this.getWrappedObject().echo(message, handler)
    }

    @Signature
    public Memory eval(Environment __env__, Memory... args) {
        this.getWrappedObject().eval(script, keys, args, handler)
    }

    @Signature
    public Memory evalsha(Environment __env__, Memory... args) {
        this.getWrappedObject().evalsha(sha1, keys, values, handler)
    }

    @Signature
    public Memory evalScript(Environment __env__, Memory... args) {
        this.getWrappedObject().evalScript(script, keys, args, handler)
    }

    @Signature
    public Memory exists(Environment __env__, Memory... args) {
        this.getWrappedObject().exists(key, handler)
    }

    @Signature
    public Memory existsMany(Environment __env__, Memory... args) {
        this.getWrappedObject().existsMany(keys, handler)
    }

    @Signature
    public Memory expire(Environment __env__, Memory... args) {
        this.getWrappedObject().expire(key, seconds, handler)
    }

    @Signature
    public Memory expireat(Environment __env__, Memory... args) {
        this.getWrappedObject().expireat(key, seconds, handler)
    }

    @Signature
    public Memory flushall(Environment __env__, Memory... args) {
        this.getWrappedObject().flushall(handler)
    }

    @Signature
    public Memory flushdb(Environment __env__, Memory... args) {
        this.getWrappedObject().flushdb(handler)
    }

    @Signature
    public Memory get(Environment __env__, Memory... args) {
        this.getWrappedObject().get(key, handler)
    }

    @Signature
    public Memory getBinary(Environment __env__, Memory... args) {
        this.getWrappedObject().getBinary(key, handler)
    }

    @Signature
    public Memory getbit(Environment __env__, Memory... args) {
        this.getWrappedObject().getbit(key, offset, handler)
    }

    @Signature
    public Memory getrange(Environment __env__, Memory... args) {
        this.getWrappedObject().getrange(key, start, end, handler)
    }

    @Signature
    public Memory getset(Environment __env__, Memory... args) {
        this.getWrappedObject().getset(key, value, handler)
    }

    @Signature
    public Memory hdel(Environment __env__, Memory... args) {
        this.getWrappedObject().hdel(key, field, handler)
    }

    @Signature
    public Memory hdelMany(Environment __env__, Memory... args) {
        this.getWrappedObject().hdelMany(key, fields, handler)
    }

    @Signature
    public Memory hexists(Environment __env__, Memory... args) {
        this.getWrappedObject().hexists(key, field, handler)
    }

    @Signature
    public Memory hget(Environment __env__, Memory... args) {
        this.getWrappedObject().hget(key, field, handler)
    }

    @Signature
    public Memory hgetall(Environment __env__, Memory... args) {
        this.getWrappedObject().hgetall(key, handler)
    }

    @Signature
    public Memory hincrby(Environment __env__, Memory... args) {
        this.getWrappedObject().hincrby(key, field, increment, handler)
    }

    @Signature
    public Memory hincrbyfloat(Environment __env__, Memory... args) {
        this.getWrappedObject().hincrbyfloat(key, field, increment, handler)
    }

    @Signature
    public Memory hkeys(Environment __env__, Memory... args) {
        this.getWrappedObject().hkeys(key, handler)
    }

    @Signature
    public Memory hlen(Environment __env__, Memory... args) {
        this.getWrappedObject().hlen(key, handler)
    }

    @Signature
    public Memory hmget(Environment __env__, Memory... args) {
        this.getWrappedObject().hmget(key, fields, handler)
    }

    @Signature
    public Memory hmset(Environment __env__, Memory... args) {
        this.getWrappedObject().hmset(key, values, handler)
    }

    @Signature
    public Memory hset(Environment __env__, Memory... args) {
        this.getWrappedObject().hset(key, field, value, handler)
    }

    @Signature
    public Memory hsetnx(Environment __env__, Memory... args) {
        this.getWrappedObject().hsetnx(key, field, value, handler)
    }

    @Signature
    public Memory hvals(Environment __env__, Memory... args) {
        this.getWrappedObject().hvals(key, handler)
    }

    @Signature
    public Memory incr(Environment __env__, Memory... args) {
        this.getWrappedObject().incr(key, handler)
    }

    @Signature
    public Memory incrby(Environment __env__, Memory... args) {
        this.getWrappedObject().incrby(key, increment, handler)
    }

    @Signature
    public Memory incrbyfloat(Environment __env__, Memory... args) {
        this.getWrappedObject().incrbyfloat(key, increment, handler)
    }

    @Signature
    public Memory info(Environment __env__, Memory... args) {
        this.getWrappedObject().info(handler)
    }

    @Signature
    public Memory infoSection(Environment __env__, Memory... args) {
        this.getWrappedObject().infoSection(section, handler)
    }

    @Signature
    public Memory keys(Environment __env__, Memory... args) {
        this.getWrappedObject().keys(pattern, handler)
    }

    @Signature
    public Memory lastsave(Environment __env__, Memory... args) {
        this.getWrappedObject().lastsave(handler)
    }

    @Signature
    public Memory lindex(Environment __env__, Memory... args) {
        this.getWrappedObject().lindex(key, index, handler)
    }

    @Signature
    public Memory linsert(Environment __env__, Memory... args) {
        this.getWrappedObject().linsert(key, option, pivot, value, handler)
    }

    @Signature
    public Memory llen(Environment __env__, Memory... args) {
        this.getWrappedObject().llen(key, handler)
    }

    @Signature
    public Memory lpop(Environment __env__, Memory... args) {
        this.getWrappedObject().lpop(key, handler)
    }

    @Signature
    public Memory lpushMany(Environment __env__, Memory... args) {
        this.getWrappedObject().lpushMany(key, values, handler)
    }

    @Signature
    public Memory lpush(Environment __env__, Memory... args) {
        this.getWrappedObject().lpush(key, value, handler)
    }

    @Signature
    public Memory lpushx(Environment __env__, Memory... args) {
        this.getWrappedObject().lpushx(key, value, handler)
    }

    @Signature
    public Memory lrange(Environment __env__, Memory... args) {
        this.getWrappedObject().lrange(key, from, to, handler)
    }

    @Signature
    public Memory lrem(Environment __env__, Memory... args) {
        this.getWrappedObject().lrem(key, count, value, handler)
    }

    @Signature
    public Memory lset(Environment __env__, Memory... args) {
        this.getWrappedObject().lset(key, index, value, handler)
    }

    @Signature
    public Memory ltrim(Environment __env__, Memory... args) {
        this.getWrappedObject().ltrim(key, from, to, handler)
    }

    @Signature
    public Memory mget(Environment __env__, Memory... args) {
        this.getWrappedObject().mget(key, handler)
    }

    @Signature
    public Memory mgetMany(Environment __env__, Memory... args) {
        this.getWrappedObject().mgetMany(keys, handler)
    }

    @Signature
    public Memory migrate(Environment __env__, Memory... args) {
        this.getWrappedObject().migrate(host, port, key, destdb, timeout, options, handler)
    }

    @Signature
    public Memory monitor(Environment __env__, Memory... args) {
        this.getWrappedObject().monitor(handler)
    }

    @Signature
    public Memory move(Environment __env__, Memory... args) {
        this.getWrappedObject().move(key, destdb, handler)
    }

    @Signature
    public Memory mset(Environment __env__, Memory... args) {
        this.getWrappedObject().mset(keyvals, handler)
    }

    @Signature
    public Memory msetnx(Environment __env__, Memory... args) {
        this.getWrappedObject().msetnx(keyvals, handler)
    }

    @Signature
    public Memory object(Environment __env__, Memory... args) {
        this.getWrappedObject().object(key, cmd, handler)
    }

    @Signature
    public Memory persist(Environment __env__, Memory... args) {
        this.getWrappedObject().persist(key, handler)
    }

    @Signature
    public Memory pexpire(Environment __env__, Memory... args) {
        this.getWrappedObject().pexpire(key, millis, handler)
    }

    @Signature
    public Memory pexpireat(Environment __env__, Memory... args) {
        this.getWrappedObject().pexpireat(key, millis, handler)
    }

    @Signature
    public Memory pfadd(Environment __env__, Memory... args) {
        this.getWrappedObject().pfadd(key, element, handler)
    }

    @Signature
    public Memory pfaddMany(Environment __env__, Memory... args) {
        this.getWrappedObject().pfaddMany(key, elements, handler)
    }

    @Signature
    public Memory pfcount(Environment __env__, Memory... args) {
        this.getWrappedObject().pfcount(key, handler)
    }

    @Signature
    public Memory pfcountMany(Environment __env__, Memory... args) {
        this.getWrappedObject().pfcountMany(keys, handler)
    }

    @Signature
    public Memory pfmerge(Environment __env__, Memory... args) {
        this.getWrappedObject().pfmerge(destkey, keys, handler)
    }

    @Signature
    public Memory ping(Environment __env__, Memory... args) {
        this.getWrappedObject().ping(handler)
    }

    @Signature
    public Memory psetex(Environment __env__, Memory... args) {
        this.getWrappedObject().psetex(key, millis, value, handler)
    }

    @Signature
    public Memory psubscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().psubscribe(pattern, handler)
    }

    @Signature
    public Memory psubscribeMany(Environment __env__, Memory... args) {
        this.getWrappedObject().psubscribeMany(patterns, handler)
    }

    @Signature
    public Memory pubsubChannels(Environment __env__, Memory... args) {
        this.getWrappedObject().pubsubChannels(pattern, handler)
    }

    @Signature
    public Memory pubsubNumsub(Environment __env__, Memory... args) {
        this.getWrappedObject().pubsubNumsub(channels, handler)
    }

    @Signature
    public Memory pubsubNumpat(Environment __env__, Memory... args) {
        this.getWrappedObject().pubsubNumpat(handler)
    }

    @Signature
    public Memory pttl(Environment __env__, Memory... args) {
        this.getWrappedObject().pttl(key, handler)
    }

    @Signature
    public Memory publish(Environment __env__, Memory... args) {
        this.getWrappedObject().publish(channel, message, handler)
    }

    @Signature
    public Memory punsubscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().punsubscribe(patterns, handler)
    }

    @Signature
    public Memory randomkey(Environment __env__, Memory... args) {
        this.getWrappedObject().randomkey(handler)
    }

    @Signature
    public Memory rename(Environment __env__, Memory... args) {
        this.getWrappedObject().rename(key, newkey, handler)
    }

    @Signature
    public Memory renamenx(Environment __env__, Memory... args) {
        this.getWrappedObject().renamenx(key, newkey, handler)
    }

    @Signature
    public Memory restore(Environment __env__, Memory... args) {
        this.getWrappedObject().restore(key, millis, serialized, handler)
    }

    @Signature
    public Memory role(Environment __env__, Memory... args) {
        this.getWrappedObject().role(handler)
    }

    @Signature
    public Memory rpop(Environment __env__, Memory... args) {
        this.getWrappedObject().rpop(key, handler)
    }

    @Signature
    public Memory rpoplpush(Environment __env__, Memory... args) {
        this.getWrappedObject().rpoplpush(key, destkey, handler)
    }

    @Signature
    public Memory rpushMany(Environment __env__, Memory... args) {
        this.getWrappedObject().rpushMany(key, values, handler)
    }

    @Signature
    public Memory rpush(Environment __env__, Memory... args) {
        this.getWrappedObject().rpush(key, value, handler)
    }

    @Signature
    public Memory rpushx(Environment __env__, Memory... args) {
        this.getWrappedObject().rpushx(key, value, handler)
    }

    @Signature
    public Memory sadd(Environment __env__, Memory... args) {
        this.getWrappedObject().sadd(key, member, handler)
    }

    @Signature
    public Memory saddMany(Environment __env__, Memory... args) {
        this.getWrappedObject().saddMany(key, members, handler)
    }

    @Signature
    public Memory save(Environment __env__, Memory... args) {
        this.getWrappedObject().save(handler)
    }

    @Signature
    public Memory scard(Environment __env__, Memory... args) {
        this.getWrappedObject().scard(key, handler)
    }

    @Signature
    public Memory scriptExists(Environment __env__, Memory... args) {
        this.getWrappedObject().scriptExists(script, handler)
    }

    @Signature
    public Memory scriptExistsMany(Environment __env__, Memory... args) {
        this.getWrappedObject().scriptExistsMany(scripts, handler)
    }

    @Signature
    public Memory scriptFlush(Environment __env__, Memory... args) {
        this.getWrappedObject().scriptFlush(handler)
    }

    @Signature
    public Memory scriptKill(Environment __env__, Memory... args) {
        this.getWrappedObject().scriptKill(handler)
    }

    @Signature
    public Memory scriptLoad(Environment __env__, Memory... args) {
        this.getWrappedObject().scriptLoad(script, handler)
    }

    @Signature
    public Memory sdiff(Environment __env__, Memory... args) {
        this.getWrappedObject().sdiff(key, cmpkeys, handler)
    }

    @Signature
    public Memory sdiffstore(Environment __env__, Memory... args) {
        this.getWrappedObject().sdiffstore(destkey, key, cmpkeys, handler)
    }

    @Signature
    public Memory select(Environment __env__, Memory... args) {
        this.getWrappedObject().select(dbindex, handler)
    }

    @Signature
    public Memory set(Environment __env__, Memory... args) {
        this.getWrappedObject().set(key, value, handler)
    }

    @Signature
    public Memory setWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().setWithOptions(key, value, options, handler)
    }

    @Signature
    public Memory setBinary(Environment __env__, Memory... args) {
        this.getWrappedObject().setBinary(key, value, handler)
    }

    @Signature
    public Memory setBinaryWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().setBinaryWithOptions(key, value, options, handler)
    }

    @Signature
    public Memory setbit(Environment __env__, Memory... args) {
        this.getWrappedObject().setbit(key, offset, bit, handler)
    }

    @Signature
    public Memory setex(Environment __env__, Memory... args) {
        this.getWrappedObject().setex(key, seconds, value, handler)
    }

    @Signature
    public Memory setnx(Environment __env__, Memory... args) {
        this.getWrappedObject().setnx(key, value, handler)
    }

    @Signature
    public Memory setrange(Environment __env__, Memory... args) {
        this.getWrappedObject().setrange(key, offset, value, handler)
    }

    @Signature
    public Memory sinter(Environment __env__, Memory... args) {
        this.getWrappedObject().sinter(keys, handler)
    }

    @Signature
    public Memory sinterstore(Environment __env__, Memory... args) {
        this.getWrappedObject().sinterstore(destkey, keys, handler)
    }

    @Signature
    public Memory sismember(Environment __env__, Memory... args) {
        this.getWrappedObject().sismember(key, member, handler)
    }

    @Signature
    public Memory slaveof(Environment __env__, Memory... args) {
        this.getWrappedObject().slaveof(host, port, handler)
    }

    @Signature
    public Memory slaveofNoone(Environment __env__, Memory... args) {
        this.getWrappedObject().slaveofNoone(handler)
    }

    @Signature
    public Memory slowlogGet(Environment __env__, Memory... args) {
        this.getWrappedObject().slowlogGet(limit, handler)
    }

    @Signature
    public Memory slowlogLen(Environment __env__, Memory... args) {
        this.getWrappedObject().slowlogLen(handler)
    }

    @Signature
    public Memory slowlogReset(Environment __env__, Memory... args) {
        this.getWrappedObject().slowlogReset(handler)
    }

    @Signature
    public Memory smembers(Environment __env__, Memory... args) {
        this.getWrappedObject().smembers(key, handler)
    }

    @Signature
    public Memory smove(Environment __env__, Memory... args) {
        this.getWrappedObject().smove(key, destkey, member, handler)
    }

    @Signature
    public Memory sort(Environment __env__, Memory... args) {
        this.getWrappedObject().sort(key, options, handler)
    }

    @Signature
    public Memory spop(Environment __env__, Memory... args) {
        this.getWrappedObject().spop(key, handler)
    }

    @Signature
    public Memory spopMany(Environment __env__, Memory... args) {
        this.getWrappedObject().spopMany(key, count, handler)
    }

    @Signature
    public Memory srandmember(Environment __env__, Memory... args) {
        this.getWrappedObject().srandmember(key, handler)
    }

    @Signature
    public Memory srandmemberCount(Environment __env__, Memory... args) {
        this.getWrappedObject().srandmemberCount(key, count, handler)
    }

    @Signature
    public Memory srem(Environment __env__, Memory... args) {
        this.getWrappedObject().srem(key, member, handler)
    }

    @Signature
    public Memory sremMany(Environment __env__, Memory... args) {
        this.getWrappedObject().sremMany(key, members, handler)
    }

    @Signature
    public Memory strlen(Environment __env__, Memory... args) {
        this.getWrappedObject().strlen(key, handler)
    }

    @Signature
    public Memory subscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribe(channel, handler)
    }

    @Signature
    public Memory subscribeMany(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribeMany(channels, handler)
    }

    @Signature
    public Memory sunion(Environment __env__, Memory... args) {
        this.getWrappedObject().sunion(keys, handler)
    }

    @Signature
    public Memory sunionstore(Environment __env__, Memory... args) {
        this.getWrappedObject().sunionstore(destkey, keys, handler)
    }

    @Signature
    public Memory sync(Environment __env__, Memory... args) {
        this.getWrappedObject().sync(handler)
    }

    @Signature
    public Memory time(Environment __env__, Memory... args) {
        this.getWrappedObject().time(handler)
    }

    @Signature
    public Memory ttl(Environment __env__, Memory... args) {
        this.getWrappedObject().ttl(key, handler)
    }

    @Signature
    public Memory type(Environment __env__, Memory... args) {
        this.getWrappedObject().type(key, handler)
    }

    @Signature
    public Memory unsubscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribe(channels, handler)
    }

    @Signature
    public Memory wait(Environment __env__, Memory... args) {
        this.getWrappedObject().wait(numSlaves, timeout, handler)
    }

    @Signature
    public Memory zadd(Environment __env__, Memory... args) {
        this.getWrappedObject().zadd(key, score, member, handler)
    }

    @Signature
    public Memory zaddMany(Environment __env__, Memory... args) {
        this.getWrappedObject().zaddMany(key, members, handler)
    }

    @Signature
    public Memory zcard(Environment __env__, Memory... args) {
        this.getWrappedObject().zcard(key, handler)
    }

    @Signature
    public Memory zcount(Environment __env__, Memory... args) {
        this.getWrappedObject().zcount(key, min, max, handler)
    }

    @Signature
    public Memory zincrby(Environment __env__, Memory... args) {
        this.getWrappedObject().zincrby(key, increment, member, handler)
    }

    @Signature
    public Memory zinterstore(Environment __env__, Memory... args) {
        this.getWrappedObject().zinterstore(destkey, sets, options, handler)
    }

    @Signature
    public Memory zinterstoreWeighed(Environment __env__, Memory... args) {
        this.getWrappedObject().zinterstoreWeighed(destkey, sets, options, handler)
    }

    @Signature
    public Memory zlexcount(Environment __env__, Memory... args) {
        this.getWrappedObject().zlexcount(key, min, max, handler)
    }

    @Signature
    public Memory zrange(Environment __env__, Memory... args) {
        this.getWrappedObject().zrange(key, start, stop, handler)
    }

    @Signature
    public Memory zrangeWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().zrangeWithOptions(key, start, stop, options, handler)
    }

    @Signature
    public Memory zrangebylex(Environment __env__, Memory... args) {
        this.getWrappedObject().zrangebylex(key, min, max, options, handler)
    }

    @Signature
    public Memory zrangebyscore(Environment __env__, Memory... args) {
        this.getWrappedObject().zrangebyscore(key, min, max, options, handler)
    }

    @Signature
    public Memory zrank(Environment __env__, Memory... args) {
        this.getWrappedObject().zrank(key, member, handler)
    }

    @Signature
    public Memory zrem(Environment __env__, Memory... args) {
        this.getWrappedObject().zrem(key, member, handler)
    }

    @Signature
    public Memory zremMany(Environment __env__, Memory... args) {
        this.getWrappedObject().zremMany(key, members, handler)
    }

    @Signature
    public Memory zremrangebylex(Environment __env__, Memory... args) {
        this.getWrappedObject().zremrangebylex(key, min, max, handler)
    }

    @Signature
    public Memory zremrangebyrank(Environment __env__, Memory... args) {
        this.getWrappedObject().zremrangebyrank(key, start, stop, handler)
    }

    @Signature
    public Memory zremrangebyscore(Environment __env__, Memory... args) {
        this.getWrappedObject().zremrangebyscore(key, min, max, handler)
    }

    @Signature
    public Memory zrevrange(Environment __env__, Memory... args) {
        this.getWrappedObject().zrevrange(key, start, stop, options, handler)
    }

    @Signature
    public Memory zrevrangebylex(Environment __env__, Memory... args) {
        this.getWrappedObject().zrevrangebylex(key, max, min, options, handler)
    }

    @Signature
    public Memory zrevrangebyscore(Environment __env__, Memory... args) {
        this.getWrappedObject().zrevrangebyscore(key, max, min, options, handler)
    }

    @Signature
    public Memory zrevrank(Environment __env__, Memory... args) {
        this.getWrappedObject().zrevrank(key, member, handler)
    }

    @Signature
    public Memory zscore(Environment __env__, Memory... args) {
        this.getWrappedObject().zscore(key, member, handler)
    }

    @Signature
    public Memory zunionstore(Environment __env__, Memory... args) {
        this.getWrappedObject().zunionstore(destkey, sets, options, handler)
    }

    @Signature
    public Memory zunionstoreWeighed(Environment __env__, Memory... args) {
        this.getWrappedObject().zunionstoreWeighed(key, sets, options, handler)
    }

    @Signature
    public Memory scan(Environment __env__, Memory... args) {
        this.getWrappedObject().scan(cursor, options, handler)
    }

    @Signature
    public Memory sscan(Environment __env__, Memory... args) {
        this.getWrappedObject().sscan(key, cursor, options, handler)
    }

    @Signature
    public Memory hscan(Environment __env__, Memory... args) {
        this.getWrappedObject().hscan(key, cursor, options, handler)
    }

    @Signature
    public Memory zscan(Environment __env__, Memory... args) {
        this.getWrappedObject().zscan(key, cursor, options, handler)
    }

    @Signature
    public Memory geoadd(Environment __env__, Memory... args) {
        this.getWrappedObject().geoadd(key, longitude, latitude, member, handler)
    }

    @Signature
    public Memory geoaddMany(Environment __env__, Memory... args) {
        this.getWrappedObject().geoaddMany(key, members, handler)
    }

    @Signature
    public Memory geohash(Environment __env__, Memory... args) {
        this.getWrappedObject().geohash(key, member, handler)
    }

    @Signature
    public Memory geohashMany(Environment __env__, Memory... args) {
        this.getWrappedObject().geohashMany(key, members, handler)
    }

    @Signature
    public Memory geopos(Environment __env__, Memory... args) {
        this.getWrappedObject().geopos(key, member, handler)
    }

    @Signature
    public Memory geoposMany(Environment __env__, Memory... args) {
        this.getWrappedObject().geoposMany(key, members, handler)
    }

    @Signature
    public Memory geodist(Environment __env__, Memory... args) {
        this.getWrappedObject().geodist(key, member1, member2, handler)
    }

    @Signature
    public Memory geodistWithUnit(Environment __env__, Memory... args) {
        this.getWrappedObject().geodistWithUnit(key, member1, member2, unit, handler)
    }

    @Signature
    public Memory georadius(Environment __env__, Memory... args) {
        this.getWrappedObject().georadius(key, longitude, latitude, radius, unit, handler)
    }

    @Signature
    public Memory georadiusWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().georadiusWithOptions(key, longitude, latitude, radius, unit, options, handler)
    }

    @Signature
    public Memory georadiusbymember(Environment __env__, Memory... args) {
        this.getWrappedObject().georadiusbymember(key, member, radius, unit, handler)
    }

    @Signature
    public Memory georadiusbymemberWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().georadiusbymemberWithOptions(key, member, radius, unit, options, handler)
    }

    @Signature
    public Memory clientReply(Environment __env__, Memory... args) {
        this.getWrappedObject().clientReply(options, handler)
    }

    @Signature
    public Memory hstrlen(Environment __env__, Memory... args) {
        this.getWrappedObject().hstrlen(key, field, handler)
    }

    @Signature
    public Memory touch(Environment __env__, Memory... args) {
        this.getWrappedObject().touch(key, handler)
    }

    @Signature
    public Memory touchMany(Environment __env__, Memory... args) {
        this.getWrappedObject().touchMany(keys, handler)
    }

    @Signature
    public Memory scriptDebug(Environment __env__, Memory... args) {
        this.getWrappedObject().scriptDebug(scriptDebugOptions, handler)
    }

    @Signature
    public Memory bitfield(Environment __env__, Memory... args) {
        this.getWrappedObject().bitfield(key, bitFieldOptions, handler)
    }

    @Signature
    public Memory bitfieldWithOverflow(Environment __env__, Memory... args) {
        this.getWrappedObject().bitfieldWithOverflow(key, commands, overflow, handler)
    }

    @Signature
    public Memory unlink(Environment __env__, Memory... args) {
        this.getWrappedObject().unlink(key, handler)
    }

    @Signature
    public Memory unlinkMany(Environment __env__, Memory... args) {
        this.getWrappedObject().unlinkMany(keys, handler)
    }

    @Signature
    public Memory swapdb(Environment __env__, Memory... args) {
        this.getWrappedObject().swapdb(index1, index2, handler)
    }

}
