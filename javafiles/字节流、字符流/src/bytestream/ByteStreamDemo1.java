package bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo1 {
    /*
    字节输入流【InputStream】：java.io.InputStream m 抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。它定义了字节输入
        流的基本共性功能方法。

        public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
        public abstract int read() ： 从输入流读取数据的下一个字节。
        public int read(byte[] b) ： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。

    FileInputStream类:
        构造方法：
            FileInputStream(File file) ： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系
            统中的 File对象 file命名。
            FileInputStream(String name) ： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件
            系统中的路径名 name命名。

        方法：
             读取字节： read 方法，每次可以读取一个字节的数据，提升为int类型，读取到文件末尾，返回 -1；
             使用字节数组读取： read(byte[] b) ，每次读取b的长度个字节到数组中，返回读取到的有效字节个数，读取到末尾时，返回 -1 ，
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // 使用File对象创建文件输入流对象
        File file = new File("./fos.txt");
        FileInputStream fis = new FileInputStream(file);

        // 使用文件名创建输入流对象
        FileInputStream fis1 = new FileInputStream("fis_test.txt");

        // 读取字节
        // int read = fis.read();
        // System.out.println((char)read);

        int b;
        while((b = fis.read()) != -1){
            System.out.println((char)b);
        }
        // 关闭资源
        fis.close();

        int len;
        byte[] b1 = new byte[2];
        while((len = fis1.read(b1)) != -1){
            System.out.println(new String(b1, 0, len));
        }
        fis1.close();
    }
}
