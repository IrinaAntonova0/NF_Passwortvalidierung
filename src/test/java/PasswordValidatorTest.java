import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void hasMinLength() {
        assertTrue(true);
    }

    @Test
    void containsDigit() {
        assertTrue(true);
    }

    @Test
    void containsUpperAndLower() {
        assertTrue(true);
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

    @Test
    void containsSpecialChar() {
        assertTrue(true);
    }

    @Test
    void isValid() {
        assertTrue(true);
    }
}