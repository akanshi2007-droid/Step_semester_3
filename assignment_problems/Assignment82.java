package feature_session_8.assignment_problems;

import java.util.*;

abstract class Vehicle {
    int hours;

    Vehicle(int hours) {
        this.hours = hours;
    }

    abstract double calculate();

    abstract String type();
}

class Bike extends Vehicle {
    Bike(int hours) {
        super(hours);
    }

    double calculate() {
        return hours * 10;
    }

    String type() {
        return "BIKE";
    }
}

class Car extends Vehicle {
    Car(int hours) {
        super(hours);
    }

    double calculate() {
        return 30 + (hours - 1) * 20;
    }

    String type() {
        return "CAR";
    }
}

class Truck extends Vehicle {
    Truck(int hours) {
        super(hours);
    }

    double calculate() {
        return Math.max(100, hours * 50);
    }

    String type() {
        return "TRUCK";
    }
}

public class Assignment82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int hours = sc.nextInt();

            if (type.equals("BIKE"))
                vehicles[i] = new Bike(hours);
            else if (type.equals("CAR"))
                vehicles[i] = new Car(hours);
            else
                vehicles[i] = new Truck(hours);
        }

        double total = 0;

        for (Vehicle v : vehicles) {
            double charge = v.calculate();
            System.out.printf("%s: %.2f%n", v.type(), charge);
            total += charge;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}