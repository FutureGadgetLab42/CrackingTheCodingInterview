package chapter_1.is_unique;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsUniqueTest {

    IsUnique isUnique = new IsUnique();

    @Test
    public void test1(){
        assertTrue(isUnique.isUnique("abc"));
    }

    @Test
    public void test2(){
        assertFalse(isUnique.isUnique("aabc"));
    }

    @Test
    public void test3(){
        assertTrue(isUnique.isUnique(""));
    }

    @Test
    public void test4(){
        assertFalse(isUnique.isUnique("abca"));
    }

    @Test
    public void test5(){
        assertFalse(isUnique.isUnique("dlfnlskadjfalkdj"));
    }
}
