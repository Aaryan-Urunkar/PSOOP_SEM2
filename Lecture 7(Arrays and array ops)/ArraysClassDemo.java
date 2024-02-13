import java.util.Arrays;

class ArraysClassDemo{


    
    public static void main(String[] args) {
        int arr[] = {10,20,15,22,35};
        Arrays.sort(arr);
        int key = 22;
        System.out.println(key + " is present at index " + Arrays.binarySearch(arr, key));
    }
}