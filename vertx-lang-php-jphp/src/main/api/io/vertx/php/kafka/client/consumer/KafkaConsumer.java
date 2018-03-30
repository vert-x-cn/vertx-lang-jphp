package io.vertx.php.kafka.client.consumer;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.ContainerConverter;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable2Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.kafka.client.common.TopicPartition;
import io.vertx.php.kafka.client.consumer.KafkaConsumerRecord;
import io.vertx.php.kafka.client.consumer.KafkaConsumerRecords;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("KafkaConsumer")
@Namespace("io\\vertx\\php\\kafka\\client\\consumer")
@SuppressWarnings("ALL")
public class KafkaConsumer<K, V> extends VertxGenVariable2Wrapper<io.vertx.kafka.client.consumer.KafkaConsumer<K,V>,K,V>{
    
    private KafkaConsumer(Environment env, io.vertx.kafka.client.consumer.KafkaConsumer<K,V> wrappedObject, TypeConverter<K> kafkaConsumerVariableKConverter, TypeConverter<V> kafkaConsumerVariableVConverter){
        super(env, wrappedObject, kafkaConsumerVariableKConverter, kafkaConsumerVariableVConverter);
    }
    public static <K, V> KafkaConsumer<K, V> __create(Environment env, io.vertx.kafka.client.consumer.KafkaConsumer<K,V> wrappedObject, TypeConverter<K> kafkaConsumerVariableKConverter, TypeConverter<V> kafkaConsumerVariableVConverter){
        return new KafkaConsumer<>(env, wrappedObject, kafkaConsumerVariableKConverter, kafkaConsumerVariableVConverter);
    }

    public static KafkaConsumer<Object, Object> __create(Environment env, io.vertx.kafka.client.consumer.KafkaConsumer<Object, Object> wrappedObject) {
        return new KafkaConsumer<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<K> getKafkaConsumerVariableKConverter() {
        return this.getTypeConverter1();
    }

    public void setKafkaConsumerVariableKConverter(TypeConverter<K> kafkaConsumerVariableKConverter) {
        this.setTypeConverter1(kafkaConsumerVariableKConverter);
    }

    public TypeConverter<V> getKafkaConsumerVariableVConverter() {
        return this.getTypeConverter2();
    }

    public void setKafkaConsumerVariableVConverter(TypeConverter<V> kafkaConsumerVariableVConverter) {
        this.setTypeConverter2(kafkaConsumerVariableVConverter);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1)) {
            return Utils.<io.vertx.kafka.client.consumer.KafkaConsumer<Object, Object>, KafkaConsumer<Object, Object>, Object, Object>convReturnVertxGenVariable2(__ENV__, KafkaConsumer.class, KafkaConsumer::__create, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, io.vertx.kafka.client.consumer.KafkaConsumer.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isClassType(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isClassType(__ENV__, arg3)) {
            return Utils.<io.vertx.kafka.client.consumer.KafkaConsumer<Object, Object>, KafkaConsumer<Object, Object>, Object, Object>convReturnVertxGenVariable2(__ENV__, KafkaConsumer.class, KafkaConsumer::__create, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, io.vertx.kafka.client.consumer.KafkaConsumer.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1), Utils.convParamClassType(__ENV__, arg2), Utils.convParamClassType(__ENV__, arg3)));
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
    public Memory handler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().handler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.kafka.client.consumer.KafkaConsumerRecord<K, V>, KafkaConsumerRecord<K, V>, K, V>create2(KafkaConsumerRecord.class, KafkaConsumerRecord::__create, getKafkaConsumerVariableKConverter(), getKafkaConsumerVariableVConverter()), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pause(Environment __ENV__) {
        this.getWrappedObject().pause();
        return toMemory();
    }/*4*/

    @Signature
    public Memory pause(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0)) {
            this.getWrappedObject().pause(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0)) {
            this.getWrappedObject().pause(Utils.convParamSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory pause(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().pause(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().pause(Utils.convParamSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory resume(Environment __ENV__) {
        this.getWrappedObject().resume();
        return toMemory();
    }/*4*/

    @Signature
    public Memory resume(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0)) {
            this.getWrappedObject().resume(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0)) {
            this.getWrappedObject().resume(Utils.convParamSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory resume(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().resume(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().resume(Utils.convParamSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory endHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().endHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory subscribe(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().subscribe(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.STRING, arg0)) {
            this.getWrappedObject().subscribe(Utils.convParamSet(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory subscribe(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().subscribe(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().subscribe(Utils.convParamSet(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory assign(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0)) {
            this.getWrappedObject().assign(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0)) {
            this.getWrappedObject().assign(Utils.convParamSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory assign(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().assign(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().assign(Utils.convParamSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory assignment(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().assignment(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class)), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unsubscribe(Environment __ENV__) {
        this.getWrappedObject().unsubscribe();
        return toMemory();
    }/*4*/

    @Signature
    public Memory unsubscribe(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().unsubscribe(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory subscription(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().subscription(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void paused(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().paused(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory partitionsRevokedHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().partitionsRevokedHandler(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class)), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory partitionsAssignedHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().partitionsAssignedHandler(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class)), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory seek(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1)) {
            this.getWrappedObject().seek(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0), Utils.convParamLong(__ENV__, arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory seek(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().seek(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory seekToBeginning(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0)) {
            this.getWrappedObject().seekToBeginning(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0)) {
            this.getWrappedObject().seekToBeginning(Utils.convParamSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory seekToBeginning(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().seekToBeginning(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().seekToBeginning(Utils.convParamSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory seekToEnd(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0)) {
            this.getWrappedObject().seekToEnd(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0)) {
            this.getWrappedObject().seekToEnd(Utils.convParamSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory seekToEnd(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().seekToEnd(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().seekToEnd(Utils.convParamSet(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.common.TopicPartition.class), arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void commit(Environment __ENV__) {
        this.getWrappedObject().commit();
    }/*4*/

    @Signature
    public void commit(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().commit(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void committed(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().committed(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.consumer.OffsetAndMetadata.class), arg1));
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
    public Memory batchHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().batchHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.kafka.client.consumer.KafkaConsumerRecords<K, V>, KafkaConsumerRecords<K, V>, K, V>create2(KafkaConsumerRecords.class, KafkaConsumerRecords::__create, getKafkaConsumerVariableKConverter(), getKafkaConsumerVariableVConverter()), arg0));
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
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void position(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().position(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.LONG, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void offsetsForTimes(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().offsetsForTimes(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.kafka.client.consumer.OffsetAndTimestamp.class), arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void beginningOffsets(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().beginningOffsets(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.LONG, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void endOffsets(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().endOffsets(Utils.convParamDataObject(__ENV__, io.vertx.kafka.client.common.TopicPartition.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.LONG, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pollTimeout(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            return Utils.<io.vertx.kafka.client.consumer.KafkaConsumer<K, V>, KafkaConsumer<K, V>, K, V>convReturnVertxGenVariable2(__ENV__, KafkaConsumer.class, KafkaConsumer::__create, getKafkaConsumerVariableKConverter(), getKafkaConsumerVariableVConverter(), this.getWrappedObject().pollTimeout(Utils.convParamLong(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
