import java.util.Scanner;

class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        
        bubbleSort(arr);
        
        System.out.print("Array elements: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}