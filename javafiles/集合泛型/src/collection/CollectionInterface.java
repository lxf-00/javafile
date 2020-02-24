package collection;

import java.util.*;
import java.util.Collection;


public class CollectionInterface {
    /*
    Collection 集合： ArrayList,Java中提供的一种容器；用来存储多个数据；

    集合与数组的区别：
        数组的长度是固定的。集合的长度是可变的。
        数组中存储的是同一类型的元素，可以存储基本数据类型值。
        集合存储的都是对象。而且对象的类型可以不一致。在开发中一般当对象多的时候，使用集合进行存储。

    集合框架：按照其存储结构可以分为两大类；
        单列集合java.util.Collection：单列集合类的根接口，用于存储一系列符合某种规则的元素，它有两个重要的子接口，
                                     分别是java.util.List和java.util.Set;
                                     List的特点是元素有序、元素可重复;主要实现类有java.util.ArrayList和java.util.LinkedList
                                     Set的特点是元素无序，而且不可重复;主要实现类有java.util.HashSet和java.util.TreeSet.
        双列集合java.util.Map：键值对； Map 中的集合不能包含重复的键，值可以重复；每个键只能对应一个值。
                              Map常用子类：
                                    HashMap：存储数据采用的哈希表结构，元素的存取顺序不能保证一致。由于要保证键的唯一、不重复，需
                                    要重写键的hashCode()方法、equals()方法。

                                    LinkedHashMap：HashMap下有个子类LinkedHashMap，存储数据采用的哈希表结构+链表结构。通过链
                                    表结构可以保证元素的存取顺序一致；通过哈希表结构可以保证的键的唯一、不重复，需要重写键的
                                    hashCode()方法、equals()方法。

   集合是所有单列集合的父接口，因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作所有的单列集合：
        public boolean add(E e)： 把给定的对象添加到当前集合中 。
        public void clear() :清空集合中所有的元素。
        public boolean remove(E e): 把给定的对象在当前集合中删除。
        public boolean contains(E e): 判断当前集合中是否包含给定的对象。
        public boolean isEmpty(): 判断当前集合是否为空。
        public int size(): 返回集合中元素的个数。
        public Object[] toArray(): 把集合中的元素，存储到数组中。
     */

    public static void main(String[] args){
        // 创建集合对象
        // 使用多态形式
        Collection<String> coll = new ArrayList<String>();

        // 使用方法： public boolean add()
        System.out.println(coll.isEmpty());
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");

        // 判断集合是否为空
        System.out.println(coll.isEmpty());

        // 判断o 是否存在集合中
        System.out.println(coll.contains("李四"));
        System.out.println(coll.contains("王二"));

        // 集合中的元素
        System.out.println(coll.size());

        // 移除指定元素
        coll.remove("赵六");
        System.out.println(coll.size());

        // 把集合中元素存储到数组中
        Object[] objs = coll.toArray();
        // 遍历
        for(Object obj: objs){
            System.out.println(obj);
        }

        // 移除集合中的所有元素
        coll.clear();
        System.out.println(coll.isEmpty());


    }
}
