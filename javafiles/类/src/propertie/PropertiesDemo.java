package propertie;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    /*
    属性集：java.util.propertie 继承于 HashTable,来表示一个持久的属性集,它使用键值结构存储数据，每个键及其
        对应值都是一个字符串.

    Properties类:

        构造方法:
            public properties() :创建一个空的属性列表

        基本的存储方法:
            public Object setProperty(String key, String value) ： 保存一对属性。
            public String getProperty(String key) ：使用此属性列表中指定的键搜索属性值。
            public Set<String> stringPropertyNames() ：所有键的名称的集合

        与流相关的方法：
            public void load(InputStream inStream) ： 从字节输入流中读取键值对
     */
    public static void main(String[] args){
        // 创建属性集对象
        Properties properties = new Properties();
        // 添加键值对元素
        properties.setProperty("filename", "a.txt");
        properties.setProperty("length", "3456");
        properties.setProperty("location", "/Desktop/");

        // 打印属性集对象
        System.out.println(properties);

        // 通过键，获取属性值
        System.out.println(properties.get("filename"));

        // 遍历属性集，获取所有键的集合
        Set<String> strings = properties.stringPropertyNames();
        // 打印键值对
        for(String key: strings){
            System.out.println(key + "........" + properties.getProperty(key));
        }

    }
}
