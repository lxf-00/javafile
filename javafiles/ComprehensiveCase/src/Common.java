import know.OpenMode;

import java.util.ArrayList;

public class Common implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        // 创建保存各个红包金额的集合
        ArrayList<Integer> list = new ArrayList<>();
        // 定义循环次数
        int times = totalCount - 1;
        // 计算生成的平均金额
        int money = totalMoney / totalCount;
        // 循环分配
        for(int i = 0; i < times; i++){
            list.add(money);
            totalCount -= money;
        }
        // 剩余金额作为最后一个红包
        list.add(totalCount);
        System.out.println("普通红包金额:" + list);

        return list;
    }
}
