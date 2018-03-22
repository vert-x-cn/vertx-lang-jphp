package io.vertx.php.redis;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
@Name("RedisTransaction")
@Namespace("io\\vertx\\php\\redis")
public interface RedisTransaction<S extends io.vertx.redis.RedisTransaction> extends IWrapper<S>{

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close(handler)
    }

    @Signature
    default Memory append(Environment __env__, Memory... args) {
        this.getWrappedObject().append(key, value, handler)
    }

    @Signature
    default Memory auth(Environment __env__, Memory... args) {
        this.getWrappedObject().auth(password, handler)
    }

    @Signature
    default Memory bgrewriteaof(Environment __env__, Memory... args) {
        this.getWrappedObject().bgrewriteaof(handler)
    }

    @Signature
    default Memory bgsave(Environment __env__, Memory... args) {
        this.getWrappedObject().bgsave(handler)
    }

    @Signature
    default Memory bitcount(Environment __env__, Memory... args) {
        this.getWrappedObject().bitcount(key, handler)
    }

    @Signature
    default Memory bitcountRange(Environment __env__, Memory... args) {
        this.getWrappedObject().bitcountRange(key, start, end, handler)
    }

    @Signature
    default Memory bitop(Environment __env__, Memory... args) {
        this.getWrappedObject().bitop(operation, destkey, keys, handler)
    }

    @Signature
    default Memory bitpos(Environment __env__, Memory... args) {
        this.getWrappedObject().bitpos(key, bit, handler)
    }

    @Signature
    default Memory bitposFrom(Environment __env__, Memory... args) {
        this.getWrappedObject().bitposFrom(key, bit, start, handler)
    }

    @Signature
    default Memory bitposRange(Environment __env__, Memory... args) {
        this.getWrappedObject().bitposRange(key, bit, start, stop, handler)
    }

    @Signature
    default Memory blpop(Environment __env__, Memory... args) {
        this.getWrappedObject().blpop(key, seconds, handler)
    }

    @Signature
    default Memory blpopMany(Environment __env__, Memory... args) {
        this.getWrappedObject().blpopMany(keys, seconds, handler)
    }

    @Signature
    default Memory brpop(Environment __env__, Memory... args) {
        this.getWrappedObject().brpop(key, seconds, handler)
    }

    @Signature
    default Memory brpopMany(Environment __env__, Memory... args) {
        this.getWrappedObject().brpopMany(keys, seconds, handler)
    }

    @Signature
    default Memory brpoplpush(Environment __env__, Memory... args) {
        this.getWrappedObject().brpoplpush(key, destkey, seconds, handler)
    }

    @Signature
    default Memory clientKill(Environment __env__, Memory... args) {
        this.getWrappedObject().clientKill(filter, handler)
    }

    @Signature
    default Memory clientList(Environment __env__, Memory... args) {
        this.getWrappedObject().clientList(handler)
    }

    @Signature
    default Memory clientGetname(Environment __env__, Memory... args) {
        this.getWrappedObject().clientGetname(handler)
    }

    @Signature
    default Memory clientPause(Environment __env__, Memory... args) {
        this.getWrappedObject().clientPause(millis, handler)
    }

    @Signature
    default Memory clientSetname(Environment __env__, Memory... args) {
        this.getWrappedObject().clientSetname(name, handler)
    }

    @Signature
    default Memory clusterAddslots(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterAddslots(slots, handler)
    }

    @Signature
    default Memory clusterCountFailureReports(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterCountFailureReports(nodeId, handler)
    }

    @Signature
    default Memory clusterCountkeysinslot(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterCountkeysinslot(slot, handler)
    }

    @Signature
    default Memory clusterDelslots(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterDelslots(slot, handler)
    }

    @Signature
    default Memory clusterDelslotsMany(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterDelslotsMany(slots, handler)
    }

    @Signature
    default Memory clusterFailover(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterFailover(handler)
    }

    @Signature
    default Memory clusterFailOverWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterFailOverWithOptions(options, handler)
    }

    @Signature
    default Memory clusterForget(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterForget(nodeId, handler)
    }

    @Signature
    default Memory clusterGetkeysinslot(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterGetkeysinslot(slot, count, handler)
    }

    @Signature
    default Memory clusterInfo(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterInfo(handler)
    }

    @Signature
    default Memory clusterKeyslot(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterKeyslot(key, handler)
    }

    @Signature
    default Memory clusterMeet(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterMeet(ip, port, handler)
    }

    @Signature
    default Memory clusterNodes(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterNodes(handler)
    }

    @Signature
    default Memory clusterReplicate(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterReplicate(nodeId, handler)
    }

    @Signature
    default Memory clusterReset(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterReset(handler)
    }

    @Signature
    default Memory clusterResetWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterResetWithOptions(options, handler)
    }

    @Signature
    default Memory clusterSaveconfig(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterSaveconfig(handler)
    }

    @Signature
    default Memory clusterSetConfigEpoch(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterSetConfigEpoch(epoch, handler)
    }

    @Signature
    default Memory clusterSetslot(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterSetslot(slot, subcommand, handler)
    }

    @Signature
    default Memory clusterSetslotWithNode(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterSetslotWithNode(slot, subcommand, nodeId, handler)
    }

    @Signature
    default Memory clusterSlaves(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterSlaves(nodeId, handler)
    }

    @Signature
    default Memory clusterSlots(Environment __env__, Memory... args) {
        this.getWrappedObject().clusterSlots(handler)
    }

    @Signature
    default Memory command(Environment __env__, Memory... args) {
        this.getWrappedObject().command(handler)
    }

    @Signature
    default Memory commandCount(Environment __env__, Memory... args) {
        this.getWrappedObject().commandCount(handler)
    }

    @Signature
    default Memory commandGetkeys(Environment __env__, Memory... args) {
        this.getWrappedObject().commandGetkeys(handler)
    }

    @Signature
    default Memory commandInfo(Environment __env__, Memory... args) {
        this.getWrappedObject().commandInfo(commands, handler)
    }

    @Signature
    default Memory configGet(Environment __env__, Memory... args) {
        this.getWrappedObject().configGet(parameter, handler)
    }

    @Signature
    default Memory configRewrite(Environment __env__, Memory... args) {
        this.getWrappedObject().configRewrite(handler)
    }

    @Signature
    default Memory configSet(Environment __env__, Memory... args) {
        this.getWrappedObject().configSet(parameter, value, handler)
    }

    @Signature
    default Memory configResetstat(Environment __env__, Memory... args) {
        this.getWrappedObject().configResetstat(handler)
    }

    @Signature
    default Memory dbsize(Environment __env__, Memory... args) {
        this.getWrappedObject().dbsize(handler)
    }

    @Signature
    default Memory debugObject(Environment __env__, Memory... args) {
        this.getWrappedObject().debugObject(key, handler)
    }

    @Signature
    default Memory debugSegfault(Environment __env__, Memory... args) {
        this.getWrappedObject().debugSegfault(handler)
    }

    @Signature
    default Memory decr(Environment __env__, Memory... args) {
        this.getWrappedObject().decr(key, handler)
    }

    @Signature
    default Memory decrby(Environment __env__, Memory... args) {
        this.getWrappedObject().decrby(key, decrement, handler)
    }

    @Signature
    default Memory del(Environment __env__, Memory... args) {
        this.getWrappedObject().del(key, handler)
    }

    @Signature
    default Memory delMany(Environment __env__, Memory... args) {
        this.getWrappedObject().delMany(keys, handler)
    }

    @Signature
    default Memory discard(Environment __env__, Memory... args) {
        this.getWrappedObject().discard(handler)
    }

    @Signature
    default Memory dump(Environment __env__, Memory... args) {
        this.getWrappedObject().dump(key, handler)
    }

    @Signature
    default Memory echo(Environment __env__, Memory... args) {
        this.getWrappedObject().echo(message, handler)
    }

    @Signature
    default Memory eval(Environment __env__, Memory... args) {
        this.getWrappedObject().eval(script, keys, args, handler)
    }

    @Signature
    default Memory evalsha(Environment __env__, Memory... args) {
        this.getWrappedObject().evalsha(sha1, keys, values, handler)
    }

    @Signature
    default Memory exec(Environment __env__, Memory... args) {
        this.getWrappedObject().exec(handler)
    }

    @Signature
    default Memory exists(Environment __env__, Memory... args) {
        this.getWrappedObject().exists(key, handler)
    }

    @Signature
    default Memory existsMany(Environment __env__, Memory... args) {
        this.getWrappedObject().existsMany(keys, handler)
    }

    @Signature
    default Memory expire(Environment __env__, Memory... args) {
        this.getWrappedObject().expire(key, seconds, handler)
    }

    @Signature
    default Memory expireat(Environment __env__, Memory... args) {
        this.getWrappedObject().expireat(key, seconds, handler)
    }

    @Signature
    default Memory flushall(Environment __env__, Memory... args) {
        this.getWrappedObject().flushall(handler)
    }

    @Signature
    default Memory flushdb(Environment __env__, Memory... args) {
        this.getWrappedObject().flushdb(handler)
    }

    @Signature
    default Memory get(Environment __env__, Memory... args) {
        this.getWrappedObject().get(key, handler)
    }

    @Signature
    default Memory getBinary(Environment __env__, Memory... args) {
        this.getWrappedObject().getBinary(key, handler)
    }

    @Signature
    default Memory getbit(Environment __env__, Memory... args) {
        this.getWrappedObject().getbit(key, offset, handler)
    }

    @Signature
    default Memory getrange(Environment __env__, Memory... args) {
        this.getWrappedObject().getrange(key, start, end, handler)
    }

    @Signature
    default Memory getset(Environment __env__, Memory... args) {
        this.getWrappedObject().getset(key, value, handler)
    }

    @Signature
    default Memory hdel(Environment __env__, Memory... args) {
        this.getWrappedObject().hdel(key, field, handler)
    }

    @Signature
    default Memory hdelMany(Environment __env__, Memory... args) {
        this.getWrappedObject().hdelMany(key, fields, handler)
    }

    @Signature
    default Memory hexists(Environment __env__, Memory... args) {
        this.getWrappedObject().hexists(key, field, handler)
    }

    @Signature
    default Memory hget(Environment __env__, Memory... args) {
        this.getWrappedObject().hget(key, field, handler)
    }

    @Signature
    default Memory hgetall(Environment __env__, Memory... args) {
        this.getWrappedObject().hgetall(key, handler)
    }

    @Signature
    default Memory hincrby(Environment __env__, Memory... args) {
        this.getWrappedObject().hincrby(key, field, increment, handler)
    }

    @Signature
    default Memory hincrbyfloat(Environment __env__, Memory... args) {
        this.getWrappedObject().hincrbyfloat(key, field, increment, handler)
    }

    @Signature
    default Memory hkeys(Environment __env__, Memory... args) {
        this.getWrappedObject().hkeys(key, handler)
    }

    @Signature
    default Memory hlen(Environment __env__, Memory... args) {
        this.getWrappedObject().hlen(key, handler)
    }

    @Signature
    default Memory hmget(Environment __env__, Memory... args) {
        this.getWrappedObject().hmget(key, fields, handler)
    }

    @Signature
    default Memory hmset(Environment __env__, Memory... args) {
        this.getWrappedObject().hmset(key, values, handler)
    }

    @Signature
    default Memory hset(Environment __env__, Memory... args) {
        this.getWrappedObject().hset(key, field, value, handler)
    }

    @Signature
    default Memory hsetnx(Environment __env__, Memory... args) {
        this.getWrappedObject().hsetnx(key, field, value, handler)
    }

    @Signature
    default Memory hvals(Environment __env__, Memory... args) {
        this.getWrappedObject().hvals(key, handler)
    }

    @Signature
    default Memory incr(Environment __env__, Memory... args) {
        this.getWrappedObject().incr(key, handler)
    }

    @Signature
    default Memory incrby(Environment __env__, Memory... args) {
        this.getWrappedObject().incrby(key, increment, handler)
    }

    @Signature
    default Memory incrbyfloat(Environment __env__, Memory... args) {
        this.getWrappedObject().incrbyfloat(key, increment, handler)
    }

    @Signature
    default Memory info(Environment __env__, Memory... args) {
        this.getWrappedObject().info(handler)
    }

    @Signature
    default Memory infoSection(Environment __env__, Memory... args) {
        this.getWrappedObject().infoSection(section, handler)
    }

    @Signature
    default Memory keys(Environment __env__, Memory... args) {
        this.getWrappedObject().keys(pattern, handler)
    }

    @Signature
    default Memory lastsave(Environment __env__, Memory... args) {
        this.getWrappedObject().lastsave(handler)
    }

    @Signature
    default Memory lindex(Environment __env__, Memory... args) {
        this.getWrappedObject().lindex(key, index, handler)
    }

    @Signature
    default Memory linsert(Environment __env__, Memory... args) {
        this.getWrappedObject().linsert(key, option, pivot, value, handler)
    }

    @Signature
    default Memory llen(Environment __env__, Memory... args) {
        this.getWrappedObject().llen(key, handler)
    }

    @Signature
    default Memory lpop(Environment __env__, Memory... args) {
        this.getWrappedObject().lpop(key, handler)
    }

    @Signature
    default Memory lpushMany(Environment __env__, Memory... args) {
        this.getWrappedObject().lpushMany(key, values, handler)
    }

    @Signature
    default Memory lpush(Environment __env__, Memory... args) {
        this.getWrappedObject().lpush(key, value, handler)
    }

    @Signature
    default Memory lpushx(Environment __env__, Memory... args) {
        this.getWrappedObject().lpushx(key, value, handler)
    }

    @Signature
    default Memory lrange(Environment __env__, Memory... args) {
        this.getWrappedObject().lrange(key, from, to, handler)
    }

    @Signature
    default Memory lrem(Environment __env__, Memory... args) {
        this.getWrappedObject().lrem(key, count, value, handler)
    }

    @Signature
    default Memory lset(Environment __env__, Memory... args) {
        this.getWrappedObject().lset(key, index, value, handler)
    }

    @Signature
    default Memory ltrim(Environment __env__, Memory... args) {
        this.getWrappedObject().ltrim(key, from, to, handler)
    }

    @Signature
    default Memory mget(Environment __env__, Memory... args) {
        this.getWrappedObject().mget(key, handler)
    }

    @Signature
    default Memory mgetMany(Environment __env__, Memory... args) {
        this.getWrappedObject().mgetMany(keys, handler)
    }

    @Signature
    default Memory migrate(Environment __env__, Memory... args) {
        this.getWrappedObject().migrate(host, port, key, destdb, timeout, options, handler)
    }

    @Signature
    default Memory monitor(Environment __env__, Memory... args) {
        this.getWrappedObject().monitor(handler)
    }

    @Signature
    default Memory move(Environment __env__, Memory... args) {
        this.getWrappedObject().move(key, destdb, handler)
    }

    @Signature
    default Memory mset(Environment __env__, Memory... args) {
        this.getWrappedObject().mset(keyvals, handler)
    }

    @Signature
    default Memory msetnx(Environment __env__, Memory... args) {
        this.getWrappedObject().msetnx(keyvals, handler)
    }

    @Signature
    default Memory multi(Environment __env__, Memory... args) {
        this.getWrappedObject().multi(handler)
    }

    @Signature
    default Memory object(Environment __env__, Memory... args) {
        this.getWrappedObject().object(key, cmd, handler)
    }

    @Signature
    default Memory persist(Environment __env__, Memory... args) {
        this.getWrappedObject().persist(key, handler)
    }

    @Signature
    default Memory pexpire(Environment __env__, Memory... args) {
        this.getWrappedObject().pexpire(key, millis, handler)
    }

    @Signature
    default Memory pexpireat(Environment __env__, Memory... args) {
        this.getWrappedObject().pexpireat(key, millis, handler)
    }

    @Signature
    default Memory pfadd(Environment __env__, Memory... args) {
        this.getWrappedObject().pfadd(key, element, handler)
    }

    @Signature
    default Memory pfaddMany(Environment __env__, Memory... args) {
        this.getWrappedObject().pfaddMany(key, elements, handler)
    }

    @Signature
    default Memory pfcount(Environment __env__, Memory... args) {
        this.getWrappedObject().pfcount(key, handler)
    }

    @Signature
    default Memory pfcountMany(Environment __env__, Memory... args) {
        this.getWrappedObject().pfcountMany(keys, handler)
    }

    @Signature
    default Memory pfmerge(Environment __env__, Memory... args) {
        this.getWrappedObject().pfmerge(destkey, keys, handler)
    }

    @Signature
    default Memory ping(Environment __env__, Memory... args) {
        this.getWrappedObject().ping(handler)
    }

    @Signature
    default Memory psetex(Environment __env__, Memory... args) {
        this.getWrappedObject().psetex(key, millis, value, handler)
    }

    @Signature
    default Memory psubscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().psubscribe(pattern, handler)
    }

    @Signature
    default Memory psubscribeMany(Environment __env__, Memory... args) {
        this.getWrappedObject().psubscribeMany(patterns, handler)
    }

    @Signature
    default Memory pubsubChannels(Environment __env__, Memory... args) {
        this.getWrappedObject().pubsubChannels(pattern, handler)
    }

    @Signature
    default Memory pubsubNumsub(Environment __env__, Memory... args) {
        this.getWrappedObject().pubsubNumsub(channels, handler)
    }

    @Signature
    default Memory pubsubNumpat(Environment __env__, Memory... args) {
        this.getWrappedObject().pubsubNumpat(handler)
    }

    @Signature
    default Memory pttl(Environment __env__, Memory... args) {
        this.getWrappedObject().pttl(key, handler)
    }

    @Signature
    default Memory publish(Environment __env__, Memory... args) {
        this.getWrappedObject().publish(channel, message, handler)
    }

    @Signature
    default Memory punsubscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().punsubscribe(patterns, handler)
    }

    @Signature
    default Memory randomkey(Environment __env__, Memory... args) {
        this.getWrappedObject().randomkey(handler)
    }

    @Signature
    default Memory rename(Environment __env__, Memory... args) {
        this.getWrappedObject().rename(key, newkey, handler)
    }

    @Signature
    default Memory renamenx(Environment __env__, Memory... args) {
        this.getWrappedObject().renamenx(key, newkey, handler)
    }

    @Signature
    default Memory restore(Environment __env__, Memory... args) {
        this.getWrappedObject().restore(key, millis, serialized, handler)
    }

    @Signature
    default Memory role(Environment __env__, Memory... args) {
        this.getWrappedObject().role(handler)
    }

    @Signature
    default Memory rpop(Environment __env__, Memory... args) {
        this.getWrappedObject().rpop(key, handler)
    }

    @Signature
    default Memory rpoplpush(Environment __env__, Memory... args) {
        this.getWrappedObject().rpoplpush(key, destkey, handler)
    }

    @Signature
    default Memory rpushMany(Environment __env__, Memory... args) {
        this.getWrappedObject().rpushMany(key, values, handler)
    }

    @Signature
    default Memory rpush(Environment __env__, Memory... args) {
        this.getWrappedObject().rpush(key, value, handler)
    }

    @Signature
    default Memory rpushx(Environment __env__, Memory... args) {
        this.getWrappedObject().rpushx(key, value, handler)
    }

    @Signature
    default Memory sadd(Environment __env__, Memory... args) {
        this.getWrappedObject().sadd(key, member, handler)
    }

    @Signature
    default Memory saddMany(Environment __env__, Memory... args) {
        this.getWrappedObject().saddMany(key, members, handler)
    }

    @Signature
    default Memory save(Environment __env__, Memory... args) {
        this.getWrappedObject().save(handler)
    }

    @Signature
    default Memory scard(Environment __env__, Memory... args) {
        this.getWrappedObject().scard(key, handler)
    }

    @Signature
    default Memory scriptExists(Environment __env__, Memory... args) {
        this.getWrappedObject().scriptExists(script, handler)
    }

    @Signature
    default Memory scriptExistsMany(Environment __env__, Memory... args) {
        this.getWrappedObject().scriptExistsMany(scripts, handler)
    }

    @Signature
    default Memory scriptFlush(Environment __env__, Memory... args) {
        this.getWrappedObject().scriptFlush(handler)
    }

    @Signature
    default Memory scriptKill(Environment __env__, Memory... args) {
        this.getWrappedObject().scriptKill(handler)
    }

    @Signature
    default Memory scriptLoad(Environment __env__, Memory... args) {
        this.getWrappedObject().scriptLoad(script, handler)
    }

    @Signature
    default Memory sdiff(Environment __env__, Memory... args) {
        this.getWrappedObject().sdiff(key, cmpkeys, handler)
    }

    @Signature
    default Memory sdiffstore(Environment __env__, Memory... args) {
        this.getWrappedObject().sdiffstore(destkey, key, cmpkeys, handler)
    }

    @Signature
    default Memory select(Environment __env__, Memory... args) {
        this.getWrappedObject().select(dbindex, handler)
    }

    @Signature
    default Memory set(Environment __env__, Memory... args) {
        this.getWrappedObject().set(key, value, handler)
    }

    @Signature
    default Memory setWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().setWithOptions(key, value, options, handler)
    }

    @Signature
    default Memory setBinary(Environment __env__, Memory... args) {
        this.getWrappedObject().setBinary(key, value, handler)
    }

    @Signature
    default Memory setBinaryWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().setBinaryWithOptions(key, value, options, handler)
    }

    @Signature
    default Memory setbit(Environment __env__, Memory... args) {
        this.getWrappedObject().setbit(key, offset, bit, handler)
    }

    @Signature
    default Memory setex(Environment __env__, Memory... args) {
        this.getWrappedObject().setex(key, seconds, value, handler)
    }

    @Signature
    default Memory setnx(Environment __env__, Memory... args) {
        this.getWrappedObject().setnx(key, value, handler)
    }

    @Signature
    default Memory setrange(Environment __env__, Memory... args) {
        this.getWrappedObject().setrange(key, offset, value, handler)
    }

    @Signature
    default Memory sinter(Environment __env__, Memory... args) {
        this.getWrappedObject().sinter(keys, handler)
    }

    @Signature
    default Memory sinterstore(Environment __env__, Memory... args) {
        this.getWrappedObject().sinterstore(destkey, keys, handler)
    }

    @Signature
    default Memory sismember(Environment __env__, Memory... args) {
        this.getWrappedObject().sismember(key, member, handler)
    }

    @Signature
    default Memory slaveof(Environment __env__, Memory... args) {
        this.getWrappedObject().slaveof(host, port, handler)
    }

    @Signature
    default Memory slaveofNoone(Environment __env__, Memory... args) {
        this.getWrappedObject().slaveofNoone(handler)
    }

    @Signature
    default Memory slowlogGet(Environment __env__, Memory... args) {
        this.getWrappedObject().slowlogGet(limit, handler)
    }

    @Signature
    default Memory slowlogLen(Environment __env__, Memory... args) {
        this.getWrappedObject().slowlogLen(handler)
    }

    @Signature
    default Memory slowlogReset(Environment __env__, Memory... args) {
        this.getWrappedObject().slowlogReset(handler)
    }

    @Signature
    default Memory smembers(Environment __env__, Memory... args) {
        this.getWrappedObject().smembers(key, handler)
    }

    @Signature
    default Memory smove(Environment __env__, Memory... args) {
        this.getWrappedObject().smove(key, destkey, member, handler)
    }

    @Signature
    default Memory sort(Environment __env__, Memory... args) {
        this.getWrappedObject().sort(key, options, handler)
    }

    @Signature
    default Memory spop(Environment __env__, Memory... args) {
        this.getWrappedObject().spop(key, handler)
    }

    @Signature
    default Memory spopMany(Environment __env__, Memory... args) {
        this.getWrappedObject().spopMany(key, count, handler)
    }

    @Signature
    default Memory srandmember(Environment __env__, Memory... args) {
        this.getWrappedObject().srandmember(key, handler)
    }

    @Signature
    default Memory srandmemberCount(Environment __env__, Memory... args) {
        this.getWrappedObject().srandmemberCount(key, count, handler)
    }

    @Signature
    default Memory srem(Environment __env__, Memory... args) {
        this.getWrappedObject().srem(key, member, handler)
    }

    @Signature
    default Memory sremMany(Environment __env__, Memory... args) {
        this.getWrappedObject().sremMany(key, members, handler)
    }

    @Signature
    default Memory strlen(Environment __env__, Memory... args) {
        this.getWrappedObject().strlen(key, handler)
    }

    @Signature
    default Memory subscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribe(channel, handler)
    }

    @Signature
    default Memory subscribeMany(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribeMany(channels, handler)
    }

    @Signature
    default Memory sunion(Environment __env__, Memory... args) {
        this.getWrappedObject().sunion(keys, handler)
    }

    @Signature
    default Memory sunionstore(Environment __env__, Memory... args) {
        this.getWrappedObject().sunionstore(destkey, keys, handler)
    }

    @Signature
    default Memory sync(Environment __env__, Memory... args) {
        this.getWrappedObject().sync(handler)
    }

    @Signature
    default Memory time(Environment __env__, Memory... args) {
        this.getWrappedObject().time(handler)
    }

    @Signature
    default Memory ttl(Environment __env__, Memory... args) {
        this.getWrappedObject().ttl(key, handler)
    }

    @Signature
    default Memory type(Environment __env__, Memory... args) {
        this.getWrappedObject().type(key, handler)
    }

    @Signature
    default Memory unsubscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribe(channels, handler)
    }

    @Signature
    default Memory unwatch(Environment __env__, Memory... args) {
        this.getWrappedObject().unwatch(handler)
    }

    @Signature
    default Memory wait(Environment __env__, Memory... args) {
        this.getWrappedObject().wait(numSlaves, timeout, handler)
    }

    @Signature
    default Memory watch(Environment __env__, Memory... args) {
        this.getWrappedObject().watch(key, handler)
    }

    @Signature
    default Memory watchMany(Environment __env__, Memory... args) {
        this.getWrappedObject().watchMany(keys, handler)
    }

    @Signature
    default Memory zadd(Environment __env__, Memory... args) {
        this.getWrappedObject().zadd(key, score, member, handler)
    }

    @Signature
    default Memory zaddMany(Environment __env__, Memory... args) {
        this.getWrappedObject().zaddMany(key, members, handler)
    }

    @Signature
    default Memory zcard(Environment __env__, Memory... args) {
        this.getWrappedObject().zcard(key, handler)
    }

    @Signature
    default Memory zcount(Environment __env__, Memory... args) {
        this.getWrappedObject().zcount(key, min, max, handler)
    }

    @Signature
    default Memory zincrby(Environment __env__, Memory... args) {
        this.getWrappedObject().zincrby(key, increment, member, handler)
    }

    @Signature
    default Memory zinterstore(Environment __env__, Memory... args) {
        this.getWrappedObject().zinterstore(destkey, sets, options, handler)
    }

    @Signature
    default Memory zinterstoreWeighed(Environment __env__, Memory... args) {
        this.getWrappedObject().zinterstoreWeighed(destkey, sets, options, handler)
    }

    @Signature
    default Memory zlexcount(Environment __env__, Memory... args) {
        this.getWrappedObject().zlexcount(key, min, max, handler)
    }

    @Signature
    default Memory zrange(Environment __env__, Memory... args) {
        this.getWrappedObject().zrange(key, start, stop, handler)
    }

    @Signature
    default Memory zrangeWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().zrangeWithOptions(key, start, stop, options, handler)
    }

    @Signature
    default Memory zrangebylex(Environment __env__, Memory... args) {
        this.getWrappedObject().zrangebylex(key, min, max, options, handler)
    }

    @Signature
    default Memory zrangebyscore(Environment __env__, Memory... args) {
        this.getWrappedObject().zrangebyscore(key, min, max, options, handler)
    }

    @Signature
    default Memory zrank(Environment __env__, Memory... args) {
        this.getWrappedObject().zrank(key, member, handler)
    }

    @Signature
    default Memory zrem(Environment __env__, Memory... args) {
        this.getWrappedObject().zrem(key, member, handler)
    }

    @Signature
    default Memory zremMany(Environment __env__, Memory... args) {
        this.getWrappedObject().zremMany(key, members, handler)
    }

    @Signature
    default Memory zremrangebylex(Environment __env__, Memory... args) {
        this.getWrappedObject().zremrangebylex(key, min, max, handler)
    }

    @Signature
    default Memory zremrangebyrank(Environment __env__, Memory... args) {
        this.getWrappedObject().zremrangebyrank(key, start, stop, handler)
    }

    @Signature
    default Memory zremrangebyscore(Environment __env__, Memory... args) {
        this.getWrappedObject().zremrangebyscore(key, min, max, handler)
    }

    @Signature
    default Memory zrevrange(Environment __env__, Memory... args) {
        this.getWrappedObject().zrevrange(key, start, stop, options, handler)
    }

    @Signature
    default Memory zrevrangebylex(Environment __env__, Memory... args) {
        this.getWrappedObject().zrevrangebylex(key, max, min, options, handler)
    }

    @Signature
    default Memory zrevrangebyscore(Environment __env__, Memory... args) {
        this.getWrappedObject().zrevrangebyscore(key, max, min, options, handler)
    }

    @Signature
    default Memory zrevrank(Environment __env__, Memory... args) {
        this.getWrappedObject().zrevrank(key, member, handler)
    }

    @Signature
    default Memory zscore(Environment __env__, Memory... args) {
        this.getWrappedObject().zscore(key, member, handler)
    }

    @Signature
    default Memory zunionstore(Environment __env__, Memory... args) {
        this.getWrappedObject().zunionstore(destkey, sets, options, handler)
    }

    @Signature
    default Memory zunionstoreWeighed(Environment __env__, Memory... args) {
        this.getWrappedObject().zunionstoreWeighed(key, sets, options, handler)
    }

    @Signature
    default Memory scan(Environment __env__, Memory... args) {
        this.getWrappedObject().scan(cursor, options, handler)
    }

    @Signature
    default Memory sscan(Environment __env__, Memory... args) {
        this.getWrappedObject().sscan(key, cursor, options, handler)
    }

    @Signature
    default Memory hscan(Environment __env__, Memory... args) {
        this.getWrappedObject().hscan(key, cursor, options, handler)
    }

    @Signature
    default Memory zscan(Environment __env__, Memory... args) {
        this.getWrappedObject().zscan(key, cursor, options, handler)
    }

    @Signature
    default Memory geoadd(Environment __env__, Memory... args) {
        this.getWrappedObject().geoadd(key, longitude, latitude, member, handler)
    }

    @Signature
    default Memory geoaddMany(Environment __env__, Memory... args) {
        this.getWrappedObject().geoaddMany(key, members, handler)
    }

    @Signature
    default Memory geohash(Environment __env__, Memory... args) {
        this.getWrappedObject().geohash(key, member, handler)
    }

    @Signature
    default Memory geohashMany(Environment __env__, Memory... args) {
        this.getWrappedObject().geohashMany(key, members, handler)
    }

    @Signature
    default Memory geopos(Environment __env__, Memory... args) {
        this.getWrappedObject().geopos(key, member, handler)
    }

    @Signature
    default Memory geoposMany(Environment __env__, Memory... args) {
        this.getWrappedObject().geoposMany(key, members, handler)
    }

    @Signature
    default Memory geodist(Environment __env__, Memory... args) {
        this.getWrappedObject().geodist(key, member1, member2, handler)
    }

    @Signature
    default Memory geodistWithUnit(Environment __env__, Memory... args) {
        this.getWrappedObject().geodistWithUnit(key, member1, member2, unit, handler)
    }

    @Signature
    default Memory georadius(Environment __env__, Memory... args) {
        this.getWrappedObject().georadius(key, longitude, latitude, radius, unit, handler)
    }

    @Signature
    default Memory georadiusWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().georadiusWithOptions(key, longitude, latitude, radius, unit, options, handler)
    }

    @Signature
    default Memory georadiusbymember(Environment __env__, Memory... args) {
        this.getWrappedObject().georadiusbymember(key, member, radius, unit, handler)
    }

    @Signature
    default Memory georadiusbymemberWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().georadiusbymemberWithOptions(key, member, radius, unit, options, handler)
    }

    @Signature
    default Memory unlink(Environment __env__, Memory... args) {
        this.getWrappedObject().unlink(key, handler)
    }

    @Signature
    default Memory unlinkMany(Environment __env__, Memory... args) {
        this.getWrappedObject().unlinkMany(keys, handler)
    }

    @Signature
    default Memory swapdb(Environment __env__, Memory... args) {
        this.getWrappedObject().swapdb(index1, index2, handler)
    }

}
