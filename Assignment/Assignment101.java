package feature_session_10.Assignment;
import java.util.*;

abstract class Ticket {
    static final double FEE = 20.0;
    int count;

    Ticket(int count) {
        this.count = count;
    }

    abstract double price();

    double total() {
        return count * (price() + FEE);
    }
}

class Regular extends Ticket {
    Regular(int c) {
        super(c);
    }

    double price() {
        return 150;
    }
}

class Premium extends Ticket {
    Premium(int c) {
        super(c);
    }

    double price() {
        return 250;
    }
}

class Recliner extends Ticket {
    Recliner(int c) {
        super(c);
    }

    double price() {
        return 400;
    }
}

public class Assignment101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int count = sc.nextInt();
            Ticket t;

            switch (type) {
                case "REGULAR":
                    t = new Regular(count);
                    break;
                case "PREMIUM":
                    t = new Premium(count);
                    break;
                default:
                    t = new Recliner(count);
            }

            double amount = t.total();
            System.out.printf("%s: %.2f%n", type, amount);
            sum += amount;
        }

        System.out.printf("Total: %.2f%n", sum);
        sc.close();
    }
}