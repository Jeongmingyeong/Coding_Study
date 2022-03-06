package bronze4;
import java.util.*;

public class BOJ_0227_2480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] count = new int[7];
        String[] input = sc.nextLine().split(" ");
        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[1]);
        int third = Integer.parseInt(input[2]);
        int max = 0;
        int index = 0;
        count[first]++; count[second]++; count[third]++;

        for(int i = 0; i < 7; i++){
            if(max < count[i]){
                max = count[i];
                index = i;
            }
        }

        if(max == 3){
            System.out.println(10000 + index * 1000);
        }
        else if(max == 2){
            System.out.println(1000 + index * 100);
        }
        else{
            Arrays.sort(input);
            System.out.println(Integer.parseInt(input[2]) * 100);
        }
        sc.close();
    }
}

/*
    주사위 세개를 던져 규칙에 맞는 상금얻기.
    rule 1 : 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
    rule 2 : 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
    rule 3 : 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

    input : 3 3 6                output : 1300

 */
