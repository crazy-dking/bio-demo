package com.cn.zj.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * @Description: 反序列化
 * @Author: wangdakai
 * @Date: 2021/11/12
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream("person.txt");
        ObjectInputStream ois = new ObjectInputStream(is);
        Person person = (Person)ois.readObject();
        System.out.println(person);
    }
}
