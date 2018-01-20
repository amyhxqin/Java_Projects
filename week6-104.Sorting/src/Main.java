
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }
    
    public static int smallest(int[] array) {
        // write the code here
        int smallestValue = array[0];
        
        for(int i = 1; i < array.length; i ++){
            if (array[i] < smallestValue) {
                smallestValue = array[i];
            }
        }
        
        return smallestValue;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        int j = 0;
        
        int smallestValue = array[0];
        
        for(int i = 1; i < array.length; i ++){
            if (array[i] < smallestValue) {
                smallestValue = array[i];
                j = i;
            }
        }
        
        return j;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        
        int j = index;
        
        int smallestValue = array[index];
        
        for(int i = index + 1; i < array.length; i ++){
            if (array[i] < smallestValue) {
                smallestValue = array[i];
                j = i;
            }
        }
        
        return j;
        
        //return smallestValue;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // code goes here

        int i = array[index1];
        int j = array[index2];

        array[index1] = j;
        array[index2] = i;
    }
    
    public static void sort(int[] array) {

            for(int k = 0; k < array.length; k ++){
                swap(array, k, indexOfTheSmallestStartingFrom(array, k));
                System.out.println(Arrays.toString(array));
            }

    }

}
