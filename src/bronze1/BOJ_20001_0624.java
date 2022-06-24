package bronze1;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_20001_0624 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = "";
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < 102; i++){
            input = sc.nextLine();
            if(input.equals("고무오리 디버깅 끝")){
                break;
            }
            else if(input.equals("고무오리 디버깅 시작")){
                continue;
            }
            else if(input.equals("문제")){
                stack.push(input);
            }
            else{ // "고무오리" 입력받았을 때
                if(stack.empty()){
                    stack.push("문제");
                    stack.push("문제");
                }
                else{
                    stack.pop();
                }
            }
        }
        String result = stack.size() == 0 ? "고무오리야 사랑해" : "힝구";
        System.out.println(result);
    }
}
