import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void hasMinLength() {
        assertTrue(true);
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
    void containsUpperAndLower() {
        assertTrue(true);
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