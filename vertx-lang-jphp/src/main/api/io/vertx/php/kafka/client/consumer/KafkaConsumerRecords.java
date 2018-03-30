package io.vertx.php.kafka.client.consumer;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable2Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("KafkaConsumerRecords")
@Namespace("io\\vertx\\php\\kafka\\client\\consumer")
@SuppressWarnings("ALL")
public class KafkaConsumerRecords<K, V> extends VertxGenVariable2Wrapper<io.vertx.kafka.client.consumer.KafkaConsumerRecords<K,V>,K,V>{
    
    private KafkaConsumerRecords(Environment env, io.vertx.kafka.client.consumer.KafkaConsumerRecords<K,V> wrappedObject, TypeConverter<K> kafkaConsumerRecordsVariableKConverter, TypeConverter<V> kafkaConsumerRecordsVariableVConverter){
        super(env, wrappedObject, kafkaConsumerRecordsVariableKConverter, kafkaConsumerRecordsVariableVConverter);
    }
    public static <K, V> KafkaConsumerRecords<K, V> __create(Environment env, io.vertx.kafka.client.consumer.KafkaConsumerRecords<K,V> wrappedObject, TypeConverter<K> kafkaConsumerRecordsVariableKConverter, TypeConverter<V> kafkaConsumerRecordsVariableVConverter){
        return new KafkaConsumerRecords<>(env, wrappedObject, kafkaConsumerRecordsVariableKConverter, kafkaConsumerRecordsVariableVConverter);
    }

    public static KafkaConsumerRecords<Object, Object> __create(Environment env, io.vertx.kafka.client.consumer.KafkaConsumerRecords<Object, Object> wrappedObject) {
        return new KafkaConsumerRecords<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<K> getKafkaConsumerRecordsVariableKConverter() {
        return this.getTypeConverter1();
    }

    public void setKafkaConsumerRecordsVariableKConverter(TypeConverter<K> kafkaConsumerRecordsVariableKConverter) {
        this.setTypeConverter1(kafkaConsumerRecordsVariableKConverter);
    }

    public TypeConverter<V> getKafkaConsumerRecordsVariableVConverter() {
        return this.getTypeConverter2();
    }

    public void setKafkaConsumerRecordsVariableVConverter(TypeConverter<V> kafkaConsumerRecordsVariableVConverter) {
        this.setTypeConverter2(kafkaConsumerRecordsVariableVConverter);
    }

    @Signature
    public Memory size(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().size());
    }/*1*/

    @Signature
    public Memory isEmpty(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isEmpty());
    }/*1*/

    @Signature
    public Memory recordAt(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.<io.vertx.kafka.client.consumer.KafkaConsumerRecord<K, V>, KafkaConsumerRecord<K, V>, K, V>convReturnVertxGenVariable2(__ENV__, KafkaConsumerRecord.class, KafkaConsumerRecord::__create, getKafkaConsumerRecordsVariableKConverter(), getKafkaConsumerRecordsVariableVConverter(), this.getWrappedObject().recordAt(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
