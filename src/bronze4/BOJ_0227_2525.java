package bronze4;
import java.util.*;

public class BOJ_0227_2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();
        int Hour = 0; // 종료되는 시간의 시
        int minute = min + time; // 종료되는 시간의 분
        int count = 0; // 입력받는 time이 몇시간 소요되는지 count

        if(minute >= 60){
            while(minute >= 60) {
                minute -= 60;
                count++;
            }
            Hour = hour + count;
            if(Hour >= 24){
                System.out.println((Hour - 24) + " " + minute);
            }
            else{
                System.out.println(Hour + " " + minute);
            }
        }
        else {
            System.out.println(hour + " " + minute);
        }

        sc.close();
    }
}

/*
    오븐시계 ( 종료되는 시간 출력 )

    input : 17 40                          output : 19 0
            80

 */
