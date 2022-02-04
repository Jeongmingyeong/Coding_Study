package bronze3;

import java.util.Scanner;

public class BOJ_0125_2439 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            System.out.print(" ".repeat(N-1-i));
            System.out.print("*".repeat(i+1));
            System.out.println();
        }
    }
}

/*
    별찍기-2

    input : 5               output :     *
                                        **
                                       ***
                                      ****
                                     *****

 */
