package bufferedstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIOS {
    // 使用基本流测试拷贝时间
    public static void main(String[] args){
        // 开始计时
        long start = System.currentTimeMillis();
        // 创建基本流对象
        try(FileInputStream fis = new FileInputStream("/Users/lxf/Desktop/django.pdf");
            FileOutputStream fos = new FileOutputStream("/Users/lxf/Desktop/django1.pdf")){
            // 读写操作
            int len;
            byte[] b = new byte[1024];

            while((len = fis.read(b)) != -1){
                fos.write(b, 0, len);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("总共耗时：" + (end - start) + "毫秒");
    }
}
