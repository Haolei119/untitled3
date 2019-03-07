package com.google.Ch09;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;



//Hash 哈希，散列
//相同元素的哈希码一定是相同的。
//Set要求元素不能重复，如何判断元素重复？
//对一个要插入的元素计算哈希码，如果已存在则认为相同
//不同元素的哈希码绝大多数情况下都是不同的，但是也有可能相同
//一旦不同元素的哈希码相同了，则叫做散列冲突
//现代的数学算法可以将散列冲突降到最低，但是无法完全消除

class A {
    private int i;
    A(int i){
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}


public class HashSetTest {

    public static void main(String[] args) {

        Set<A> set = new HashSet<>(33);
        //set集合的初始化大小是0
        //如果指定了初始化大小，那么实际大小是初始化大小的最接近的比他大的2的次方
        //如果指定的初始化大小不够了，那么set必须扩容
        //扩容后的大小是原来大小的1.5倍大，新= 旧+旧>>1
        //什么时候算不够了？当元素实际个数超过75%，就开始扩容，这个75%称为负载因子（装填因子）

        set.add(new A(1));
        set.add(new A(2));
        set.add(new A(3));

        set.forEach(System.out::println);



    }
}





