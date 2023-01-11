package com.hillel.lonzhnaksy.lesson15;

import com.hillel.lonzhansky.lessons.lesson15.ArrayUtil;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestArrayUtil {

    // if not found - return -1
    // if empty - return -2
    // if null - return -3

    static int[] array = null;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
        array = new int[]{1, 2, 3, 4, 5};
    }

    @BeforeEach
    public void beforeEach() {
        array = new int[]{1, 2, 3, 4, (int) (Math.random() * 11)};
    }

    @Test
    public void test1() {
        assertEquals(2, ArrayUtil.getIndexElement(array, 3));
    }

    @Test
    public void test2() {
        assertEquals(-3, ArrayUtil.getIndexElement(null, 3));
    }

    @Test
    public void test3() {
        assertEquals(-2, ArrayUtil.getIndexElement(new int[0], 3));
    }

    @Test
    public void test4() {
        assertEquals(-1, ArrayUtil.getIndexElement(array, 43));
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after!!!!!!!!");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }
}
