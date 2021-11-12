package com.cn.zj.file;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Description:
 * @Author: wangdakai
 * @Date: 2021/11/12
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1,6,3,7,2,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
    // 快速排序，方式和这个方法差多。只不过快速不进行借助第三方空间。
         // 真正执行的地方
        sort(arr,0,arr.length-1);
    }

    private static void sort(int[] arr, int l, int r) {
        // 终止条件
        if(l>=r)return ;
        // 进行中间操作。找到轴点，轴点可以随机一个。然后遍历。轴点左边下于轴点轴点右边大于轴点。让后按照轴点左后位置进行切分，循环遍历
        int index = helper(arr,l,r);
        sort(arr,l,index);
        sort(arr,index+1,r);
    }

    private static int helper(int[] arr, int l, int r) {
        // 轴点可以随便选取，我们每次都去数组最左边的数作为轴点。
        int pivot = arr[l];
        while(l<r){
            while(l<r&& arr[r]>=pivot)r--;
            if(l<r)swap(arr,l,r);
            while(l<r&& arr[l]<=pivot)l++;
            if(l<r)swap(arr,l,r);
        }
        arr[l]=pivot;
        return l;
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l]=arr[r];
        arr[r] = temp;

    }


}
