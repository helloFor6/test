package com.test.demo;

import com.alibaba.fastjson.JSON;

import java.util.Random;

public class TestDome {



    public static void main(String[] args) {
        int[] list = getList(18);

        System.out.println(JSON.toJSONString(list));
        BubbleSort(list);
        System.out.println(JSON.toJSONString(list));
        System.out.println(JSON.toJSONString(TwoArry(list)));
//        System.out.println(TwoArry(list).length);
//        System.out.println(list.length);
        System.out.println();
    }

    public static Object[] TwoArry1(int[] x) {
        Object[] o = new Object[x.length / 2];
        BubbleSort(x);
        for (int i = 0; i < x.length; i++) {
            int y = x[i];
            for (int j = 0; j < o.length; j++) {
                Random random = new Random();
                int m = random.nextInt(3) + 1;
                int[] g = new int[m];
                for (int k = 0; k < g.length; k++) {
                    System.out.println("-->" + y);
                    g[k] = y;
                }
                o[j] = g;
            }
        }
        return o;
    }

    public static Object[] TwoArry(int[] array) {
        Object[] x = new Object[array.length / 2];
        int k = 0;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            Random random = new Random();
            int m = random.nextInt(3) + 1;
            int[] g = new int[m];
//            System.out.println("m---" + m);
            count += m;
//            System.out.println("count---" + count);
            if (count > array.length) {
                System.out.println("退出。。。。。。。。。。。");
                break;
            }
            for (int j = 0; j < m; j++) {
//                System.out.println("j->"+j+"---k==>"+k);
                g[j] = array[k];
                k++;
//                System.out.println("k内->" + k);
            }
//            System.out.println("k->" + k);
//            System.out.println("随机数组--》"+JSON.toJSONString(g));
            x[i] = g;
//            System.out.println("赋值后--》"+JSON.toJSONString(x[i]));
        }
//        System.out.println("长度------》" + count);
        if (count != array.length) {
            return TwoArry(array);
        }else {
            System.out.println("最终--》"+JSON.toJSONString(x));
            return x;
        }

    }

    public static void BubbleSort(int[] array) {
        int x = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                int temp;
                x++;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("===========" + x);
    }

    public static int[] getList(int x) {
        int[] arrs = new int[x];
        for (int i = 0; i < x; i++) {
            Random random1 = new Random();
            arrs[i] = random1.nextInt(100) + 1;

        }
        return arrs;
    }

}
