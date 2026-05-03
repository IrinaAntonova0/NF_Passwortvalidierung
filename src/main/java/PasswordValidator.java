import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public final class PasswordValidator {

    // kleine interne Liste
    public static final String[] COMMONS = {"password", "Passwort1", "12345678", "Aa345678"};
    public static final Set<String> COMMONS_SET = Arrays.stream(COMMONS)
            .map(String::trim)        // Trims whitespace
            .map(String::toLowerCase) // Converts to lowercase
            .collect(Collectors.collectingAndThen(
                    Collectors.toSet(),  // Unique result in HashSet
                    Collections::unmodifiableSet // Make Set immutable
                ));

    public static final String[] SPECIALS = "!@#$%^&*()-_+=?.,;:".split("");
    //public static final Set<String> SPECIALS_SET = Set.copyOf(Arrays.asList(SPECIALS));

    public static final int MIN = 8;

    public static boolean hasMinLength(String password, int min){
        if( min == 0 || password == null || password.length()<= 0 ) {
            return false;
        }
        if(password.length()<min){
            return false;
        }
        return true;
    }

    public static boolean containsDigit(String password){
        if( password == null || password.length() == 0 ){
            return false;
        }
        char cArr[] = password.toCharArray();
        for(char c : cArr) {
            if(Character.isDigit(c))
                return true;
            else {
            }
        }
        return false;
    }

    public static boolean containsUpperAndLower(String password){
        if( password == null || password.length() < 2 ){
            return false;
        }
        boolean isUpper = false;
        boolean isLower = false;
        for(char c : password.toCharArray()) {
            isLower = Character.isLowerCase(c) ? true : isLower ;
            isUpper = Character.isUpperCase(c) ? true : isUpper ;
            if(isUpper && isLower) {
                return true;
            }
        }
        return isUpper && isLower;
    }

    public static boolean isCommonPassword(String password){
        for(String s : COMMONS_SET){
            if(password.toLowerCase().equals(s.toLowerCase())) {
                return true;
            }
        }
        return false;
    } // kleine interne Liste

    // Bonus:
    public static boolean containsSpecialChar(String password, String[] allowed){
        if( password == null || password.length() == 0 ){
            return false;
        }
        String sArr[] = password.split("");
        for(String s : sArr) {
            for(String special : allowed) {
                if (special.equals(s))
                    return true;
            }
        }
        return false;
    }

    // Optionale Gesamtsicht:
    public static boolean isValid(String password){
        if(password == null)
            return false;
        String trimmed = password.trim();
        if( ! PasswordValidator.hasMinLength(trimmed, MIN))
            return false;
        if( ! PasswordValidator.containsDigit(trimmed))
            return false;
        if( ! PasswordValidator.containsUpperAndLower(trimmed))
            return false;
        if( ! PasswordValidator.containsSpecialChar(trimmed, SPECIALS))
            return false;
        return true;
    } // nutzt die obenstehenden Checks

}