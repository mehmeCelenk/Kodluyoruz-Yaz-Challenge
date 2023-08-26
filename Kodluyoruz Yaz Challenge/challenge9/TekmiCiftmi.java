import java.util.Scanner;

public class TekmiCiftmi {
    // Easy: Kullanıcıdan aldığınız sayının tek mi çift mi olduğunu ekrana yazdıran bir kod parçacığı yazar mısın?
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int number = scan.nextInt();
        
        if(number % 2 == 0){
            System.out.print(number + " Sayısı çifttir !");
        } else if (number % 2 == 1) {
            System.out.print(number + " Sayısı tekdir !");
        }else{
            System.out.println("Lütfen sayı girin !");
        }
    }
}
