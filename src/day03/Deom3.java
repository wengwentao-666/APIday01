package day03;   //比较字符串 a.equals(s1)

public class Deom3 {
    public static void main(String[] args) {

     method1();
     System.out.println(method2(6,5));
     System.out.println(method3('a',6));
    }
    //自定义一个没有返回值的方法  加return方法结束
    public static void method1(){

        System.out.println("我爱中国");
       // return;                          //本方法该return可加可不加
    }
    //定义一个有返回值为int的方法
    public static int method2(int a,int b){
        return (a+b);
    }

    public static int method3(char a, int b){
        int sum = a + b;
        return (sum);
    }

}
