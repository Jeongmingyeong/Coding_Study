package bronze2;

import java.util.*;

public class BOJ_2675_0131 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt(); // 입력받을 줄의 수
        sc.nextLine();

        for(int i = 0; i < line; i++){
            String[] input = sc.nextLine().split(" ");
            int num = Integer.parseInt(input[0]);
            String str = input[1];
            for(int j = 0; j < str.length(); j++){
                for(int k = 0; k < num; k++){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}

/*
    문자열 반복

    input : 2               output :
            3 ABC                    AABBCC
            5 /HTTP                  /////HHHHHTTTTTTTTTTPPPPP

 */