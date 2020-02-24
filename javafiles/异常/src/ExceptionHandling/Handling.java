package ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Handling {
    /*
    IO 异常的处理：
        JDK7前处理：建议使用try...catch...finally,
        JDK7优化使用：  try-with-resource
            格式：
                try (创建流对象语句，如果多个,使用';'隔开) {
                        // 读写数据
                } catch (IOException e) {
                    e.printStackTrace();
                }
        JDK9的改进:  try-with-resource 的改进，对于引入对象的方式，支持的更加简洁。
     */
    public static void main(String[] args){
        // 创建流对象
        try(FileWriter fw = new FileWriter("./fwriter_test1.txt");){
            // 写入数据
            fw.write("这什么啊");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
