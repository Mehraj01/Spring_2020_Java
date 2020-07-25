package day50_Polymorphism;

public class Inheritance {

    public int publicInt=100;
    protected int protectedInt=200;
    int defaultInt=300;
    private int privateInt=400;


}

class Data extends Inheritance{

    // Because it is in the same package there 3 variable are inherited. ==> protected, public, default
    // If subclass was in different package then only public and protected would be inherited

    public static void main(String[] args) {
        Data obj=new Data();
        System.out.println(obj.publicInt);
       // System.out.println(obj.privateInt);// private is not inherited
        System.out.println(obj.protectedInt);
        System.out.println(obj.defaultInt);// if it was in different package it would be inherited
    }


}
