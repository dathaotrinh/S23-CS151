package exceptions;

public class UpperCaseCharacterMissing extends PasswordException{
    public UpperCaseCharacterMissing() {
        System.out.println("A upper case character is missing in the password.");
    }

    public static boolean hasNoUpperCaseCharacter(String password) {
        char[] pw = password.toCharArray();
        for (char c :
                pw) {
            if(Character.isUpperCase(c)) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "A upper case character is missing in the password.";
    }
}
