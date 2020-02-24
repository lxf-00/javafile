package bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise {
    /*
    图片复制
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // 创建输入流对象：源文件地址
        FileInputStream pf = new FileInputStream("./test.jpg");

        // 创建输出流对象：目标文件
        FileOutputStream pf1 = new FileOutputStream("./字节流、字符流/src/test.jpg");

        int len;
        byte[] b = new byte[1024];
        // 循环读取，写入
        while((len = pf.read(b)) != -1){
            pf1.write(b, 0, len);
        }
        // 关闭资源
        pf.close();
        pf1.close();

    }
}
