import java.util.Arrays
public class Main {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40, 53, 122, 344, 566, 7788 };
        System.out.println(binarySearch(arr, 7788));
        System.out.println(binarySearch(arr, 7788) == arr.length-1);
    }

    public static int binarySearch(int arr[], int target) {
        Arrays.sort(arr);
        int start = 0, mid = 0, end = arr.length-1;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) start = mid + 1;
            else end = mid -1;
        }
        return -1;
    }
}