import java.sql.SQLOutput;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        do {
            System.out.println("***********MENU***************");
            System.out.println("1.In hình chữ nhật ");
            System.out.println("2.In hình tam giác vuông");
            System.out.println("3.In hình tam giác cân ");
            System.out.println("4.Thoát ");
            System.out.println("Lựa chọn của bạn là :");
            int hinhve = Integer.parseInt(sr.nextLine());
            switch (hinhve){
                case 1 :
                    for (int i = 0; i < 3 ; i++) {
                        for (int j= 0 ;j<6 ; j++){
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2 :
                    for (int i = 1; i <= 5; i++) {
                        for (int j =1 ; j<i ; j++){
                            System.out.printf("*");
                        }
                        System.out.println();
                    }break;
                case 3 :
                    for (int i = 7; i >= 1; i--) {
                        for (int j=1 ; j <= i; j++){
                            System.out.printf("*");
                        }
                        System.out.println();
                    }break;
                case 4 :
                    System.exit(0);
                default:
                    System.err.println("vui lòng nhập từ 1-4");
            }
        }while(true);
    }
}
