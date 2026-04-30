public final class PasswordValidator {

    public static boolean hasMinLength(String password, int min){
        return false;
    };

    public static boolean containsDigit(String password){
        return false;
    };

    public static boolean containsUpperAndLower(String password){
        if( password == null || password.length() == 0 ){
            return false;
        }
        char cArr[] = password.toCharArray();
        boolean isUpper = false;
        boolean isLower = false;
        for(char c : cArr) {
            if(isUpper && isLower) {
                return true;
            }
/*            if(isUpper && Character.isLowerCase(c)) {
                return true;
            }
            if(isLower && Character.isUpperCase(c)) {
                return true;
            }*/
            isLower = Character.isLowerCase(c) ? true : isLower ;
            isUpper = Character.isUpperCase(c) ? true : isUpper ;
        }
        return isUpper && isLower;
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