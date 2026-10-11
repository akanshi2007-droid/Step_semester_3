package feature_session_10.Practice;
import java.util.*;

abstract class LibraryItem {
    String title;
    int daysLate;

    LibraryItem(String t, int d) {
        title = t;
        daysLate = d;
    }

    abstract double calculateFine();
}

class Book extends LibraryItem {
    Book(String t, int d) {
        super(t, d);
    }

    double calculateFine() {
        return daysLate * 2.0;
    }
}

class DVD extends LibraryItem {
    DVD(String t, int d) {
        super(t, d);
    }

    double calculateFine() {
        return Math.min(daysLate * 5.0, 50.0);
    }
}

class Magazine extends LibraryItem {
    Magazine(String t, int d) {
        super(t, d);
    }

    double calculateFine() {
        return daysLate * 1.0;
    }
}

public class Problem103{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String title = sc.next();
            int days = sc.nextInt();
            LibraryItem item;

            switch (type) {
                case "BOOK":
                    item = new Book(title, days);
                    break;
                case "DVD":
                    item = new DVD(title, days);
                    break;
                default:
                    item = new Magazine(title, days);
            }

            double fine = item.calculateFine();
            System.out.printf("%s: %.2f%n", title, fine);
            total += fine;
        }

        System.out.printf("Total Fines: %.2f%n", total);
        sc.close();
    }
}