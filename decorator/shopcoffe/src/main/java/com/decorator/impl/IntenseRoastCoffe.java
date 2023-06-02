package com.decorator.impl;

import com.decorator.interfaces.Coffe;

public class IntenseRoastCoffe implements Coffe {

    @Override
    public double CalcularPrice() {
        return 350;
    }

}
