package com.cn.zj.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Description: 我们事先一个文件复制
 * 我们将项目下a文件copy到我们io文件夹中。
 * @Author: wangdakai
 * @Date: 2021/11/12
 */
public class CopyDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("/Users/mlamp/back_end/dk_workspace/bio-demo/src/main/java/com/cn/zj/io/a.txt");
        int len;
        while((len=fis.read())!=-1){
            fos.write(len);
        }
        fis.close();
        fos.close();
    }
}
