package day03; // Arrays.toString(数组)  打印数组
               // Arrays.copOf(要复制的数组，新数组的长度）  不改变源数组
               // Arrays.sort(数组）  没有返回值直接在源数组上修改
               // s.equals(byebye)   判断数组是否相等

import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {
        int [] array = new int [10];
        int [] array1 = {1,2,3,8,9};
        int [] array2 = new int[]{6,9,8,5};
        for(int i = 0;i < 10; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(array.length);

        for(int i = 0; i < 5; i++){
            array1[i] = ++array1[i] ;
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
