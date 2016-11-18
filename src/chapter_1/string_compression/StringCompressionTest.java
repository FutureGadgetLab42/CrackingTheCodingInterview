package chapter_1.string_compression;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCompressionTest {

    StringCompression stringCompression = new StringCompression();

    @Test
    public void test1() {
        assertEquals("a2b1c5a3", stringCompression.stringCompression("aabcccccaaa"));
    }

    @Test
    public void test2() {
        assertEquals("a1b1c1", stringCompression.stringCompression("abc"));
    }

    @Test
    public void test3() {
        assertEquals("", stringCompression.stringCompression(""));
    }

    @Test
    public void test4() {
        assertEquals("a5", stringCompression.stringCompression("aaaaa"));
    }

    @Test
    public void test5() {
        assertEquals("a1", stringCompression.stringCompression("a"));
    }
}
