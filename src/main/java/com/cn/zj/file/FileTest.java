package com.cn.zj.file;

import java.io.File;
import java.io.IOException;

/**
 * 我们可以File进行对文件继续操作。
 * file dictionary path
 * 路径分割符“:"
 * 文件分割符"\"
 *
 *
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        // 文件的分隔符
        String pathSeparator = File.pathSeparator;
        String separator = File.separator;

        System.out.println(pathSeparator+ " == " +separator);
        File file = new File("b.txt");
        System.out.println(file);
        System.out.println(file.getAbsolutePath());

        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println("====== 文件判断======");

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        System.out.println("====== 文件增删改======");
        File file1 = new File("createNewFile");
        // 如果没有会创建一个。返回值boolean
        System.out.println("创建"+file1.createNewFile());
        // 注意此处有个删除。在测试效果的时候要将他注释掉。
        file1.delete();
        // 创建文件夹
        System.out.println(file1.mkdir());
        file1.delete();

        System.out.println("====== 文件的获取======");
        file.list();
        file.listFiles();
    }
}
