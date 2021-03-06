package com.epam.brest.model.selector;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class PriceSelectorTest {

    Map<Integer, BigDecimal> values = Map.of(
            1, new BigDecimal(100),
            2, new BigDecimal(200),
            3, new BigDecimal(300));

    PriceSelector priceSelector = new PriceSelector();

    @Test
    public void selectPriceMediumValue() {

        BigDecimal result = priceSelector.selectPriceValue(values, new BigDecimal(2));
        assertTrue("Result value is incorrect", result.equals(new BigDecimal(200)));
    }

    @Test
    public void selectPriceZeroValue() {

        BigDecimal result = priceSelector.selectPriceValue(values, new BigDecimal(0));
        assertTrue("Result value is incorrect", result.equals(new BigDecimal(100)));
    }

    @Test
    public void selectPriceMaxValue() {

        BigDecimal result = priceSelector.selectPriceValue(values, new BigDecimal(4));
        assertTrue("Result value is incorrect", result.equals(new BigDecimal(300)));
    }

    @Test
    public void selectPriceIncorrectValue() {

        BigDecimal result = priceSelector.selectPriceValue(values, new BigDecimal(-1));
        assertTrue("Result value is incorrect", result.equals(new BigDecimal(100)));
    }
}