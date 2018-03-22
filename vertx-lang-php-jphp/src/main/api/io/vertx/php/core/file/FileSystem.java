package io.vertx.php.core.file;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.file.AsyncFile;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.file.FileSystemProps;
import io.vertx.php.core.file.FileProps;
@Name("FileSystem")
@Namespace("io\\vertx\\php\\core\\file")
public interface FileSystem<S extends io.vertx.core.file.FileSystem> extends IWrapper<S>{

    @Signature
    default Memory copy(Environment __env__, Memory... args) {
        this.getWrappedObject().copy(from, to, handler)
    }

    @Signature
    default Memory copyBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().copyBlocking(from, to)
    }

    @Signature
    default Memory copyRecursive(Environment __env__, Memory... args) {
        this.getWrappedObject().copyRecursive(from, to, recursive, handler)
    }

    @Signature
    default Memory copyRecursiveBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().copyRecursiveBlocking(from, to, recursive)
    }

    @Signature
    default Memory move(Environment __env__, Memory... args) {
        this.getWrappedObject().move(from, to, handler)
    }

    @Signature
    default Memory moveBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().moveBlocking(from, to)
    }

    @Signature
    default Memory truncate(Environment __env__, Memory... args) {
        this.getWrappedObject().truncate(path, len, handler)
    }

    @Signature
    default Memory truncateBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().truncateBlocking(path, len)
    }

    @Signature
    default Memory chmod(Environment __env__, Memory... args) {
        this.getWrappedObject().chmod(path, perms, handler)
    }

    @Signature
    default Memory chmodBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().chmodBlocking(path, perms)
    }

    @Signature
    default Memory chmodRecursive(Environment __env__, Memory... args) {
        this.getWrappedObject().chmodRecursive(path, perms, dirPerms, handler)
    }

    @Signature
    default Memory chmodRecursiveBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().chmodRecursiveBlocking(path, perms, dirPerms)
    }

    @Signature
    default Memory chown(Environment __env__, Memory... args) {
        this.getWrappedObject().chown(path, user, group, handler)
    }

    @Signature
    default Memory chownBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().chownBlocking(path, user, group)
    }

    @Signature
    default Memory props(Environment __env__, Memory... args) {
        this.getWrappedObject().props(path, handler)
    }

    @Signature
    default Memory propsBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FilePropsImpl::new, this.getWrappedObject().propsBlocking(path)
    }

    @Signature
    default Memory lprops(Environment __env__, Memory... args) {
        this.getWrappedObject().lprops(path, handler)
    }

    @Signature
    default Memory lpropsBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FilePropsImpl::new, this.getWrappedObject().lpropsBlocking(path)
    }

    @Signature
    default Memory link(Environment __env__, Memory... args) {
        this.getWrappedObject().link(link, existing, handler)
    }

    @Signature
    default Memory linkBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().linkBlocking(link, existing)
    }

    @Signature
    default Memory symlink(Environment __env__, Memory... args) {
        this.getWrappedObject().symlink(link, existing, handler)
    }

    @Signature
    default Memory symlinkBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().symlinkBlocking(link, existing)
    }

    @Signature
    default Memory unlink(Environment __env__, Memory... args) {
        this.getWrappedObject().unlink(link, handler)
    }

    @Signature
    default Memory unlinkBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().unlinkBlocking(link)
    }

    @Signature
    default Memory readSymlink(Environment __env__, Memory... args) {
        this.getWrappedObject().readSymlink(link, handler)
    }

    @Signature
    default Memory readSymlinkBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().readSymlinkBlocking(link)
    }

    @Signature
    default Memory delete(Environment __env__, Memory... args) {
        this.getWrappedObject().delete(path, handler)
    }

    @Signature
    default Memory deleteBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().deleteBlocking(path)
    }

    @Signature
    default Memory deleteRecursive(Environment __env__, Memory... args) {
        this.getWrappedObject().deleteRecursive(path, recursive, handler)
    }

    @Signature
    default Memory deleteRecursiveBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().deleteRecursiveBlocking(path, recursive)
    }

    @Signature
    default Memory mkdir(Environment __env__, Memory... args) {
        this.getWrappedObject().mkdir(path, handler)
    }

    @Signature
    default Memory mkdirBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().mkdirBlocking(path)
    }

    @Signature
    default Memory mkdirs(Environment __env__, Memory... args) {
        this.getWrappedObject().mkdirs(path, handler)
    }

    @Signature
    default Memory mkdirsBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().mkdirsBlocking(path)
    }

    @Signature
    default Memory readDir(Environment __env__, Memory... args) {
        this.getWrappedObject().readDir(path, handler)
    }

    @Signature
    default Memory readDirBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().readDirBlocking(path)
    }

    @Signature
    default Memory readFile(Environment __env__, Memory... args) {
        this.getWrappedObject().readFile(path, handler)
    }

    @Signature
    default Memory readFileBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().readFileBlocking(path)
    }

    @Signature
    default Memory writeFile(Environment __env__, Memory... args) {
        this.getWrappedObject().writeFile(path, data, handler)
    }

    @Signature
    default Memory writeFileBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().writeFileBlocking(path, data)
    }

    @Signature
    default Memory open(Environment __env__, Memory... args) {
        this.getWrappedObject().open(path, options, handler)
    }

    @Signature
    default Memory openBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AsyncFileImpl::new, this.getWrappedObject().openBlocking(path, options)
    }

    @Signature
    default Memory createFile(Environment __env__, Memory... args) {
        this.getWrappedObject().createFile(path, handler)
    }

    @Signature
    default Memory createFileBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().createFileBlocking(path)
    }

    @Signature
    default Memory exists(Environment __env__, Memory... args) {
        this.getWrappedObject().exists(path, handler)
    }

    @Signature
    default Memory existsBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().existsBlocking(path)
    }

    @Signature
    default Memory fsProps(Environment __env__, Memory... args) {
        this.getWrappedObject().fsProps(path, handler)
    }

    @Signature
    default Memory fsPropsBlocking(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FileSystemPropsImpl::new, this.getWrappedObject().fsPropsBlocking(path)
    }

}
