package com.google.ch05;

enum Gendar{
    F(0),M(1)
    ;
    int gendar;
    Gendar(int gendar){
        this.gendar = gendar;
    }
}
public enum Size {
    S("small"),M,L,XL,XXL;
    private int i = 1;
    private String size;
    public void f(){}
    Size(){}
    Size(String s) {
        this.size = s;
    }
}
