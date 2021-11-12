package com.cn.zj.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @Description: 序列化
 * @Author: wangdakai
 * @Date: 2021/11/12
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("person.txt");
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(new Person(1,"dk"));
        oos.flush();
        oos.close();
    }
}
