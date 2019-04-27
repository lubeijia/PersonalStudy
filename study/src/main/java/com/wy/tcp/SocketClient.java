package com.wy.tcp;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * @program: PersonalStudy
 * @description: socket客户端
 * @author: Wuyong
 * @create: 2019-04-26 17:23
 **/
public class SocketClient {
    private static String IP = "127.0.0.1";
    private static int PORT = 20006;

    public static void testStream() {
        try {
            Socket client = new Socket(IP, PORT);
            client.setSoTimeout(10000);
            OutputStream outputStream = client.getOutputStream();
            InputStream inputStreamServer = client.getInputStream();

            outputStream.write(1001);
            int result = inputStreamServer.read();
            System.out.println("客户端收到服务端发送的信息：" + result);

            outputStream.close();
            inputStreamServer.close();
            client.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }


    public static void testString() {
        //客户端请求与目标注计的某个端口建立连接
        Socket client = null;
        try {
            client = new Socket(IP, PORT);
            client.setSoTimeout(10000);
            //获取键盘数据
            BufferedReader bufferedReaderInput = new BufferedReader(new InputStreamReader(System.in));

            //获取Socket输出流，用来发送数据到服务端。
            PrintStream printStream = new PrintStream(client.getOutputStream());
            //获取Socket输入流，用来接收从服务端发送过来的数据
            BufferedReader bufferedReaderServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            boolean flag = true;
            while (flag) {
                System.out.println("请输入信息:");
                String str = bufferedReaderInput.readLine();
                //发送数据到服务端
                printStream.println(str);
                if ("bye".equals(str)) {
                    flag = false;
                } else {
                    try {
                        //从服务器接收数据有个时间限制，超过限制时间，抛出异常
                        String echo = bufferedReaderServer.readLine();
                        System.out.println("客户端收到服务端发送的信息：" + echo);
                    } catch (SocketTimeoutException e) {
                        e.printStackTrace();
                        System.out.println("Time out,No response.");
                    }
                }
            }
            bufferedReaderInput.close();
            printStream.close();
            bufferedReaderServer.close();
            if (client != null) {
                //如果构造函数建立了连接，则关闭套接字。
                client.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static void main(String[] args) {
        SocketClient.testString();
//        SocketClient.testStream();
    }
}
