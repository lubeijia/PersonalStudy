package com.wy.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: PersonalStudy
 * @description: Socket服务端
 * @author: Wuyong
 * @create: 2019-04-26 17:57
 **/
public class SocketServer {
    private static int PORT = 20006;

    public static void main(String[] args) {
        //服务端监听端口
        ServerSocket server = null;
        try {
            server = new ServerSocket(PORT);
            Socket client = null;
            while (true) {
                //等待客户端的连接
                client = server.accept();
                System.out.println("与客户端连接成功！");
                //为每个客户端连接启动一个线程
                new Thread(new ServerThread(client)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
            try {
                if (server != null)
                    server.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
