package feature_session_7.class_problems;
public class Problem1 {
    private int savings;
    private final String id;
    public Problem1(String id) {
        this.id = id;
        savings = 0;
    }
    public void deposit(int amount) {
        if (amount > 0) {
            savings += amount;
        }
    }
    public void withdraw(int amount) {
        if (amount > 0 && amount <= savings) {
            savings -= amount;
        }
    }
    public int getSavings() {
        return savings;
    }
    public static void main(String[] args) {
        Problem1 pb = new Problem1("PB-1");
        pb.deposit(100);
        System.out.println(pb.getSavings());
        pb.withdraw(30);
        System.out.println(pb.getSavings());
        pb.withdraw(500);
        System.out.println(pb.getSavings());
    }
}