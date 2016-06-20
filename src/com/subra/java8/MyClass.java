package com.subra.java8;

public class MyClass {

    Integer a;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "MyClass [a=" + a + "]";
    }

    public MyClass(Integer a) {
        super();
        this.a = a;
    }
    
}
