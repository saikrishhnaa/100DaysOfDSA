import java.util.Scanner;

class BinarySearch {
    
    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while(low <= high) {
            mid = (low + high) / 2;
            if(arr[mid] == key)
                return mid + 1;
            if(arr[mid] > key)
                high = mid - 1;
            else 
                low = mid + 1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrLen = sc.nextInt();
        int arr[] = new int[arrLen];

	//To use binary search, the array on which the binary search is applying must be sorted
        System.out.print("Enter array elements: ");
        for(int i = 0; i < arrLen; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter element you want to search: ");
        int key = sc.nextInt();

        System.out.println();

	int elementPosition = binarySearch(arr, key);
        if(elementPosition != -1)
            System.out.print("The element " + key + " is at position " + elementPosition + ".");
        else 
            System.out.print("The element " + key + " is not present in the array.");
    }
}