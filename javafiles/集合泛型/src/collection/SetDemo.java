package collection;

import java.util.HashSet;

public class SetDemo {
    /*
    Set接口： java.util.Set 继承Collection接口；它与 Collection 接口中的方
             法基本一致，并没有对 Collection 接口进行功能上的扩充，只是比 Collection 接口更加严格了。

    特点： 元素无序；
          不重复；

    Set 集合有多个子类: java.util.HashSet 、 java.util.LinkedHashSet ....

    java.util.HashSet 是 Set 接口的一个实现类，它所存储的元素是不可重复的，并且元素都是无序的(即存取顺序
    不一致)。底层的实现其实是一个 java.util.HashMap 支持.

    HashSet 是根据对象的哈希值来确定元素在集合中的存储位置，因此具有良好的存取和查找性能。保证元素唯一性
    的方式依赖于： hashCode 与 equals 方法。


    HashSet集合存储数据的结构（哈希表）:
        哈希表： 在JDK1.8之前，哈希表底层采用数组+链表实现，即使用链表处理冲突，同一hash值的链表都存储在一个链表里；
                但是当位于一个桶中的元素较多，即hash值相等的元素较多时，通过key值依次查找的效率较低。而JDK1.8中，哈
                希表存储采用数组+链表+红黑树实现，当链表长度超过阈值（8）时，将链表转换为红黑树，这样大大减少了查找时间。
        根据对象的hashCode和equals方法来保证HashSet集合元素的唯一，
        如果我们往集合中存放自定义的对象，那么保证其唯一，就必须复写hashCode和equals方法建立属于当前对象的比较方式。

    LinkedHashSet: HashSet的子类，使存储的元素有序且唯一；它是链表和哈希表组合的一个数据存储结构。
     */

    public static void main(String[] args){
        // 创建HashSet集合
        HashSet<String> hs = new HashSet<>();

        // 添加元素: 集合不能存储重复元素
        hs.add("abc");
        hs.add("cda");
        hs.add(new String("bgi"));
        hs.add("bgi");

        System.out.println(hs);

        // 遍历
        for(String s: hs){
            System.out.println(s);
        }
    }
}
