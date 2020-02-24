package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercise {
    /*
    创建一个学生类，存储到ArrayList集合中完成指定排序操作。
     */
    public static void main(String[] args) {
        // 创建四个学生对象，保存到ArrayList 列表中
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("Jack", 19);
        Student s2 = new Student("Snow", 20);
        Student s3 = new Student("Vany", 21);
        Student s4 = new Student("Stack", 15);

        Collections.addAll(list, s1, s2, s3, s4);

        // 显示原始排序
        System.out.println("原始排序" + list);

        // 让学生按照年龄排序 升序
        // Collections.sort(list); 报错  原因：如果想要集合中的元素完成排序，那么必须要实现比较器Comparable接口。
//        Collections.sort(list);
//        System.out.println("按年龄排序" + list);

        // 另一个种方式
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("按年龄排序" + list);
    }
}



// 创建学生类
class  Student{
    // 封装： 成员变量
    private String name;
    private int age;

    // 构造方法
    public Student(){}
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // set/get方法
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

    // 重写toString 方法


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.age - o.age; //升序
//    }
}
