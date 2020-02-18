package Public;

public class Modifier {
    // java 中提供了四种访问权限：
    //                              public     protected     default      private
    // 同一类中                       y           y             y             y
    // 同一包中中（子类与关类）         y           y             y
    // 不同包的子类                    y           y
    //  不同包的中的无关类              y

    // public 最大权限，private 最小权限；
    // 不加权限修饰符，默认使用default;
    // 编写代码时，没有特殊的考虑，建议这样使用权限：
        // 成员变量使用private，隐藏细节
        // 构造方法使用public, 方便创建对象
        // 成员方法使用public, 方便调用方法

}
