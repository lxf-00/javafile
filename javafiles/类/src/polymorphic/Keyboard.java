package polymorphic;

// 定义USB接口实现类： Keyboard
public class Keyboard implements USB {
    @Override
    public void switchOn() {
        System.out.println("键盘连接电脑，功能开启");
    }

    @Override
    public void switchOff() {
        System.out.println("关闭键盘功能!");
    }

    // 特有方法： 敲击打字
    public void type(){
        System.out.println("打字中....");
    }

}
