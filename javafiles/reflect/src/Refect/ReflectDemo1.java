package Refect;

import domain.Person;

public class ReflectDemo1 {
    /**
     * 反射
     * 获取class对象三种方式：
     */
    public static void main(String[] args) throws Exception {
        // 第一种方式： Class.formName("全类名)
        Class cls1 = Class.forName("domain.Person");
        System.out.println(cls1);

        // 第二种方式：类名.Class
        Class cls2 = Person.class;
        System.out.println(cls2);

        // 第三种方式：对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        // == 比较
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);

    }

}
