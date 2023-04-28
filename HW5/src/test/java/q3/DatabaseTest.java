package q3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class DatabaseTest {
    Database database;
    @Before
    public void init() {
        database = Database.getInstance();
    }
    @Test
    public void testSingleInstance() {
        Database database2 = Database.getInstance();
        Assert.assertEquals(database, database2);
    }

    @Test
    public void testAddData() {
        database.addData("username", "password");
        Map<String, String> dictionary = database.getDictionary();
        Assert.assertEquals(1, dictionary.size());
        Assert.assertEquals("password", dictionary.get("username"));
    }
}
