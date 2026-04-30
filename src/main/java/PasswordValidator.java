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
        for(String s : commons){
            if(password.toLowerCase().equals(s.toLowerCase()))
                return true;
            else
                continue;
        }
        return false;
    }; // kleine interne Liste

    // kleine interne Liste
    public static String[] commons = {"password", "Passwort1", "12345678", "Aa345678"};





    // Bonus:
    public static boolean containsSpecialChar(String password, String allowed){
        return false;
    };
    // Optionale Gesamtsicht:
    public static boolean isValid(String password){
        return false;
    }; // nutzt die obenstehenden Checks
}