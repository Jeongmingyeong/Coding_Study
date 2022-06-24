package silver5;
import java.util.*;

public class BOJ_2941_0201 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().replace("c=", "+").replace("c-", "+")
                .replace("dz=", "+").replace("d-", "+").replace("lj", "+")
                .replace("nj", "+").replace("s=", "+").replace("z=", "+");

        System.out.println(input.length());

        sc.close();

    }
}

/*
    크로아티아 알파벳 세기

    input : ljes=njak           output : 6

 */
