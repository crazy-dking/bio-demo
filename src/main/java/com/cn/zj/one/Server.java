package com.cn.zj.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 1.监听客户端请求端口好
 * 2.监听客户端的连接请求
 * 3.从socket管道中获取一个输入流
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8080);
            Socket socket = ss.accept();
            InputStream inputStream = socket.getInputStream();
            // 将字节输入流包装成一个 缓冲字符输入流。
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String msg;
            while((msg=br.readLine())!=null){
                System.out.println("读取到客户端信息："+msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
