package com.cn.zj.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: 所谓的输入和输出是针对内存的。
 * @Author: wangdakai
 * @Date: 2021/11/12
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/mlamp/back_end/dk_workspace/bio-demo/a.txt");
        fos.write(97);
        fos.write(65);
        // 通过byte数组方式进行写入
        byte[] bytes = new byte[]{65, 65, 65};
        fos.write(bytes);
        // 从开始 写一个
        fos.write(bytes,0,1);
        // 追加写。换行写。
        fos.close();
        File file = new File("/Users/mlamp/back_end/dk_workspace/bio-demo/append.txt");
        FileOutputStream fos1 = new FileOutputStream(file,true);
        fos1.write(bytes);
        fos1.write("\r\n".getBytes());
        fos1.close();
    }
}
