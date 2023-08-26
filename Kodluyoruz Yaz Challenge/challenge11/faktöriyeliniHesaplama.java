import java.util.Scanner;

public class faktöriyeliniHesaplama {
    //Easy: Kullanıcıdan aldığınız bir sayının faktöriyelini hesaplayan kod parçacığını yazmanızı istiyorum.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int number = scan.nextInt();
        System.out.println(number);
        int result = 0;

        result = number;

        for(int i = 1; i < number; i++){
            result *= i;
        }

        System.out.println(number + " sayısının faktöriyeli :" + result);

    }
}