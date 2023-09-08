package challenge3;

import java.util.Scanner;

public class Medium {
    //Medium:  Bir mağazada bir kitap 80 TL,
    // bir defter 20 TL ve bir kalem 5 TL. Bir müşteri 2 kitap, 3 defter ve 4 kalem aldı.
    // Müşteri ne kadar ödeme yapmalı?
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kitap = 80;
        int defter = 20;
        int kalem = 5;

        System.out.print("Almak istediğiniz kitap adedini giriniz :");
        int kitapAded = scan.nextInt();

        System.out.print("Almak istediğiniz defter adedini giriniz :");
        int defterAded = scan.nextInt();

        System.out.print("Almak istediğiniz Kalem adedini giriniz :");
        int kalemAded = scan.nextInt();


        int toplamKitap = kitap * kitapAded;
        int toplamDefter = defter * defterAded;
        int toplamKalem = kalem * kalemAded;

        double genelToplam = toplamKitap + toplamDefter + toplamKalem;

        System.out.println("kitap + defter + kalem alışverişinizin tutarı :" + genelToplam + " TL");
    }
}
