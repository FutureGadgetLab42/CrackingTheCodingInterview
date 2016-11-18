package chapter_1.one_away;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OneAwayTest {

    OneAway oneAway = new OneAway();

    @Test
    public void test1() {
        assertTrue(oneAway.oneAway("pale", "ple"));
    }

    @Test
    public void test2() {
        assertTrue(oneAway.oneAway("pales", "pale"));
    }

    @Test
    public void test3() {
        assertTrue(oneAway.oneAway("pale", "bale"));
    }

    @Test
    public void test4() {
        assertFalse(oneAway.oneAway("pale", "bake"));
    }

    @Test
    public void test5() {
        assertTrue(oneAway.oneAway("", "a"));
    }

    @Test
    public void test6() {
        assertFalse(oneAway.oneAway("this doesnt work", "1234 5678nt work"));
    }

    @Test
    public void test7() {
        assertFalse(oneAway.oneAway("godel my dude", "godel my dup"));
    }
}
