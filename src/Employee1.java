public class Employee1 {

    private String name;
    private double salary = 1000;
    public static double pi = 3.14;
    private int age;
//    private double salary1 = salary;
//
//    public Employee1() {//默认构造器，无参数构造器。
//        //默认构造器：当不写任何构造器时，机器就默认生成一个默认构造器
//        //如果写了任何一个构造器。机器就不再生成默认构造器
//        //最好手动添加无参数构造器，不要依赖机器生成
//    }
//
//    {
//        name = "Tom";
//        salary = 2.1;
//    }

//    public Employee1() {
//        name = "ben";
//        salary = 3.3;
//    }
//    //成员变量和初始化块按照他们在类中定义的顺序依次执行，一定是最后执行构造器
//
//     static {
//        System.out.println("static1");//static静态初始化块优于所有非静态satic执行
//     }
//
//     static{
//        System.out.println("static2");//静态static块之间按顺序执行
//     }
//
//    public static void main(String[] args) {
//        Employee1 employee = new Employee1();
//        System.out.println(employee.name);
//        System.out.println(employee.salary);
//    }

    @Override
    public String toString() {
        return "name:    " + name + "\ngongzi:  " +salary +"\nnianling:"+age;
    }

    int fun(int i) {
        return 0;
    }


      void Employee(){//写得不好的方法，首字母应该小写
          //这不是构造器，构造器没有返回值
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0)
            this.salary = 0;
        else
        this.salary = salary;
    }

//    public static void main(String[] args) {
//        Employee1 tom = new Employee1();
//        Employee1 jerry =new Employee1();
//        jerry.fun(2);
//        jerry.Employee();
//        System.out.println(jerry);//直接打印一个对象时，默认是调用toString
//        //系统默认的toString是打印“类名@哈希玛“

    public Employee1(String name,double salary) {
        this.name = name;//this后面一定是类中的属性或方法
        this.salary = salary;
        // 方法中的变量会遮蔽类中的变量，如果要使用类中的变量，需要加上this.
//        age = 2;
//        this.age=1;
//    }
    }

}
