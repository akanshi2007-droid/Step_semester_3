import java.util.Arrays;

public class HeightLineUp {

    public static void lineUp(int[] heights) {
        int pass = 1;
        boolean swapped;
        do {
            swapped = false;
            for (int j = 0; j < heights.length - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("Pass " + pass + ": " + Arrays.toString(heights));
            pass++;
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] heights1 = {4, 2, 5, 1};
        System.out.println("Sample Input 1 Output:");
        lineUp(heights1);

        int[] heights2 = {1, 3, 2, 4};
        System.out.println("\nSample Input 2 Output:");
        lineUp(heights2);

        int[] heights3 = {3, 1, 4, 2};
        System.out.println("\nCustom Input Output:");
        lineUp(heights3);
    }
}