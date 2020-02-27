package TCP;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTransmission {
    /*
    文件传输： 服务端
     */
    public static void main(String[] args) throws IOException{
        System.out.println("server is running.....");

        ThreadSer ts = new ThreadSer();
        Thread t = new Thread(ts, "server thread....");

        t.start();
    }
}

class ThreadSer implements Runnable {
    @Override
    public void run() {
        try ( // 获取该套接字的输入流，获取文件数据
              // 创建服务端套接字
              ServerSocket ss = new ServerSocket(8080);
              Socket server = ss.accept();
              BufferedInputStream bis = new BufferedInputStream(server.getInputStream());
              // 创建文件输出流，保存文件到本地)
              BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(System.currentTimeMillis() + ".jpg"))) {
            int len;
            byte[] b = new byte[1024 * 4];
            while ((len = bis.read()) != -1) {
                bos.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
