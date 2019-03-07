package com.google.ch06;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class DateSort implements Comparator<LocalDate> {

    @Override
    public int compare(LocalDate o1, LocalDate o2) {
        if (o1.getDayOfMonth() > o2.getDayOfMonth()) return 1;
        else if (o1.getDayOfMonth() == o2.getDayOfMonth()) return 0;
        else return -1;
    }
}



 class Test2{
    public static void main(String[] args) {
        LocalDate k1 = LocalDate.of(1995,2,7);
        LocalDate k2 = LocalDate.of(2001,2,3);
        LocalDate k3 = LocalDate.of(2006,1,7);
        LocalDate k4 = LocalDate.of(1991,11,19);

        LocalDate[] dates = {k1,k2,k3,k4};
        Arrays.sort( dates,new DateSort());
        Arrays.stream(dates).forEach(System.out::println);

    }
}



