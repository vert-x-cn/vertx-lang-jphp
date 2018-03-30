package io.vertx.php.kafka.client.consumer;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable2Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("KafkaConsumerRecord")
@Namespace("io\\vertx\\php\\kafka\\client\\consumer")
@SuppressWarnings("ALL")
public class KafkaConsumerRecord<K, V> extends VertxGenVariable2Wrapper<io.vertx.kafka.client.consumer.KafkaConsumerRecord<K,V>,K,V>{
    
    private KafkaConsumerRecord(Environment env, io.vertx.kafka.client.consumer.KafkaConsumerRecord<K,V> wrappedObject, TypeConverter<K> kafkaConsumerRecordVariableKConverter, TypeConverter<V> kafkaConsumerRecordVariableVConverter){
        super(env, wrappedObject, kafkaConsumerRecordVariableKConverter, kafkaConsumerRecordVariableVConverter);
    }
    public static <K, V> KafkaConsumerRecord<K, V> __create(Environment env, io.vertx.kafka.client.consumer.KafkaConsumerRecord<K,V> wrappedObject, TypeConverter<K> kafkaConsumerRecordVariableKConverter, TypeConverter<V> kafkaConsumerRecordVariableVConverter){
        return new KafkaConsumerRecord<>(env, wrappedObject, kafkaConsumerRecordVariableKConverter, kafkaConsumerRecordVariableVConverter);
    }

    public static KafkaConsumerRecord<Object, Object> __create(Environment env, io.vertx.kafka.client.consumer.KafkaConsumerRecord<Object, Object> wrappedObject) {
        return new KafkaConsumerRecord<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<K> getKafkaConsumerRecordVariableKConverter() {
        return this.getTypeConverter1();
    }

    public void setKafkaConsumerRecordVariableKConverter(TypeConverter<K> kafkaConsumerRecordVariableKConverter) {
        this.setTypeConverter1(kafkaConsumerRecordVariableKConverter);
    }

    public TypeConverter<V> getKafkaConsumerRecordVariableVConverter() {
        return this.getTypeConverter2();
    }

    public void setKafkaConsumerRecordVariableVConverter(TypeConverter<V> kafkaConsumerRecordVariableVConverter) {
        this.setTypeConverter2(kafkaConsumerRecordVariableVConverter);
    }

    @Signature
    public Memory topic(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().topic());
    }/*1*/

    @Signature
    public Memory partition(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().partition());
    }/*1*/

    @Signature
    public Memory offset(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().offset());
    }/*1*/

    @Signature
    public Memory timestamp(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().timestamp());
    }/*1*/

    @Signature
    public Memory timestampType(Environment __ENV__) {
        return Utils.convReturnEnum(__ENV__, this.getWrappedObject().timestampType());
    }/*1*/

    @Signature
    public Memory checksum(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().checksum());
    }/*1*/

    @Signature
    public Memory key(Environment __ENV__) {
        return getKafkaConsumerRecordVariableKConverter().convReturn(__ENV__, this.getWrappedObject().key());
    }/*1*/

    @Signature
    public Memory value(Environment __ENV__) {
        return getKafkaConsumerRecordVariableVConverter().convReturn(__ENV__, this.getWrappedObject().value());
    }/*1*/

}
