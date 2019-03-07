package com.google.ch05;

import java.lang.reflect.*;

public class Test7 {

    public static <structor> void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class cl = User.class;
//        Constructor[] constructors = cl.getConstructors();
//        //拿到当前类和父类中public的方法
//
//        for(int i = 0; i<constructors.length; i++)
//             System.out.println(constructors[i]);
//
//        System.out.println("-------------------------------");
//
//        constructors = cl.getDeclaredConstructors();
//        //拿到当前类中的public和private的方法
//        for(Constructor constructor : constructors)
//            System.out.println(constructor);


        Constructor constructorNoArgs = cl.getConstructor();
        User user = (User)constructorNoArgs.newInstance();
        System.out.println(user);//拿无参数构造器

        Constructor constructor1 =
                cl.getConstructor(String.class, int.class, int.class);
        user = (User)constructor1.newInstance("Tom", 1, 1);
        System.out.println(user);//拿有参数构造器 

    }
}
