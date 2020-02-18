package InterfaceImplements;

public class ImplementsTest  implements InterfaceKeyWord {
    // 定义接口实现类
    @Override
    public void eat() {
        System.out.println("正在吃东西....");
    }

    @Override
    public void sleep() {
        System.out.println("正在熟睡....");
    }
}
