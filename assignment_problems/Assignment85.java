package feature_session_8.assignment_problems;

import java.time.*;
import java.util.*;

abstract class Plan {
    String name;
    LocalDate startDate;

    Plan(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    abstract LocalDate renewalDate();
}

class Basic extends Plan {
    Basic(String name, LocalDate startDate) {
        super(name, startDate);
    }

    LocalDate renewalDate() {
        return startDate.plusDays(30);
    }
}

class Standard extends Plan {
    Standard(String name, LocalDate startDate) {
        super(name, startDate);
    }

    LocalDate renewalDate() {
        return startDate.plusDays(90);
    }
}

class Premium extends Plan {
    Premium(String name, LocalDate startDate) {
        super(name, startDate);
    }

    LocalDate renewalDate() {
        return startDate.plusDays(365);
    }
}

public class Assignment85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Plan[] plans = new Plan[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            LocalDate date = LocalDate.parse(sc.next());

            if (type.equals("BASIC"))
                plans[i] = new Basic(name, date);
            else if (type.equals("STANDARD"))
                plans[i] = new Standard(name, date);
            else
                plans[i] = new Premium(name, date);
        }

        for (Plan p : plans) {
            System.out.println(p.name + ": " + p.renewalDate());
        }
    }
}