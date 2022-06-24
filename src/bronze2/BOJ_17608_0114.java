package bronze2;
import java.util.*;

public class BOJ_17608_0114 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt(); // 입력받을 줄의 수
        int[] num = new int[line];
        int count = 1;

        for(int i = 0 ; i < line; i++){
            num[i] = sc.nextInt();
        }
        int max = num[line-1]; // 마지막 입력값

        for(int i = line-2; i >= 0; i--){
            if(max < num[i]){
                count++;
                max = num[i];

            }
        }

        System.out.println(count);

        sc.close();
    }
}

/*
    보이는 막대기의 수 출력

    input : 5               output : 2
            6
            8
            7
            9
            2
 */