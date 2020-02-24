package printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    /*
    打印流： java.io.PrintStream 类  print（） println（）

    PrintStream类:
        构造方法
            public PrintStream(String fileName) ： 使用指定的文件名创建一个新的打印流。
        改变打印流向:
            System.out 就是 PrintStream 类型的，只不过它的流向是系统规定的，打印在控制台上。不过，既然是流对象，我们就可以玩一个"小把戏"，改变它的流向。
     */
    public static void main(String[] args) throws FileNotFoundException {
        // 调用系统的打印流
       // System.out.println(97);

        // 创建打印流，指定文件名称
        PrintStream ps = new PrintStream("ps.txt");

        // 设置系统的打印流向:输出到ps.txt
        System.setOut(ps);

        // 调用系统打印流， ps.txt
        System.out.println(97);
    }
}
