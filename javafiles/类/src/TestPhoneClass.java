public class TestPhoneClass {
    public static void main(String[] args){
        // 测试手机类
        // 实例化手机类
        Phone p = new Phone();

        // 打印成员变量
        System.out.println("品牌：" + p.brand);
        System.out.println("价格：" + p.price + "元");

        // 成员变量赋值
        p.brand = "apple";
        p.price = 4500;
        p.color = "哑黑";

        System.out.println("品牌：" + p.brand);
        System.out.println("价格：" + p.price + "元");

        // 调用成员方法1： 打电话
        p.call("李四");
        p.textMessage();

        // 实例化另一个手机对象： p2
        /*
        对象内存：
        1，栈内存：JVM使用操作系统时使用，先进后出，后进先出，main 入栈；
        2， 堆内存：存储对象数组等；
        3， 方法区：存储可运行的class文件（Phone)
        4, 对象调用方法时，根据对象中方法标记（地址值），去类中寻找方法信息。这样哪怕是多个对象，方法信息
        只保存一份，节约内存空间。
         */
        Phone p2 = new Phone();
        // 调用打电话方法
        p2.call("王五");

    }
}
