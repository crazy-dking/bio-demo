package com.cn.zj.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Description: 输入流，读取磁盘到内存。
 * @Author: wangdakai
 * @Date: 2021/11/12
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis =  new FileInputStream("a.txt");
        int read = fis.read();
        System.out.println(read);
        int read1 = fis.read();
        System.out.println(read1);
        // 一次读取一个字节。
        int len;
        while((len = fis.read())!=-1){
            System.out.println(len);
        }
//        byte[] bytes = new byte[2];
//        while((len = fis.read(bytes))!=-1){
//            System.out.println(new String(bytes));
//        }
        fis.close();

    }

}
