package exceptions;

public class SpecialCharacterMissing extends PasswordException{
    public SpecialCharacterMissing() {
        System.out.println("A special character is missing in the password.");
    }

    public static boolean hasNoSpecialCharacter(String password) {
        char[] pw = password.toCharArray();
        for (char c :
                pw) {
            if(!Character.isDigit(c) && !Character.isLetter(c)) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "A special character is missing in the password.";
    }
}
