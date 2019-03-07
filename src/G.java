
class MyException extends Throwable{//自定义异常
    public MyException(String s){
        super("余额不足");
    }

}
public class G {
    void s()  {
        throw new IndexOutOfBoundsException();//异常声明
        //RuntimeException及其子类没有必要被声明或捕获
    }

    public static void main(String[] args){ //throws MyException
        try {
            if(args.length>0)
            throw new MyException("xxxx");////抛出异常
            //try中一旦发生异常 ，就会立刻停止之后的语句，转而执行catch字句
            System.out.println("hello");
            //return;
            System.exit(1);//程序立刻被终止
            //一旦程序发生异常就不再继续执行了
        } catch (MyException e) {
            //catch参数捕获的异常类型必须是抛出异常本身或其父类
            e.printStackTrace();
            System.out.println("hello");
        } catch (Throwable e){
            //catch可以有多个，但是最下面的应该是类型最宽泛的
            System.out.println("catch...");
        } finally {
            //无论是否产生异常，finally里面的内容必须执行
            System.out.println("finally");
        }

    }




}