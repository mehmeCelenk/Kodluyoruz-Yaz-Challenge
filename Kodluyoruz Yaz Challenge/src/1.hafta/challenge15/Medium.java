package challenge15;

import java.util.Scanner;

public class Medium {
    //Medium: Kullanıcıdan bir metin almanızı istiyorum.
    // Bu metnin içindeki en çok tekrar eden harfi bulmalı ve kaç kere tekrar ettiğini göstermeli.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir metin giriniz :");
        String metin = scan.nextLine();


        // Harf sayılarını tutmak için bir dizi oluşturuyoruz
        int[] harfSayilari = new int[29]; // Türk alfabesindeki harf sayısı


        // Metin üzerinde dolaşıp harf sayılarını hesaplıyoruz
        for(char harf: metin.toCharArray()){
            if(Character.isLetter(harf)){ // Sadece harfleri sayıyoruz
                harf = Character.toLowerCase(harf); // Harfi küçük harfe çeviriyoruz
                int index = harf - 'a'; // Harfin dizideki indeksini buluyoruz
                harfSayilari[index]++; // Harfin sayısını bir artırıyoruz
            }
        }

        // En çok tekrar eden harfi buluyoruz
        char enCokTekrarEdenHarf = 'a'; // Varsayılan olarak 'a' harfini seçiyoruz
        int enCokTekrarSayisi = 0; // Varsayılan olarak 0 sayısını seçiyoruz

        for(int i =0; i < harfSayilari.length; i++){
            if(harfSayilari[i] > enCokTekrarSayisi){
                enCokTekrarSayisi = harfSayilari[i];
                enCokTekrarEdenHarf = (char) (i + 'a'); // Indeksi harfe dönüştürüyoruz
            }
            }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("En çok tekrar eden harf :" + enCokTekrarEdenHarf);
        System.out.println("Tekrar Sayısı :" + enCokTekrarSayisi);

    }

}
