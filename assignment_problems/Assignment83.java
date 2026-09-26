package feature_session_8.assignment_problems;

import java.util.*;

abstract class Room {
    int units;

    Room(int units) {
        this.units = units;
    }

    abstract double calculate();

    abstract String type();
}

class Single extends Room {
    Single(int units) {
        super(units);
    }

    double calculate() {
        return units * 8;
    }

    String type() {
        return "SINGLE";
    }
}

class Shared extends Room {
    int occupants;

    Shared(int units, int occupants) {
        super(units);
        this.occupants = occupants;
    }

    double calculate() {
        return units * 6.0 / occupants;
    }

    String type() {
        return "SHARED";
    }
}

class AC extends Room {
    AC(int units) {
        super(units);
    }

    double calculate() {
        return units * 10 + 200;
    }

    String type() {
        return "AC";
    }
}

public class Assignment83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Room[] rooms = new Room[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();

            if (type.equals("SINGLE"))
                rooms[i] = new Single(units);
            else if (type.equals("SHARED")) {
                int occupants = sc.nextInt();
                rooms[i] = new Shared(units, occupants);
            } else
                rooms[i] = new AC(units);
        }

        double total = 0;

        for (Room r : rooms) {
            double bill = r.calculate();
            System.out.printf("%s: %.2f%n", r.type(), bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}