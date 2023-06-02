package com.decorator.impl.Additions;

import com.decorator.interfaces.Coffe;

public class WhippedCream  extends AdditionsDecorator{

    public WhippedCream(Coffe coffe){
        super(coffe);
    }
    
    @Override
    public double CalcularPrice() {
        return super.CalcularPrice() + 100;
    }
    
}
