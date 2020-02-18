import know.OpenMode;
import java.util.Random;

import java.util.ArrayList;

public class Lucky implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        // 创建随机对象
        Random r = new Random();
        // 随机次数
        int times = totalCount - 1;
        // 循环分配
        for(int i = 0; i < times; i++){
            int money = r.nextInt(totalMoney / totalCount * 2) + 1;
            list.add(money);
            totalCount -= money;
            totalCount -= 1;
        }
        list.add(totalCount);
        System.out.println("红包金额" + list);
        return list;
    }
}
