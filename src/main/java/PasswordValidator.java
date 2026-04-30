public final class PasswordValidator {

    public static boolean hasMinLength(String password, int min){
        return false;
    };

    public static boolean containsDigit(String password){
        return false;
    };

    public static boolean containsUpperAndLower(String password){
        return false;
    };
    
    public static boolean isCommonPassword(String password){
        return false;
    }; // kleine interne Liste


    // Bonus:
    public static boolean containsSpecialChar(String password, String allowed){
        return false;
    };
    // Optionale Gesamtsicht:
    public static boolean isValid(String password){
        return false;
    }; // nutzt die obenstehenden Checks
}