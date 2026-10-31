public class QueueOrder {

    public static int firstBreak(int[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i] < tokens[i - 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] tokens1 = {3, 5, 5, 8, 6, 9};
        int[] tokens2 = {1, 2, 2, 7};
        int[] tokens3 = {5, 4, 3, 2, 1};

        System.out.println("Sample Input 1 Output: " + firstBreak(tokens1));
        System.out.println("Sample Input 2 Output: " + firstBreak(tokens2));
        System.out.println("Custom Input Output: " + firstBreak(tokens3));
    }
}
```[cite: 4]