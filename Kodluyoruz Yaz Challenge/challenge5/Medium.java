package challenge5;

import java.util.Scanner;

public class Medium {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz :");
        String metin = scan.nextLine();

        String[] kelimeler = metin.split("\\s+");
        int kelimeSayisi = kelimeler.length;

        System.out.println("Metindeki kelime sayısı: " + kelimeSayisi);

    }
}
