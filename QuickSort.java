/**
 *
 * @author Swapnil
 */
public class QuickSort {
    
    /**
     * Method to swap two elements in an array
     * @param array
     * @param i
     * @param j 
     */
    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * Main method
     * @param args 
     */
    public static void main(String[] args) {
        int[] arr = new int[]{8, 5, 3, 2, 1, 9, 4, 10, 6, 7};
        printIntArray(arr);
        quickSort(arr, 0, arr.length - 1);
        printIntArray(arr);
    }
    
    /**
     * Print out elements of an array
     * @param arr 
     */
    public static void printIntArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
    }
    
    /**
     * Recursive quicksort
     * @param array
     * @param left
     * @param right 
     */
    public static void quickSort(int[] array, int left, int right){
        int index = partition(array, left, right);
        if(left < index - 1){
            quickSort(array, left, index-1);
        }
        if(index < right){
            quickSort(array, index, right);
        }
    } 
    
    /**
     * Partitioning algorithm
     * @param array
     * @param left
     * @param right
     * @return 
     */
    public static int partition(int[] array, int left, int right){
        // pick a pivot as the middle element
        int pivot = array[(left + right)/2];
        
        while(left<= right){
            // move to the right till we find an element greater than pivot
            while(array[left] < pivot){
                left++;
            }
            // move to the left till we find element less than pivot
            while(array[right]>pivot){
                right--;
            }
            
            // swap elements if left <= right
            if(left <= right){
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
}
