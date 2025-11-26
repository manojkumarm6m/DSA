package sorting;

import java.util.PriorityQueue;

public class KthLargestElement {


    private static int findKthLargest(int[] nums, int target) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);

            if (minHeap.size() > target) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }


    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}
