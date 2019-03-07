package com.google.Ch09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        c.add(1);c.add(9);c.add(3);c.add(7);
        Iterator<Integer> it = c.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        

    }
}
