package com.google.Ch09;

import java.util.*;

public class MapSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);list.add(14);list.add(6);
        list.add(1);

        Map<String,Integer> map = new HashMap<>();//所谓set就是用map做出来的
        //TreeMap是按照key有序来排序的
        //LinkedHashMap是按照插入顺序有序的
        //HashMap是无序的
        map.put("Jerry",6);
        map.put("Tom",5);
        map.put("Ben",7);
        map.put("Tom",10);
        System.out.println(map.get("Jerry"));
        System.out.println(map.get("Tom"));
        //Map的key键是不允许重复元素的，值是最后一次放入的键所对应的
        //Map的key虽然不允许重复，但值确实允许重复的
        //Set中的元素也是不允许重复的

        Set<String> keys = map.keySet();
        //key.add("ffff"); 会抛异常
        //keySet方法的作用是将map映射中所有的键取出来组成一个Set
        //但这个set并不是java.util.Set,而是class keySet
        //keySet实际上实现了Set接口，但是其中大部分方法都是抛异常

        Set<String> keys1 = new HashSet<>(keys);
        //for (String key : keys)
        //   keys1.add(key);
         keys1.add("sss");
        //将一个List集合中的重复元素去掉。
               //《面试题》
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);list1.add(1);list1.add(1);
        Set<String> keys2 = new HashSet(list1);
        keys2.forEach(System.out::println);


        for(String key : map.keySet()){
            System.out.printf("%-5s: %-3d", key, map.get(key));
        }

        System.out.println();

        map.forEach((k, v)->System.out.printf("%-5s: %-3d",k,v));
    }
}
