package bronze3;
import java.util.*;

public class BOJ_2440_0326 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = N; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
    별찍기 - 3
    input : 5                   output : *****
                                         ****
                                         ***
                                         **
                                         *

 */

