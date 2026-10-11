package feature_session_10.Assignment;
import java.util.*;

interface BusUser {
    double transportFee();
}

abstract class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    abstract double tuition();

    double hostelFee() {
        return 0;
    }

    double totalFee() {
        return tuition() + hostelFee();
    }
}

class DayScholar extends Student implements BusUser {
    DayScholar(String n) {
        super(n);
    }

    double tuition() {
        return 40000;
    }

    public double transportFee() {
        return 12000;
    }

    double totalFee() {
        return tuition() + transportFee();
    }
}

class Hosteller extends Student {
    Hosteller(String n) {
        super(n);
    }

    double tuition() {
        return 40000;
    }

    double hostelFee() {
        return 60000;
    }
}

class Scholar extends Student implements BusUser {
    Scholar(String n) {
        super(n);
    }

    double tuition() {
        return 20000;
    }

    public double transportFee() {
        return 12000;
    }

    double totalFee() {
        return tuition() + transportFee();
    }
}

public class Assignment103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            Student s;

            switch (type) {
                case "DAY_SCHOLAR":
                    s = new DayScholar(name);
                    break;
                case "HOSTELLER":
                    s = new Hosteller(name);
                    break;
                default:
                    s = new Scholar(name);
            }

            double fee = s.totalFee();
            System.out.printf("%s: %.2f%n", name, fee);
            total += fee;
        }

        System.out.printf("Total Collected: %.2f%n", total);
        sc.close();
    }
}