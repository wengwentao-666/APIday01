package day04;

public class Cricle {
    int r;
    public static void main(String[] args) {
      Cricle C1 = new Cricle(6);
      double Area1 = Area(C1.r);
      double Length = Length(C1.r);
      System.out.println("面积 = " + Area1);
      System.out.println("周长 = " +Length);

      Cricle[] a = new Cricle[10];     // 创建十个圆的数组对象
      for(int i = 1; i < 10; i++){
         a[i] = new Cricle((int)(Math.random()*15 + 5));
         System.out.println(Area(a[i].r));
      }

    }
    public  Cricle(int r1 ){
        this.r = r1;
    }
    public static double Area(double r){
        double S = 3.14 * (Math.pow(r,2));
        return S;
    }
    public static double Length(double r){
        double L = 3.14 * 2 * r;
        return L;
    }
}
