public class FunctionReference {
    /*
    方法引用：
        1， 冗余的Lambda场景
        2，用方法引用改进代码
        3, 双冒号 :: 写法，这被称为“方法引用”，而双冒号是一种新的语法。

    方法引用符: 双冒号 :: 为引用运算符，而它所在的表达式被称为方法引用。如果Lambda要表达的函数方案已经存在于某个方法的实现中，那么则可以通过双冒号来引用该方法作为Lambda的替代者

    推导与省略:
        如果使用Lambda，那么根据“可推导就是可省略”的原则，无需指定参数类型，也无需指定的重载形式——它们都将被自动推导。而如果使用方法引用，也是同样可以根据上下文进行推导。

    函数式接口是Lambda的基础，而方法引用是Lambda的孪生兄弟。

    通过对象名引用成员方法:
    通过类名称引用静态方法:
    通过super引用成员方法:
    通过this引用成员方法：
    类的构造器引用：由于构造器的名称与类名完全一样，并不固定。所以构造器引用使用 类名称::new 的格式表示。
    数组的构造器引用：

     */
    public static void main(String[] args){
        printString((System.out::println));
    }
    @FunctionalInterface
    interface Printable{
        void print(String str);
    }

    private static void printString(Printable data){
        data.print("Hello world!");
    }
}
