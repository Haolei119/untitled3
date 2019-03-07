package com.google.ch08;

import java.util.ArrayList;

//public class Node<T,E> {//泛型类
//    private T data;
//    public E num;
//    private String name;
//
//
//    public static <A> A f(){//泛型方法
//        A a = null;
//        return a;
//    }
//}

class ArrayAlg{
    public static <T> T getMiddle(T...a){
        return a[a.length/2];
    }

    public static <T extends Comparable> T min(T[]a){
        if(a==null||a.length==0)return null;
        T smallest = a[0];
        for(int i = 1; i<a.length;i++)
            if(smallest.compareTo(a[i])>0) smallest=a[i];
            return smallest;
    }
}

class Test1{
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//
//        int i = list.get(0);
//
//        Node<Integer,Double> node = new Node<>();
//        Node<String,String> node1 = new Node<>();

//        Node.<String>f();
//        int i=ArrayAlg.<Integer>getMiddle(1,4,6,8,3);
//        System.out.println(i);
//        String s=ArrayAlg.<String>getMiddle("gg","ffd","gsdh","ggr");
//        System.out.println(s);

        ArrayAlg.<String>min(new String[]{"dd","f"});
        class User implements Comparable<User>{

            @Override
            public int compareTo(User o) {
                return 0;
            }
        }
        ArrayAlg.<User>min(new User[]{});
    }

}
