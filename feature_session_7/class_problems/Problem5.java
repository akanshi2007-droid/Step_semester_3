package feature_session_7.class_problems;
public class Problem5 {
    private String[] students;
    private final int maxSize;
    private int presentCount;
    public Problem5(int maxSize) {
        this.maxSize = maxSize;
        students = new String[maxSize];
        presentCount = 0;
    }
    public void markPresent(String name) {
        if (isPresent(name)) {
            return;
        }
        if (presentCount < maxSize) {
            students[presentCount] = name;
            presentCount++;
        }
    }
    public int getPresentCount() {
        return presentCount;
    }
    public boolean isPresent(String name) {
        for (int i = 0; i < presentCount; i++) {
            if (students[i].equals(name)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Problem5 sheet = new Problem5(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");
        System.out.println(sheet.getPresentCount());
        System.out.println(sheet.isPresent("Ben"));
        System.out.println(sheet.isPresent("Chen"));
    }
}