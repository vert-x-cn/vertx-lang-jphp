package io.vertx.php.redis;
import io.vertx.core.json.JsonArray;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.redis.op.GeoRadiusOptions;
import io.vertx.php.redis.op.KillFilter;
import io.vertx.php.redis.op.LimitOptions;
import io.vertx.php.redis.op.MigrateOptions;
import io.vertx.php.redis.op.RangeLimitOptions;
import io.vertx.php.redis.op.ScanOptions;
import io.vertx.php.redis.op.SetOptions;
import io.vertx.php.redis.op.SortOptions;
import io.vertx.redis.op.AggregateOptions;
import io.vertx.redis.op.BitOperation;
import io.vertx.redis.op.FailoverOptions;
import io.vertx.redis.op.GeoUnit;
import io.vertx.redis.op.InsertOptions;
import io.vertx.redis.op.ObjectCmd;
import io.vertx.redis.op.RangeOptions;
import io.vertx.redis.op.ResetOptions;
import io.vertx.redis.op.SlotCmd;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("RedisTransaction")
@Namespace("io\\vertx\\php\\redis")
@SuppressWarnings("ALL")
public class RedisTransaction extends VertxGenVariable0Wrapper<io.vertx.redis.RedisTransaction>{
    
    private RedisTransaction(Environment env, io.vertx.redis.RedisTransaction wrappedObject){
        super(env, wrappedObject);
    }
    public static  RedisTransaction __create(Environment env, io.vertx.redis.RedisTransaction wrappedObject){
        return new RedisTransaction(env, wrappedObject);
    }

    @Signature
    public void close(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().close(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory append(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().append(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory auth(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().auth(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bgrewriteaof(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().bgrewriteaof(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bgsave(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().bgsave(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bitcount(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().bitcount(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bitcountRange(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().bitcountRange(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bitop(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, BitOperation.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isList(__ENV__, TypeConverter.STRING, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().bitop(Utils.convParamEnum(__ENV__, BitOperation.class, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamList(__ENV__, TypeConverter.STRING, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bitpos(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().bitpos(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bitposFrom(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isInteger(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().bitposFrom(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamInteger(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bitposRange(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isInteger(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isInteger(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().bitposRange(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamInteger(__ENV__, arg2), Utils.convParamInteger(__ENV__, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory blpop(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().blpop(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory blpopMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().blpopMany(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory brpop(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().brpop(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory brpopMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().brpopMany(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory brpoplpush(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isInteger(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().brpoplpush(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamInteger(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clientKill(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.redis.op.KillFilter.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clientKill(Utils.convParamDataObject(__ENV__, io.vertx.redis.op.KillFilter.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clientList(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().clientList(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clientGetname(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().clientGetname(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clientPause(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clientPause(Utils.convParamLong(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clientSetname(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clientSetname(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterAddslots(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clusterAddslots(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterCountFailureReports(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clusterCountFailureReports(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterCountkeysinslot(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clusterCountkeysinslot(Utils.convParamLong(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterDelslots(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clusterDelslots(Utils.convParamLong(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterDelslotsMany(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clusterDelslotsMany(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterFailover(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().clusterFailover(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterFailOverWithOptions(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, FailoverOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clusterFailOverWithOptions(Utils.convParamEnum(__ENV__, FailoverOptions.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterForget(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clusterForget(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterGetkeysinslot(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().clusterGetkeysinslot(Utils.convParamLong(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterInfo(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().clusterInfo(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterKeyslot(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clusterKeyslot(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterMeet(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().clusterMeet(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterNodes(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().clusterNodes(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterReplicate(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clusterReplicate(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterReset(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().clusterReset(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterResetWithOptions(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, ResetOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clusterResetWithOptions(Utils.convParamEnum(__ENV__, ResetOptions.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterSaveconfig(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().clusterSaveconfig(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterSetConfigEpoch(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clusterSetConfigEpoch(Utils.convParamLong(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterSetslot(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isEnum(__ENV__, SlotCmd.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().clusterSetslot(Utils.convParamLong(__ENV__, arg0), Utils.convParamEnum(__ENV__, SlotCmd.class, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterSetslotWithNode(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isEnum(__ENV__, SlotCmd.class, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().clusterSetslotWithNode(Utils.convParamLong(__ENV__, arg0), Utils.convParamEnum(__ENV__, SlotCmd.class, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterSlaves(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().clusterSlaves(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clusterSlots(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().clusterSlots(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory command(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().command(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory commandCount(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().commandCount(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory commandGetkeys(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().commandGetkeys(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory commandInfo(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().commandInfo(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory configGet(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().configGet(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory configRewrite(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().configRewrite(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory configSet(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().configSet(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory configResetstat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().configResetstat(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory dbsize(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().dbsize(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory debugObject(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().debugObject(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory debugSegfault(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().debugSegfault(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory decr(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().decr(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory decrby(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().decrby(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory del(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().del(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory delMany(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().delMany(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory discard(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().discard(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory dump(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().dump(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory echo(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().echo(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory eval(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isList(__ENV__, TypeConverter.STRING, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().eval(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamList(__ENV__, TypeConverter.STRING, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory evalsha(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isList(__ENV__, TypeConverter.STRING, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().evalsha(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamList(__ENV__, TypeConverter.STRING, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory exec(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().exec(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_ARRAY, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory exists(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().exists(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory existsMany(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().existsMany(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory expire(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().expire(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory expireat(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().expireat(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory flushall(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().flushall(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory flushdb(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().flushdb(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory get(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().get(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getBinary(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().getBinary(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getbit(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().getbit(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getrange(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().getrange(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getset(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().getset(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hdel(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().hdel(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hdelMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().hdelMany(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hexists(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().hexists(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hget(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().hget(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hgetall(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().hgetall(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hincrby(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().hincrby(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hincrbyfloat(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDouble(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().hincrbyfloat(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamDouble(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hkeys(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().hkeys(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hlen(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().hlen(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hmget(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().hmget(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hmset(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().hmset(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hset(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().hset(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hsetnx(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().hsetnx(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hvals(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().hvals(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory incr(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().incr(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory incrby(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().incrby(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory incrbyfloat(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDouble(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().incrbyfloat(Utils.convParamString(__ENV__, arg0), Utils.convParamDouble(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory info(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().info(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory infoSection(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().infoSection(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory keys(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().keys(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory lastsave(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().lastsave(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory lindex(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().lindex(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory linsert(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isEnum(__ENV__, InsertOptions.class, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().linsert(Utils.convParamString(__ENV__, arg0), Utils.convParamEnum(__ENV__, InsertOptions.class, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamString(__ENV__, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory llen(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().llen(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory lpop(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().lpop(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory lpushMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().lpushMany(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory lpush(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().lpush(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory lpushx(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().lpushx(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory lrange(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().lrange(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory lrem(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().lrem(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory lset(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().lset(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory ltrim(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().ltrim(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory mget(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().mget(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory mgetMany(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().mgetMany(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory migrate(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5, Memory arg6) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isInteger(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isLong(__ENV__, arg4) && Utils.isNotNull(arg5) && Utils.isDataObject(__ENV__, io.vertx.redis.op.MigrateOptions.class, arg5) && Utils.isNotNull(arg6) && Utils.isHandler(__ENV__, arg6)) {
            this.getWrappedObject().migrate(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamInteger(__ENV__, arg3), Utils.convParamLong(__ENV__, arg4), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.MigrateOptions.class, arg5), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg6));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory monitor(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().monitor(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory move(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().move(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory mset(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().mset(Utils.convParamJsonObject(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory msetnx(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().msetnx(Utils.convParamJsonObject(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory multi(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().multi(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory object(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isEnum(__ENV__, ObjectCmd.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().object(Utils.convParamString(__ENV__, arg0), Utils.convParamEnum(__ENV__, ObjectCmd.class, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory persist(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().persist(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pexpire(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().pexpire(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pexpireat(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().pexpireat(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pfadd(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().pfadd(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pfaddMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().pfaddMany(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pfcount(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().pfcount(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pfcountMany(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().pfcountMany(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pfmerge(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().pfmerge(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory ping(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().ping(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory psetex(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().psetex(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory psubscribe(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().psubscribe(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory psubscribeMany(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().psubscribeMany(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pubsubChannels(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().pubsubChannels(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pubsubNumsub(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().pubsubNumsub(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pubsubNumpat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().pubsubNumpat(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pttl(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().pttl(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory publish(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().publish(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory punsubscribe(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().punsubscribe(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory randomkey(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().randomkey(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory rename(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().rename(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory renamenx(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().renamenx(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory restore(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().restore(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory role(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().role(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory rpop(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().rpop(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory rpoplpush(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().rpoplpush(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory rpushMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().rpushMany(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory rpush(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().rpush(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory rpushx(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().rpushx(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sadd(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().sadd(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory saddMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().saddMany(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory save(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().save(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory scard(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().scard(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory scriptExists(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().scriptExists(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory scriptExistsMany(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().scriptExistsMany(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory scriptFlush(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().scriptFlush(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory scriptKill(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().scriptKill(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory scriptLoad(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().scriptLoad(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sdiff(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().sdiff(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sdiffstore(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isList(__ENV__, TypeConverter.STRING, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().sdiffstore(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamList(__ENV__, TypeConverter.STRING, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory select(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().select(Utils.convParamInteger(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory set(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().set(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.redis.op.SetOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().setWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.SetOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setBinary(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().setBinary(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setBinaryWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.redis.op.SetOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().setBinaryWithOptions(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg1), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.SetOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setbit(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isInteger(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().setbit(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamInteger(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setex(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().setex(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setnx(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().setnx(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setrange(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().setrange(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sinter(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().sinter(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sinterstore(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().sinterstore(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sismember(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().sismember(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory slaveof(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().slaveof(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory slaveofNoone(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().slaveofNoone(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory slowlogGet(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().slowlogGet(Utils.convParamInteger(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory slowlogLen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().slowlogLen(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory slowlogReset(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().slowlogReset(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory smembers(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().smembers(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_ARRAY, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory smove(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().smove(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sort(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.redis.op.SortOptions.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().sort(Utils.convParamString(__ENV__, arg0), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.SortOptions.class, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory spop(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().spop(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory spopMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().spopMany(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory srandmember(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().srandmember(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory srandmemberCount(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().srandmemberCount(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory srem(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().srem(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sremMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().sremMany(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory strlen(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().strlen(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory subscribe(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().subscribe(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory subscribeMany(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().subscribeMany(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sunion(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().sunion(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sunionstore(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().sunionstore(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sync(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().sync(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory time(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().time(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory ttl(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().ttl(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory type(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().type(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unsubscribe(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().unsubscribe(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unwatch(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().unwatch(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory wait(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().wait(Utils.convParamLong(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory watch(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().watch(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory watchMany(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().watchMany(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zadd(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDouble(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().zadd(Utils.convParamString(__ENV__, arg0), Utils.convParamDouble(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zaddMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.DOUBLE, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().zaddMany(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.DOUBLE, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zcard(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().zcard(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zcount(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDouble(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDouble(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().zcount(Utils.convParamString(__ENV__, arg0), Utils.convParamDouble(__ENV__, arg1), Utils.convParamDouble(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zincrby(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDouble(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().zincrby(Utils.convParamString(__ENV__, arg0), Utils.convParamDouble(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zinterstore(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, AggregateOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().zinterstore(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamEnum(__ENV__, AggregateOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zinterstoreWeighed(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.DOUBLE, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, AggregateOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().zinterstoreWeighed(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.DOUBLE, arg1), Utils.convParamEnum(__ENV__, AggregateOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zlexcount(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().zlexcount(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zrange(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().zrange(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zrangeWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isEnum(__ENV__, RangeOptions.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().zrangeWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2), Utils.convParamEnum(__ENV__, RangeOptions.class, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zrangebylex(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isDataObject(__ENV__, io.vertx.redis.op.LimitOptions.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().zrangebylex(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.LimitOptions.class, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zrangebyscore(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isDataObject(__ENV__, io.vertx.redis.op.RangeLimitOptions.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().zrangebyscore(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.RangeLimitOptions.class, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zrank(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().zrank(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zrem(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().zrem(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zremMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().zremMany(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zremrangebylex(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().zremrangebylex(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zremrangebyrank(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().zremrangebyrank(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zremrangebyscore(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().zremrangebyscore(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zrevrange(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isEnum(__ENV__, RangeOptions.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().zrevrange(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2), Utils.convParamEnum(__ENV__, RangeOptions.class, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zrevrangebylex(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isDataObject(__ENV__, io.vertx.redis.op.LimitOptions.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().zrevrangebylex(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.LimitOptions.class, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zrevrangebyscore(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isDataObject(__ENV__, io.vertx.redis.op.RangeLimitOptions.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().zrevrangebyscore(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.RangeLimitOptions.class, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zrevrank(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().zrevrank(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zscore(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().zscore(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zunionstore(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, AggregateOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().zunionstore(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamEnum(__ENV__, AggregateOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zunionstoreWeighed(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.DOUBLE, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, AggregateOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().zunionstoreWeighed(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.DOUBLE, arg1), Utils.convParamEnum(__ENV__, AggregateOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory scan(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.redis.op.ScanOptions.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().scan(Utils.convParamString(__ENV__, arg0), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.ScanOptions.class, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sscan(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.redis.op.ScanOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().sscan(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.ScanOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hscan(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.redis.op.ScanOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().hscan(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.ScanOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory zscan(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.redis.op.ScanOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().zscan(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.ScanOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory geoadd(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDouble(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDouble(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().geoadd(Utils.convParamString(__ENV__, arg0), Utils.convParamDouble(__ENV__, arg1), Utils.convParamDouble(__ENV__, arg2), Utils.convParamString(__ENV__, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory geoaddMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, DataObjectConverter.create(io.vertx.redis.op.GeoMember.class), arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().geoaddMany(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, DataObjectConverter.create(io.vertx.redis.op.GeoMember.class), arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory geohash(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().geohash(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory geohashMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().geohashMany(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory geopos(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().geopos(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory geoposMany(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().geoposMany(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory geodist(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().geodist(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory geodistWithUnit(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isEnum(__ENV__, GeoUnit.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().geodistWithUnit(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamEnum(__ENV__, GeoUnit.class, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory georadius(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDouble(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDouble(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isDouble(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isEnum(__ENV__, GeoUnit.class, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5)) {
            this.getWrappedObject().georadius(Utils.convParamString(__ENV__, arg0), Utils.convParamDouble(__ENV__, arg1), Utils.convParamDouble(__ENV__, arg2), Utils.convParamDouble(__ENV__, arg3), Utils.convParamEnum(__ENV__, GeoUnit.class, arg4), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg5));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory georadiusWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5, Memory arg6) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDouble(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDouble(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isDouble(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isEnum(__ENV__, GeoUnit.class, arg4) && Utils.isNotNull(arg5) && Utils.isDataObject(__ENV__, io.vertx.redis.op.GeoRadiusOptions.class, arg5) && Utils.isNotNull(arg6) && Utils.isHandler(__ENV__, arg6)) {
            this.getWrappedObject().georadiusWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamDouble(__ENV__, arg1), Utils.convParamDouble(__ENV__, arg2), Utils.convParamDouble(__ENV__, arg3), Utils.convParamEnum(__ENV__, GeoUnit.class, arg4), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.GeoRadiusOptions.class, arg5), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg6));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory georadiusbymember(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDouble(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isEnum(__ENV__, GeoUnit.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().georadiusbymember(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamDouble(__ENV__, arg2), Utils.convParamEnum(__ENV__, GeoUnit.class, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory georadiusbymemberWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDouble(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isEnum(__ENV__, GeoUnit.class, arg3) && Utils.isNotNull(arg4) && Utils.isDataObject(__ENV__, io.vertx.redis.op.GeoRadiusOptions.class, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5)) {
            this.getWrappedObject().georadiusbymemberWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamDouble(__ENV__, arg2), Utils.convParamEnum(__ENV__, GeoUnit.class, arg3), Utils.convParamDataObject(__ENV__, io.vertx.redis.op.GeoRadiusOptions.class, arg4), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg5));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unlink(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().unlink(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unlinkMany(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().unlinkMany(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory swapdb(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().swapdb(Utils.convParamInteger(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
