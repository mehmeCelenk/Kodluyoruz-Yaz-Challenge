package challenge5;

import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        double number = scan.nextInt();

       if(Math.sqrt(number) % 2 == 0){
           double newNumber = Math.sqrt(number);
           System.out.println(newNumber);
       }else {
           System.out.println("Sayı karekökten çıkamaz");
       }
    }
}
