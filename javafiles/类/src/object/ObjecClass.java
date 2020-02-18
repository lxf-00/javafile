package object;

import string.StringClass;
import java.util.Objects;

public class ObjecClass {
    /*
    Object 类： Java 语言的根类,即所有类的父类；
    如果一个类没有特别指定父类，则默认继承自Object;
    API 方法：
    public String toString: 返回该对象的字符串表示; 快捷键：control + return
    public boolean equals(Object obj): 指示其他对象与该对象是否"相等"; 相等有两种定义：默认地址比较；对象内容比较 快捷键：control + return

    Objects 类： JDK7 添加；Object equals容易抛出空指针问题；Objects 中的equals优化了此问题；
    源码：
    public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }
     */


    public static void main(String[] args){
        Person p = new Person();
        Person p1 = new Person();
        Person p2 = new Person("张三", 23);
        System.out.println(p);
        // 为重写结果： object.Person@5c0369c4 （对象类型@内存地址值）
        // 重写后的结果：Person{name:null;age:0}
        // 我们直接使用输出语句输出对象名时，其实通过该对象调用了toString()方法即
        // System.out.print(p);  等价于 System.out.print(p.toString());
        StringClass st = new StringClass();
        System.out.println(p.equals(st));  // false
        System.out.println(p.equals(p1));  // true
        System.out.println(p.equals(p2));  // false



    }
}


// 如果需要，可以改写toString方法的默认行为
class Person{
    private String name;
    private int age;

    public Person(){}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person{" + "name:" + name + ";age:" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        // 如果对象地址一样，则认为相同
        if (this == o) return true;
        // 如果参数为空或者类型信息不一样，则认为不同
        if (o == null || getClass() != o.getClass()) return false;
        // 转换为当前类型
        Person person = (Person) o;
        // 要求基本类型相等，并且将引用类型交给java.util.Objects类的equals静态方法取用结果
        return age == person.age &&
                Objects.equals(name, person.name);
    }

}
