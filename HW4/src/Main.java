import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // read data file
        String jarDir = Common.getJarCurrentDir();
        File file = new File(jarDir + "/data.txt");
        if(file.createNewFile()) {
            System.out.println("File Created");
        }

        file = new File(jarDir + "/data.txt");
        Scanner fileReader = new Scanner(file);
        Common.userMap = new HashMap<>();

        while(fileReader.hasNextLine()) {
            String[] dataTokens = fileReader.nextLine().split(",");
            Common.addNewUser(dataTokens[2], dataTokens[0], dataTokens[1], dataTokens[3], dataTokens[4]);

        }

        System.out.println(Common.userMap);

        fileReader.close();

        new WelcomeFrame();
    }
}