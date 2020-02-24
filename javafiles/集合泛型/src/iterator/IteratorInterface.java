package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorInterface {
    /*
    Iterator接口： 遍历，Iterator对象也称为迭代器；
    迭代： 集合元素的通用获取方式，取元素之前先要判断集合中有没有元素，如果有，就把这个元素取出来，继续在判断，如果还有就再取出出来。
          一直把集合中的所有元素全部取出。这种取出方式专业术语称为迭代。

    获取迭代器的方法：
        public Iterator iterator(): 获取集合对应的迭代器，用来遍历集合中的元素的；

    常用的方法：
        public E next(): 返回迭代的下一个对象；
        public boolean hasNext(): 判断是否还有下个可迭代元素；

    实现原理：
            hasNext()
            next()
            采用指针的方式来跟踪集合中的元素位置


    增强for: for each 循环（JDK1.5); 专门用来遍历数组和集合的; 内部原理其实是个Iterator迭代器

    格式：
        for(元素的数据类型  变量 : Collection集合or数组){
  	            //写操作代码
            }

    新for循环必须有被遍历的目标。目标只能是Collection或者是数组。新式for仅仅作为遍历操作出现。
     */

    public static void main(String[] args){
        // 多态方式，创建集合
        Collection<String> coll = new ArrayList<String>();

        // 添加元素
        coll.add("刘备");
        coll.add("关羽");
        coll.add("张飞");
        coll.add("曹操");
        coll.add("许褚");
        coll.add("夏侯惇");

        // 使用迭代器进行遍历
        // 每个集合对象都代对象
        Iterator<String> istr = coll.iterator();

        // 泛型： 指的是迭代出元素的数据类型
        while(istr.hasNext()){
            String s = istr.next();
            System.out.println(s);
        }

        // for each 遍历集合
        for(Object o: coll){
            System.out.print(o);
        }
    }

}
