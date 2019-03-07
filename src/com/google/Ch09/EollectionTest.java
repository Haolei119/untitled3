package com.google.Ch09;


import java.util.*;

public class EollectionTest {
    public static void main(String[] args) {
        //ArrayList<String> list= new ArrayList<>();
//        Collection<String> list= new ArrayList<>();//集合遵循结构，Collection是最大的父类
//        list.add("abc");
//        list.add("def");
//
//        //System.out.println(list.get(0));
//
//
//        Iterator<String> it = list.iterator();
//        //取到一个集合上的迭代器，迭代器用于遍历（循环）集合
//        while(it.hasNext())//看看有没有下一个hasNext,跨越一个元素，能跨过去就返回true，否则返回false
//            System.out.println(it.next());//刚刚跨过去的元素被取出
//        //forEach循环在后台实际上就是用迭代器完成的
//

        //Arrays是操纵数组的一些工具（方法）的集合
        //Array是数组的反射类

        //Collection是所有集合的父接口
        //Collections是操纵集合的一些工具（方法）的集合

        //Collection接口下面的三大接口:
        //1.List接口：允许重复元素，元素之间有顺序
        //  1.1实现类LinkedList:在开头和结尾插入和删除元素较快，查询比较慢
        //  1.2实现类ArrayList:查询较快，但是插入和删除较慢
        //
        //2.Set接口：不允许重复元素，元素之间无顺序
        //  2.1实现类HashSet：速度快，元素之间完全无顺序
        //  2.2实现类TreeSet：速度叫HashSet慢，但是元素之间是排序的
        //  2.3实现类LinkedHashSet:速度快，元素之间按照插入的顺序有序
        //
        //3.Queue：一种特殊的先进先出的结构
        //  3.1双端队列
        //  3.2优先级队列
        //
        //4.stack:一种特殊的后进先出（掉井）


       ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("abc");
       arraylist.add("def");
        arraylist.add("abc");
       arraylist.get(0);
       arraylist.forEach(System.out::println);
       System.out.println(arraylist.get(2));
//
//
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("abc");//在最后一个位置插入
//        linkedList.addFirst("aaa");//在第一个位置插入
//        linkedList.addLast("zzz");//在最后一个位置插入
//        linkedList.forEach(System.out::println);
//        linkedList.removeFirst();//删除第一个元素
//        linkedList.removeLast();//删除最后一个元素
//        linkedList.remove();//删除第一个元素
//        linkedList.forEach(System.out::println);


        Set<Integer> set = new HashSet<>();//不允许有重复元素，元素之间完全无顺序
        set.add(2);set.add(1);set.add(3);set.add(9);
        set.add(2);set.add(2);set.add(7);set.add(6);
        set.forEach(System.out::println);


        System.out.println("--------------------------------------------------------------");

        Set<Integer> set1 = new TreeSet<>();//不允许有重复元素，元素之间是排序的
        set1.add(2);set1.add(1);set1.add(1);set1.add(9);
        set1.add(1);set1.add(2);set1.add(6);set1.add(7);
        set1.forEach(System.out::println);


        System.out.println("--------------------------------------------------------------");

        Queue<Integer> queue = new PriorityQueue<>();//优先级队列，谁小谁优先
        //new ArrayDeque<>();//双端队列

        queue.offer(5);//元素放入队列（入队列）
        queue.offer(4);
        queue.offer(4);
        queue.offer(3);

        queue.forEach(System.out::println);

        System.out.println(queue.peek());//查看队列的第一个元素（不取出）
        System.out.println(queue.poll());//取出队列的第一个元素（出队列）

        Iterator<Integer> it = queue.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        //for (Integer q : queue)
        //    System.out.println(q);
        //queue.forEach(System.out::println);//forEach 中的lamda表达式是并发运行的，不一定按照顺序打出来


//        System.out.println("--------------------------------------------------------------");
//
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(3);//将元素压入堆栈（入栈）
//        stack.push(5);
//        stack.push(4);
//        System.out.println(stack.peek());//查看堆栈的第一个元素（不取出）
//        System.out.println(stack.pop());//将栈顶元素弹出堆栈（出栈）
//
//        stack.forEach(System.out::println);


    }
}

