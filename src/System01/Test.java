package System01;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println(" 欢迎来到酒店管理系统！");
        Hotel hotel1 = new Hotel();
        int[][] d =  hotel1.fangjian();
      //  int[][] e = hotel1.Zhu();

        while (true) {
            Scanner Panduan = new Scanner(System.in);
            String Panduan1 = Panduan.next();
            if(Panduan1.equals("show")){

            }




            /*System.out.println("");
                 Scanner room1 = new Scanner(System.in);    // 输入房间号
                 int number = room1.nextInt();
                 Scanner rengming = new Scanner(System.in);  // 输入人的名字
                 String rengming1 = rengming.nextLine();
                 System.out.println(number);
                 System.out.println(rengming1);*/


        }
    }

}
