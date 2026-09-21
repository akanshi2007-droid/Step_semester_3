package feature_session_7.class_problems;
public class Problem4 {
    private String code;
    private final int lockerNumber;
    public Problem4(int lockerNumber, String code) {
        this.lockerNumber = lockerNumber;
        this.code = code;
    }
    public void changeCode(String currentCode, String newCode) {
        if (code.equals(currentCode)) {
            code = newCode;
        }
    }
    public static void main(String[] args) {
        Problem4 l = new Problem4(101, "1234");
        l.changeCode("1234", "5678");
        l.changeCode("0000", "9999");
        System.out.println("Code changed successfully");
    }
}