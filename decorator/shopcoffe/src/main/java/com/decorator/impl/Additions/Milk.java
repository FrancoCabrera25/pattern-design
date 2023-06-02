package com.decorator.impl.Additions;

import com.decorator.interfaces.Coffe;

public class Milk extends AdditionsDecorator {

    public Milk(Coffe coffe) {
        super(coffe);
    }

    @Override
    public double CalcularPrice() {
        return super.CalcularPrice() + 50;
    }

}
