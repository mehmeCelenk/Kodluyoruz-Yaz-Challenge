import java.util.Scanner;

public class SayiTamBolenleriToplami {
//💪🏻Hard: Kullanıcının girdiği bir sayının tam bölenlerinin toplamını hesaplayan bir kod parçacığı yazınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int number = scan.nextInt();

        int total = 0;

        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                total += i;
            }
        }

        System.out.println(total);
    }
}
