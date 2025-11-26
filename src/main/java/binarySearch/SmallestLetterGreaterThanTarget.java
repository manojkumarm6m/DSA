package binarySearch;

public class SmallestLetterGreaterThanTarget {

    private static char nextGreatestLetter(char[] chars, char c) {
        int left = 0, right = chars.length-1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (chars[mid] <= c) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return chars[left % chars.length];
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};

        System.out.println(nextGreatestLetter(letters, 'a')); // c
        System.out.println(nextGreatestLetter(letters, 'c')); // f
        System.out.println(nextGreatestLetter(letters, 'j')); // c (wrap)
    }
}
