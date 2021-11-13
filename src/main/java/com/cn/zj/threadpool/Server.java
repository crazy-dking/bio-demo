package com.cn.zj.threadpool;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 采用线程池的方式进行接受socket链接
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // 创建socket监听。
        ServerSocket ss = new ServerSocket(8080);
        // 正常应该将他拿出去作为一个单例，且使用的时候注意队列不能无限大。
        ThreadPoolExecutor thread = new ThreadPoolExecutor(3, 10, 60, TimeUnit.SECONDS, new SynchronousQueue<>());
        Socket accept;
        while(true){
            accept = ss.accept();
            Socket finalAccept = accept;
            thread.execute(()->{
                try {
                    InputStream is = finalAccept.getInputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    String msg;
                    while((msg=br.readLine())!=null){
                        System.out.println("读取到客户端信息："+msg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    try {
                        finalAccept.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

            });
        }
    }
}
