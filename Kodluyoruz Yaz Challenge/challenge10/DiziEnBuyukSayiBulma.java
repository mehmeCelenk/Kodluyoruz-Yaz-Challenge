public class DiziEnBuyukSayiBulma {
    public static void main(String[] args) {
        int[] arr = {12, 300, 100, 600};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int print : arr) {
            System.out.print(print + ", ");
        }

        System.out.println("\nArry'in en büyük elemanı :" + max);

    }
}
