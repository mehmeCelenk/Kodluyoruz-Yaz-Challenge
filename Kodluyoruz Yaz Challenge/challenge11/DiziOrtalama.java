import java.util.Scanner;

public class DiziOrtalama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("kaç elamanlı dizi istiyorsanız tam sayı olarak giriniz :");
        int arrySize = scan.nextInt();

        int[] arry = new int[arrySize];

        for(int i = 0; i < arry.length; i++){
            System.out.print(i + ". elemanı girniz (index 0'dan başlamaktadır!)");
            arry[i] = scan.nextInt();
        }

        for (int ar : arry){
            System.out.print(ar + ", ");
        }

        int total = 0;

        for(int ar1 : arry){
            total += ar1 ;
        }

        int arg = total / arrySize;

        System.out.println("Arry'in ortalaması :" + arg);
    }
}
