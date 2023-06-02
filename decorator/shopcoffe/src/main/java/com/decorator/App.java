package com.decorator;

import com.decorator.impl.IntenseRoastCoffe;
import com.decorator.impl.LightRoastCoffe;
import com.decorator.impl.Additions.Milk;
import com.decorator.impl.Additions.VainillaSyrup;
import com.decorator.impl.Additions.WhippedCream;
import com.decorator.interfaces.Coffe;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Coffe cafeSuave = new LightRoastCoffe();
        Coffe cafeSuaveConCremaVainilla = new VainillaSyrup(new WhippedCream(cafeSuave));

        Coffe cafeIntenso = new IntenseRoastCoffe();
        Coffe cafeIntensoConCrema = new WhippedCream(cafeIntenso);
        Coffe cafeIntensoConCremaleche = new Milk(new WhippedCream(cafeIntenso));

        System.out.println("Precio: cafeSuave $" + cafeSuave.CalcularPrice());
        System.out.println("Precio: cafeSuaveConCremaVainilla $" + cafeSuaveConCremaVainilla.CalcularPrice());



        System.out.println("Precio: cafeIntenso $" + cafeIntenso.CalcularPrice());

        System.out.println(" precio cafeIntensoConCrema: $" + cafeIntensoConCrema.CalcularPrice());
        System.out.println(" precio cafeIntensoConCremaleche: $" + cafeIntensoConCremaleche.CalcularPrice());
    }
}
