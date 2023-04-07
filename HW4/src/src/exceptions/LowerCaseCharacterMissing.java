package exceptions;

public class LowerCaseCharacterMissing extends PasswordException{
    public LowerCaseCharacterMissing() {
        System.out.println("A lower case character is missing in the password.");
    }

    public static boolean hasNoLowerCaseCharacter(String password) {
        char[] pw = password.toCharArray();
        for (char c :
                pw) {
            if(Character.isLowerCase(c)) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "A lower case character is missing in the password.";
    }
}
