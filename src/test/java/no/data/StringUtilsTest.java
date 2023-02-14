package no.data;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void isSubstringOfAlphabet() {
        assertTrue(StringUtils.isSubstringOfAlphabet("abc"));
    }

    @Test
    public void isNotSubstringOfAlphabet() {
        assertFalse(StringUtils.isSubstringOfAlphabet("bce"));
    }
}