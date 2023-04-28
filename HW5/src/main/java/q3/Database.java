package q3;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private static Database uniqueInstance;
    private Map<String, String> dictionary;
    private Database() {
        dictionary = new HashMap<>();
    }

    public static Database getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Database();
        }

        return uniqueInstance;
    }

    public void addData(String username, String password) {
        dictionary.put(username, password);
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }
}
