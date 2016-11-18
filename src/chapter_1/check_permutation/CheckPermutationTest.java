package chapter_1.check_permutation;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckPermutationTest {

    CheckPermutation checkPermutation = new CheckPermutation();

    @Test
    public void test1() {
        assertTrue(checkPermutation.checkPermutation("abc", "cab"));
    }

    @Test
    public void test2() {
        assertFalse(checkPermutation.checkPermutation("aabc", "cab"));
    }

    @Test
    public void test3() {
        assertTrue(checkPermutation.checkPermutation("", ""));
    }

    @Test
    public void test4() {
        assertFalse(checkPermutation.checkPermutation("adsflks", "sdkjfnsdjkf"));
    }
}
