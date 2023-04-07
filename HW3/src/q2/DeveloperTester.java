package q2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeveloperTester {
    public static void main(String[] args) throws ParseException {
        List<Developer> developerList = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date dob1 = format.parse("12/23/1996");
        Developer intern1 = new Intern("Trinh", "Thao", "intern1", dob1, 54.0);
        Date dob2 = format.parse("08/13/1994");
        Developer sde2 = new SDE("Chan", "Dylan", "sde2", dob2, new Education("BS", "Computer Science"), Level.II);
        Date dob3 = format.parse("11/07/1999");
        Developer partime3 = new Partime("Chen", "Elton", "partime3", dob3, 44.0, 20);

        developerList.add(intern1);
        developerList.add(sde2);
        developerList.add(partime3);

        for (Developer dev :
                developerList) {
            System.out.println(dev);
        }

    }
}
