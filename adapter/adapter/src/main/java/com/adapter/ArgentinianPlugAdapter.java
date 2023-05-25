package com.adapter;

public class ArgentinianPlugAdapter implements Plugs {

    private Plugs plug;

    public ArgentinianPlugAdapter(Plugs plug) {
        this.plug = plug;
    }

    @Override
    public void connect() {
        plug.connect();
        System.out.println("Adaptador: conviertiendo enchfue en enchufe argentino");
    }

}
