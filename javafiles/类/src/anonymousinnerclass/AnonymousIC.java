package anonymousinnerclass;

public interface AnonymousIC {
    // 匿名内部类： 内部类的简写方法
    // 本质： 带具体实现的 父类或者父接口 匿名的子对象
    // 前提： 匿名内部类必须继承一个父类或实现一个父接口
    // 格式：
        // new 父类名或接口名{
            // 方法重写
            // @override
            // .......
        // }

    // 使用方式：接口为例
    // 定义抽象方法
    public abstract void method1();

}
