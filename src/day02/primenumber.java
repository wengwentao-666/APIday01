package day02;

public class primenumber {
    public static void main(String[] args) {
      int d = 0;
      int e = 0;
      for (int i = 101; i <=200; i++){

           for(int r = 1; r <= i; r++){
               int c = i % r;
               if(c == 0){
                  d ++;
               }
           }
          if(d <=2){
              e++;
              System.out.print(i + " ");
          }
          d = 0;
      }
      System.out.println();
      System.out.println("素数的数量" + e);
    }
}
