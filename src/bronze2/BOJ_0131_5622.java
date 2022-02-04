package bronze2;
import java.util.*;

public class BOJ_0131_5622 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().strip();
        char[] ch = new char[input.length()];
        int[] dial = new int[input.length()]; // char to num

        for(int i = 0; i < input.length(); i++){
            ch[i] = input.charAt(i);
        }

        for(int i = 0; i < input.length(); i++){
            if(ch[i] >= 65 && ch[i] <= 67) {
                dial[i] = 2;
            }
            else if(ch[i] >= 68 && ch[i] <= 70) {
                dial[i] = 3;
            }
            else if(ch[i] >= 71 && ch[i] <= 73) {
                dial[i] = 4;
            }
            else if(ch[i] >= 74 && ch[i] <= 76) {
                dial[i] = 5;
            }
            else if(ch[i] >= 77 && ch[i] <= 79) {
                dial[i] = 6;
            }
            else if(ch[i] >= 80 && ch[i] <= 83) {
                dial[i] = 7;
            }
            else if(ch[i] >= 84 && ch[i] <= 86) {
                dial[i] = 8;
            }
            else if(ch[i] >= 87 && ch[i] <= 90) {
                dial[i] = 9;
            }
            else{
                dial[i] = 0;
            }
        }

        int time = 0;
        for(int a : dial) {
            time = time + a + 1 ;
        }

        System.out.println(time);


    }
}

/*
    문자열 반복

    input : UNUCIC               output : 36

 */
