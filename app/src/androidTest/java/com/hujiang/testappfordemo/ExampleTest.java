package com.hujiang.testappfordemo;

import android.test.InstrumentationTestCase;

/**
 * Function:
 * Create date on 15/7/1.
 *
 * @author Conquer
 * @version 1.0
 */
public class ExampleTest extends InstrumentationTestCase {

    public void test() throws Exception {
        final int expected = 1;
        final int reality = 5;
        assertEquals(expected, reality);
    }

}
