package challenge5;

import java.util.Scanner;

public class Easy {
    // Easy: Kullanıcıdan aldığın iki sayının toplamını ekrana yazdıran bir kod parçacığı yazar mısın?
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz :");
        double sayi1 = scan.nextInt();

        System.out.print("2. sayıyı giriniz :");
        double sayi2= scan.nextInt();

        double toplam = sayi1 + sayi2;

        System.out.println("Girdiginiz sayıların toplamı :" + toplam);
    }
}
