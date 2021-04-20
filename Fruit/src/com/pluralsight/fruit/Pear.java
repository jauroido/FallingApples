package com.pluralsight.fruit;

public class Pear implements IFruit {
    @Override
    public String getName() {
        return "Pear";
    }

    @Override
    public int getRollMultiplier() {
        return 0;
    }
}
