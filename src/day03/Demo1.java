package day03;

import java.util.Scanner;  //do-while 先do，再判断。无论如何都会先做一遍   continue: 结束本次循环，继续下次循环

public class Demo1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);  //  输入对象
        int num = (int)(Math.random()*200 + 1);   //  产生0~200的随机数
        int n = -1;
        while( n != num){                         //死循环要求输入的数n和num不相等时循环继续
            n = number.nextInt();

            if(n < num){
                System.out.println("太小了");
            }else if(n > num){
                System.out.println("太大了");
            }
        }
        System.out.println("你猜对了");
    }
}
