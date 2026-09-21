package feature_session_7.class_problems;
public class Problem2 {
    private boolean[] results;
    private int answerCount;
    public Problem2(int totalQuestions) {
        results = new boolean[totalQuestions];
        answerCount = 0;
    }
    public void recordAnswer(boolean correct) {
        if (answerCount < results.length) {
            results[answerCount] = correct;
            answerCount++;
        }
    }
    public int getScore() {
        int score = 0;
        for (int i = 0; i < answerCount; i++) {
            if (results[i]) {
                score++;
            }
        }
        return score;
    }
    public static void main(String[] args) {
        Problem2 sc = new Problem2(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);
        System.out.println(sc.getScore());
    }
}