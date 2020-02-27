package Refect;

import domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    /**
     * 1，获取成员方法们：
     */
    public static void main(String[] args) throws Exception {
       Class cls = Person.class;

       // 获取所有public修饰的成员变量： Field[] getFields()
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        // 获取指定的public修饰的成员变量：getField(String str)
        System.out.println("...........................");
        Field a = cls.getField("a");
        // 获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        // 设置成员变量的值
        a.set(p,"张三");
        System.out.println(p);

        System.out.println("=====================");

        // Field[] getDeclaredFields(): 获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        //  Field[] getDeclaredField(String str): ....单个
        Field d = cls.getDeclaredField("c");
        // 忽略访问权限的安全检查
        d.setAccessible(true); // 暴力反射
        Object value1 = d.get(p);
        System.out.println(value1);
    }
}
