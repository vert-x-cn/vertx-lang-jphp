package io.vertx.php.core.file.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.file.FileSystem;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("FileSystemImpl")
@Namespace("io\\vertx\\php\\core\\file\\impl")
public class FileSystemImpl extends VertxGenWrapper<io.vertx.core.file.FileSystem> implements FileSystem<io.vertx.core.file.FileSystem>{
    
    public FileSystemImpl(Environment env, io.vertx.core.file.FileSystem wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory copy(Environment __env__, Memory... args) {
        this.getWrappedObject().copy(from, to, handler)
    }

    @Signature
    public Memory copyBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().copyBlocking(from, to)
    }

    @Signature
    public Memory copyRecursive(Environment __env__, Memory... args) {
        this.getWrappedObject().copyRecursive(from, to, recursive, handler)
    }

    @Signature
    public Memory copyRecursiveBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().copyRecursiveBlocking(from, to, recursive)
    }

    @Signature
    public Memory move(Environment __env__, Memory... args) {
        this.getWrappedObject().move(from, to, handler)
    }

    @Signature
    public Memory moveBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().moveBlocking(from, to)
    }

    @Signature
    public Memory truncate(Environment __env__, Memory... args) {
        this.getWrappedObject().truncate(path, len, handler)
    }

    @Signature
    public Memory truncateBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().truncateBlocking(path, len)
    }

    @Signature
    public Memory chmod(Environment __env__, Memory... args) {
        this.getWrappedObject().chmod(path, perms, handler)
    }

    @Signature
    public Memory chmodBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().chmodBlocking(path, perms)
    }

    @Signature
    public Memory chmodRecursive(Environment __env__, Memory... args) {
        this.getWrappedObject().chmodRecursive(path, perms, dirPerms, handler)
    }

    @Signature
    public Memory chmodRecursiveBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().chmodRecursiveBlocking(path, perms, dirPerms)
    }

    @Signature
    public Memory chown(Environment __env__, Memory... args) {
        this.getWrappedObject().chown(path, user, group, handler)
    }

    @Signature
    public Memory chownBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().chownBlocking(path, user, group)
    }

    @Signature
    public Memory props(Environment __env__, Memory... args) {
        this.getWrappedObject().props(path, handler)
    }

    @Signature
    public Memory propsBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FilePropsImpl::new, this.getWrappedObject().propsBlocking(path)
    }

    @Signature
    public Memory lprops(Environment __env__, Memory... args) {
        this.getWrappedObject().lprops(path, handler)
    }

    @Signature
    public Memory lpropsBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FilePropsImpl::new, this.getWrappedObject().lpropsBlocking(path)
    }

    @Signature
    public Memory link(Environment __env__, Memory... args) {
        this.getWrappedObject().link(link, existing, handler)
    }

    @Signature
    public Memory linkBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().linkBlocking(link, existing)
    }

    @Signature
    public Memory symlink(Environment __env__, Memory... args) {
        this.getWrappedObject().symlink(link, existing, handler)
    }

    @Signature
    public Memory symlinkBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().symlinkBlocking(link, existing)
    }

    @Signature
    public Memory unlink(Environment __env__, Memory... args) {
        this.getWrappedObject().unlink(link, handler)
    }

    @Signature
    public Memory unlinkBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().unlinkBlocking(link)
    }

    @Signature
    public Memory readSymlink(Environment __env__, Memory... args) {
        this.getWrappedObject().readSymlink(link, handler)
    }

    @Signature
    public Memory readSymlinkBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().readSymlinkBlocking(link)
    }

    @Signature
    public Memory delete(Environment __env__, Memory... args) {
        this.getWrappedObject().delete(path, handler)
    }

    @Signature
    public Memory deleteBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().deleteBlocking(path)
    }

    @Signature
    public Memory deleteRecursive(Environment __env__, Memory... args) {
        this.getWrappedObject().deleteRecursive(path, recursive, handler)
    }

    @Signature
    public Memory deleteRecursiveBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().deleteRecursiveBlocking(path, recursive)
    }

    @Signature
    public Memory mkdir(Environment __env__, Memory... args) {
        this.getWrappedObject().mkdir(path, handler)
    }

    @Signature
    public Memory mkdirBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().mkdirBlocking(path)
    }

    @Signature
    public Memory mkdirs(Environment __env__, Memory... args) {
        this.getWrappedObject().mkdirs(path, handler)
    }

    @Signature
    public Memory mkdirsBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().mkdirsBlocking(path)
    }

    @Signature
    public Memory readDir(Environment __env__, Memory... args) {
        this.getWrappedObject().readDir(path, handler)
    }

    @Signature
    public Memory readDirBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().readDirBlocking(path)
    }

    @Signature
    public Memory readFile(Environment __env__, Memory... args) {
        this.getWrappedObject().readFile(path, handler)
    }

    @Signature
    public Memory readFileBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().readFileBlocking(path)
    }

    @Signature
    public Memory writeFile(Environment __env__, Memory... args) {
        this.getWrappedObject().writeFile(path, data, handler)
    }

    @Signature
    public Memory writeFileBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().writeFileBlocking(path, data)
    }

    @Signature
    public Memory open(Environment __env__, Memory... args) {
        this.getWrappedObject().open(path, options, handler)
    }

    @Signature
    public Memory openBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AsyncFileImpl::new, this.getWrappedObject().openBlocking(path, options)
    }

    @Signature
    public Memory createFile(Environment __env__, Memory... args) {
        this.getWrappedObject().createFile(path, handler)
    }

    @Signature
    public Memory createFileBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().createFileBlocking(path)
    }

    @Signature
    public Memory exists(Environment __env__, Memory... args) {
        this.getWrappedObject().exists(path, handler)
    }

    @Signature
    public Memory existsBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().existsBlocking(path)
    }

    @Signature
    public Memory fsProps(Environment __env__, Memory... args) {
        this.getWrappedObject().fsProps(path, handler)
    }

    @Signature
    public Memory fsPropsBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FileSystemPropsImpl::new, this.getWrappedObject().fsPropsBlocking(path)
    }

}
