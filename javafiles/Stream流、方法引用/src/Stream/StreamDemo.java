package Stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    /*
    Stream 流： 在Java 8中，得益于Lambda所带来的函数式编程，引入了一个全新的Stream概念，用于解决已有集合类库既有的弊端。

    传统集合的多步遍历代码。
    循环遍历的弊端：
        for循环的语法就是“怎么做”
        for循环的循环体才是“做什么”

    Stream的更优写法。流式思想概述：
        “Stream流”其实是一个集合元素的函数模型，它并不是集合，也不是数据结构，其本身并不存储任何元素（或其地址值）
        Stream（流）是一个来自数据源的元素队列。
            元素是特定类型的对象，形成一个队列。 Java中的Stream并不会存储元素，而是按需计算。
            数据源 流的来源。 可以是集合，数组 等。
        和以前的Collection操作不同， Stream操作还有两个基础的特征：
            Pipelining: 中间操作都会返回流对象本身。
            内部迭代： 以前对集合遍历都是通过Iterator或者增强for的方式, 显式的在集合外部进行迭代， 这叫做外部迭代。 Stream提供了内部迭代的方式，流可以直接调用遍历方法
        三个基本步骤：获取一个数据源（source）→ 数据转换→执行操作获取想要的结果，每次转换原有 Stream 对象不改变，返回一个新的 Stream 对象（可以有多次转换），这就允许对其操作可以
                    像链条一样排列，变成一个管道。

    获取流：
        java.util.stream.Stream<T> 是Java 8新加入的最常用的流接口。
        获取一个流非常简单，有以下几种常用的方式：
            所有的 Collection 集合都可以通过 stream 默认方法获取流；
            Stream 接口的静态方法 of 可以获取数组对应的流。

        根据Collection获取流：首先， java.util.Collection 接口中加入了default方法 stream 用来获取流，所以其所有实现类均可获取流。
        根据Map获取流:java.util.Map 接口不是 Collection 的子接口，且其K-V数据结构不符合流元素的单一特征，所以获取对应的流需要分key、value或entry等情况.
        根据数组获取流: 由于数组对象不可能添加默认方法，所以 Stream 接口中提供了静态方法of( of 方法的参数其实是一个可变参数，所以支持数)

    常用方法：
        流模型的操作很丰富，这里介绍一些常用的API。这些方法可以被分成两种：
            延迟方法：返回值类型仍然是 Stream 接口自身类型的方法，因此支持链式调用。（除了终结方法外，其余方法均为延迟方法。）
            终结方法：返回值类型不再是 Stream 接口自身类型的方法，因此不再支持类似 StringBuilder 那样的链式调用。

            逐一处理：forEach （虽然方法名字叫 forEach ，但是与for循环中的“for-each”昵称不同。）
                void forEach(Consumer<? super T> action);

            过滤：filter: filter 方法将一个流转换成另一个子集流.
                Stream<T> filter(Predicate<? super T> predicate);

            映射：map:如果需要将流中的元素映射到另一个流中，可以使用 map 方法
                <R> Stream<R> map(Function<? super T, ? extends R> mapper);

            统计个数：count:正如旧集合 Collection 当中的 size 方法一样，流提供 count 方法来数一数其中的元素个数
                long count();

            取用前几个：limit,limit 方法可以对流进行截取，只取用前n个
                Stream<T> limit(long maxSize);

            跳过前几个：skip, 如果希望跳过前几个元素，可以使用 skip 方法获取一个截取之后的新流：
                Stream<T> skip(long n);

            组合：concat, 如果有两个流，希望合并成为一个流，那么可以使用 Stream 接口的静态方法 concat
                static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)

     */
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        // 获取List的流
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        // 获取Set的流
        Stream<String> stream2 = set.stream();

        Vector<String> vector = new Vector<>();
        // ...
        Stream<String> stream3 = vector.stream();

        Map<String, String> map = new HashMap<>();
        // 获取Map的流: key value entry
        Stream<String> keyStream = map.keySet().stream();
        Stream<String> valueStream = map.values().stream();
        Stream<Map.Entry<String, String>> entryStream = map.entrySet().stream();

        String[] arr = {"小明","小华","小李"};
        // 获取数组的流
        Stream<String> stream4 = Stream.of(arr);

        // foreach 方法
        stream4.forEach(name -> System.out.println(name));

        // filter 方法
        Stream<String> stream5 = Stream.of("张三", "李四", "张五萨");
        Stream<String> res = stream5.filter(s -> s.startsWith("张"));

        // 映射:map
        Stream<String> stream6 = Stream.of("3","5","7");
        Stream<Integer> res1 = stream6.map(str -> Integer.parseInt(str));

        // 统计个数:count
        System.out.println(res.count());

        // 取用前几个:limit
        Stream<String> stream7 = Stream.of("4","3","8");
        Stream<String> res2 = stream7.limit(3);
        System.out.println(res2.count());

        // 跳过前几个： skip
        Stream<Integer> stream8 = Stream.of(3,5,1,2,6,3);
        Stream<Integer> res3 = stream8.skip(2);
        System.out.println(res3.count());


        // 组合：concat
        Stream<String> stream = Stream.of("你","好");
        Stream<String> stream9 = Stream.of("啊", "！");
        Stream<String> res4 = Stream.concat(stream, stream9);
        System.out.println(res4.count());




    }
}
