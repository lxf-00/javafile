package InterfaceImplements;

import InterfaceImplements.ImplementsTest;

public class InterfaceImplementsTest {
    public static void main(String[] args){
        // 测试interface implements
        // 新建ImplementsTest对象
        ImplementsTest it = new ImplementsTest();
        // 调用实现后的方法
        it.eat();
        it.sleep();
        // 调用静态方法
        InterfaceKeyWord.method2();
        // 调用默认方法
        it.method1();
        // 测试私有方法
        it.usePrivate();

    }

}
