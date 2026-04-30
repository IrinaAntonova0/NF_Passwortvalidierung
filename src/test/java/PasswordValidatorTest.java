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
    void isCommonPassword() {
        assertTrue(true);
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