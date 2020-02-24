import java.util.*;

public class LambdaDemo {
    /* 编程思想转变： 怎么做   做什么
    Lambda 语法：一些参数，一个箭头，一段代码
            （参数类型 参数名称）-> {代码语句};


    Lambda的参数和返回值:
            使用数组存储多个Person对象
            对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序

     使用Lambda的前提：
         使用Lambda必须具有接口，且要求接口中有且仅有一个抽象方法。（有且仅有一个抽象方法的接口，称为“函数式接口”。）
         使用Lambda必须具有上下文推断。

     */
    public static void main(String[] args){
        // 启动线程的简单写法
        new Thread(() -> System.out.println("多线程运行")).start();

        // 常规写法：
        // 创建Array
        Person[] arr = { new Person("张三", 19), new Person("李四", 18),
                        new Person("王五", 22), new Person("赵六", 21) };
        // 排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge(); // 升序
            }
        });
        // 显示
        for(Person p: arr){
            System.out.println(p);
        }

        //  lambda 写法
        Arrays.sort(arr, (Person a, Person b) ->{
            return b.getAge() - a.getAge(); // 降序
        });

        // 显示
        for(Person p: arr){
            System.out.println(p);
        }



    }
}


class Person{
    private String name;
    private int age;

    public Person(){}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}