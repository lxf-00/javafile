package bytestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    /*
    字节流： 一切皆为字节；
        一切文件数据(文本、图片、视频等)在存储时，都是以二进制数字的形式保存，都一个一个的字节，那么传输时一
        样如此。所以，字节流可以传输任意文件数据。在操作流的时候，我们要时刻明确，无论使用什么样的流对象，底
        层传输的始终为二进制数据

    字节输出流【OutputStream】：java.io.OutputStream抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。它定义了字
        节输出流的基本共性功能方法。

        public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
        public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出。
        public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
        public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输
        出到此输出流。
        public abstract void write(int b) ：将指定的字节输出流。

    FileOutputStream类：java.io.FileOutputStream 文件输出流，用于将数据写出到文件；
        构造方法：
            public FileOutputStream(File file) ：创建文件输出流以写入由指定的 File对象表示的文件。
            public FileOutputStream(String name) ： 创建文件输出流以指定的名称写入文件。

            当你创建一个流对象时，必须传入一个文件路径。该路径下，如果没有这个文件，会创建该文件。如果有这个文
            件，会清空这个文件的数据。

        写出字节数据：
            写出字节： write(int b) 方法，每次可以写出一个字节数据；
            写出字节数组：write(byte[] b) ，每次可以写出数组中的数据;
            写出指定长度字节数组： write(byte[] b, int off, int len) ,每次写出从off索引开始，len个字节
            追加写出： public FileOutputStream(File file, boolean append)；public FileOutputStream(String name, boolean append)
            写出换行：
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // 使用File对象创建流对象
        File file = new File("./fileoutput_test.txt");
        FileOutputStream fos = new FileOutputStream(file,true);
        FileOutputStream fos2 = new FileOutputStream("fos.txt", true);

        // 使用文件名创建流对象
        FileOutputStream fos1 = new FileOutputStream("fileoutput_test1.txt", true);

        // 写出字节
        fos.write(97);
        fos.write(98);

        // 写出字节数组
        byte[] b = "这是个晴天啊".getBytes();
        fos1.write(b);

        byte[] b1 = "bacde".getBytes();
        fos1.write(b1, 2, 2);

        byte[] b2 = {97,98,99,100,101};
        for(byte by: b2){
            fos2.write(by);
            fos2.write("\r".getBytes());
        }


        // 关闭资源
        fos.close();
        fos1.close();
        fos2.close();
    }
}
