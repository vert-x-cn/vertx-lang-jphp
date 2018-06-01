package io.vertx.lang.jphp.converter;

import io.vertx.lang.jphp.function.Function2;
import io.vertx.lang.jphp.wrapper.BaseWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ObjectMemory;

@SuppressWarnings("unchecked")
public abstract class WrapperConverter<S, W extends BaseWrapper<S>> implements TypeConverter<S> {
    private Class<?> clazz;
    private Class<? extends BaseWrapper> wrapperClass;
    private Function2<Environment, S, W> creator;

    WrapperConverter(Class<?> clazz, Class<? extends BaseWrapper> wrapperClass, Function2<Environment, S, W> creator) {
        this.clazz = clazz;
        this.wrapperClass = wrapperClass;
        this.creator = creator;
    }

    @SuppressWarnings("unused")
    public static <S> boolean accept(Class<S> clazz, Class<? extends BaseWrapper> wrapperClass, Memory value) {
        if (!(value instanceof ObjectMemory)) {
            return false;
        }
        ObjectMemory objectMemory = (ObjectMemory) value;
//        if (!(wrapperClass.isInstance(objectMemory.value))) {
//            return false;
//        }
        BaseWrapper wrapper = (BaseWrapper) objectMemory.value;
        return clazz.isInstance(wrapper.getWrappedObject());
    }

    @Override
    public boolean accept(Environment env, Memory value) {
        return accept(clazz, wrapperClass, value);
    }

    @Override
    public S convParamNotNull(Environment env, Memory value) {
        ObjectMemory objectMemory = (ObjectMemory) value;
        W wrapper = (W) objectMemory.value;
        return wrapper.getWrappedObject();
    }

    @Override
    public Memory convReturnNotNull(Environment env, S value) {
        return this.creator.apply(env, value).toMemory();
    }
}
