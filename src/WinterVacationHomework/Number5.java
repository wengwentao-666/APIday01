package WinterVacationHomework;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        /*题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。*/
        System.out.println("请输入成绩：");
        Scanner Number = new Scanner(System.in);
        int Score = Number.nextInt();
      if((Score >= 90)&&(Score <= 100)){
          System.out.println("该学生的成绩为A");
      }else if((Score >= 60)&&(Score <= 89)){
          System.out.println("该学生的成绩为B");
      }else{
          System.out.println("该学生的成绩为C");
      }
    }
}
