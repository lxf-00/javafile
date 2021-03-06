package Abstract;

public abstract class AbstractClass {
    // 抽象类： 父类中方法被子类重写，子类各自的实现都不尽相同；那么父类中的方法声明和方法主体；只有声明还有意义
    // 我们把没有方法主体的的方法成为抽象方法， Java 语法规定： 包含抽象方法的类为抽象类
    // 定义： 抽象方法（没有方法主体的方法）； 抽象类（包含抽象方法的类）
    // 使用格式： abstract 关键字修饰的方法为抽象方法（只含一个方法名，没有方法体）
    // 修饰符 abstract 返回值类型 方法名(参数列表）;
    // 修饰符 abstract class 类名{}
    // 抽象的使用：
    // 继承抽象类的子类必须重写父类中的所有的抽象方法，否则该子类也必须声明为抽象类；

    public abstract void run();

    // 抽象类的注意事项
    // (1), 抽象类不能创建对象，如果创建，编译无法通过，只创建非抽象子类对象
    // (2), 抽象类中可以有构造方法，是供子类创建对象时，初始化父类成员使用
    // (3), 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类
    // (4), 抽象类的子类必须重写父类中的所有方法，否则编译无法通过，除非该子类也是抽象类
}
