package bufferedstream;

import java.io.*;

public class BSDemo1 {
    /*
    字符缓冲流：
        构造方法
            public BufferedReader(Reader in) ：创建一个 新的缓冲输入流。
            public BufferedWriter(Writer out) ： 创建一个新的缓冲输出流。

        特有方法： 字符缓冲流的基本方法与普通字符流调用方式一致，
            BufferedReader： public String readLine() : 读一行文字。
            BufferedWriter： public void newLine() : 写一行行分隔符,由系统属性定义符号。
     */
    public static void main(String[] args){
        // 创建字符缓冲流对象： 输入流和输出流
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/lxf/Desktop/test.txt"));
            BufferedReader br = new BufferedReader(new FileReader("/Users/lxf/Desktop/test.txt"))){
            // 写出
            bw.write("今天星期天了....");
            // 写出换行
            bw.newLine();
            bw.write("明天星期一...");
            // 显示写出
            String line;
           while((line = br.readLine()) != null){
               System.out.println(line);
           }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
