package challenge15;

import java.util.Scanner;

public class Easy {
   // Easy: Kullanıcının doğum tarihini alarak kaç yaşında olduğunu bulan bir algoritma yazmanızı istiyorum.
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

      // kullanıcıdan veri alıyoruz
       System.out.print("Lütfen doğum tarihinizi giriniz :");
       int birthyear = scan.nextInt();

      // şuanki yılı tanımlıyoruz
       int currentYear = 2023;

      // yaşı hesaplamak için şuanki yıldan doğum yılımızı çıkartıyoruz
       int age = currentYear - birthyear;

      // ve ekrana yazdırıyoruz
       System.out.println("Yaşınız :" + age);

   }

}
