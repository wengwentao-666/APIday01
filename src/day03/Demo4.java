package day03;

public class Demo4 {
    public static void main(String[] args) {

       int e = print(4,7);
       System.out.println(e);
        print("jlop");
        print('i');
    }

    public static int print(int x,int y) {
        return (x + y);
    }
    public static void print(String h){
        System.out.println(h);
    }
    public static void print(char x){
        System.out.println(x);
    }
}