package _00_Intro_to_Sorting_Algorithms;

class _02_SwappingDigits {

    // 1. Complete the method so that the first two elements of the array are
    //    swapped.
    public static void swapArrayOfTwo(int[] arr) {
    	int zero = arr[0];
    	int one = arr[1];
    	arr[0] = one;
    	arr[1] = zero;
    }

    // 2. Complete the method so that it sorts the array using a bubble sort.
    //    Iterate through the array and when you find two elements that are out
    //    of order, swap them. Repeat this until the array is in order.
    public static void sortIntArray(int[] arr) {
    	int swap;
    	for(int i = 0; i<arr.length - 1; i++) {
    		for(int k = 0; k < arr.length - 1; k++) {
    			if(arr[k] > arr[k+1]) {
    				swap = arr[k+1];
    				arr[k+1] = arr[k];
    				arr[k] = swap;
    			}
    		}
    	}
    }

    // 3. Complete the method so that it finds the middle number in the array.
    //    *Hint* it helps to sort it first.
    //    *Double Hint* Use the method you already wrote in step 2 to sort it
    public static int findMiddle(int[] arr) {
        int middle = 0;
        sortIntArray(arr);
        middle = arr[(arr.length - 1)/2];
    	return middle;
    }
}
