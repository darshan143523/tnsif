package com.tnsif.dayseven;

class A {
    int i;

    void disp() {
        System.out.println("Value of i in class A: " + i);
    }
}

class B extends A {
    int j;

    void disp() {
        super.disp();  // Calling the disp() method of the superclass (A)
        System.out.println("Value of j in class B: " + j);
    }
}

public class FinalVariable {

    public static void main(String[] args) {
        B obj = new B();
        obj.i = 1;
        obj.j = 2;
        obj.disp();
    }
}
