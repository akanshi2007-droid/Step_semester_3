import java.util.Arrays;

public class SortingAssignment {

    /**
     * Sorts the marks array in descending order using a selection-sort approach.
     * Counts and returns the number of swaps actually made.
     * 
     * @param marks the array of marks to sort
     * @return the number of swaps performed
     */
    public static int prizeTable(int[] marks) {
        int swapCount = 0;
        int n = marks.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the current position holds the largest mark initially
            int maxIndex = i;

            // Scan from i + 1 to the end to find the index of the largest mark
            for (int j = i + 1; j < n; j++) {
                if (marks[j] > marks[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap only if the largest mark is not already in position i
            if (maxIndex != i) {
                int temp = marks[i];
                marks[i] = marks[maxIndex];
                marks[maxIndex] = temp;
                swapCount++;
            }
        }

        return swapCount;
    }

    public static void main(String[] args) {
        // Sample Input 1
        int[] marks1 = {45, 90, 60, 75};
        int swaps1 = prizeTable(marks1);
        System.out.println("Output 1: " + Arrays.toString(marks1) + "  swaps = " + swaps1);

        // Sample Input 2
        int[] marks2 = {80, 70, 60};
        int swaps2 = prizeTable(marks2);
        System.out.println("Output 2: " + Arrays.toString(marks2) + "  swaps = " + swaps2);

        // Custom Test Input
        int[] marks3 = {50, 20, 100, 30, 90};
        int swaps3 = prizeTable(marks3);
        System.out.println("Custom Input Output: " + Arrays.toString(marks3) + "  swaps = " + swaps3);
    }
}
```[cite: 1]