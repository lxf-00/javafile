package ComprehensiveCase;

import java.util.ArrayList;
public class ComperhensiveExercise {
    public static void main(String[] args){
        // 继承的综合案例
        /*
        群主发普通红包。某群有多名成员，群主给成员发普通红包。普通红包的规则：
        1. 群主的一笔金额，从群主余额中扣除，平均分成n等份，让成员领取。
        2. 成员领取红包后，保存到成员余额中。
         */
        // 新建群主类
        QunZhu q = new QunZhu("群主", 30.0);

        // 显示群主余额
        q.show();
        // 调用发红包方法
        ArrayList<Double> list = q.send(10, 3);
        // 显示群主余额
        q.show();

        // 新建一个成员对象
        Member m = new Member("成员", 0.0);
        // 显示余额
        m.show();
        // 调用方法：开红包
        m.openHongBao(list);
        // 显示余额
        m.show();


    }
}
