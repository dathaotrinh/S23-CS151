package exceptions;

public class NumberCharacterMissing extends PasswordException{
    public NumberCharacterMissing() {
        System.out.println("The password doesn't have any numbers in it.");
    }

    public static boolean hasNoNumber(String password) {
        char[] pw = password.toCharArray();
        for (char c :
                pw) {
            if(Character.isDigit(c)) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "The password doesn't have any numbers in it.";
    }
}
