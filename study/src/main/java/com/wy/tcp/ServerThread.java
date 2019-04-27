package com.wy.tcp;

import java.io.*;
import java.net.Socket;
import java.util.Date;

/**
 * @program: PersonalStudy
 * @description: Socket多线程服务端
 * @author: Wuyong
 * @create: 2019-04-26 17:50
 **/
public class ServerThread implements Runnable {
    private static Socket client = null;

    public ServerThread(Socket client) {
        this.client = client;
    }

    public static void testsTream() {
        try {
            OutputStream outputStream = client.getOutputStream();
            InputStream inputStream = client.getInputStream();
            while (true) {
                int inputInt = inputStream.read();
                System.out.println("服务端收到客户端发送的信息：" + inputInt);
                outputStream.write(inputInt);
                if (inputInt == 00) {
                    break;
                }
            }
            outputStream.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testString() {
        {
            try {
                //获取Socket的输出流，用来向客户端发送数据
                PrintStream printStream = new PrintStream(client.getOutputStream());
                //获取Socket的输入流，用于接收客户端发送过来的数据
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                while (true) {
                    //接收从客户端发送过来的数据
                    String inputStr = bufferedReader.readLine();
                    if (inputStr == null || "".equals(inputStr) || "bye".equals(inputStr)) {
                        break;
                    } else {
                        //将接收到的字符串前面加上特定前缀，发送给对应的客户端。
                        printStream.println(new Date() + "server===" + inputStr);
                        System.out.println("服务端收到客户端发送的信息：" + inputStr);
                    }
                }
                printStream.close();
                bufferedReader.close();
                if (client != null && !client.isClosed())
                    client.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        testString();
//        testsTream();
    }
}
