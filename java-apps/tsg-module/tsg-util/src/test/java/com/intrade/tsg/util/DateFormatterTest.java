package com.intrade.tsg.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created: 09/11/13 17:29 by: horako
 */
public class DateFormatterTest {

    @Test
    public void testGetABC() {
        String abc = new DateFormatter().getABC();
        Assert.assertEquals("abc", abc);
    }
}
