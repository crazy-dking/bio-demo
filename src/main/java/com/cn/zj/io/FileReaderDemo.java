package com.cn.zj.io;

import javafx.scene.chart.Chart;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Description: 字符,专门用来处理中文的
 * @Author: wangdakai
 * @Date: 2021/11/12
 */
public class FileReaderDemo {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("fileReader.txt");
        int len;
//        while((len = fr.read())!=-1){
//            System.out.println(len);
//        }
        // 一次读取多个 自流中使用的byte[]这里使用char[]
        char[] charts = new char[1024];
        while(-1 != (len = fr.read(charts))){
            System.out.println(len);
        }
    }
}
