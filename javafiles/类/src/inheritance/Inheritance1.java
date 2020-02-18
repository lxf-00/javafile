package inheritance;

import inheritance.Inheritance;

// 定义子类 继承 inheritance.Inheritance
public class Inheritance1 extends Inheritance {
    // 定义方法： 打印姓名
    int age;
    int age1 = 2;
    public void printName(){
        System.out.println("姓名：" + name);
    }

    public void printAge(){
        System.out.println("父类中 age1: "  + super.age1);
        System.out.println("子类中 age1: "  + age1);
    }

}
