package feature_session_10.Practice;
import java.util.*;

abstract class Staff {
    String name;

    Staff(String name) {
        this.name = name;
    }

    abstract double calculatePay();
}

class FullTime extends Staff {
    double salary;

    FullTime(String n, double s) {
        super(n);
        salary = s;
    }

    double calculatePay() {
        return salary;
    }
}

class Hourly extends Staff {
    double hours, rate;

    Hourly(String n, double h, double r) {
        super(n);
        hours = h;
        rate = r;
    }

    double calculatePay() {
        if (hours <= 40)
            return hours * rate;
        return 40 * rate + (hours - 40) * rate * 1.5;
    }
}

class Intern extends Staff {
    double stipend;

    Intern(String n, double s) {
        super(n);
        stipend = s;
    }

    double calculatePay() {
        return stipend;
    }
}

public class Problem102{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            Staff s;

            switch (type) {
                case "FULLTIME":
                    s = new FullTime(name, sc.nextDouble());
                    break;
                case "HOURLY":
                    s = new Hourly(name, sc.nextDouble(), sc.nextDouble());
                    break;
                default:
                    s = new Intern(name, sc.nextDouble());
            }

            double pay = s.calculatePay();
            System.out.printf("%s: %.2f%n", name, pay);
            total += pay;
        }

        System.out.printf("Total Payroll: %.2f%n", total);
        sc.close();
    }
}