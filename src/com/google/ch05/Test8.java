package com.google.ch05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test8 {

    public static <structor> void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Class cl = User.class;
//       Method[] methods = cl.getMethods();
//        //拿到当前类和父类中public的方法
//
//        for(int i = 0; i<methods.length; i++)
//             System.out.println(methods[i]);
//
//        System.out.println("-------------------------------");
//
//        methods = cl.getDeclaredMethods();
//        //拿到当前类中的public和private的方法
//        for(Method method : methods)
//            System.out.println(method);

        User user = new User();

        Method goo
                =cl.getDeclaredMethod("goo",int.class, double.class);
        goo.setAccessible(true);
        goo.invoke(user,1,3.14);//可变参数列表
        //调私有的方法

        Method foo = cl.getMethod("foo");
        foo.invoke(user);//调公有的方法
    }
}
