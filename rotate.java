import java.util.*;
import java.util.Arrays;

public class rotate {
    public static void rotate(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int k = sc.nextInt();
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        k = k % arr.length;
        
        for (int step = 0; step<k; step++){
        int lastElement = arr[arr.length - 1];
        
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        arr[0] = lastElement;
        }
        
        System.out.println("Rotated array:  " + Arrays.toString(arr));
    }
}
