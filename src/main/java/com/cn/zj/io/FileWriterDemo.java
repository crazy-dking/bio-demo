package com.cn.zj.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: 字符的输出流
 * @Author: wangdakai
 * @Date: 2021/11/12
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("fileReader.txt",true);
        fw.write("王");
        // flush表示一次落盘
        fw.flush();
        fw.close();
    }
}
