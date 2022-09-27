import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("In ra các số nguyên tố nhỏ hơn 100");
        boolean check  ;
        int n=2;
        while (n<100){
            check = true ;
            for (int i=2; i < n ; i ++)
                if ( n % i == 0){
                    check = false;
                    break;
                }

            if (check) {
                System.out.println(n);
            }
            n++;
        }
    }
}
