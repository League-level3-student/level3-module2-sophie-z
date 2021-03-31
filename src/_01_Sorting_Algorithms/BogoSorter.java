package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
        while(!isSorted(array)) {
        	for(int i = 0; i<array.length-1; i++) {
        		if(array[i] > array[i+1]) {
        			Random rand = new Random();
        			int random = rand.nextInt(array.length-1);
        			Random rand2 = new Random();
        			int random2 = rand2.nextInt(array.length-1);
        			int element = array[random];
        			array[random] = array[random2];
        			array[random2] = element;
        		}	
        		display.updateDisplay();	
        	}
        }
    }

    private static boolean isSorted(int[] array) {
    	for (int i = 0; i < array.length; i++) {
    		if (array[i] > array[i - 1]) {
    		} 
    		else {
    			return false;
    		}
    	}
    	return true;
    }
}