<?php 
namespace io\vertx\php\core\file;
use io\vertx\php\core\buffer\Buffer;
class FileSystem
{
    
    private function __construct()
    {

    }
    /**
     * (string path, string perms, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function chmod(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string path, string perms)
     * @return FileSystem
     * methodSize : 1
     */
    public function chmodBlocking(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path, string perms, string dirPerms, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function chmodRecursive(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (string path, string perms, string dirPerms)
     * @return FileSystem
     * methodSize : 1
     */
    public function chmodRecursiveBlocking(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string path, string user, string group, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function chown(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (string path, string user, string group)
     * @return FileSystem
     * methodSize : 1
     */
    public function chownBlocking(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string from, string to, callable handler)
     * @return FileSystem
     * (string from, string to, CopyOptions options, callable handler)
     * @return FileSystem
     * methodSize : 2
     */
    public function copy(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (string from, string to)
     * @return FileSystem
     * methodSize : 1
     */
    public function copyBlocking(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string from, string to, bool recursive, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function copyRecursive(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (string from, string to, bool recursive)
     * @return FileSystem
     * methodSize : 1
     */
    public function copyRecursiveBlocking(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string path, callable handler)
     * @return FileSystem
     * (string path, string perms, callable handler)
     * @return FileSystem
     * methodSize : 2
     */
    public function createFile(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string path)
     * @return FileSystem
     * (string path, string perms)
     * @return FileSystem
     * methodSize : 2
     */
    public function createFileBlocking(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function delete(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path)
     * @return FileSystem
     * methodSize : 1
     */
    public function deleteBlocking(/*1*/$arg0)
    {

    }
    /**
     * (string path, bool recursive, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function deleteRecursive(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string path, bool recursive)
     * @return FileSystem
     * methodSize : 1
     */
    public function deleteRecursiveBlocking(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function exists(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path)
     * @return bool
     * methodSize : 1
     */
    public function existsBlocking(/*1*/$arg0)
    {

    }
    /**
     * (string path, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function fsProps(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path)
     * @return FileSystemProps
     * methodSize : 1
     */
    public function fsPropsBlocking(/*1*/$arg0)
    {

    }
    /**
     * (string link, string existing, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function link(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string link, string existing)
     * @return FileSystem
     * methodSize : 1
     */
    public function linkBlocking(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function lprops(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path)
     * @return FileProps
     * methodSize : 1
     */
    public function lpropsBlocking(/*1*/$arg0)
    {

    }
    /**
     * (string path, callable handler)
     * @return FileSystem
     * (string path, string perms, callable handler)
     * @return FileSystem
     * methodSize : 2
     */
    public function mkdir(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string path)
     * @return FileSystem
     * (string path, string perms)
     * @return FileSystem
     * methodSize : 2
     */
    public function mkdirBlocking(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path, callable handler)
     * @return FileSystem
     * (string path, string perms, callable handler)
     * @return FileSystem
     * methodSize : 2
     */
    public function mkdirs(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string path)
     * @return FileSystem
     * (string path, string perms)
     * @return FileSystem
     * methodSize : 2
     */
    public function mkdirsBlocking(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string from, string to, callable handler)
     * @return FileSystem
     * (string from, string to, CopyOptions options, callable handler)
     * @return FileSystem
     * methodSize : 2
     */
    public function move(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (string from, string to)
     * @return FileSystem
     * methodSize : 1
     */
    public function moveBlocking(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path, OpenOptions options, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function open(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string path, OpenOptions options)
     * @return AsyncFile
     * methodSize : 1
     */
    public function openBlocking(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function props(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path)
     * @return FileProps
     * methodSize : 1
     */
    public function propsBlocking(/*1*/$arg0)
    {

    }
    /**
     * (string path, callable handler)
     * @return FileSystem
     * (string path, string filter, callable handler)
     * @return FileSystem
     * methodSize : 2
     */
    public function readDir(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string path)
     * @return string
     * (string path, string filter)
     * @return string
     * methodSize : 2
     */
    public function readDirBlocking(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function readFile(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path)
     * @return Buffer
     * methodSize : 1
     */
    public function readFileBlocking(/*1*/$arg0)
    {

    }
    /**
     * (string link, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function readSymlink(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string link)
     * @return string
     * methodSize : 1
     */
    public function readSymlinkBlocking(/*1*/$arg0)
    {

    }
    /**
     * (string link, string existing, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function symlink(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string link, string existing)
     * @return FileSystem
     * methodSize : 1
     */
    public function symlinkBlocking(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string path, num len, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function truncate(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string path, num len)
     * @return FileSystem
     * methodSize : 1
     */
    public function truncateBlocking(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string link, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function unlink(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string link)
     * @return FileSystem
     * methodSize : 1
     */
    public function unlinkBlocking(/*1*/$arg0)
    {

    }
    /**
     * (string path, Buffer data, callable handler)
     * @return FileSystem
     * methodSize : 1
     */
    public function writeFile(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string path, Buffer data)
     * @return FileSystem
     * methodSize : 1
     */
    public function writeFileBlocking(/*2*/$arg0, $arg1)
    {

    }
}
