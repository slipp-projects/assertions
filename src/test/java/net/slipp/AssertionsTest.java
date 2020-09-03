package net.slipp;

import org.junit.Test;

public class AssertionsTest {

    @Test(expected = IllegalArgumentException.class)
    public void assertArgumentEquals() {
        Assertions.assertArgumentEquals("name", "name1", "not equal");
    }

    @Test
    public void assertArgumentFalse() {
    }

    @Test
    public void assertArgumentLength() {
    }

    @Test
    public void testAssertArgumentLength() {
    }

    @Test
    public void assertArgumentNotEmpty() {
    }

    @Test
    public void assertArgumentNotEquals() {
    }

    @Test
    public void assertArgumentNotNull() {
    }

    @Test
    public void assertArgumentRange() {
    }

    @Test
    public void testAssertArgumentRange() {
    }

    @Test
    public void testAssertArgumentRange1() {
    }

    @Test
    public void testAssertArgumentRange2() {
    }

    @Test
    public void assertArgumentTrue() {
    }

    @Test
    public void assertStateFalse() {
    }

    @Test
    public void assertStateTrue() {
    }
}
