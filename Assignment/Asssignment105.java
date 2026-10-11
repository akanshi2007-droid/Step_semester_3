package feature_session_10.Assignment;

import java.util.*;

interface SaverMode {
    double SAVER_FACTOR = 0.75;
}

abstract class Appliance {
    double hours;

    Appliance(double hours) {
        this.hours = hours;
    }

    abstract double power();

    double units() {
        return power() * hours / 1000;
    }

    double cost() {
        return units() * 8;
    }
}

class Fridge extends Appliance {
    Fridge(double h) {
        super(h);
    }

    double power() {
        return 150;
    }
}

class AC extends Appliance implements SaverMode {
    AC(double h) {
        super(h);
    }

    double power() {
        return 1500;
    }

    double units() {
        return power() * hours / 1000 * SAVER_FACTOR;
    }
}

class TV extends Appliance {
    TV(double h) {
        super(h);
    }

    double power() {
        return 100;
    }
}

class Washer extends Appliance implements SaverMode {
    Washer(double h) {
        super(h);
    }

    double power() {
        return 500;
    }

    double units() {
        return power() * hours / 1000 * SAVER_FACTOR;
    }
}

public class Asssignment105{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double hours = sc.nextDouble();
            boolean saver = sc.hasNext("SAVER");

            if (saver) {
                sc.next();
            }

            Appliance a;

            switch (type) {
                case "FRIDGE":
                    a = new Fridge(hours);
                    break;
                case "AC":
                    a = new AC(hours);
                    break;
                case "TV":
                    a = new TV(hours);
                    break;
                default:
                    a = new Washer(hours);
            }

            if (saver && !(a instanceof SaverMode)) {
                System.out.println(type + ": saver mode not supported");
                continue;
            }

            double units = a.units();
            double cost = a.cost();

            System.out.printf("%s: Units=%.2f Cost=%.2f%n",
                    type, units, cost);
            total += cost;
        }

        System.out.printf("Total Cost: %.2f%n", total);
        sc.close();
    }
}