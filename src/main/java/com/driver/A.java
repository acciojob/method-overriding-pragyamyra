package com.driver;

public class A {

     String meth(){
        return  "Invoking method from class A";
    }
}

class B extends A{

    String meth(){
        //super();
        return "Method is overridden in Extended class B";
    }
}
