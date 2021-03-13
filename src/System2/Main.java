package System2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" 欢迎来到酒店管理系统！");
        System.out.println("请输入指令: 查询(show) 入住(in) 退房(Out) 退出系统(exit)");
        Hotel hotel = new Hotel();
     loop:while (true){
            Scanner Order = new Scanner(System.in);
            String order1 = Order.next();
            switch (order1){
                case "show":
                   hotel.Show();
                    break;
                case "in":

                    System.out.println("房号:");
                    Scanner number = new Scanner(System.in);
                    int number1 = number.nextInt();
                    System.out.println("姓名:");
                    Scanner Name = new Scanner(System.in);
                    String name1 = Name.next();
                    hotel.In(number1,name1);
                    break;

                case"out":
                    System.out.println("房号:");
                    Scanner numberout = new Scanner(System.in);
                    int numberout1 = numberout.nextInt();
                    hotel.Out(numberout1);
                    break;

                case"exit":
                    break loop;
            }
        }


    }
}
