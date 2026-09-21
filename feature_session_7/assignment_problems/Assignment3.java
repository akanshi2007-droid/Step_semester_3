package feature_session_7.assignment_problems;
public class Assignment3 {
    private final String password;
    public Assignment3(String password) {
        this.password = password;
    }
    public String getStrength() {
        if (password.length() < 6) {
            return "Weak";
        } else if (password.length() <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }
    public static void main(String[] args) {
        Assignment3 pc = new Assignment3("abcd");
        System.out.println(pc.getStrength());
        Assignment3 pc2 = new Assignment3("abcdefgh");
        System.out.println(pc2.getStrength());
        Assignment3 pc3 = new Assignment3("abcdefghij");
        System.out.println(pc3.getStrength());
    }
}