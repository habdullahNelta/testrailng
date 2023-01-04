package com.idera.testrail.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


class MultiplicationTest {

    @Test
    void MultiplyTwoNumbers() {
        Assert.assertEquals(4, 1*2, "Should equal 4");
    }
}
