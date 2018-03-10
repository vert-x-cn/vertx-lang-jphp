package io.vertx.php.core.parsetools;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.parsetools.JsonEventType;
import io.vertx.php.core.buffer.Buffer;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("JsonEvent")
@Namespace("io\\vertx\\php\\core\\parsetools")
public class JsonEvent extends BaseWrapper<io.vertx.core.parsetools.JsonEvent> {
    
    public JsonEvent(Environment env, io.vertx.core.parsetools.JsonEvent wrappedObject) {
        super(env, wrappedObject);
    }
    
    public JsonEvent(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.parsetools.JsonEvent getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public JsonArray arrayValue(){
        return this.getWrappedObject().arrayValue();
    }
   
    @Signature
    //false
    public Buffer binaryValue(){
        return new Buffer(__env__, this.getWrappedObject().binaryValue());
    }
   
    @Signature
    //false
    public Boolean booleanValue(){
        return this.getWrappedObject().booleanValue();
    }
   
    @Signature
    //false
    public Double doubleValue(){
        return this.getWrappedObject().doubleValue();
    }
   
    @Signature
    //false
    public String fieldName(){
        return this.getWrappedObject().fieldName();
    }
   
    @Signature
    //false
    public Float floatValue(){
        return this.getWrappedObject().floatValue();
    }
   
    @Signature
    //false
    public Integer integerValue(){
        return this.getWrappedObject().integerValue();
    }
   
    @Signature
    //false
    public boolean isArray(){
        return this.getWrappedObject().isArray();
    }
   
    @Signature
    //false
    public boolean isBoolean(){
        return this.getWrappedObject().isBoolean();
    }
   
    @Signature
    //false
    public boolean isNull(){
        return this.getWrappedObject().isNull();
    }
   
    @Signature
    //false
    public boolean isNumber(){
        return this.getWrappedObject().isNumber();
    }
   
    @Signature
    //false
    public boolean isObject(){
        return this.getWrappedObject().isObject();
    }
   
    @Signature
    //false
    public boolean isString(){
        return this.getWrappedObject().isString();
    }
   
    @Signature
    //false
    public Long longValue(){
        return this.getWrappedObject().longValue();
    }
   
    @Signature
    //false
    public Memory mapTo(Class<Memory> type){
        return this.getWrappedObject().mapTo(type);
    }
   
    @Signature
    //false
    public JsonObject objectValue(){
        return this.getWrappedObject().objectValue();
    }
   
    @Signature
    //false
    public String stringValue(){
        return this.getWrappedObject().stringValue();
    }
   
    @Signature
    //false
    public JsonEventType type(){
        return this.getWrappedObject().type();
    }
   
    @Signature
    //false
    public Object value(){
        return this.getWrappedObject().value();
    }

}
