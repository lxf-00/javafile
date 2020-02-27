package TCP;

import java.io.*;
import java.net.Socket;

public class ClientTransmission {
    /*
     文件上传案例:
        客户端上传
     */
    public static void main(String[] args){
        try(
        // 创建输入流：读取文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/lxf/Desktop/django.pdf"));

        // 创建套接字，输出流，写到服务器
        Socket client = new Socket("172.16.36.164", 8080);
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
        ){
            // 写入数据
            int len;
            byte[] b = new byte[1024 * 4];

            while((len = bis.read()) != -1){
                bos.write(b, 0, len);
                bos.flush();
            }

            System.out.println("文件发送完毕.....");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
