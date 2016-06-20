package com.subra.java8;
import java.util.ArrayList;
import java.util.function.Consumer;

public class LambaExample {

    public static void main(String[] args) {

        Consumer<String> con = x->System.out.println(x);
        con.accept("My first lamba");
        
        ArrayList<String> arrays = new ArrayList<String>();
        arrays.add("Sudhi");
        arrays.add("Subbu");
        arrays.add("Maachu");
        
        arrays.forEach(con);
        
        ArrayList<MyClass> customArray = new ArrayList<MyClass>();
        customArray.add(new MyClass(10));
        customArray.add(new MyClass(20));
        customArray.add(new MyClass(30));
        
        
        Consumer<MyClass> con2 = x->System.out.println(x);
        customArray.forEach(con2);

    }

}
