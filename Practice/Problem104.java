package feature_session_10.Practice;
import java.util.*;

abstract class Connection {
    double units;

    Connection(double units) {
        this.units = units;
    }

    abstract double calculateBill();
}

class Home extends Connection {
    Home(double u) {
        super(u);
    }

    double calculateBill() {
        if (units <= 100)
            return units * 5;
        return 100 * 5 + (units - 100) * 7;
    }
}

class Shop extends Connection {
    Shop(double u) {
        super(u);
    }

    double calculateBill() {
        return units * 8 + 100;
    }
}

class Factory extends Connection {
    Factory(double u) {
        super(u);
    }

    double calculateBill() {
        return Math.max(units * 6, 1000);
    }
}

public class Problem104{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double units = sc.nextDouble();
            Connection c;

            switch (type) {
                case "HOME":
                    c = new Home(units);
                    break;
                case "SHOP":
                    c = new Shop(units);
                    break;
                default:
                    c = new Factory(units);
            }

            double bill = c.calculateBill();
            System.out.printf("%s: %.2f%n", type, bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}