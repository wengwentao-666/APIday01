package MySelf;

import java.util.LinkedList;

public  class MyStack implements Stack {
    LinkedList<Hero> heros = new LinkedList<>();

    @Override
    public void push(Hero h) {
        heros.addLast(h);
    }

    @Override
    public Hero pull() {
        return heros.removeLast();
    }

    @Override
    public Hero peek() {
        return heros.getLast();
    }

    public static void main(String[] args) {
        MyStack herosStack = new MyStack();
        for(int i = 0; i < 5; i++){
            Hero h = new Hero("hero name"+i);
            System.out.println("压入 hero："+h);
            herosStack.push(h);
        }
        for(int i = 0; i < 5; i++){
            Hero h = herosStack.pull();
            System.out.println("弹出hero"+h);
        }
    }
}

