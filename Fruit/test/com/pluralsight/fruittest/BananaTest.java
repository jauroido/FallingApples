package com.pluralsight.fruittest;

import com.pluralsight.fruit.Banana;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BananaTest {

    private Banana banana;

    @Before
    public void setUp() {
        banana = new Banana();
    }

    @Test
    public void getName() {
        Assert.assertEquals("Banana", banana.getName());
    }

    @Test
    public void getRollMultiplier() {
        Assert.assertEquals(0, banana.getRollMultiplier());
    }
}