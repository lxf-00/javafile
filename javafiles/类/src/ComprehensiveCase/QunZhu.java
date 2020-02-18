package ComprehensiveCase;

import ComprehensiveCase.User;

import java.util.ArrayList;
public class QunZhu extends User {
    // 子类： 群主
    // 添加构造方法
    public QunZhu(){}
    public QunZhu(String username, double balance){
        // 调用父类的构造方法
        super(username, balance);
    }

    // 成员方法： send
    public ArrayList<Double> send(int money, int count){
        // 获取群主的余额
        double balance = getBalance();
        // 判断余额是否支持发红包
        if(balance < money){
            // 不足以发红包
            System.out.println("余额不足！");
            return null;
        }

        // 代表可以发红包
        // 修改群主余额
        setBalance(balance - money);

        // 创建一个集合：保存等分金额
        ArrayList<Double> list = new ArrayList<>();

        // 扩大100倍，相当于折算为'分' 为单位，避免小数运算损失精度
        money = money * 100;

        // 每份的金额
        int m = money / count;

        // 不能整数的余数
        int l = money % count;

        // 无论是否整除， n-1份，都是等额的金额
        for(int i = 0; i < count - 1; i++ ){
            list.add(m/100.0);
        }

        // 判断是否整除
        if(l == 0){
            // 能整除
            list.add(m/100.0);
        }else{
            // 不能整除
            list.add(m/100.0 + l/100);
        }

        // 返回集合
        return list;
    }
}
