package bronze1;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_12605_0624_Stack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int caseSize = sc.nextInt();
        sc.nextLine();
        Stack<String> stack = new Stack<>();
        String input = "";

        for(int i = 0; i < caseSize; i++){
            input = sc.nextLine();
            String arr[] = input.split(" ");

            for(int j = 0; j < arr.length; j++){
                stack.push(arr[j]);
            }

            System.out.print("Case #" + (i+1) + ": ");
            while(!stack.empty()){
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }
    }
}
