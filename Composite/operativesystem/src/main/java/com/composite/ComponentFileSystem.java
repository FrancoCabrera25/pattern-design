package com.composite;

public interface ComponentFileSystem {
    String getName();

    int getSize();

    void print();

    void add(ComponentFileSystem component);

    void remove(ComponentFileSystem component);
}
