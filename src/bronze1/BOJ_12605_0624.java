package bronze1;

import java.util.Scanner;

public class BOJ_12605_0624 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int caseSize = sc.nextInt(); // case 개수
        sc.nextLine();
        String input = "";

        for(int i = 0; i < caseSize; i++){
            input = sc.nextLine();
            String[] arr = input.split(" ");
            System.out.print("Case #" + (i+1) + ": ");
            int size = arr.length;
            for(int j = size-1; j >= 0; j--){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
