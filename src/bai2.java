import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" In ra 20 số nguyên tố đầu");
        boolean check ;
        int N = 2;
        int count = 0;
        while (count < 20) {
            check = true;
            for (int i = 2; i < N; i++)
                if (N % i == 0) {
                    check = false;
                    break;
                }
            if (check) {
                System.out.printf("%d ",N);
                count++;
            }
            N++;
        }

    }
}