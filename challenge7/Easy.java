import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir kelime giriniz :");
        String kelime = scan.nextLine();

        System.out.println("Girdiğiniz kelimenin uzunlugu :" + kelime.length());
    }
}
