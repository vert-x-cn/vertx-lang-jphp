package io.vertx.php.kafka.client.producer;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable2Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("KafkaProducerRecord")
@Namespace("io\\vertx\\php\\kafka\\client\\producer")
@SuppressWarnings("ALL")
public class KafkaProducerRecord<K, V> extends VertxGenVariable2Wrapper<io.vertx.kafka.client.producer.KafkaProducerRecord<K,V>,K,V>{
    
    private KafkaProducerRecord(Environment env, io.vertx.kafka.client.producer.KafkaProducerRecord<K,V> wrappedObject, TypeConverter<K> kafkaProducerRecordVariableKConverter, TypeConverter<V> kafkaProducerRecordVariableVConverter){
        super(env, wrappedObject, kafkaProducerRecordVariableKConverter, kafkaProducerRecordVariableVConverter);
    }
    public static <K, V> KafkaProducerRecord<K, V> __create(Environment env, io.vertx.kafka.client.producer.KafkaProducerRecord<K,V> wrappedObject, TypeConverter<K> kafkaProducerRecordVariableKConverter, TypeConverter<V> kafkaProducerRecordVariableVConverter){
        return new KafkaProducerRecord<>(env, wrappedObject, kafkaProducerRecordVariableKConverter, kafkaProducerRecordVariableVConverter);
    }

    public static KafkaProducerRecord<Object, Object> __create(Environment env, io.vertx.kafka.client.producer.KafkaProducerRecord<Object, Object> wrappedObject) {
        return new KafkaProducerRecord<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<K> getKafkaProducerRecordVariableKConverter() {
        return this.getTypeConverter1();
    }

    public void setKafkaProducerRecordVariableKConverter(TypeConverter<K> kafkaProducerRecordVariableKConverter) {
        this.setTypeConverter1(kafkaProducerRecordVariableKConverter);
    }

    public TypeConverter<V> getKafkaProducerRecordVariableVConverter() {
        return this.getTypeConverter2();
    }

    public void setKafkaProducerRecordVariableVConverter(TypeConverter<V> kafkaProducerRecordVariableVConverter) {
        this.setTypeConverter2(kafkaProducerRecordVariableVConverter);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isVariable(__ENV__, arg1)) {
            return Utils.<io.vertx.kafka.client.producer.KafkaProducerRecord<Object, Object>, KafkaProducerRecord<Object, Object>, Object, Object>convReturnVertxGenVariable2(__ENV__, KafkaProducerRecord.class, KafkaProducerRecord::__create, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, io.vertx.kafka.client.producer.KafkaProducerRecord.create(Utils.convParamString(__ENV__, arg0), Utils.convParamVariable(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isVariable(__ENV__, arg1) && Utils.isVariable(__ENV__, arg2)) {
            return Utils.<io.vertx.kafka.client.producer.KafkaProducerRecord<Object, Object>, KafkaProducerRecord<Object, Object>, Object, Object>convReturnVertxGenVariable2(__ENV__, KafkaProducerRecord.class, KafkaProducerRecord::__create, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, io.vertx.kafka.client.producer.KafkaProducerRecord.create(Utils.convParamString(__ENV__, arg0), Utils.convParamVariable(__ENV__, arg1), Utils.convParamVariable(__ENV__, arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isVariable(__ENV__, arg1) && Utils.isVariable(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isLong(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isInteger(__ENV__, arg4)) {
            return Utils.<io.vertx.kafka.client.producer.KafkaProducerRecord<Object, Object>, KafkaProducerRecord<Object, Object>, Object, Object>convReturnVertxGenVariable2(__ENV__, KafkaProducerRecord.class, KafkaProducerRecord::__create, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, io.vertx.kafka.client.producer.KafkaProducerRecord.create(Utils.convParamString(__ENV__, arg0), Utils.convParamVariable(__ENV__, arg1), Utils.convParamVariable(__ENV__, arg2), Utils.convParamLong(__ENV__, arg3), Utils.convParamInteger(__ENV__, arg4)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory topic(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().topic());
    }/*1*/

    @Signature
    public Memory key(Environment __ENV__) {
        return getKafkaProducerRecordVariableKConverter().convReturn(__ENV__, this.getWrappedObject().key());
    }/*1*/

    @Signature
    public Memory value(Environment __ENV__) {
        return getKafkaProducerRecordVariableVConverter().convReturn(__ENV__, this.getWrappedObject().value());
    }/*1*/

    @Signature
    public Memory timestamp(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().timestamp());
    }/*1*/

    @Signature
    public Memory partition(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().partition());
    }/*1*/

}
