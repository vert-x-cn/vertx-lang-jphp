package io.vertx.php.core.buffer;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
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
@Name("Buffer")
@Namespace("io\\vertx\\php\\core\\buffer")
public class Buffer extends BaseWrapper<io.vertx.core.buffer.Buffer> {
    
    public Buffer(Environment env, io.vertx.core.buffer.Buffer wrappedObject) {
        super(env, wrappedObject);
    }
    
    public Buffer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.buffer.Buffer getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public Buffer appendBuffer(Buffer buff){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendBuffer(Buffer buff, int offset, int len){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendByte(byte b){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendDouble(double d){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendFloat(float f){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendInt(int i){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendIntLE(int i){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendLong(long l){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendLongLE(long l){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendMedium(int i){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendMediumLE(int i){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendShort(short s){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendShortLE(short s){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendString(String str, String enc){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendString(String str){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendUnsignedByte(short b){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendUnsignedInt(long i){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendUnsignedIntLE(long i){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendUnsignedShort(int s){
         return this;
    }
   
    @Signature
    //false
    public Buffer appendUnsignedShortLE(int s){
         return this;
    }
   
    @Signature
    //false
    public static Buffer buffer(Environment __env__){
        return new Buffer(__env__, io.vertx.core.buffer.Buffer.buffer());
    }
   
    @Signature
    //false
    public static Buffer buffer(Environment __env__, Memory memory0){
        return new Buffer(__env__, io.vertx.core.buffer.Buffer.buffer(/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public static Buffer buffer(Environment __env__, String string, String enc){
        return new Buffer(__env__, io.vertx.core.buffer.Buffer.buffer(string,enc));
    }
   
    @Signature
    //false
    public Buffer copy(){
        return new Buffer(__env__, this.getWrappedObject().copy());
    }
   
    @Signature
    //false
    public Buffer getBuffer(int start, int end){
        return new Buffer(__env__, this.getWrappedObject().getBuffer(start,end));
    }
   
    @Signature
    //false
    public byte getByte(int pos){
        return this.getWrappedObject().getByte(pos);
    }
   
    @Signature
    //false
    public double getDouble(int pos){
        return this.getWrappedObject().getDouble(pos);
    }
   
    @Signature
    //false
    public float getFloat(int pos){
        return this.getWrappedObject().getFloat(pos);
    }
   
    @Signature
    //false
    public int getInt(int pos){
        return this.getWrappedObject().getInt(pos);
    }
   
    @Signature
    //false
    public int getIntLE(int pos){
        return this.getWrappedObject().getIntLE(pos);
    }
   
    @Signature
    //false
    public long getLong(int pos){
        return this.getWrappedObject().getLong(pos);
    }
   
    @Signature
    //false
    public long getLongLE(int pos){
        return this.getWrappedObject().getLongLE(pos);
    }
   
    @Signature
    //false
    public int getMedium(int pos){
        return this.getWrappedObject().getMedium(pos);
    }
   
    @Signature
    //false
    public int getMediumLE(int pos){
        return this.getWrappedObject().getMediumLE(pos);
    }
   
    @Signature
    //false
    public short getShort(int pos){
        return this.getWrappedObject().getShort(pos);
    }
   
    @Signature
    //false
    public short getShortLE(int pos){
        return this.getWrappedObject().getShortLE(pos);
    }
   
    @Signature
    //false
    public String getString(int start, int end, String enc){
        return this.getWrappedObject().getString(start,end,enc);
    }
   
    @Signature
    //false
    public String getString(int start, int end){
        return this.getWrappedObject().getString(start,end);
    }
   
    @Signature
    //false
    public short getUnsignedByte(int pos){
        return this.getWrappedObject().getUnsignedByte(pos);
    }
   
    @Signature
    //false
    public long getUnsignedInt(int pos){
        return this.getWrappedObject().getUnsignedInt(pos);
    }
   
    @Signature
    //false
    public long getUnsignedIntLE(int pos){
        return this.getWrappedObject().getUnsignedIntLE(pos);
    }
   
    @Signature
    //false
    public int getUnsignedMedium(int pos){
        return this.getWrappedObject().getUnsignedMedium(pos);
    }
   
    @Signature
    //false
    public int getUnsignedMediumLE(int pos){
        return this.getWrappedObject().getUnsignedMediumLE(pos);
    }
   
    @Signature
    //false
    public int getUnsignedShort(int pos){
        return this.getWrappedObject().getUnsignedShort(pos);
    }
   
    @Signature
    //false
    public int getUnsignedShortLE(int pos){
        return this.getWrappedObject().getUnsignedShortLE(pos);
    }
   
    @Signature
    //false
    public int length(){
        return this.getWrappedObject().length();
    }
   
    @Signature
    //false
    public Buffer setBuffer(int pos, Buffer b){
         return this;
    }
   
    @Signature
    //false
    public Buffer setBuffer(int pos, Buffer b, int offset, int len){
         return this;
    }
   
    @Signature
    //false
    public Buffer setByte(int pos, byte b){
         return this;
    }
   
    @Signature
    //false
    public Buffer setDouble(int pos, double d){
         return this;
    }
   
    @Signature
    //false
    public Buffer setFloat(int pos, float f){
         return this;
    }
   
    @Signature
    //false
    public Buffer setInt(int pos, int i){
         return this;
    }
   
    @Signature
    //false
    public Buffer setIntLE(int pos, int i){
         return this;
    }
   
    @Signature
    //false
    public Buffer setLong(int pos, long l){
         return this;
    }
   
    @Signature
    //false
    public Buffer setLongLE(int pos, long l){
         return this;
    }
   
    @Signature
    //false
    public Buffer setMedium(int pos, int i){
         return this;
    }
   
    @Signature
    //false
    public Buffer setMediumLE(int pos, int i){
         return this;
    }
   
    @Signature
    //false
    public Buffer setShort(int pos, short s){
         return this;
    }
   
    @Signature
    //false
    public Buffer setShortLE(int pos, short s){
         return this;
    }
   
    @Signature
    //false
    public Buffer setString(int pos, String str){
         return this;
    }
   
    @Signature
    //false
    public Buffer setString(int pos, String str, String enc){
         return this;
    }
   
    @Signature
    //false
    public Buffer setUnsignedByte(int pos, short b){
         return this;
    }
   
    @Signature
    //false
    public Buffer setUnsignedInt(int pos, long i){
         return this;
    }
   
    @Signature
    //false
    public Buffer setUnsignedIntLE(int pos, long i){
         return this;
    }
   
    @Signature
    //false
    public Buffer setUnsignedShort(int pos, int s){
         return this;
    }
   
    @Signature
    //false
    public Buffer setUnsignedShortLE(int pos, int s){
         return this;
    }
   
    @Signature
    //false
    public Buffer slice(){
        return new Buffer(__env__, this.getWrappedObject().slice());
    }
   
    @Signature
    //false
    public Buffer slice(int start, int end){
        return new Buffer(__env__, this.getWrappedObject().slice(start,end));
    }
   
    @Signature
    //false
    public JsonArray toJsonArray(){
        return this.getWrappedObject().toJsonArray();
    }
   
    @Signature
    //false
    public JsonObject toJsonObject(){
        return this.getWrappedObject().toJsonObject();
    }
   
    @Signature
    //false
    public String toString(){
        return this.getWrappedObject().toString();
    }
   
    @Signature
    //false
    public String toString(String enc){
        return this.getWrappedObject().toString(enc);
    }

}
