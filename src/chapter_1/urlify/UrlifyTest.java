package chapter_1.urlify;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UrlifyTest {

    Urlify urlify = new Urlify();

    @Test
    public void test1() {
        assertEquals("hello%20world", urlify.urlify("hello world"));
    }

    @Test
    public void test2() {
        assertEquals("%20hello%20%20world%20", urlify.urlify(" hello  world "));
    }

    @Test
    public void test3() {
        assertEquals("helloworld", urlify.urlify("helloworld"));
    }

    @Test
    public void test4() {
        assertEquals("", urlify.urlify(""));
    }

    @Test
    public void test5() {
        assertEquals("%20%20%20", urlify.urlify("   "));
    }
}
