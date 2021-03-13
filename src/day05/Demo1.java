package day05; // 引用类型数组int[][]  其中int[]为引用数组

import javafx.scene.shape.Path;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        System.out.println("HelloWord!");
        int [][] a = {new int[2], new int[6], {1,5,2,3}, new int[9], new int[6]};
        int [][] b = {new int[3], new int[3], new int[3], {3,8,4}};
        int [][] c = {{10,10,10,10}, {10,10,10,10}, {10,10,10,10}};

        int[][] d = new int[5][];
        d[1] = new int[6];

     read_data:   for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                System.out.print(c[i][j] + " ");
                break read_data;
            }
        }
        int foueth = (6 & (1 << 3)) >> 3;
        System.out.println("位运算符："+foueth);
        //String message = String.format("Hello, %s.Next year,you'll be %d",name,age);
      //  Scanner in = new Scanner(Path.of("E:\\新建文本文档.txt"), StandardCharsets.UTF_8);
    }
}
