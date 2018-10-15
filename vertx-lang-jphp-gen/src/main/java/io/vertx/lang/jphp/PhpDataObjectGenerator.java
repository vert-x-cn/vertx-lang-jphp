package io.vertx.lang.jphp;

import io.vertx.codegen.DataObjectModel;
import io.vertx.codegen.type.ClassTypeInfo;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class PhpDataObjectGenerator extends PhpGenerator<DataObjectModel> {
    PhpDataObjectGenerator(){
        this.kinds = Collections.singleton("dataObject");
    }
    @Override
    void render(DataObjectModel model, int index, int size, Map<String, Object> session, PrintWriter writer) {
        ClassTypeInfo type = model.getType();
        writer.print("<?php");
        writer.print("namespace ");
        writer.println(type.getRaw().translatePackageName("jphp").replace(".", "\\"));

        Set<String> set = new TreeSet<>();


    }
}
