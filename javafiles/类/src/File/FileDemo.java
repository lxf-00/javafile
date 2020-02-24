package File;

import java.io.File;
public class FileDemo {
    /*
    File 类：java.io.File; 文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。

    构造方法：
        public File(String pathname) ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
        public File(String parent, String child) ：从父路径名字符串和子路径名字符串创建新的 File实例。
        public File(File parent, String child) ：从父抽象路径名和子路径名字符串创建新的 File实例

        一个File对象代表硬盘中实际存在的一个文件或者目录; 无论该路径下是否存在文件或者目录，都不影响File对象的创建。

    常用的方法：
        public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        public String getPath() ：将此File转换为路径名字符串。
        public String getName() ：返回由此File表示的文件或目录的名称。
        public long length() ：返回由此File表示的文件的长度。

    绝对路径和相对路径：
        绝对路径：从盘符开始的路径，这是一个完整的路径；
        相对路径：相对于项目目录的路径，这是一个便捷的路径，开发中经常使用。

    判断功能的方法：
        public boolean exists() ：此File表示的文件或目录是否实际存在。
        public boolean isDirectory() ：此File表示的是否为目录。
        public boolean isFile() ：此File表示的是否为文件。

    创建删除功能的方法：
        public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        public boolean delete() ：删除由此File表示的文件或目录。
        public boolean mkdir() ：创建由此File表示的目录。
        public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。

    目录的遍历：
        public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录

    文件过滤器优化：
        java.io.FileFilter 是一个接口，是File的过滤器，该接口的对象可以传递给File类的 listFiles(FileFilter)
        作为参数， 接口中只有一个方法。boolean accept(File pathname) ：测试pathname是否应该包含在当前File目录中，符合则返回true。
     */
    public static void main(String[] args){
        // 文件路径名
        String pathname = "./a.txt";
        File file = new File(pathname);

        // 通过父路径名和子路径字符串
        String parent = "/Users/lxf/Desktop";
        String child = "b.txt";
        File file1 = new File(parent, child);

        // 通过父级File对象和子路径字符串
        File parentDir = new File("/Users/lxf/Desktop");
        String child1 = "c.txt";
        File file2 = new File(parentDir, child1);

        // String getAbsolutePath()
        System.out.println(file.getAbsoluteFile());

        // String getPath()
        System.out.println(file.getPath());

        // String getName()
        System.out.println(file.getName());

        // long length()
        System.out.println(file.length());

    }
}
