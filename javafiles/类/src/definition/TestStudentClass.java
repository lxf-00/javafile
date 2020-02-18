package definition;

import definition.Student;

public class TestStudentClass {
    public static void main(String[] args){
        // 类的使用：实例化对象
        // 格式： 类名 对象名 = new 类名（）;
        Student s = new Student();
        System.out.println("s:"+s);

        // 输出成员变量
        System.out.println("姓名："+ s.name);
        System.out.println("年龄："+ s.age);

        // 成员变量进行赋值
        s.name = "张三";
        s.age = 19;
        System.out.println("姓名："+ s.name);
        System.out.println("年龄："+ s.age);

        // 调用成员方法
        s.study();
        s.rest();
    }
}
