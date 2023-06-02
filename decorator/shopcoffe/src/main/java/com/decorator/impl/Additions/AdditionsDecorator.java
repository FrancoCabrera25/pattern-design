package com.decorator.impl.Additions;

import com.decorator.interfaces.Coffe;

public abstract class AdditionsDecorator implements Coffe {

    private Coffe coffe;

    public AdditionsDecorator(Coffe coffe) {
        this.coffe = coffe;
    }

    @Override
    public double CalcularPrice() {
        return this.coffe.CalcularPrice();
    }
}
