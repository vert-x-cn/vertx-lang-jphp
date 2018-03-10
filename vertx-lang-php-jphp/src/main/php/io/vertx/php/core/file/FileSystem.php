<?php 
namespace io\vertx\php\core\file;
class FileSystem
{
    
    private function __construct()
    {

    }
    /*
     * (String path, String perms, Handler<AsyncResult<Void>> handler)
     * methodSize : 1
     */
    public function chmod()
    {

    }
    /*
     * (String path, String perms)
     * methodSize : 1
     */
    public function chmodBlocking()
    {

    }
    /*
     * (String path, String perms, String dirPerms, Handler<AsyncResult<Void>> handler)
     * methodSize : 1
     */
    public function chmodRecursive()
    {

    }
    /*
     * (String path, String perms, String dirPerms)
     * methodSize : 1
     */
    public function chmodRecursiveBlocking()
    {

    }
    /*
     * (String path, String user, String group, Handler<AsyncResult<Void>> handler)
     * methodSize : 1
     */
    public function chown()
    {

    }
    /*
     * (String path, String user, String group)
     * methodSize : 1
     */
    public function chownBlocking()
    {

    }
    /*
     * (String from, String to, Handler<AsyncResult<Void>> handler)
     * (String from, String to, CopyOptions options, Handler<AsyncResult<Void>> handler)
     * methodSize : 2
     */
    public function copy()
    {

    }
    /*
     * (String from, String to)
     * methodSize : 1
     */
    public function copyBlocking()
    {

    }
    /*
     * (String from, String to, boolean recursive, Handler<AsyncResult<Void>> handler)
     * methodSize : 1
     */
    public function copyRecursive()
    {

    }
    /*
     * (String from, String to, boolean recursive)
     * methodSize : 1
     */
    public function copyRecursiveBlocking()
    {

    }
    /*
     * (String path, Handler<AsyncResult<Void>> handler)
     * (String path, String perms, Handler<AsyncResult<Void>> handler)
     * methodSize : 2
     */
    public function createFile()
    {

    }
    /*
     * (String path)
     * (String path, String perms)
     * methodSize : 2
     */
    public function createFileBlocking()
    {

    }
    /*
     * (String path, Handler<AsyncResult<Void>> handler)
     * methodSize : 1
     */
    public function delete()
    {

    }
    /*
     * (String path)
     * methodSize : 1
     */
    public function deleteBlocking()
    {

    }
    /*
     * (String path, boolean recursive, Handler<AsyncResult<Void>> handler)
     * methodSize : 1
     */
    public function deleteRecursive()
    {

    }
    /*
     * (String path, boolean recursive)
     * methodSize : 1
     */
    public function deleteRecursiveBlocking()
    {

    }
    /*
     * (String path, Handler<AsyncResult<Boolean>> handler)
     * methodSize : 1
     */
    public function exists()
    {

    }
    /*
     * (String path)
     * methodSize : 1
     */
    public function existsBlocking()
    {

    }
    /*
     * (String path, Handler<AsyncResult<FileSystemProps>> handler)
     * methodSize : 1
     */
    public function fsProps()
    {

    }
    /*
     * (String path)
     * methodSize : 1
     */
    public function fsPropsBlocking()
    {

    }
    /*
     * (String link, String existing, Handler<AsyncResult<Void>> handler)
     * methodSize : 1
     */
    public function link()
    {

    }
    /*
     * (String link, String existing)
     * methodSize : 1
     */
    public function linkBlocking()
    {

    }
    /*
     * (String path, Handler<AsyncResult<FileProps>> handler)
     * methodSize : 1
     */
    public function lprops()
    {

    }
    /*
     * (String path)
     * methodSize : 1
     */
    public function lpropsBlocking()
    {

    }
    /*
     * (String path, Handler<AsyncResult<Void>> handler)
     * (String path, String perms, Handler<AsyncResult<Void>> handler)
     * methodSize : 2
     */
    public function mkdir()
    {

    }
    /*
     * (String path)
     * (String path, String perms)
     * methodSize : 2
     */
    public function mkdirBlocking()
    {

    }
    /*
     * (String path, Handler<AsyncResult<Void>> handler)
     * (String path, String perms, Handler<AsyncResult<Void>> handler)
     * methodSize : 2
     */
    public function mkdirs()
    {

    }
    /*
     * (String path)
     * (String path, String perms)
     * methodSize : 2
     */
    public function mkdirsBlocking()
    {

    }
    /*
     * (String from, String to, Handler<AsyncResult<Void>> handler)
     * (String from, String to, CopyOptions options, Handler<AsyncResult<Void>> handler)
     * methodSize : 2
     */
    public function move()
    {

    }
    /*
     * (String from, String to)
     * methodSize : 1
     */
    public function moveBlocking()
    {

    }
    /*
     * (String path, OpenOptions options, Handler<AsyncResult<AsyncFile>> handler)
     * methodSize : 1
     */
    public function open()
    {

    }
    /*
     * (String path, OpenOptions options)
     * methodSize : 1
     */
    public function openBlocking()
    {

    }
    /*
     * (String path, Handler<AsyncResult<FileProps>> handler)
     * methodSize : 1
     */
    public function props()
    {

    }
    /*
     * (String path)
     * methodSize : 1
     */
    public function propsBlocking()
    {

    }
    /*
     * (String path, Handler<AsyncResult<List<String>>> handler)
     * (String path, String filter, Handler<AsyncResult<List<String>>> handler)
     * methodSize : 2
     */
    public function readDir()
    {

    }
    /*
     * (String path)
     * (String path, String filter)
     * methodSize : 2
     */
    public function readDirBlocking()
    {

    }
    /*
     * (String path, Handler<AsyncResult<Buffer>> handler)
     * methodSize : 1
     */
    public function readFile()
    {

    }
    /*
     * (String path)
     * methodSize : 1
     */
    public function readFileBlocking()
    {

    }
    /*
     * (String link, Handler<AsyncResult<String>> handler)
     * methodSize : 1
     */
    public function readSymlink()
    {

    }
    /*
     * (String link)
     * methodSize : 1
     */
    public function readSymlinkBlocking()
    {

    }
    /*
     * (String link, String existing, Handler<AsyncResult<Void>> handler)
     * methodSize : 1
     */
    public function symlink()
    {

    }
    /*
     * (String link, String existing)
     * methodSize : 1
     */
    public function symlinkBlocking()
    {

    }
    /*
     * (String path, long len, Handler<AsyncResult<Void>> handler)
     * methodSize : 1
     */
    public function truncate()
    {

    }
    /*
     * (String path, long len)
     * methodSize : 1
     */
    public function truncateBlocking()
    {

    }
    /*
     * (String link, Handler<AsyncResult<Void>> handler)
     * methodSize : 1
     */
    public function unlink()
    {

    }
    /*
     * (String link)
     * methodSize : 1
     */
    public function unlinkBlocking()
    {

    }
    /*
     * (String path, Buffer data, Handler<AsyncResult<Void>> handler)
     * methodSize : 1
     */
    public function writeFile()
    {

    }
    /*
     * (String path, Buffer data)
     * methodSize : 1
     */
    public function writeFileBlocking()
    {

    }
}
