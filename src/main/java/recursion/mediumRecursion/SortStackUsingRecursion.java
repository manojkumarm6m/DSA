package recursion.mediumRecursion;

import java.util.Stack;

public class SortStackUsingRecursion {
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        // Step 2: Sort remaining stack
        sortStack(stack);
        // Step 3: Insert element in sorted order
        insertSorted(stack, top);
    }
    private static void insertSorted(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }
        // Remove top and recurse
        int top = stack.pop();
        insertSorted(stack, value);
        // Put the element back
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
