package characterstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamDemo {
    /*
    字符流： 以字符为单位读写数据，专门用于处理文本文件。

    字符输入流【Reader】：java.io.Reader 抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。它定义了字符输入
            流的基本共性功能方法。

            public void close() ：关闭此流并释放与此流相关联的任何系统资源。
            public int read() ： 从输入流读取一个字符。
            public int read(char[] cbuf) ： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。

    FileReader类：
        java.io.FileReader 类是读取字符文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。

        构造方法：
            FileReader(File file) ： 创建一个新的 FileReader ，给定要读取的File对象。
            FileReader(String fileName) ： 创建一个新的 FileReader ，给定要读取的文件的名称。

        读取字符数据:
            读取字符： read 方法，每次可以读取一个字符的数据，提升为int类型，读取到文件末尾，返回 -1 ，循环读取;
            使用字符数组读取： read(char[] cbuf) ，每次读取b的长度个字符到数组中，返回读取到的有效字符个数，读取到末尾时，返回 -1

        续写和换行：操作类似于FileOutputStream。
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // 使用File对象创建FileReader对象
        File file = new File("./fos.txt");
        FileReader fr = new FileReader(file);

        // 使用文件名创建FileReader对象
        FileReader fr1 = new FileReader("./frreader_test.txt");

        // 读取字符数据: 循环
        // int c = fr.read();
        // System.out.println((char)c);
        int c;
        while((c = fr.read()) != -1){
            System.out.println((char)c);
        }
        // 关闭
        fr.close();

        // 使用字符数组读取

        // 定义变量保存有效字符个数
        int len;
        // 定义字符数组，作为装字符的容器
        char[] cbuf = new char[2];
        // 循环读取
        while((len = fr1.read(cbuf)) != -1){
            System.out.print(new String(cbuf, 0, len));
        }
        // 关闭
        fr1.close();


    }
}
