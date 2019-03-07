package com.google;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {//junit类名不应该只叫Test

    @Test //每一次做测试的时候都需要加入Test注解
    public void test1(){//方法名任意指定返回值应该是void，且不能带参数
        User tom = new User(1,"tom");
        System.out.println(tom);
    }

    @Test
    public void test2(){
        User jack = new User(2,"jack");
        System.out.println(jack);
    }

}//直接在文件上点击右键执行，会一次执行这些带@Test的方法
//也可以在某个方法名上点击右键，只执行这个方法。