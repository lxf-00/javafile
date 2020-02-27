package Refect;

import domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo4 {
    /**
     * 获取成员方法
     */
    public static void main(String[] args) throws Exception {
        // 获取Class对象
        Class cls = Person.class;

        // method[] getMethods()
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        // Method getMethod(String str)
        Method eat = cls.getMethod("eat");
        Person p = new Person();
       eat.invoke(p);


    }
}
