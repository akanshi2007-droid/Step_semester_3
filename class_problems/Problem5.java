package feature_session_5.assignment_problems;

import java.util.Arrays;

public class Problem5 implements Comparable<Problem5> {

    private String name;
    private double cgpa;
    private int codingScore;

    public Problem5(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {

        return cgpa >= 7.5;
    }

    static boolean isEligible(double cgpa, int codingScore) {

        return cgpa >= 6.5 && codingScore >= 60;
    }

    private double getCompositeScore() {

        return cgpa * 10 + codingScore;
    }

    @Override
    public int compareTo(Problem5 other) {

        return Double.compare(
            other.getCompositeScore(),
            this.getCompositeScore()
        );
    }

    static String shortlistAndRank(Problem5[] candidates) {

        Problem5[] shortlisted = new Problem5[candidates.length];

        int count = 0;

        for (Problem5 candidate : candidates) {

            if (isEligible(candidate.cgpa) ||
                isEligible(candidate.cgpa, candidate.codingScore)) {

                shortlisted[count] = candidate;
                count++;
            }
        }

        shortlisted = Arrays.copyOf(shortlisted, count);

        Arrays.sort(shortlisted);

        String result = "";

        for (int i = 0; i < shortlisted.length; i++) {

            result += (i + 1) + ". "
                    + shortlisted[i].name
                    + " (" + shortlisted[i].getCompositeScore() + ")";

            if (i < shortlisted.length - 1) {
                result += " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Problem5[] candidates = {

            new Problem5("Aisha", 8.2, 40),
            new Problem5("Rohit", 6.8, 65),
            new Problem5("Meena", 6.0, 90),
            new Problem5("Karan", 7.5, 20)

        };

        System.out.println(shortlistAndRank(candidates));
    }
}