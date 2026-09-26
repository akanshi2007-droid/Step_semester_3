package feature_session_8.assignment_problems;

import java.util.*;

abstract class Customer {
    double amount;

    Customer(double amount) {
        this.amount = amount;
    }

    abstract double calculate();

    abstract String type();
}

class Student extends Customer {
    Student(double amount) {
        super(amount);
    }

    double calculate() {
        return amount * 0.90;
    }

    String type() {
        return "STUDENT";
    }
}

class Staff extends Customer {
    Staff(double amount) {
        super(amount);
    }

    double calculate() {
        return amount * 0.95;
    }

    String type() {
        return "STAFF";
    }
}

class Guest extends Customer {
    Guest(double amount) {
        super(amount);
    }

    double calculate() {
        return amount + 10;
    }

    String type() {
        return "GUEST";
    }
}

public class Assignment81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Customer[] customers = new Customer[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();

            if (type.equals("STUDENT"))
                customers[i] = new Student(amount);
            else if (type.equals("STAFF"))
                customers[i] = new Staff(amount);
            else
                customers[i] = new Guest(amount);
        }

        double total = 0;

        for (Customer c : customers) {
            double amount = c.calculate();
            System.out.printf("%s: %.2f%n", c.type(), amount);
            total += amount;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}