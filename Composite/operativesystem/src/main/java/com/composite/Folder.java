package com.composite;

import java.lang.invoke.VarHandle.VarHandleDesc;
import java.util.ArrayList;
import java.util.List;

public class Folder implements ComponentFileSystem {

    private String name;
    private List<ComponentFileSystem> components;

    public Folder(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (ComponentFileSystem component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    @Override
    public void print() {
        System.out.println("Carpeta: " + name + ", Tamaño: " + getSize() + " KB");
        for (ComponentFileSystem componente : components) {
            componente.print();
        }
    }

    @Override
    public void add(ComponentFileSystem component) {
        components.add(component);
    }

    @Override
    public void remove(ComponentFileSystem component) {
        component.remove(component);
    }

}
