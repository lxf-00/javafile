package Abstract;

import Abstract.AbstractClass1;

public class AbstractTest {
    public static void main(String[] args){
        // 创建子类AbstractClass1 对象
        AbstractClass1 a1 = new AbstractClass1();
        // 调用重写方法： run
        a1.run();
    }
}
