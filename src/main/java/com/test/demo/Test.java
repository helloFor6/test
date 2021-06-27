package com.test.demo;

import java.util.ArrayList;
 class Test2{
     int starisNum = 10;

     int[] ways = {1, 2, 3};

     int count = 0;
     ArrayList<Integer> list = new ArrayList<Integer>();



     void getSum(int tempSteps) {

         if (tempSteps > starisNum)

             return;


         if (tempSteps == starisNum) {

             count++;

             System.out.println(count + " 具体步法为：" + list);

             return;

         }

         for (int i = 0; i < ways.length; i++) {

             list.add(ways[i]);

             tempSteps += ways[i];

             getSum(tempSteps);

             tempSteps -= ways[i];

             list.remove(list.size() - 1);

         }

     }
}

public class Test {

    public static void main(String[] args) {
        Test2 te = new Test2();
        te.getSum(0);
    }
//    public static void main(String[] args) {
////        String x="hello";
////        String y="hello";
//
////        String x=new String("hello");
////        String y=new String("hello");
////        String x=null;
////        String y=null;
////
////        System.out.println(x==y);
////        System.out.println(x.equals(y));
////        x=y;
//////
////        System.out.println(x==y);
////        System.out.println(x.equals(y));
//////
//
//    }
}
