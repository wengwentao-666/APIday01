package day06;  //静态成员变量  static int money = 1000；  静态类属于类，普通成员方法属于对象

                //静态代码块   进入程序之前加载好，属于类，各类的静态成员初始化，
                //代码块      属于对象，创建多少次对象代码块执行多少次在构造方法使用前执行，给成员变量初始化，
public class Demo1 {

     public static void main(String[] args) {
       sleep();
     }
     static void sleep(){
        System.out.println(" 我很快乐！");
     }

}
