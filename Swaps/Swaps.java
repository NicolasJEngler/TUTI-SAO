public class MinSwaps {

    public static void main(String[] args) {
        int A = 5;
        int B = 2;
        int C = 8;

        int[] arr = { A, B, C };

        int swaps = minSwaps(arr);

        System.out.println(swaps);
    }

    public static int minSwaps(int[] arr) {
        int swaps = 0;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    swaps++;

                    swapped = true;
                }
            }
        } while (swapped); 

        return swaps;
    }
}