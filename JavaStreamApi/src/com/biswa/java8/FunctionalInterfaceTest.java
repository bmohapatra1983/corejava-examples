package com.biswa.java8;

interface MyFunctionalInterface {
    void show();
    static void display() {
      System.out.println("Display World!");
    }
    default void hi(){
        System.out.println("hi");
    }
}

public class FunctionalInterfaceTest implements MyFunctionalInterface {
    @Override
    public void show() {
        System.out.println( "Hello World!");
    }
    public void display() {
        System.out.println("Display World12345!");
    }
    // main method
    public static void main(String[] args) {
        FunctionalInterfaceTest obj = new FunctionalInterfaceTest();
        obj.show();
        obj.display();
        MyFunctionalInterface.display();
        obj.hi();
    }
}
