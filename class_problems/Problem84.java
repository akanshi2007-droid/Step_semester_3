package feature_session_8.class_problems;

import java.util.*;

abstract class Question {
    String correct, answer;
    double points;

    Question(String correct, String answer, double points) {
        this.correct = correct;
        this.answer = answer;
        this.points = points;
    }

    abstract double grade();
}

class MCQ extends Question {
    MCQ(String c, String a, double p) {
        super(c, a, p);
    }

    double grade() {
        return correct.equalsIgnoreCase(answer) ? points : 0;
    }
}

class TF extends Question {
    TF(String c, String a, double p) {
        super(c, a, p);
    }

    double grade() {
        return correct.equalsIgnoreCase(answer) ? points : 0;
    }
}

class Essay extends Question {
    Essay(String c, String a, double p) {
        super(c, a, p);
    }

    double grade() {
        String[] keywords = correct.split(",");
        int count = 0;

        for (String keyword : keywords) {
            if (answer.toLowerCase().contains(keyword.trim().toLowerCase())) {
                count++;
            }
        }

        if (count >= 2) return points * 0.75;
        if (count == 1) return points * 0.50;
        return 0;
    }
}

public class Problem84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double total = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split("\"");
            String type = parts[0].trim().split("\\s+")[0];

            String question = parts[1];
            String correct = parts[3];
            String answer = parts[5];
            double points = Double.parseDouble(parts[6].trim());

            Question q;

            switch (type) {
                case "MCQ":
                    q = new MCQ(correct, answer, points);
                    break;
                case "TF":
                    q = new TF(correct, answer, points);
                    break;
                default:
                    q = new Essay(correct, answer, points);
            }

            double score = q.grade();
            System.out.printf("%s: %.2f%n", type, score);
            total += score;
        }

        System.out.printf("Total Score: %.2f%n", total);
        sc.close();
    }
}
