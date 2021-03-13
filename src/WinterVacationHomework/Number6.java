package WinterVacationHomework;

import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        /*题目：输入两个正整数m和n，求其最大公约数和最小公倍数。   
        在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，取得的余数作为下一轮循环的较小的数，
        如此循环直到较小的数的值为0，返回较大的数，
        此数即为最大公约数，最小公倍数为两数之积除以最大公约数*/
        double a = 0.0;
        Scanner Number = new Scanner(System.in);
        int m = Number.nextInt();
        int n = Number.nextInt();
       // System.out.println(m+" "+n);
        for(int i = 1; i <= m; i++){
            if(m%i == 0){
                if(n%(m/i) == 0){
                    if(a <= (m/i)){
                        a = m/i;
                    }
                }
            }
        }

      loop: for(int i = n; i >= 1; i--){
          if(m%i == 0){
              if(m/(a*(m/i)) != 0){
                  if(n/(a*(m/i)) != 0){
                      System.out.println("m和n的最大公倍数为："+a*(m/i));
                      break;
                  }
              }
          }

       }
        System.out.print("m和n两个数的最大公约数为："+a);
    }
}
