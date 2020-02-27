package functioninterface;

public class FunInterface {
    /*
    函数式接口：
        函数式接口在Java中是指：有且仅有一个抽象方法的接口。Java中的函数式编程体现就是Lambda

         格式：
            修饰符 interface 接口名称 {
                public abstract 返回值类型 方法名称(可选参数信息);
                // 其他非抽象方法内容
            }

        @FunctionalInterface注解： Java 8中专门为函数式接口引入了一个新的注解： @FunctionalInterface。

        自定义函数式接口：


    “语法糖”是指使用更加方便，但是原理不变的代码语法。，Java中的Lambda可以被当做是匿名内部类的“语法糖”，但是二者在原理上是不同的。

    函数式编程：
        1 Lambda的延迟执行：
            有些场景的代码执行后，结果不一定会被使用，从而造成性能浪费。而Lambda表达式是延迟执行的，这正好可以作为解决方案，提升性能。


    常用函数式接口:java.util.function 包中被提供。
        1, Supplier接口: java.util.function.Supplier<T> 接口仅包含一个无参的方法： T get() 。用来获取一个泛型参数指定类型的对象数据
        2,  Consumer接口:java.util.function.Consumer<T> 接口则正好与Supplier接口相反，它不是生产一个数据，而是消费一个数据，其数据类型由泛型决定。
            Consumer 接口中包含抽象方法 void accept(T t) ，意为消费一个指定泛型的数据.
            如果一个方法的参数和返回值全都是 Consumer 类型，那么就可以实现效果：消费数据的时候，首先做一个操作，然后再做一个操作，实现组合。而这个方法就是 Consumer 接口中的default方法 andThen 。
        3， Predicate接口：有时候我们需要对某种类型的数据进行判断，从而得到一个boolean值结果。这时可以使用java.util.function.Predicate<T> 接口。
            Predicate 接口中包含一个抽象方法： boolean test(T t) 。用于条件判断的场景。
            默认方法：and，既然是条件判断，就会存在与、或、非三种常见的逻辑关系。其中将两个 Predicate 条件使用“与”逻辑连接起来实现“并且”的效果时，可以使用default方法 and
            默认方法：or，与 and 的“与”类似，默认方法 or 实现逻辑关系中的“或”
            默认方法：negate

        4, Function接口:java.util.function.Function<T,R> 接口用来根据一个类型的数据得到另一个类型的数据，前者称为前置条件，后者称为后置条件。
            抽象方法：apply, R apply(T t) ，根据类型T的参数获取类型R的结果。
            默认方法：andThen,用来进行组合操作.


     */
    public static void main(String[] args){
        // 性能浪费的日志案例
        String msgA = "hello";
        String msgB = "Logger";
        String msgC = "User";

        log(1, msgA + msgB + msgC);
        // 无论级别是否满足要求，作为 log 方法的第二个参数，三个字符串一定会首先被拼接并传入方
        //法内，然后才会进行级别判断,如果级别不符合要求，那么字符串的拼接操作就白做了，存在性能浪费。
//        SLF4J是应用非常广泛的日志框架，它在记录日志时为了解决这种性能浪费的问题，并不推荐首先进行
//        字符串的拼接，而是将字符串的若干部分作为可变参数传入方法中，仅在日志级别满足要求的情况下才会进
//        行字符串拼接。

        // Lambda 方式：
        log1(1, () -> msgA + msgB + msgC);


    }
    private static void log(int level, String msg){
        if(level ==  1){
            System.out.println(msg);
        }
    }

    @FunctionalInterface
    interface MsgBuilder{
        String buildMessage();
    }

    private static void log1(int level, MsgBuilder builder){
        if(level == 1){
            System.out.println(builder.buildMessage());
        }
    }
}
