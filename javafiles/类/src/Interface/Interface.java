package Interface;

public interface Interface {
    // 接口的多实现
    // 对于接口来说，一个类可以实现多个接口
    // 实现格式：
    // class 类名[extends 父类名] implements 接口1，接口2，接口3.。。{
    //      重写接口中的抽象方法；(必须）
    //      重写接口的默认方法；（可选）
    // }

    // 优先级问题： 当一个类既继承父类，有实现若干接口，父类中的成员方法和接口中默认方法重名的，子类就近选择执行父类的成员方法

    // 接口中无法定义成员变量，但是可以定义常量，其值不可以改变，默认使用public static final 修饰
    // 接口没有构造方法，不能创建对象
    // 接口中，没有静态代码块

    public abstract void show();
    public abstract void show1();
}
