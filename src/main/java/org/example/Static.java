package org.example;

public class Static {

    void m()
    {
        System.out.println("Abhiek sahoo");
    }
    static {
        System.out.println("hello");
    }


    public static void main(String[] args) {
        Static obj =new Static();
        obj.m();

    }
}