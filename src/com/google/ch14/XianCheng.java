package com.google.ch14;

import java.util.*;

public class XianCheng {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> syncList = Collections.synchronizedList(list);//集合

        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> syncｍap = Collections.synchronizedMap(map);//映射
    }
}
