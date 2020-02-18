package inheritance;

import inheritance.Inheritance;
import inheritance.Inheritance1;

public class InheritanceTest {
    public static void main(String[] args) {
        // 测试类的继承特性
        // 创建inheritance1 对象
        Inheritance i = new Inheritance();
        Inheritance1 ih = new Inheritance1();
        // 为name赋值
        ih.name = "张三";
        // 调用打印姓名的方法
        ih.printName();
        // 调用work方法
        ih.work();

        // 继承后的特点: 不重名无影响
        // 继承后的特点: 重名覆盖，
        ih.printAge();
    }

}
