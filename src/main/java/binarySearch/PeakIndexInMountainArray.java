package binarySearch;

public class PeakIndexInMountainArray {


    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid ;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};  // example input
        int result = peakIndexInMountainArray(arr);
        System.out.println("Peak Index: " + result);
        System.out.println("Peak Value: " + arr[result]);
    }
}
