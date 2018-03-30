package io.vertx.php.kafka.client.producer;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.ContainerConverter;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable2Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.kafka.client.common.PartitionInfo;
import java.lang.Class;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("KafkaProducer")
@Namespace("io\\vertx\\php\\kafka\\client\\producer")
@SuppressWarnings("ALL")
public class KafkaProducer<K, V> extends VertxGenVariable2Wrapper<io.vertx.kafka.client.producer.KafkaProducer<K,V>,K,V>{
    
    private KafkaProducer(Environment env, io.vertx.kafka.client.producer.KafkaProducer<K,V> wrappedObject, TypeConverter<K> kafkaProducerVariableKConverter, TypeConverter<V> kafkaProducerVariableVConverter){
        super(env, wrappedObject, kafkaProducerVariableKConverter, kafkaProducerVariableVConverter);
    }
    public static <K, V> KafkaProducer<K, V> __create(Environment env, io.vertx.kafka.client.producer.KafkaProducer<K,V> wrappedObject, TypeConverter<K> kafkaProducerVariableKConverter, TypeConverter<V> kafkaProducerVariableVConverter){
        return new KafkaProducer<>(env, wrappedObject, kafkaProducerVariableKConverter, kafkaProducerVariableVConverter);
    }

    public static KafkaProducer<Object, Object> __create(Environment env, io.vertx.kafka.client.producer.KafkaProducer<Object, Object> wrappedObject) {
        return new KafkaProducer<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<K> getKafkaProducerVariableKConverter() {
        return this.getTypeConverter1();
    }

    public void setKafkaProducerVariableKConverter(TypeConverter<K> kafkaProducerVariableKConverter) {
        this.setTypeConverter1(kafkaProducerVariableKConverter);
    }

    public TypeConverter<V> getKafkaProducerVariableVConverter() {
        return this.getTypeConverter2();
    }

    public void setKafkaProducerVariableVConverter(TypeConverter<V> kafkaProducerVariableVConverter) {
        this.setTypeConverter2(kafkaProducerVariableVConverter);
    }

    @Signature
    public static Memory createShared(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isMap(__ENV__, TypeConverter.STRING, arg2)) {
            return Utils.<io.vertx.kafka.client.producer.KafkaProducer<Object, Object>, KafkaProducer<Object, Object>, Object, Object>convReturnVertxGenVariable2(__ENV__, KafkaProducer.class, KafkaProducer::__create, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, io.vertx.kafka.client.producer.KafkaProducer.createShared(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory createShared(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isMap(__ENV__, TypeConverter.STRING, arg2) && Utils.isNotNull(arg3) && Utils.isClassType(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isClassType(__ENV__, arg4)) {
            return Utils.<io.vertx.kafka.client.producer.KafkaProducer<Object, Object>, KafkaProducer<Object, Object>, Object, Object>convReturnVertxGenVariable2(__ENV__, KafkaProducer.class, KafkaProducer::__create, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, io.vertx.kafka.client.producer.KafkaProducer.createShared(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg2), Utils.convParamClassType(__ENV__, arg3), Utils.convParamClassType(__ENV__, arg4)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1)) {
            return Utils.<io.vertx.kafka.client.producer.KafkaProducer<Object, Object>, KafkaProducer<Object, Object>, Object, Object>convReturnVertxGenVariable2(__ENV__, KafkaProducer.class, KafkaProducer::__create, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, io.vertx.kafka.client.producer.KafkaProducer.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isClassType(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isClassType(__ENV__, arg3)) {
            return Utils.<io.vertx.kafka.client.producer.KafkaProducer<Object, Object>, KafkaProducer<Object, Object>, Object, Object>convReturnVertxGenVariable2(__ENV__, KafkaProducer.class, KafkaProducer::__create, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, io.vertx.kafka.client.producer.KafkaProducer.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1), Utils.convParamClassType(__ENV__, arg2), Utils.convParamClassType(__ENV__, arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory exceptionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().exceptionHandler(Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory write(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.kafka.client.producer.KafkaProducerRecord.class, KafkaProducerRecord.class, arg0)) {
            this.getWrappedObject().write(Utils.  <io.vertx.kafka.client.producer.KafkaProducerRecord<K, V>, KafkaProducerRecord<K, V>  , K, V  >convParamVertxGenVariable2(__ENV__, KafkaProducerRecord.class, KafkaProducerRecord::__create,  getKafkaProducerVariableKConverter(), getKafkaProducerVariableVConverter(), arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory write(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.kafka.client.producer.KafkaProducerRecord.class, KafkaProducerRecord.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().write(Utils.  <io.vertx.kafka.client.producer.KafkaProducerRecord<K, V>, KafkaProducerRecord<K, V>  , K, V  >convParamVertxGenVariable2(__ENV__, KafkaProducerRecord.class, KafkaProducerRecord::__create,  getKafkaProducerVariableKConverter(), getKafkaProducerVariableVConverter(), arg0), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.producer.RecordMetadata.class), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void end(Environment __ENV__) {
        this.getWrappedObject().end();
    }/*4*/

    @Signature
    public void end(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.kafka.client.producer.KafkaProducerRecord.class, KafkaProducerRecord.class, arg0)) {
            this.getWrappedObject().end(Utils.  <io.vertx.kafka.client.producer.KafkaProducerRecord<K, V>, KafkaProducerRecord<K, V>  , K, V  >convParamVertxGenVariable2(__ENV__, KafkaProducerRecord.class, KafkaProducerRecord::__create,  getKafkaProducerVariableKConverter(), getKafkaProducerVariableVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setWriteQueueMaxSize(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().setWriteQueueMaxSize(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory writeQueueFull(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().writeQueueFull());
    }/*1*/

    @Signature
    public Memory drainHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().drainHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory partitionsFor(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().partitionsFor(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.kafka.client.common.PartitionInfo.class)), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory flush(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().flush(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*4*/

    @Signature
    public void close(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().close(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void close(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().close(Utils.convParamLong(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
