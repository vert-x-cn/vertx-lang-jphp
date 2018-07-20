package io.vertx.lang.jphp.generator;

import io.vertx.codegen.Helper;
import io.vertx.codegen.Model;
import io.vertx.codegen.ModuleInfo;
import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.TypeInfo;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static io.vertx.codegen.type.ClassKind.*;

public abstract class AbstractClassGenerator<M extends Model> extends PhpGenerator<M> {
    protected final boolean implement;
    private final String suffix;
    public AbstractClassGenerator(boolean impl, String suffix){
        this.implement = impl;
        this.suffix = suffix;
    }
    protected Set<String> importClassSet = new HashSet<>();

    @Override
    public String render(M model, int index, int size, Map<String, Object> session) {
        importClassSet.clear();
        return super.render(model, index, size, session);
    }

    @Override
    public String filename(M model) {
        ModuleInfo module = model.getModule();
        String packageName = module.translateQualifiedName(Helper.getPackageName(model.getFqn()), id);
        StringBuilder sb = new StringBuilder(packageName);
        if (implement) {
            sb.append(".impl");
        }
        sb.append(".").append(Helper.getSimpleName(model.getFqn()));
        if (implement) {
            sb.append("Impl");
        }
        String fileName = sb.toString();
        if (suffix.equals("php")) {
            String moduleName = module.getName();
            fileName = moduleName + "-jphp/" + sb.toString().replace(".", "/");
        }
        return fileName + "." + suffix;
    }

    public void addImport(M model, TypeInfo type) {
        if (type.isVariable()) {
            return;
        }
        ClassKind kind = type.getKind();
        if (kind == API || kind == DATA_OBJECT) {
            String packageName = Helper.getPackageName(model.getFqn());
        } else if (kind == ENUM) {

        } else if (kind.json) {

        } else {
            importClassSet.add(type.getRaw().getName());
        }

    }
}
