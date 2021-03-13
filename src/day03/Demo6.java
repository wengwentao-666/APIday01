package day03;

import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) {
        int [] red = new int[5];

        for(int i = 0; i < 5; i++ ){
            int a = (int)(Math.random()*32) + 1;
            red[i] = a;
        }

        Arrays.sort(red);int a = (int)(Math.random()*32) + 1;
        System.out.println(Arrays.toString(red));

        int b = (int)(Math.random()*16) + 1;
        red =  Arrays.copyOf(red , red.length + 1 );
        red[red.length - 1] = b;
        System.out.println(Arrays.toString(red));

    }
}
