package WinterVacationHomework;

public class PrimeNumber {
    public static void main(String[] args) {
       /* 题目：判断101-200之间有多少个素数，并输出所有素数。
        程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。  */
        int a ;
        int b = 0;
        int c = 0;
        for(int i = 101; i <= 200; i++){
            for(int j = 1; j <= i; j++){
               a = i % j;
               if(a == 0){
                   b++;
               }
            }
            if(b < 3){
                System.out.print(i + " ");
                c++;
            }
            b = 0;
        }
        System.out.println();
        System.out.println("101到200以内的素数个数为：" + c);
    }
}
