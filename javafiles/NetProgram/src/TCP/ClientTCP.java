package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTCP {
    /*
    TCP : 客户端   服务端
    两端通信时步骤：
        1. 服务端程序，需要事先启动，等待客户端的连接。
        2. 客户端主动连接服务器端，连接成功才能通信。服务端不可以主动连接客户端。

    在Java中，提供了两个类用于实现TCP通信程序：
        1. 客户端： java.net.Socket 类表示。创建 Socket 对象，向服务端发出连接请求，服务端响应请求，两者建立连接开始通信。
        2. 服务端： java.net.ServerSocket 类表示。创建 ServerSocket 对象，相当于开启一个服务，并等待客户端的连接。

    Socket类：该类实现客户端套接字，套接字指的是两台设备之间通讯的端点。
        构造方法
            public Socket(String host, int port) :创建套接字对象并将其连接到指定主机上的指定端口号。如果指定的host是null ，则相当于指定地址为回送地址。
        成员方法:
            public InputStream getInputStream() ： 返回此套接字的输入流。
                如果此Scoket具有相关联的通道，则生成的InputStream 的所有操作也关联该通道。
                关闭生成的InputStream也将关闭相关的Socket。
            public OutputStream getOutputStream() ： 返回此套接字的输出流。
                如果此Scoket具有相关联的通道，则生成的OutputStream 的所有操作也关联该通道。
                关闭生成的OutputStream也将关闭相关的Socket。
            public void close() ：关闭此套接字。
                一旦一个socket被关闭，它不可再使用。
                关闭此socket也将关闭相关的InputStream和OutputStream
            public void shutdownOutput() ： 禁用此套接字的输出流.
                任何先前写出的数据将被发送，随后终止输出流。

    ServerSocket类: 这个类实现了服务器套接字，该对象等待通过网络的请求.
        构造方法
            public ServerSocket(int port) ：使用该构造方法在创建ServerSocket对象时，就可以将其绑定到一个指定的端口号上，参数port就是端口号。
        成员方法
            public Socket accept() ：侦听并接受连接，返回一个新的Socket对象，用于和客户端实现通信。该方法会一直阻塞直到建立连接。

     */
    public static void main(String[] args){
        System.out.println("客户端发送数据:");
        // 创建客户端套接字
        try {
            // Socket(ip， port)  连接到哪， 目的端口
            Socket client = new Socket("172.16.36.164", 8080);
            // 获取流对象: 输出
            OutputStream ops = client.getOutputStream();
            // 写对象
            ops.write("你好，来自TCP (Java 实现的问候）".getBytes());


            // 接收服务器的信息
            InputStream ips = client.getInputStream();
            byte[] b = new byte[1024];
            int len = ips.read(b);

            System.out.println("回复：" + new String(b, 0, len));
            // 关闭资源
            ops.close();
            client.close();

        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
