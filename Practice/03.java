import java.util.*;

public class Main {
    static boolean hasDuplicate(String[] ids) {
        HashSet<String> seen = new HashSet<>();

        for (String id : ids) {
            if (seen.contains(id))
                return true;

            seen.add(id);
        }

        return false;
    }

    public static void main(String[] args) {
        String[] ids = {
            "TXN1001", "TXN1002", "TXN1003", "TXN1002"
        };

        System.out.println(hasDuplicate(ids));
    }
}