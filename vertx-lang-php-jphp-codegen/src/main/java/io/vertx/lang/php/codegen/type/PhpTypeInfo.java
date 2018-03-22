package io.vertx.lang.php.codegen.type;

import io.vertx.codegen.type.ClassKind;

import java.util.HashMap;
import java.util.Map;

//public class PhpTypeInfo extends TypeInfo {
//    private static PhpTypeInfo ANY = new PhpTypeInfo("array");
//    private static PhpTypeInfo STRING = new PhpTypeInfo("string");
//    private static PhpTypeInfo INT = new PhpTypeInfo("int");
//    private static PhpTypeInfo DOUBLE = new PhpTypeInfo("float");
//    private static PhpTypeInfo NUMBER = new PhpTypeInfo("num");
//    private static PhpTypeInfo ARRAY = new PhpTypeInfo("array");
//    private static PhpTypeInfo BOOLEAN = new PhpTypeInfo("bool");
//    private static PhpTypeInfo CALLABLE = new PhpTypeInfo("callable");
//    private static PhpTypeInfo OBJECT = new PhpTypeInfo("object");
//    private static PhpTypeInfo VARARG = new PhpTypeInfo("...");
//    private static PhpTypeInfo TRAVERSABLE = new PhpTypeInfo("traversable");
//    private static PhpTypeInfo ITERABLE = new PhpTypeInfo("iterable");
//    private static PhpTypeInfo VOID = new PhpTypeInfo("void");
//    private static PhpTypeInfo SELF = new PhpTypeInfo("self");
//    private static Map<ClassKind, PhpTypeInfo> map = new HashMap<>();
//    static{
//        map.put(ClassKind.STRING, STRING);
//
////        map.put(ClassKind.BOXED_PRIMITIVE, STRING);
////        map.put(ClassKind.PRIMITIVE, STRING);
//        map.put(ClassKind.ENUM, STRING);
//
//        map.put(ClassKind.JSON_OBJECT, STRING);
//        map.put(ClassKind.JSON_ARRAY, STRING);
//        map.put(ClassKind.THROWABLE, STRING);
//        map.put(ClassKind.VOID, STRING);
//        map.put(ClassKind.OBJECT, STRING);
//        map.put(ClassKind.LIST, STRING);
//        map.put(ClassKind.SET, STRING);
//        map.put(ClassKind.MAP, STRING);
//        map.put(ClassKind.API, STRING);
//        map.put(ClassKind.DATA_OBJECT, STRING);
//        map.put(ClassKind.HANDLER, STRING);
//        map.put(ClassKind.FUNCTION, STRING);
//        map.put(ClassKind.ASYNC_RESULT, STRING);
//        map.put(ClassKind.CLASS_TYPE, STRING);
//        map.put(ClassKind.OTHER, STRING);
//    }
//
//    private String name;
//
//    private PhpTypeInfo(io.vertx.codegen.type.TypeInfo type, String name){
//        super(type);
//        this.name = name;
//    }
//
//    public static PhpTypeInfo create(io.vertx.codegen.type.TypeInfo type){
////        if (type.getKind())
//        return null;
//    }
//}
