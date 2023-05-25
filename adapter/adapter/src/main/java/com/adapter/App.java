package com.adapter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Plugs plugArgentinian = new ArgentinianPlug();
        plugArgentinian.connect();

        Plugs plugAmerican = new AmericanPlug();
        Plugs plugAdapter = new ArgentinianPlugAdapter(plugAmerican);
        plugAdapter.connect();
    }
}
