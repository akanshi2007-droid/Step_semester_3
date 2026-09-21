package feature_session_7.class_problems;
public class Problem3 {
    private final String firstName;
    private final String lastName;
    public Problem3(String fullName) {
        String[] parts = fullName.split(" ");
        firstName = parts[0];
        lastName = parts[1];
    }
    public String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }
    public static void main(String[] args) {
        Problem3 tag = new Problem3("Maria Gomez");
        System.out.println(tag.getNickname());
    }
}