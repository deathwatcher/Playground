package org.enafynn.playgorund.util.validation;

import org.enafynn.playgorund.util.validation.result.ValidationResult;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Optional;

public class StringValidationTest {

    @Test
    public void routingIsNotEmptyTest() {
        ValidationResult result = null;

        Assert.assertTrue(result.isValid());
    }

    @Test
    public void routingIsEmptyTest() {


        ValidationResult result = null;

        Assert.assertFalse(result.isValid());
        Optional<String> opReason = result.getReason();

        Assert.assertNotNull(opReason);
        Assert.assertEquals(opReason.get(), "Routing is empty!");
    }


}
