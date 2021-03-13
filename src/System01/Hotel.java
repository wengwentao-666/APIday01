package System01;

public class Hotel{

    public static int[][] fangjian(){   // 创建一个5 * 8 的数组，意义为5层，每层有8个房间

        int[][] d = new int[5][];
        for (int i = 0; i < d.length; i++){
            d[i] = new int[8];
        }
        for (int i = 1; i <= d.length; i++){
            for (int j = 1; j <= 8; j++){
               d[i-1][j-1] = 1000 * i + j;
            }
        }
         return d;
    }

    public static int[][] Zhu(int fanghao,String name){
       int Ceng = fanghao / 1000 ;
       int Hao  = fanghao % 1000 ;
       int[][] Stand = {{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0}};
       if(name != null) {
           Stand[Ceng][Hao] = 1;
       }
       return Stand;
    }


}














