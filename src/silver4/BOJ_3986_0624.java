package silver4;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_3986_0624 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 단어의 개수
        sc.nextLine();
        String input = ""; // 입력받는 단어
        int count = 0;

        for(int i = 0; i < N; i++) {
            input = sc.nextLine();
            String[] arr = input.split("");
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < arr.length; j++) {
                if(stack.empty()){
                    stack.push(arr[j]);
                }
                else {
                    if (stack.peek().equals(arr[j])) {
                        stack.pop();
                        if(stack.empty()) {
                            count++;
                        }
                    } else {
                        stack.push(arr[j]);
                    }
                }
            }
        }
        System.out.println(count);
    }
}
