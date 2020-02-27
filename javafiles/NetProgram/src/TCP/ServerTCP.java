package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    /*
    TCP  ： 服务器端
     */
    public static void main(String[] args){
        System.out.println("服务器端启动，等待连接.....");

        // 创建ServerSocket对象
        try {
            ServerSocket ss = new ServerSocket(8080);

            // 接收连接accept方法，返回socket对象
            Socket server = ss.accept();

            // 通过Socket对象获取输入流
            InputStream is = server.getInputStream();

            // 读取数据
            byte[] b = new byte[1024];
            int len = is.read(b);

            // 显示信息
            String msg = new String(b, 0, len);
            System.out.println("msg:" + msg);

            // 向客户端返回数据
            OutputStream ops = server.getOutputStream();
            ops.write("很好，谢谢（来自Java测试)".getBytes());

            // 关闭资源
            is.close();
            ops.close();
            ss.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
