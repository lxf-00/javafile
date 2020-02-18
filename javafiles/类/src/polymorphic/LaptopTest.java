package polymorphic;

public class LaptopTest {
    public static void main(String[] args){
        // 创建笔记本对象
        Laptop l = new Laptop();
        // 开启笔记本
        l.run();
        // 使用USB Mouse 功能
        USB usb1 = new Mouse();
        l.useUSB(usb1);

        // 测试键盘功能
        USB usb2 = new Keyboard();
        l.useUSB(usb2);

        // 关闭电脑
        l.shutDown();
    }

}
