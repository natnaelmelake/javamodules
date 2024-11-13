package utilityManagement;

public class Utils {
    public static boolean validateEmail(String email) {
        return email != null && email.contains("@");
    }

    public static boolean validatePrice(double price) {
        return price > 0;
    }

    public static void log(String message) {
        System.out.println("LOG: " + message);
    }
}
