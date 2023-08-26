import java.util.Scanner;

public class SesliHarfBulma {
    //💪🏻Hard: Kullanıcıdan aldığınız bir metnin içindeki sesli harfleri sayan ve bunu kullanıcıya geri dönen bir kod parçacığı yazar mısın?
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir metin giriniz :");
        String metin = scan.nextLine();

        String newMetin =  metin.toUpperCase();

        char[] karekter = {'A', 'E', 'I', 'İ', 'O', 'U', 'Ü', 'Ö'};

        int total = 0;

        for(int i = 0; i < newMetin.length(); i++){
            for(char karekter1 : karekter){
                if(newMetin.charAt(i) == karekter1){
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}
