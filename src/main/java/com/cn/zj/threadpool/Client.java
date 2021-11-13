package com.cn.zj.threadpool;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端：用来发送消息
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // 创建socket 请求对象
        Socket socket = new Socket("127.0.0.1",8080);
        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入您的请求：");
        while(scan.hasNext()){
            ps.println(scan.next());
            ps.flush();
        }
    }
}
