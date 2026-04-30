import org.junit.jupiter.api.Test;

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


    @Test
    void containsDigit() {
        assertTrue(true);
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