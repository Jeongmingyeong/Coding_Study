package bronze1;
import java.util.*;
import java.io.*;

public class BOJ_2869_0204 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int up = Integer.parseInt(input[0]); // 낮에 올라가는 거리
        int down = Integer.parseInt(input[1]); // 밤에 미끄러지는 거리
        int top = Integer.parseInt(input[2]); // 꼭대기까지의 거리
        int day = (top - down) / (up - down); // 며칠이 걸리는지

        if((top - down) % (up - down) != 0) {
            day++;
        }

        System.out.println(day);
    }
}

/*
    달팽이는 올라가고싶다. (올라가는데 며칠이 걸리는지)

    input : 5 1 6                   output : 2

 */
