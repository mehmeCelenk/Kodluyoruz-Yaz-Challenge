public class DiziEnBuyukEnKucuk {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int max = arr[0];
        int min = arr[1];

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        for(int arry : arr){
            System.out.println(arry);
        }

        System.out.println("Arry'deki en büyük sayı :" + max + " " + " Arry'deki en küçük sayı :" + min);

    }
}
