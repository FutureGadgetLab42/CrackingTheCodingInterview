package chapter_1.palindrome_permutation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromePermutationTest {

    PalindromePermutation palindromePermutation = new PalindromePermutation();

    @Test
    public void test1() {
        assertTrue(palindromePermutation.palindromePermutation("aabaa"));
    }

    @Test
    public void test2() {
        assertTrue(palindromePermutation.palindromePermutation("baaaa"));
    }

    @Test
    public void test3() {
        assertTrue(palindromePermutation.palindromePermutation("aaaa"));
    }

    @Test
    public void test4() {
        assertTrue(palindromePermutation.palindromePermutation("aab"));
    }

    @Test
    public void test5() {
        assertTrue(palindromePermutation.palindromePermutation("a"));
    }

    @Test
    public void test6() {
        assertTrue(palindromePermutation.palindromePermutation(""));
    }

    @Test
    public void test7() {
        assertTrue(palindromePermutation.palindromePermutation("abab"));
    }

    @Test
    public void test8() {
        assertFalse(palindromePermutation.palindromePermutation("aaab"));
    }

    @Test
    public void test9() {
        assertFalse(palindromePermutation.palindromePermutation("aabc"));
    }

    @Test
    public void test10() {
        assertFalse(palindromePermutation.palindromePermutation("abc"));
    }
}
