package bronze3;
import java.util.*;

public class BOJ_3009_0306 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            String[] input = sc.nextLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if(x.contains(a)){
                x.remove(Integer.valueOf(a));
            }
            else x.add(a);

            if(y.contains(b)){
                y.remove(Integer.valueOf(b));
            }
            else y.add(b);
        }

        System.out.println(x.get(0) + " " + y.get(0));

        sc.close();
    }
}

/*
    직사각형의 네번째 점 찾기.

    input : 3 3                   output : 6 6
            3 6
            6 3
 */
