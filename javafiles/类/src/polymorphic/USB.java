package polymorphic;

// 定义接口类： USB
public  interface  USB {
    // 接口多态综合案例：
//     笔记本电脑（laptop）通常具备使用USB设备的功能。在生产时，笔记本都预留了可以插入USB设备的USB接口，
//    但具体是什么USB设备，笔记本厂商并不关心，只要符合USB规格的设备都可以。
//    定义USB接口，具备最基本的开启功能和关闭功能。鼠标和键盘要想能在电脑上使用，那么鼠标和键盘也必须遵守
//    USB规范，实现USB接口，否则鼠标和键盘的生产出来也无法使用。

    // 定义抽象方法：开启功能
    public abstract void switchOn();
    // 定义抽象方法：关闭功能
    public abstract void switchOff();
}
