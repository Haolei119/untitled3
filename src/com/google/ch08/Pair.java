package com.google.ch08;

import java.time.LocalDate;
import java.util.ArrayList;
//注解
@SuppressWarnings("ssg")
public class Pair<T> {
        private T first;
    private T second;

    public T getFirst() {
        return first;
    }
//
//    public void setFirst(T first) {
//        this.first = first;
//    }

//    public T getSecond() {
//        return second;
//    }

//    public void setSecond(T second) {
//        this.second = second;
// }

    public void setSecond(T newValue) {
//         second = newValue;
    }

    static class PairTeat {
        public static void main(String[] args) {
            class Employee {}
//        Pair<Employee> e = new Pair<>();
//        Employee emp = e.getFirst();


            Pair<String> a = new Pair();
            Pair<Integer> b = new Pair();

            if(a instanceof Pair){//error: instanceof Pair<String>
            }

            a = (Pair)b;//error: (Pair<Integer>)b;
            System.out.println(a.getClass()==b.getClass());

        }
    }
//class DateInterrval extends Pair<LocalDate>{
//    @Override
//    public void setSecond(LocalDate newValue) {
//        super.setSecond(newValue);
//    }
    }

