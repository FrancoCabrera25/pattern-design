package com.facade;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MicrowaweFacade microwawe = new MicrowaweFacadeImpl();

        microwawe.defrost();
        microwawe.warm();
        microwawe.heat();
    }
}
