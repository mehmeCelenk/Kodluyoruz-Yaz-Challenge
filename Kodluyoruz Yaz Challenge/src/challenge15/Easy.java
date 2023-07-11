package challenge15;

import java.util.Scanner;

public class Easy {
   // Easy: Kullanıcının doğum tarihini alarak kaç yaşında olduğunu bulan bir algoritma yazmanızı istiyorum.
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.print("Lütfen doğum tarihinizi giriniz :");
       int birthyear = scan.nextInt();

       int currentYear = 2023;

       int age = currentYear - birthyear;

       System.out.println("Yaşınız :" + age);

   }

}
