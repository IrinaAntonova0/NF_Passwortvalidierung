import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void hasMinLength_shouldReturnFalse_whenNullminLX() {
        //given
        String str = null;
        int minL = 8;
        //when
        boolean act = PasswordValidator.hasMinLength(str, minL);
        //then
        assertEquals(false, act);
    }

    @Test
    void hasMinLength_shouldReturnFalse_whenLength0minL8() {
        //given
        String str = "";
        int minL = 8;
        //when
        boolean act = PasswordValidator.hasMinLength(str, minL);
        //then
        assertEquals(false, act);
    }

    @Test
    void hasMinLength_shouldReturnFalse_whenLength7minL8() {
        //given
        String str = "1234567";
        int minL = 8;
        //when
        boolean act = PasswordValidator.hasMinLength(str, minL);
        //then
        assertEquals(false, act);
    }

    @Test
    void hasMinLength_shouldReturnTrue_whenLength8minL8() {
        //given
        String str = "12345678";
        int minL = 8;
        //when
        boolean act = PasswordValidator.hasMinLength(str, minL);
        //then
        assertEquals(true, act);
    }

    @Test
    void hasMinLength_shouldReturnTrue_whenLength9minL8() {
        //given
        String str = "123456789";
        int minL = 8;
        //when
        boolean act = PasswordValidator.hasMinLength(str, minL);
        //then
        assertEquals(true, act);
    }

    @Test
    void hasMinLength_shouldReturnTrue_whenLength1minL1() {
        //given
        String str = "1";
        int minL = 1;
        //when
        boolean act = PasswordValidator.hasMinLength(str, minL);
        //then
        assertEquals(true, act);
    }

    @Test
    void hasMinLength_shouldReturnFalse_whenLength7minL0() {
        //given
        String str = "1234567";
        int minL = 0;
        //when
        boolean act = PasswordValidator.hasMinLength(str, minL);
        //then
        assertEquals(false, act);
    }

    //Parametrisierte Tests @CsvSource({"arg0,arg1, arg2", "arg0,arg1, arg2", })
    @ParameterizedTest
    @CsvSource( value = { ",8 ,false",
            ",8 ,false",
            "1234567,8 ,false",
            "12345678,8 ,true",
            "123456789,8 ,true",
            "S,1, true",
            "1234567, 0, false"
    })
    void hasMinLength_shouldREturnArg2_whenCalledwithArg0andArg1(String str, int minL, boolean expected) {
        boolean actual = PasswordValidator.hasMinLength(str, minL);
        assertEquals(expected, actual);
    }



    @Test
    void containsDigit_shouldReturnFalse_whenAbcd() {
        //given
        String str = "Abcd";
        //when
        boolean act = PasswordValidator.containsDigit(str);
        //then
        assertEquals(false, act);
    }

    @Test
    void containsDigit_shouldReturntrue_whenAbc1() {
        //given
        String str = "Abc1";
        //when
        boolean act = PasswordValidator.containsDigit(str);
        //then
        assertEquals(true, act);
    }

    @Test
    void containsDigit_shouldReturntrue_when12345() {
        //given
        String str = "12345";
        //when
        boolean act = PasswordValidator.containsDigit(str);
        //then
        assertEquals(true, act);
    }

    @Test
    void containsDigit_shouldReturnfalse_whenplusminus() {
        //given
        String str = "+-+-+";
        //when
        boolean act = PasswordValidator.containsDigit(str);
        //then
        assertEquals(false, act);
    }

    @Test
    void containsDigit_shouldReturnfalse_whenOnlySpaces() {
        //given
        String str = "     ";
        //when
        boolean act = PasswordValidator.containsDigit(str);
        //then
        assertEquals(false, act);
    }

    @Test
    void containsUpperAndLower_shouldReturnfalse_whenabc() {
        //given
        String str = "abc";
        //when
        boolean act = PasswordValidator.containsUpperAndLower(str);
        //then
        assertEquals(false, act);
    }

    @Test
    void containsUpperAndLower_shouldReturnfalse_whenABC() {
        //given
        String str = "ABC";
        //when
        boolean act = PasswordValidator.containsUpperAndLower(str);
        //then
        assertEquals(false, act);
    }

    @Test
    void containsUpperAndLower_shouldReturnfalse_whenA() {
        //given
        String str = "A";
        //when
        boolean act = PasswordValidator.containsUpperAndLower(str);
        //then
        assertEquals(false, act);
    }

    @Test
    void containsUpperAndLower_shouldReturnfalse_whenb() {
        //given
        String str = "b";
        //when
        boolean act = PasswordValidator.containsUpperAndLower(str);
        //then
        assertEquals(false, act);
    }
    @Test
    void containsUpperAndLower_shouldReturnfalse_when123() {
        //given
        String str = "123";
        //when
        boolean act = PasswordValidator.containsUpperAndLower(str);
        //then
        assertEquals(false, act);
    }

    @Test
    void containsUpperAndLower_shouldReturnfalse_whenplusminus() {
        //given
        String str = "+-+-+-";
        //when
        boolean act = PasswordValidator.containsUpperAndLower(str);
        //then
        assertEquals(false, act);
    }

    @Test
    void containsUpperAndLower_shouldReturntrue_when1Aa2bb3() {
        //given
        String str = "1Aa2bb3";
        //when
        boolean act = PasswordValidator.containsUpperAndLower(str);
        //then
        assertEquals(true, act);
    }

    @Test
    void isCommonPassword_shouldReturntrue_whenPassword() {
        //given
        String str = "Passwort1";
        //when
        boolean act = PasswordValidator.isCommonPassword(str);
        //then
        assertEquals(true, act);
    }

    @Test
    void isCommonPassword_shouldReturnfalse_whenPassworddddd() {
        //given
        String str = "Passworddddd";
        //when
        boolean act = PasswordValidator.isCommonPassword(str);
        //then
        assertEquals(false, act);
    }

    @Test
    void isCommonPassword_shouldReturnfalse_whenEmptyString() {
        //given
        String str = "";
        //when
        boolean act = PasswordValidator.isCommonPassword(str);
        //then
        assertEquals(false, act);
    }

    //Parametrisierte Tests @CsvSource({"arg0,arg1, arg2", "arg0,arg1, arg2", })
    @ParameterizedTest
    @CsvSource( value = { ",false",
            "1234567,false",
            "'123:4567',true",
            "12345678,false",
            "'-------',true",
            "1234!56789,true",
            "'1234!56,;789',true",
            "+, true",
            "1@234567, true"
    })
    void containsSpecialChar_shouldREturnArg1_whenCalledwithArg0(String str, boolean expected) {
        boolean actual = PasswordValidator.containsSpecialChar(str,
                PasswordValidator.SPECIALS);
        assertEquals(expected, actual);
    }

    //Parametrisierte Tests @CsvSource({"arg0,arg1, arg2", "arg0,arg1, arg2", })
    @ParameterizedTest
    @CsvSource(value =
            {"null,false", // zu null
                    "abcd, false", //zu kurz
                    "abcdabcd, false", // keine Ziffer
                    "abcdabc1, false", // no upperCase
                    "ABCDABC1, false", // no lowerCase
                    "password, false", // common password
                    "+-+-+-+-, false", //
                    " '         ', false", // no password
                    " '  cdAB12  ', false", // 2 short
                    "ABCDabc1, false", // no defined specialChar
                    " '  cdA!!!B12  ', true", //
                    "AB%CDa$bc1, true",
                    "'AB+*CD,;abc1', true",
                    "ABCD%abc1, true",
    },    nullValues = "null"
    )// Definiert, welcher Text als null gilt
    void isValid_shouldREturnArg1_whenCalledwithArg0(String password, boolean expected) {
        boolean actual = PasswordValidator.isValid(password);
        assertEquals(expected, actual);
    }
}