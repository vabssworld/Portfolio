import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        int lastElement = arr[arr.length - 1];
        
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        arr[0] = lastElement;
        
        System.out.println("Rotated array:  " + Arrays.toString(arr));
    }
}
