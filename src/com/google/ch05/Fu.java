package com.google.ch05;

public class Fu {
    private String f;
    public void foo(){
    }
    public Fu() {
        System.out.println("fu:"+f);
    }

    public  Fu(String f) {
        this.f = f;
        System.out.println("fu:"+f);
    }

    @Override
    public String toString() {
        return "Fu{" +
                "f='" + f + '\'' +
                '}';
    }



}
