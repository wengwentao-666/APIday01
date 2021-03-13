package day04;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
       int [] arr1 = {6,6,9,5,8,2};
       arr1 = Maopao(arr1);
        System.out.println(Arrays.toString(arr1));

    }

    public static int[] Maopao(int[] arr){
        for (int i = 0; i < arr.length - 1; i++ ){
            for (int j = 0; j < arr.length - i -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

}
