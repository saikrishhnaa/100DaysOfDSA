// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class LinearSearch {
    
    public static int linearSearch(int arr[], int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i + 1;
            }
        }
        return -1;
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
        
        System.out.print("Enter element you want to search: ");
        int key = sc.nextInt();

        System.out.println();
        if(linearSearch(arr, key) != -1)
            System.out.print("The element " + key + " is at position " + linearSearch(arr, key) + ".");
        else 
            System.out.print("The element " + key + " is not present in the array.");
    }
}