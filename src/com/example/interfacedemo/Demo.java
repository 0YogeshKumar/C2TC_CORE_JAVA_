package com.example.interfacedemo;

public interface Demo {
    int x = 10;

    void m1();

    default void m3() {//interface allows only default concrete method

    }

    interface IONE{

    }

    void m2();
}