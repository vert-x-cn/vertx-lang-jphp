package io.vertx.lang.jphp;

import io.vertx.codegen.ModuleModel;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ServiceLoaderGenerator extends PhpGenerator<ModuleModel> {

    ServiceLoaderGenerator() {
        this.kinds = Collections.singleton("module");
        this.incremental = true;
    }

    @Override
    public String filename(ModuleModel model) {
        return "resources/META-INF/services/php.runtime.ext.support.Extension";
    }

    private Set<String> extensions = new HashSet<>();

    @Override
    void render(ModuleModel model, int index, int size, Map<String, Object> session, PrintWriter writer) {
        extensions.add(PhpExtensionGenerator.fcq(model));
        if (index == size - 1) {
            for (String extension : extensions) {
                writer.println(extension);
            }
        }
    }
}
