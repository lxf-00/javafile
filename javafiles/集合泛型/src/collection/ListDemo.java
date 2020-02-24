package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    /*
    List接口： java.util.List; 继承自Collection接口，是单列集合的一个重要分支；习惯性地会将实现了 List 接口的对
    象称为List集合。子类包括： ArrayList

    特点： 它是一个元素存取有序的集合；
          它是一个带有索引的集合，通过索引就可以精确的操作集合中的元素（与数组的索引是一个道理）。
          集合中可以有重复的元素，通过元素的equals方法，来比较是否为重复的元素。

    List接口中常用方法:
        public void add(int index, E element) : 将指定的元素，添加到该集合中的指定位置上。
        public E get(int index) :返回集合中指定位置的元素。
        public E remove(int index) : 移除列表中指定位置的元素, 返回的是被移除的元素。
        public E set(int index, E element) :用指定元素替换集合中指定位置的元素,返回值的更新前的元素。


    List的子类：
        ArrayList:java.util.ArrayList 集合数据存储的结构是数组结构。元素增删慢，查找快，由于日常开发中使用最多的功能为
                    查询数据、遍历数据，所以 ArrayList 是最常用的集合。
       LinkedList:java.util.LinkedList 集合数据存储的结构是链表结构。方便元素添加、删除的集合。
            了解：
                public void addFirst(E e) :将指定元素插入此列表的开头。
                public void addLast(E e) :将指定元素添加到此列表的结尾。
                public E getFirst() :返回此列表的第一个元素。
                public E getLast() :返回此列表的最后一个元素。
                public E removeFirst() :移除并返回此列表的第一个元素。
                public E removeLast() :移除并返回此列表的最后一个元素。
                public E pop() :从此列表所表示的堆栈处弹出一个元素。
                public void push(E e) :将元素推入此列表所表示的堆栈。
                public boolean isEmpty() ：如果列表不包含元素，则返回true。
     */

    public static void main(String[] args){
        // 创建List集合对象
        // 多态方式： ArrayList
        List<String> list = new ArrayList<>();



        // 尾部添加元素
        list.add("张三");
        list.add("李四");
        list.add("王五");

        System.out.println(list);

        // add(int index, E e) 指定位置增加元素
        list.add(0, "王二");
        System.out.println(list);

        // remove(int index) 删除指定位置元素，返回被删除元素
        System.out.println(list.remove(0));

        // set(int index, E e) : 指定位置，元素替换
        list.set(2, "赵六");
        System.out.println(list);

        // 遍历
        for(String s: list){
            System.out.println(s);
        }


        // 创建LinkedList 对象
        LinkedList<Integer> ll = new LinkedList<>();

        // 添加元素
        ll.addFirst(3);
        ll.addFirst(4);

        System.out.println(ll);

        ll.addLast(2);
        System.out.println(ll);

        for(int i: ll){
            System.out.println(i);
        }

    }
}
