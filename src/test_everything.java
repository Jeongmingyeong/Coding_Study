import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test_everything {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        //int N = br.read(); // 표지판 사이즈
        int size = sc.nextInt();

        String starline = "*".repeat(size);
        System.out.println(starline);

        for(int i = 0 ; i < size - 2; i++){
            for(int j = 0; j < size; j++){
                if(j == 0 || j == size-2){
                    System.out.print("*");
                }
                System.out.print(j == i || j == size-3-i ? "*" : " ");
            }
            if(i != size-2) {
                System.out.println();
            }
        }
        if(size != 1) {
            System.out.println(starline);
        }
    }
}