package ComprehensiveCase;

import ComprehensiveCase.User;

import java.util.Random;
import java.util.ArrayList;
public class Member extends User {
    // 子类--- 成员类
    // 添加构造方法
    public Member(){}
    public Member(String username, double balance){
        // 调用父类的构造方法
        super(username, balance);
    }

    // 定义成员方法： 收红包
    // 从集合中随机取一份，放入余额中
    public void openHongBao(ArrayList<Double> list){
        // 创建一个随机对象,随机生成一个角标
        int index = new Random().nextInt(list.size());

        // 取出相对应的金额
        double m = list.get(index);
        System.out.println("获取金额" + m);

        // 移除一个金额
        double r = list.remove(index);

        // 重新设置成员金额
        double mb = getBalance() + m;
        setBalance(mb);
    }

}
