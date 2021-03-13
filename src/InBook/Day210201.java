package InBook;

import java.time.LocalDate;

public class Day210201 {
    public static void main(String[] args) {
        int[] a = {2,52,62,54,23};
        for(int each : a)  System.out.print(each+" ");
        human ren01 = new human();
        ren01.eat();
        LocalDate data = LocalDate.now();
        LocalDate hireday = LocalDate.of(2012, 12, 20);
        System.out.println();
        System.out.println(hireday.getYear());
    }

}
class human{
     public void eat(){
    System.out.println("用筷子吃！");
     }

}





























