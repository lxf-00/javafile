package polymorphic;

// 定义USB 接口的实现类： Mouse(鼠标）
public class Mouse implements USB {
    // 重写抽象方法： 开启
    @Override
    public void switchOn() {
        System.out.println("鼠标连接电脑成功，功能开启");
    }

    // 重写抽象方法： 关闭
    @Override
    public void switchOff() {
        System.out.println("关闭鼠标功能开启");
    }

    // 特有方法：点击
    public void click(){
        System.out.println("单击鼠标");
    }
}
