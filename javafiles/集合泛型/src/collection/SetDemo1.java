package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class SetDemo1 {
    // HashSet  存储自定义类型元素
    public static void main(String[] args){
        // 创建集合对象，存储Student类型
        HashSet<Student> hs = new HashSet<>();

        // 创建Student对象
        Student s1 = new Student("刘备", 35);
        Student s2 = new Student("关羽", 32);
        Student s3 = new Student("张飞", 31);
        Student s4 = new Student("刘备", 35);

        // 添加到集合中
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        // 遍历
        for(Student s: hs){
            System.out.println(s.getName() + s.getAge());
        }

        // 创建LinkedHashSet 对象
        // 多态方式
        HashSet<String> lhs = new LinkedHashSet<>();

        // 添加元素
        lhs.add("aaa");
        lhs.add("bbb");
        lhs.add("ccc");
        lhs.add("aaa");

        // 显示
        System.out.println(lhs);
        // 遍历
        for(String s: lhs){
            System.out.println(s);
        }

    }
}





// 自定义类型
class Student{
    private String name;
    private int age;

    public Student(){}
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // set/get
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    // 重写equals hashCode方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}