package serialzation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise {
    /*
    反序列化练习：
        1. 将存有多个自定义对象的集合序列化操作，保存到 list.txt 文件中。
        2. 反序列化 list.txt ，并遍历集合，打印对象信息。
     */
    public static void main(String[] args){
        // 创建ArrayList保存学生对象
        List<Student> list = new ArrayList<>();

        // 保存学生对象
        list.add(new Student("小明", 5));
        list.add(new Student("小李", 6));
        list.add(new Student("小红", 7));
        list.add(new Student("小华", 8));

        // 创建序列化对象
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./list.txt"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./list.txt"))){
            // 进行序列化
            oos.writeObject(list);

            // 反序列化
            ArrayList<Student> list1 = (ArrayList<Student>)ois.readObject();
            // 遍历，打印
            for(Student s: list1){
                System.out.println(s);
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}


// 自定义学生对象
class Student implements java.io.Serializable{
    public String name;
    public int age;
    private static final long serialVersionID = 1L;

    // 构造方法
    Student(){};
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // set/get 方法
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

    // 重写toString方法

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
