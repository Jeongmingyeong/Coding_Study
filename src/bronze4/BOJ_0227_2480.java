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
