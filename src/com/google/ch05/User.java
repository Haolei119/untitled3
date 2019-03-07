package com.google.ch05;

public class User {
    private String name;
    private int age;
    public int id;

    public User() {
    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void foo(){

    }


    private void goo(int i, double d){
          System.out.println("what is name?");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
