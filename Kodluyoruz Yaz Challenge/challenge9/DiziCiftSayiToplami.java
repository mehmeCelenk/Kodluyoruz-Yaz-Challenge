public class DiziCiftSayiToplami {
    //🌟Medium: Bir dizi oluşturup içindeki çift sayıların toplamını hesaplayan bir kod parçacığı yazar mısınız?
    public static void main(String[] args) {
        int[] arry = {1, 2, 4, 3, 6, 8, 7, 10, 10};

        int total = 0;
        for(int gez : arry){
            if(gez % 2 == 0){
                total += gez;
            }
        }

        System.out.println("Arry'deki çift sayıların toplamı :" + total);
    }
}
