package linearSearch;

public class BinarySearchForArrays {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 23;

        // Call binarySearch method
        int index = binarySearch(arr, target, 0, arr.length - 1);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return binarySearch(arr, target, start, mid - 1);
            } else {
                return binarySearch(arr, target, mid + 1, end);
            }
        }

        return -1;
    }
}
