package exceptions;

public class Minimum8CharactersRequired extends PasswordException{
    public Minimum8CharactersRequired() {
        System.out.println("The password is less than 8 characters.");
    }

    public static boolean hasLessThan8Characters(String password) {
        return password.length() < 8;
    }

    @Override
    public String toString() {
        return "The password is less than 8 characters.";
    }
}
