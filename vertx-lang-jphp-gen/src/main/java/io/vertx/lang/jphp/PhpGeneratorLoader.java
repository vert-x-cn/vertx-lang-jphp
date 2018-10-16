package io.vertx.lang.jphp;

import io.vertx.codegen.Generator;
import io.vertx.codegen.GeneratorLoader;

import javax.annotation.processing.ProcessingEnvironment;
import java.util.stream.Stream;

public class PhpGeneratorLoader implements GeneratorLoader {
    @Override
    public Stream<Generator<?>> loadGenerators(ProcessingEnvironment processingEnv) {
        return Stream.of(
//                new PhpClassGenerator(),
//                new PhpClassWrapperGenerator(),
//                new PhpDataObjectGenerator(),
//                new PhpDataObjectWrapperGenerator(),
                new PhpExtensionGenerator()
        );
//        return Stream.empty();
    }
}