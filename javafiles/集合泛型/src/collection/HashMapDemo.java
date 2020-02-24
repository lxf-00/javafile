package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapDemo {
    /*
    HashMap 存储自定义类型：
    练习：每位学生（姓名，年龄）都有自己的家庭住址。那么，既然有对应关系，则将学生对象和家庭住址存储到
          map集合中。学生作为键, 家庭住址作为值。

    当给HashMap中存放自定义对象时，如果自定义对象作为key存在，这时要保证对象唯一，必须复写对象的
    hashCode和equals方法

    如果要保证map中存放的key和取出的顺序一致，可以使用 java.util.LinkedHashMap 集合来存放。
     */
    public static void main(String[] args){
        // 创建HashMap 集合
        Map<Student, String> map = new HashMap<>();


        // 存储住址
        map.put(new Student("张三", 18), "北京");
        map.put(new Student("李四", 19), "上海");
        map.put(new Student("王五", 20), "天津");
        map.put(new Student("赵六", 21), "广州");

        // 遍历键 值
        Set<Student> keys = map.keySet();
        for(Student key: keys){
            System.out.println(key + "......" + map.get(key));
        }
    }
}
