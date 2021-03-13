package day01;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        int score = 0;
        System.out.println("HelloWord !");
        Scanner constant = new Scanner(System.in);  // 创建一个输入数字对象
        for (int i = 0; i < 10; i++) {

            int a = (int) (Math.random() * 100);  //产生两个随机数
            int b = (int) (Math.random() * 100);
            int ab = a + b;
            System.out.println(a + "+" + b + "=" + "?");
            int Constant1 = constant.nextInt();  // 将输入的数字大小给Constant1

            if (Constant1 == ab) {
                System.out.println("回答正确");
                score += 10;
            }
            else{
                    System.out.println("回答错误");
                }
            }
        System.out.println(score);
        }


    }