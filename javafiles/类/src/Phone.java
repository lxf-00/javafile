public class Phone {
    // 定义手机类
    // 成员变量
    String brand;   // 品牌
    int price;      // 价格
    String color;   // 颜色

    // 成员方法1： 打电话
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    // 成员方法2：发短线
    public void textMessage(){
        System.out.println("群发短信");
    }
}
