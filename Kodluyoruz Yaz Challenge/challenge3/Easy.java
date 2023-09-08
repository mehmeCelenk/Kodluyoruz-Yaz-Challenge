package challenge3;

import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int point3 = 3;
        int point2 = 2;

        System.out.print("3 puanlık atıştan ne kadar isabet etirdiniz giriniz :");
        int isabet1 = scan.nextInt();

        System.out.print("2 puanlık atıştan ne kadar isabet etirdiniz giriniz :");
        int isabet2 = scan.nextInt();

        int toplam1 = point3 * isabet1;

        int toplam2 = point2 * isabet2;

        int genelToplam = toplam1 + toplam2;

        System.out.println("Toplam elde ettiğiniz puan :" + genelToplam);
    }
}
