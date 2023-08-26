import java.util.Scanner;

public class KaresiniHesapla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı giriniz :");
        int number = scan.nextInt();

        double pow = Math.pow(number, 2);

        System.out.println(number + " Sayısının karesi :" + pow);
    }
}
