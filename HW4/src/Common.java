import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Common {
    static Map<String, Map<String, String>> userMap; // username - other data

    public static void addNewUser(String username, String firstName, String lastName, String email, String password) {
        userMap.put(username, new HashMap<>());

        userMap.get(username).put("FirstName", firstName);
        userMap.get(username).put("LastName", lastName);
        userMap.get(username).put("Email", email);
        userMap.get(username).put("Password", password);
    }

    public static String getJarCurrentDir() {
        String path = Main.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        File jarFile = new File(path);
        return jarFile.getParentFile().getAbsolutePath();
    }
}
