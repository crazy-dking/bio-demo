package com.cn.zj.io;

import java.io.*;
import java.util.Properties;

/**
 * @Description: 他是唯一一个可以和io结合的集合。
 * @Author: wangdakai
 * @Date: 2021/11/12
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
//        pro.setProperty("name","dk");
//        pro.setProperty("age","18");
//        Writer w = new FileWriter("my.properties");
//        pro.store(w,"我的配置");
//        w.close();

        InputStream is = new FileInputStream("my.properties");
        pro.load(is);
        System.out.println(pro.getProperty("name"));
        is.close();
    }
}
