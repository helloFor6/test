package com.test.demo;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.Random;

//测试分支
//主分支
public class Test3 {
    public static void main(String[] args) {
        int[] list = getList(18);
        System.out.println("第一题输出：" + Arrays.toString(list));
        Sort(list);
        int[] trim = trim(list);


        System.out.println("第二题输出：" + Arrays.toString(reArray(trim, 18)));
    }

    //数组去重复-->重复对象去掉
    private static int[] trim(int[] arry) {
        int t = 0;
        int[] newary = new int[arry.length];
        for (int i = 0; i < arry.length; i++) {
            boolean isTrue = true;
            for (int j = i + 1; j < arry.length; j++) {

                if (arry[i] == arry[j]) {
                    isTrue = false;
                    break;
                }
            }

            if (isTrue) {
                newary[t] = arry[i];
                t++;
            }

        }
        int[] newArry = new int[t];
        System.arraycopy(newary, 0, newArry, 0, t);
        return newArry;
    }

    //冒泡排序
    public static void Sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                int temp;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public static int[] getList(int x) {
        int[] arrs = new int[x];
        for (int i = 0; i < x; i++) {
            Random random1 = new Random();
            arrs[i] = random1.nextInt(100) + 1;
        }
        return arrs;
    }
    //数组重组
    public static Object[] reArray(int[] array, int z) {
        Object[] x = new Object[z / 2];
        int k = 0;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            Random random = new Random();
            int m = random.nextInt(3) + 1;
            int[] g = new int[m];
            count += m;
            if (count > array.length) {
                break;
            }
            for (int j = 0; j < m; j++) {
                g[j] = array[k];
                k++;
            }
            x[i] = Arrays.toString(g);
        }
        if (count != array.length) {
            return reArray(array, z);
        } else {
            return x;
        }

    }
}
