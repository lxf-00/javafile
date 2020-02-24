package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    /*
    java.util.Collections 是集合工具类，用来对集合进行操作

    部分方法如下：
        public static <T> boolean addAll(Collection<T> c, T... elements) :往集合中添加一些元素。
        public static void shuffle(List<?> list) 打乱顺序 :打乱集合顺序。
        public static <T> void sort(List<T> list) :将集合中元素按照默认规则排序。
        public static <T> void sort(List<T> list，Comparator<? super T> ) :将集合中元素按照指定规则排序。


    Comparable：强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，类的compareTo方法
                被称为它的自然比较方法。只能在类中实现compareTo()一次，不能经常修改类的代码实现自己想要的排序。实现
                此接口的对象列表（和数组）可以通过Collections.sort（和Arrays.sort）进行自动排序，对象可以用作有序映射中
                的键或有序集合中的元素，无需指定比较器。

    Comparator：强行对某个对象进行整体排序。可以将Comparator 传递给sort方法（如Collections.sort或
                Arrays.sort），从而允许在排序顺序上实现精确控制。还可以使用Comparator来控制某些数据结构（如有序set或
                有序映射）的顺序，或者为那些没有自然顺序的对象collection提供排序。
     */

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        // 添加元素：原本写法
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(15);

        // 采用工具类，完成添加方法
        Collections.addAll(list, 12, 13, 14, 15, 16);
        System.out.println(list);

        // 打乱顺序，排序
        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list); // 默认升序


        // 新建字符类ArrayList测试按照一定规则排序
        ArrayList<String> list1 = new ArrayList<>();

        // 添加元素
        Collections.addAll(list1, "abd", "bdf", "cgh", "drt");
        System.out.println("排序前：" + list1);
        // 排序方式： 按照第一个单词
        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);
                // 返回正数： 降序
                // 返回负数：升序
            }
        });
        System.out.println("排序后：" + list1);
    }
}
