package com.google;

public class User {

    private int id;
    private String name;

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}

