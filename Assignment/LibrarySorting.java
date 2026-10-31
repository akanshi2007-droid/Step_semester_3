import java.util.Arrays;

public class LibrarySorting {

    public static void shelf(int[] books) {
        for (int i = 1; i < books.length; i++) {
            int key = books[i];
            int j = i - 1;
            while (j >= 0 && books[j] > key) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
            System.out.println("After placing " + key + ": " + Arrays.toString(books));
        }
    }

    public static void main(String[] args) {
        int[] sampleBooks = {30, 10, 40, 20};
        System.out.println("Sample Input Output:");
        shelf(sampleBooks);

        int[] customBooks = {50, 15, 25, 5, 35};
        System.out.println("\nCustom Input Output:");
        shelf(customBooks);
    }
}
```[cite: 2]