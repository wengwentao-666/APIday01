package day06;

public class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    public Bird(){

    }
    public static void main(String[] args) {
        Bird YellowBird = new Bird();
        Bird YellowBird01 = new Bird("黄");
    }
}
