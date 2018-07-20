package io.vertx.lang.jphp.generator.dataobject;

import io.vertx.codegen.DataObjectModel;
import io.vertx.codegen.ModuleInfo;

import java.io.PrintWriter;
import java.util.Map;

public class PhpDataObjectImplGenerator extends AbstractPhpDataObjectGenerator {

    public PhpDataObjectImplGenerator() {
        super(true, "php");
    }

    @Override
    protected void render(DataObjectModel model, int index, int size, Map<String, Object> session, PrintWriter writer) {
        ModuleInfo module = model.getModule();
        importClassSet.add(module.translateQualifiedName(model.getFqn(), id) + " as " + model.getType().getSimpleName() + "Interface");
        writer.println("<?php");
        super.render(model, index, size, session, writer);
    }
}
