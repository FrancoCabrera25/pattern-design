package com.decorator.impl;

import com.decorator.interfaces.Coffe;

public class LightRoastCoffe implements Coffe {

    @Override
    public double CalcularPrice() {
        return 250;
    }
}