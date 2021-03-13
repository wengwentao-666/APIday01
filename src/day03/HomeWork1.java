package day03;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        // 创建一个char类型随机数组，字符串长度为5
        int Same = 0;
        int Same1 = 0;
        boolean yes = true;
        int k = 0;
        char [] bye =  {'b','y','e','b','y','e'} ;
        char[] c1 = new char[5];
        System.out.println(Arrays.toString(bye));
        for(int i = 0; i < 5; i++){
            int asc = (int)(Math.random()*25 + 97 );
            char c = (char) asc;
            c1[i] = c;
            System.out.print(c + " ");
        }
       while (yes) {
           Scanner number = new Scanner(System.in);       //读取控制台输入的字符串
           String cs = number.next();
           char[] chs = cs.toCharArray();                 //将控制台输入的字符串cs  转变成数组  chs[]
           System.out.println(Arrays.toString(chs));
           //控制台输入的数组，和随机产生的数组已经生成，接下来就是判别过程
           System.out.println(cs);
           for (int i = 0; i < chs.length; i++){
              if (bye[i] == chs[i]){
                  k ++;
              }
              if(k == 5){
                 yes = false;
              }
           }
           k = 0;
           for (int i = 0; i < 5; i++) {
               for (int j = 0; j < 5; j++) {
                   if (c1[i] == chs[j]) {
                       Same++;
                   }
                   if(Same >= 5){
                       Same = 5;
                   }
               }
           }
           for (int i = 0; i < 5; i++) {
               if (c1[i] == chs[i]) {
                   Same1++;
               }
           }
           System.out.println(Same + "个字母正确" + "," + "其中位置正确有" + Same1 + "个");
           Same = 0;
           Same1 = 0;
       }
    }
           public static void Guess(){

           }
}
