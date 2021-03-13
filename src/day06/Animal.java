package day06;

public class Animal {
    String name;
    public Animal(){

    }
    public Animal(String name){
        this.name = name;
    }

    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类代码块");
    }
}

