package com.google;

interface J{}
class c{}
class D extends c implements I,J{
    @Override
    public void f() {

    }
}
public interface I{
    private int  fun(){
        return 0;
    }

    public static final int i = 1;
    public abstract void f();
    public static void g(){
        //fun();一个静态方法不能调用一个非静态方法
    }

    public default void h(){
        fun();
    }
}
