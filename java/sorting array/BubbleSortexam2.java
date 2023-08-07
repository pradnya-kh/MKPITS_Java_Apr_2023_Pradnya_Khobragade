public class BubbleSortexam2 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int[] inputArray = {2, 5, 6, 7, 4};
        bubbleSort(inputArray);

        
        System.out.print("Sorted Array: ");
        for (int num : inputArray) {
            System.out.print(num + " ");
        }
    }
}
