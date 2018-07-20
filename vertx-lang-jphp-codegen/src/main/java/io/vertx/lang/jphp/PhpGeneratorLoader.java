package io.vertx.lang.jphp;

import io.vertx.codegen.Generator;
import io.vertx.codegen.GeneratorLoader;
import io.vertx.lang.jphp.generator.PhpExtensionGenerator;
import io.vertx.lang.jphp.generator.ServiceLoaderGenerator;
import io.vertx.lang.jphp.generator.dataobject.PhpDataObjectGenerator;
import io.vertx.lang.jphp.generator.dataobject.PhpDataObjectImplGenerator;
import io.vertx.lang.jphp.generator.dataobject.PhpDataObjectWrapperGenerator;
import io.vertx.lang.jphp.generator.dataobject.PhpDataObjectWrapperImplGenerator;

import javax.annotation.processing.ProcessingEnvironment;
import java.util.stream.Stream;

public class PhpGeneratorLoader implements GeneratorLoader {
    @Override
    public Stream<Generator<?>> loadGenerators(ProcessingEnvironment processingEnv) {
        return Stream.of(
//                new PhpApiGenerator(),
//                new PhpApiWrapperGenerator(),
//                new ServiceLoaderGenerator(),
//                new PhpExtensionGenerator(),
                new PhpDataObjectGenerator(),
                new PhpDataObjectImplGenerator(),
                new PhpDataObjectWrapperGenerator(),
                new PhpDataObjectWrapperImplGenerator());
//        return Stream.empty();
    }
}