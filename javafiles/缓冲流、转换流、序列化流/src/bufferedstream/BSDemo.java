package bufferedstream;

import java.io.*;
import java.nio.Buffer;

public class BSDemo {
    /*
    缓冲流,也叫高效流，是对4个基本的 FileXxx 流的增强，所以也是4个流，按照数据类型分类：
        字节缓冲流： BufferedInputStream ， BufferedOutputStream
        字符缓冲流： BufferedReader ， BufferedWriter

    缓冲流的基本原理，是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数，从而提高读写的效率。


    字节缓冲流:
        构造方法:
            public BufferedInputStream(InputStream in) ：创建一个 新的缓冲输入流。
            public BufferedOutputStream(OutputStream out) ： 创建一个新的缓冲输出流。

     */
    public static void main(String[] args){
        // 开始计时
        long start = System.currentTimeMillis();
        // 创建字节缓冲输入流
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/lxf/Desktop/django.pdf"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/lxf/Desktop/Django"))){
            // 读写数据
            int len;
            byte[] b = new byte[1024];

            while((len = bis.read(b)) != -1){
                bos.write(b, 0, len);
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("总共化时：" + (end - start) + "毫秒");

    }
}
