package com.example.helloandroid.test;

import junit.framework.TestCase;
import com.example.helloandroid.*;

public class StringUtilsTest extends TestCase {
    public void testIsBlank() throws Exception {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank("  bob  "));
    }
}
