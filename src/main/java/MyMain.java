import java.util.Arrays;
public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        // REPLACE WITH YOUR CODE HERE
        int[] x = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            x[i] = arr[arr.length - i - 1];
        }
        // OK SO apparently if you declare int[] x = arr it will just assign arr to x. So I spent a lot of time
        //trying to figure out why it was affecting arr when I was only changing x, but there we go.
       
        return x;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int largest = arr[0];
        int second = arr[0];        
        for (int x: arr){
            if (x > largest){
                largest = x;
            }
        }
        for (int x: arr){
            if (x < second){
                second = x;
            }
        }
        for (int x: arr){
            if ((x > second) && (x < largest)){
                second = x;
            }
        }
        return second;
    }
    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double r = (double) arr[1] / arr[0];
        for (int i = 1; i < arr.length; i++){
            if ((double) arr[i] / arr[i - 1] != r){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(x)));
        int[] y = {1, 2, 4, 8, 16, 32};
        System.out.println(isGeometric(y));
        int[] z = {12, 1, 3, 7, 8};
        System.out.println(secondLargest(z));
    }
}