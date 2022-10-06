import java.util.Scanner;

class SelectionSort{
    public static void selectionSort(int[] arr) {
        int min;
        for(int i = 0; i < arr.length - 1; i++)
        {
            min = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[min] > arr[j])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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
        
        selectionSort(arr);
        
        System.out.print("Array elements: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}