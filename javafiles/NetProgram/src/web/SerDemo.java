package web;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SerDemo {
    /*
    模拟B/S:
     */
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动，等待连接....");
        ServerSocket ss = new ServerSocket(8888);
        while(true) {
            Socket socket = ss.accept();
            new Thread(new Web(socket)).start();
        }
    }
}

class Web implements Runnable {
    private Socket socket;

    public Web(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        try {
            // 转换流读取服务器中请求数据
            BufferedReader readwb = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String request = readwb.readLine();
            System.out.println("request : " +request);
            // 取出请求的路径
            String[] strArr = request.split(" ");
            // 去掉web前面的/
            String path = strArr[1].substring(1);
            System.out.println("path:" + path);
            // 读取客户端要求的资源文件
            FileInputStream fis = new FileInputStream("./" + path);
            int len;
            byte[] b = new byte[1024];
            // 字节输出流，将文件写回到客户端中
            OutputStream ops = socket.getOutputStream();
            // 写HTTP 协议响应头，固定写法
            ops.write("HTTP/1.1 200 OK \r\n".getBytes());
            ops.write("Content-Type:text/html\r\n".getBytes());
            // 写入空行,在写入内容
            ops.write("\r\n".getBytes());
            while((len = fis.read(b)) != -1){
                ops.write(b, 0, len);
            }

            // 关闭资源
            fis.close();
            ops.close();
            readwb.close();
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}




