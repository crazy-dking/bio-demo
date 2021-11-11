package com.cn.zj.one;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // 创建socket请求对象
        Socket socket = new Socket("127.0.0.1",8080);
        // 从socket中创建要给字节输入流
        OutputStream os = socket.getOutputStream();
        PrintStream printStream = new PrintStream(os);
        printStream.println("hello world");
        printStream.flush();
        System.out.println();
    }
}
