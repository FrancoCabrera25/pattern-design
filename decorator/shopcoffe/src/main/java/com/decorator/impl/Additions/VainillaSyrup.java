package com.decorator.impl.Additions;

import com.decorator.interfaces.Coffe;

public class VainillaSyrup extends AdditionsDecorator {

    public VainillaSyrup(Coffe coffe) {
        super(coffe);
    }

    @Override
    public double CalcularPrice() {
        return super.CalcularPrice() + 200;
    }

}
