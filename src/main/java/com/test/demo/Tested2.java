package com.test.demo;

import java.util.ArrayList;
import java.util.List;

public class Tested2 {
    public static void main(String[] args) {
        String a[] = new String[]{"16","15","2","30","25","1","359","254","333256","333255"};
        String g[][] = new String[18][18];
        List<String[]> list=new ArrayList<>();
        String gg="";
        String ff="";
        String p[][];
        boolean tr = true;
        int cc=0;
        int aa=0;
        int size = a.length;
        for(int i = 0; i<size-1; i++) {
            for (int j = i+1; j<a.length; j++) {
                if(Integer.parseInt(a[i])>Integer.parseInt(a[j])) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0;i<a.length; i++){
            int  b =Integer.parseInt(a[i].substring(0));
            b = (b / 10);
            int z =a[i].length();
            int t=  Integer.parseInt(a[i]);
            int f = new Double(b*10).intValue();
            if(i==0){
                cc=f;
            }
            if(f<10){
                ff+=a[i]+",";
            }
            else if (t>=f&&t<f+10){
                if(cc == f){
                    gg += a[i]+",";
                }else {
                    if(ff!= null){
                        if(Integer.parseInt(a[i])>10){
                            String[]  strs=ff.split(",");
                            list.add(strs);
                        }

                        ff=null;
                    }
                    String[]  strs=gg.split(",");
                    list.add(strs);
                    cc = f;
                    gg =a[i]+",";
                }
            }
        }
        String[]  strs1=gg.split(",");
        list.add(strs1);
        System.out.println(list);
    }


}
