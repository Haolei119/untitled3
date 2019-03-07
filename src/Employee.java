import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireday;

    {
        //初始化块，类似于复合语句
        name = "tom";
    }

    static {
        //静态初始化块
    }

    //get开头的叫方法叫做 访问器
    public String getName() {
        return name;
    }

    //set开头的方法叫做设置器
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }

    public void setHireday(LocalDate hireday) {
        this.hireday = hireday;
    }

    //带参数构造器
    public Employee(String name, double salary, LocalDate hireday) {
        this.name = name;
        this.salary = salary;
        this.hireday = hireday;
    }

    public Employee() {//无参数构造器（构造方法 构造函数）
    }
}
