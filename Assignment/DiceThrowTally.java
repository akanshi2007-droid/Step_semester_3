import java.util.Arrays;

public class DiceThrowTally {

    public static int[] diceSort(int[] rolls) {
        int[] count = new int[7];
        for (int roll : rolls) {
            count[roll]++;
        }

        System.out.print("Counts: ");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + ":" + count[i] + (i < 6 ? " " : ""));
        }
        System.out.println();

        int[] sorted = new int[rolls.length];
        int index = 0;
        for (int v = 1; v <= 6; v++) {
            for (int c = 0; c < count[v]; c++) {
                sorted[index++] = v;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] rolls1 = {4, 1, 6, 4, 2, 1, 4};
        System.out.println("Sample Input Output:");
        int[] result1 = diceSort(rolls1);
        System.out.println("Sorted: " + Arrays.toString(result1));

        int[] rolls2 = {3, 3, 2, 5, 1, 6, 2, 5};
        System.out.println("\nCustom Input Output:");
        int[] result2 = diceSort(rolls2);
        System.out.println("Sorted: " + Arrays.toString(result2));
    }
}
```[cite: 5]