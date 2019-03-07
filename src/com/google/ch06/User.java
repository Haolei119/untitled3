package com.google.ch06;
import java.util.Arrays;

//Comparable接口用于指定对象排序的方法
//对象如果需要排序，比较等操作，必须是实现接口
public class User implements Comparable<User>{
   private int id;
   private String name;

    public User(int id, String name){
       this.id = id;
       this.name = name;
   }

    @Override
    public int compareTo(User o) {
       //return负数表示当前对象比0小
       //return 0表示两个对象相等
       //return 正数表示当前对象比0大
       if(this.id > o.id) return 1;
       else if(this.id == o.id) return 0;
       else return -1;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}

class  Test{
    public static void main(String[] args) {
        User tom = new User(1,"Tom");
        User jerry = new User(3,"Jerry");
        User ben = new User(2,"Ben");

        User[] users = {tom,jerry,ben};
        Arrays.sort(users);

        Arrays.stream(users).forEach(System.out::println);

    }
}
