import java.util.Scanner;

class InsertionSort {
    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrLen = sc.nextInt();
        int arr[] = new int[arrLen];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < arrLen; i++) {
            arr[i] = sc.nextInt();
        }
        
        insertionSort(arr);
        
        System.out.print("Array elements: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}