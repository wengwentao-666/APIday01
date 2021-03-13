package InBook;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Day210202 {
    public static void main(String[] args) {
        Employee people01 = new Employee(23,"王五");
        Employee people02 = new Employee(10,"赵四");
        Object people03 = new Employee(2,"lk");
        Employee people04 = new Employee(23,"王五");
        Employee people05 = people01;
        /*System.out.println(people01 == people04);
        System.out.println(people01 == people05);
        System.out.println(people01.equals(people04));
        System.out.println(people01.equals(people05));
        System.out.println(people01);
        System.out.println(people01.toString());
        System.out.println("people01.hashCode():"+people01.hashCode());*/

        ArrayList<Employee> Array = new ArrayList<>(100);
        Array.add(new Employee(2,"甲"));
        Array.add(2,people01);
        

        System.out.println("当前数组长度为：" + Array.size());
        /*System.out.println(people01.Getname()+" "+people01.Getage());
        System.out.println();
        people02.RaiseAge();
        System.out.println(people02.Getname()+" "+people02.Getage());*/
       // System.out.println(people03.);
    }
}
class Employee{
  //实例字段
  private int age;
  private String name;
  //有参构造方法
    public Employee(int a,String n){
        this.age = a;
        this.name = n;
    }

    public String Getname(){
        return this.name;
    }

    public int Getage(){
        return this.age;
    }
    public void RaiseAge(){
        this.age+=6;
    }
}