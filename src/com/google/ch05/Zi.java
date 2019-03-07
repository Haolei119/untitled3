package com.google.ch05;

public class Zi extends Fu{
    private String z;
    public void goo(int i, double d){

    }

    //建议： 子类构造器的参数要想办法给父类中的属性一个值。
    public Zi() {
        super();//子类构造器中如果没有用this（）来调用本类的其余构造器
        //就会自动被加入super();这句话的意思是调用父类无参数构造器
        //super()必须出现在构造器的第一行
        System.out.println("zi:"+z);
    }

    public Zi(String z, String f ) {
        super(f);//调用父类一个带String参数的构造器
        this.z = z;
        System.out.println("Zi:"+z);
    }

    @Override
    public String toString() {
        return "Zi{" +
                "z='" + z + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fu f = new Fu();
        f = new Zi();

        System.out.println(f);


    }
}
