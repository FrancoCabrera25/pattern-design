package com.composite;

public class File implements ComponentFileSystem {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    @Override
    public int getSize() {

    return size;
    }

    @Override
    public void print() {
        System.out.println("File: " + this.name + ", Tamaño: " + this.size + " KB");
    }

    @Override
    public void add(ComponentFileSystem component) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void remove(ComponentFileSystem component) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

}
