package com.google.ch06;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class User1 implements Cloneable{
 //如果一个接口中没有任何方法，这个接口被认为是标记性接口
 //Cloneable表示这个类的对象是可以进行clone操作的
    private int id;
    private String name;
    private LocalDate birthday;

    @Override
    public Object clone() throws CloneNotSupportedException {
        User1 user1 = (User1)super.clone();

        LocalDate localDate = LocalDate.of(
                birthday.getYear(),
                birthday.getMonthValue(),
                birthday.getDayOfMonth()
        );
        user1.birthday = localDate;
        return user1;
    }


    public User1(int id, String name, LocalDate birthday){
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }


    public int getId() {
        return id;
    }


    public LocalDate getBirthday() {
        return birthday;
    }


    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


//Comparator接口用于指定对象排序的方法，但是又无法修改类源代码的情况，既不能用Comparable时
class UserOrder implements Comparator<User1>{
    @Override
    public int compare(User1 o1, User1 o2) {
        if(o1.getId() > o2.getId()) return 1;
        else if(o1.getId() > o2.getId()) return 0;
        else return -1;
    }
}



class  Test1{
    public static void main(String[] args) {
        User1 tom = new User1(1,"Tom",LocalDate.now());
        User1 jerry = new User1(3,"Jerry",LocalDate.now());
        User1 ben = new User1(2,"Ben",LocalDate.now());

        User1[] users1 = {tom,jerry,ben};
        Arrays.sort(users1,new UserOrder());

        Arrays.stream(users1).forEach(System.out::println);

    }
}