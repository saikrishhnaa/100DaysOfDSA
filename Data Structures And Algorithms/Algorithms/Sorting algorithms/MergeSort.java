class MergeSort {
    public static void mergeSort(int arr[], int start, int end)
    {
        if(start < end) {
            int mid = 0;
            mid = start + ((end - start) / 2);
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            
            int larr[] = new int[mid - start + 1];
            int rarr[] = new int[end - mid];
            
            int itr1 = 0;
            for(int i = start; i <= mid; i++) {
                larr[itr1] = arr[i];
                itr1++;
            }
            
            int itr2 = 0;
            for(int i = mid + 1; i <= end; i++) {
                rarr[itr2] = arr[i];
                itr2++;
            }
            
            int lptr = 0;
            int rptr = 0;
            while(lptr < larr.length && rptr < rarr.length) {
                if(larr[lptr] <= rarr[rptr]) {
                    arr[start] = larr[lptr];
                    lptr++;
                } else {
                    arr[start] = rarr[rptr];
                    rptr++;
                }
                start++;
            }
            
            while(lptr < larr.length) {
                arr[start] = larr[lptr];
                lptr++;
                start++;
            }
            
            while(rptr < rarr.length) {
                arr[start] = rarr[rptr];
                rptr++;
                start++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {8, 10, 4, 6, 3, 7, 1};
        mergeSort(arr, 0, arr.length - 1);
        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}