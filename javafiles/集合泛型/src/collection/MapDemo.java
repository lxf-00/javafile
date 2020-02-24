package collection;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo {
    /*
    Map接口中定义了很多方法，常用的如下：
        public V put(K key, V value) : 把指定的键与指定的值添加到Map集合中。
        public V remove(Object key) : 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
        public Set<K> keySet() : 获取Map集合中所有的键，存储到Set集合中。
        public Set<Map.Entry<K,V>> entrySet() : 获取到Map集合中所有的键值对对象的集合(Set集合)。



    Entry键值对对象:
        public K getKey() ：获取Entry对象中的键。
        public V getValue() ：获取Entry对象中的值
     */

    public static void main(String[] args){
        // 创建map对象
        HashMap<String, String> map = new HashMap<>();
        // 添加元素到集合中
        map.put("1", "张三");
        map.put("2", "李四");
        map.put("3", "王五");
        map.put("4", "赵六");

        // 获取所有的键值
        Set<String> keys = map.keySet();

        // 获取指定的键值的对象
        System.out.println(map.get("3"));

        // 遍历键值
        for(String s: keys){
            System.out.println(s);
        }

        // 遍历键 值
        Set<Entry<String, String>> entryset = map.entrySet();
        for(Entry<String, String> entry: entryset){
            System.out.println("位置：" + entry.getKey() + "值：" + entry.getValue());
        }
    }
}
