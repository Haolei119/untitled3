package com.google.ch05;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Date;

public class Test6 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class cl = User.class;
//        Field[] fields = cl.getFields();
//        //System.out.println(Arrays.toString(fields));
//        for(int i = 0; i<fields.length; i++)
//             System.out.println(fields[i]);
//
//        System.out.println("-------------------------------");
//
//        fields = cl.getDeclaredFields();
//        for(Field field : fields)o
//            System.out.println(field);
//

        User  tom = new User();
        User jerry = new User();

        Field id = cl.getField("id");
        id.set(tom,1);
        id.set(jerry,2);

        Field name = cl.getDeclaredField("name");
        name.setAccessible(true);
        name.set(tom,"Tom");
        name.set(jerry,"Jerry");

        System.out.println(tom + "\n"+jerry);
    }

}
