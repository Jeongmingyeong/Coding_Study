package bronze2;

import java.util.*;

public class BOJ_0131_1152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().strip().split(" ");
        if(input.length == 1){
            if(input[0].equals("")) {
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        }
        else {
            System.out.println(input.length);
        }

        sc.close();

    }
}

/*
    단어 개수 출력

    input : The Curious Case of Benjamin Button
    output : 6

 */
