package characterstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterSteamDemo1 {
    /*
    字符输出流【Writer】：java.io.Writer 抽象类是表示用于写出字符流的所有类的超类，将指定的字符信息写出到目的地。它定义了字节
        输出流的基本共性功能方法

        void write(int c) 写入单个字符。
        void write(char[] cbuf) 写入字符数组。
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的某一部分,off数组的开始索引,len
        写的字符个数。
        void write(String str) 写入字符串。
        void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个
        数。
        void flush() 刷新该流的缓冲。
        void close() 关闭此流，但要先刷新它。


        FileWriter类： java.io.FileWriter 类是写出字符到文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。

            构造方法
                FileWriter(File file) ： 创建一个新的 FileWriter，给定要读取的File对象。
                FileWriter(String fileName) ： 创建一个新的 FileWriter，给定要读取的文件的名称。

            关闭和刷新: 因为内置缓冲区的原因，如果不关闭输出流，无法写出字符到文件中。但是关闭的流对象，是无法继续写出数据
                的。如果我们既想写出数据，又想继续使用流，就需要 flush 方法了。

            写出字符数组 ： write(char[] cbuf) 和 write(char[] cbuf, int off, int len) ，每次可以写出字符数组中的数据，用法类似FileOutputStream

            写出字符串： write(String str) 和 write(String str, int off, int len) ，每次可以写出字符串中的数据，更为方便


     */

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // 使用文件名创建FileWriter对象
        File file = new File("./fwriter_test1.txt");
        FileWriter fw = new FileWriter(file);

        // 使用文件名创建FileWriter对象
        FileWriter fw1 = new FileWriter("./fwrter_test2.txt");

        // 写出数据
        fw.write(97);
        fw.flush();
        fw.write('b');
        fw.flush();

        // 关闭资源时,与FileOutputStream不同。
        //如果不关闭,数据只是保存到缓冲区，并未保存到文件
        // 关闭文件
        fw.close();

        String msg = "车车车";
        fw1.write(msg, 0, 2);
        fw1.flush();
        fw1.close();

    }
}
