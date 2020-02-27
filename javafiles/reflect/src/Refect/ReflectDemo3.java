package Refect;

import domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    /**
     * 2， 获取构造方法们
     */
    public static void main(String[] args) throws Exception {
        // 获取对象Class对象
        Class cls = Person.class;

        // Constructor<?>[] getConstructors()
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("======================");
        // Constructor<T> getConstructor(类<?>...parameterType)
        Constructor constructor = cls.getConstructor(String.class, int.class);
        System.out.println(constructor);
        // 创建对象
        Object person =  constructor.newInstance("张三", 19);
        System.out.println(person);

        // 空参构造
        Object o = cls.newInstance();
        System.out.println(o);

    }
}
