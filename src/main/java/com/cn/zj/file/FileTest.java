package com.cn.zj.file;

import java.io.File;

/**
 * 我们可以File进行对文件继续操作。
 * file dictionary path
 * 路径分割符“:"
 * 文件分割符"\"
 *
 *
 */
public class FileTest {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        String separator = File.separator;

        System.out.println(pathSeparator+ " == " +separator);
        File file = new File("b.txt");
        System.out.println(file);

    }
}
