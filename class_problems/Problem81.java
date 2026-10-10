package feature_session_8.class_problems;
import java.util.*;

abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract double calculateAmount();

    String getType() {
        return getClass().getSimpleName().replace("Payment", "").toUpperCase();
    }
}

class CARDPayment extends Payment {
    CARDPayment(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount * 1.02;
    }
}

class WALLETPayment extends Payment {
    WALLETPayment(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount * 1.01;
    }
}

class BANKTRANSFERPayment extends Payment {
    BANKTRANSFERPayment(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount;
    }
}

public class Problem81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            Payment p;

            switch (type) {
                case "CARD":
                    p = new CARDPayment(amount);
                    break;
                case "WALLET":
                    p = new WALLETPayment(amount);
                    break;
                default:
                    p = new BANKTRANSFERPayment(amount);
            }

            double result = p.calculateAmount();
            System.out.printf("%s: %.2f%n", type, result);
            total += result;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
