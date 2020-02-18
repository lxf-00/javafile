package encpasulation;

public class Encapsulation {
    // 类的特征1： 封装（encapsulation), 将属性隐藏起来，提供公共方法对其进行访问
    // 封装步骤： 使用private关键字来修饰成员变量；对需要访问的成员变量，提供对应的getXXX方法、setXXX方法；

    // private关键字：权限修饰符，代表最小权限；
    // 可以修饰成员变量和成员方法；
    // 别private关键字修饰的成员变量或成员方法，只能在本类中才能访问。
    // 格式： private 数据类型 变量名;
    private String name;
    private int age;

    // this关键字--- 封装优化1
    // this 代表所在类当前对象的引用（地址值），即对象自己的引用
    // 格式： this.成员变量
    // 方法中只有一个变量名时，默认也是使用 this 修饰，可以省略不写。

    public void setName(String name){
        // name = xxx;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        // age = xxx;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    // 构造方法--- 封装优化2
    // 当一个对象被创建时，构造方法用来初始化该对象，给该对象成员变量赋初始值
    /*构造方法格式:
    修饰符  构造方法名(参数列表){
        // 方法体
    }*/
    // 写法：方法名与所在的类名一致，无返回值，无返回值类型，甚至可以不需void
    // 无参数构造方法
    public Encapsulation(){}
    // 有参数构造方法
    public Encapsulation(String name, int age){
        this.name = name;
        this.age = age;
    }
}
