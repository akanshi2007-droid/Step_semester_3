package feature_session_10.Practice;
import java.util.*;

abstract class Booking {
    static final double BOOKING_FEE = 50.0;
    double distance;

    Booking(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    double totalFare() {
        return calculateFare() + BOOKING_FEE;
    }
}

class Bus extends Booking {
    Bus(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 2;
    }
}

class Train extends Booking {
    Train(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 1.5;
    }
}

class Flight extends Booking {
    Flight(double d) {
        super(d);
    }

    double calculateFare() {
        return 2500 + distance * 4;
    }
}

public class Problem105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String mode = sc.next();
            double distance = sc.nextDouble();
            Booking b;

            switch (mode) {
                case "BUS":
                    b = new Bus(distance);
                    break;
                case "TRAIN":
                    b = new Train(distance);
                    break;
                default:
                    b = new Flight(distance);
            }

            System.out.printf("%s: %.2f%n", mode, b.totalFare());
        }

        sc.close();
    }
}