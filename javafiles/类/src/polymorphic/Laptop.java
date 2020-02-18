package polymorphic;

// 定义笔记本类： 开机， 使用USB, 关机
//
public class Laptop {
    public void run(){
        System.out.println("笔记本运行....");
    }

    // 使用USB功能： 传入对应的USB类
    public void useUSB(USB usb){
        // 判断是否有usb 对象
        if(usb != null){
            // 调用USB： 开启功能
            usb.switchOn();
            // 调用器特有的方法
            if(usb instanceof Mouse){
                // 向下转型
                ((Mouse) usb).click();
            }else if(usb instanceof Keyboard){
                ((Keyboard) usb).type();
            }
            // 关闭功能
            usb.switchOff();
        }
    }

    // 笔记本关闭功能：
    public void shutDown(){
        System.out.println("笔记本关闭中.....");
    }
}
