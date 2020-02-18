package InterfaceImplements;

public interface InterfaceKeyWord {
    // 接口 java语言中的一种引用类型，是方法的合集
    // 接口内部主要封装了方法，包含抽象方法（jdk7) 默认方法和静态方法（jdk8),私有方法（jdk9)
    // 定义： 与定义类的方式一样，但是使用interface关键字修饰，也回编译成。class文件，但不是类，而是一种引用数据类型
    // 使用： 不能创建对象，可以被实现（implements,类似于被继承），实现了接口的类可以看作是其子类；需要实现接口中所有抽象方法；
    // 格式：
        // public interface 接口名称（）{
        // 抽象方法
        // public abstract void method();
        // 默认方法: 可以继承，可以重写，只能通过实现类的对象来调用
        // public default void method(){ // 语句体}
        // 静态方法： 只能使用接口名调用
        // public static void method(){// 语句体}
        // 私有方法： 只有默认方法可以调用；私有静态方法（默认方法和静态方法都可以调用）
        // private void method(){// 语句体}
        // }
    // 基本的实现： 类与接口的关系为实现关系，即类实现接口，该类被称为接口的实现类
    // 实现使用implements 关键字

    // 非抽象子类实现接口：1, 必须重写接口中所有的抽象类； 2， 继承了接口的默认方法，可以直接使用，也可以重写；
    // 实现格式：
        //    class 类名 implements 接口名(){
        //        重写接口中所有抽象方法（必须）
        //        重写接口中的默认方法（可选）
        //    }

    // 定义抽象方法
    public abstract void eat();
    public abstract  void sleep();

    // 定义默认方法
    public default void method1(){
        System.out.println("我是接口中的默认方法1");
    }

    // 定义静态方法
    public static void method2(){
        System.out.println("我是接口类中的静态方法1");
    }

    // 定义私有方法
    private void method3(){
        System.out.println("我是接口类中的私有方法1");
    }

    // 使用私有方法
    public default void usePrivate(){
        method3();
    }

}
