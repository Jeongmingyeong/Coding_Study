package silver5;
import java.util.*;

public class BOJ_0201_1316 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        int N = sc.nextInt();
        int count = 0;

        for(int i = 0; i < N; i++){
            if(checker() == true){
             count++;
            }
        }

        System.out.println(count);

    }

    public static boolean checker(){
        boolean[] checker = new boolean[26];
        int prev = 0;
        String input = sc.next();

        for(int i = 0; i < input.length(); i++){
            int now = input.charAt(i);

            if(prev != now){
                if(checker[now - 'a'] == false){
                    checker[now - 'a'] = true;
                    prev = now;
                }
                else if(checker[now - 'a'] == true){
                    return false;
                }
            }
        }
        return true;
    }
}

/*
    그룹문자 체커기 (그룹문자 : 단어 내에 존재하는 모든 문자가 연속해서 나타나는 경우 aabbcc (o) aabbca (x))

    input : 3                     output : 2
            aabb
            aba
            abcc
 */
