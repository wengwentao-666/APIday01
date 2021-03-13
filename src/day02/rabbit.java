package day02;

import java.util.Scanner;

public class rabbit {
    public static void main(String[] args) {
        int shuliang = 0;
        Scanner month = new Scanner(System.in);
        int number = month.nextInt();
        int b = number / 3;
        int a = b + 1;
        shuliang = (int) Math.pow(2, a);
        System.out.println(number + "个月的兔子总数为" + shuliang);
    }
}
