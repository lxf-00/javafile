package ComprehensiveCase;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    /*
    综合练习： 按照斗地主的规则，完成洗牌发牌的动作。
    准备牌：
    牌可以设计为一个ArrayList,每个字符串为一张牌。
    每张牌由花色数字两部分组成，我们可以使用花色集合与数字集合嵌套迭代完成每张牌的组装。
    牌由Collections类的shuffle方法进行随机排序。
    发牌
    将每个人以及底牌设计为ArrayList,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。
    看牌
    直接打印每个集合。
     */
    public static void main(String[] args){
        //  1, 创建牌盒，用来存储牌
        ArrayList<String> pokerBox = new ArrayList<>();
        // 2, 创建花色合集
        ArrayList<String> colors = new ArrayList<>();
        // 3， 创建数字集合
        ArrayList<String> numbers = new ArrayList<>();
        //1.4 分别给花色 以及 数字集合添加元素
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");

        for(int i = 2; i <= 10; i++){
            numbers.add(String.valueOf(i));
        }

        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        // 创建牌
        // 拿出每种花色，数字拼接
        for(String color: colors){
            for(String number: numbers){
                String card = color + number;
                // 存储到牌盒中
                pokerBox.add(card);
            }
        }

        // 大王小王
        pokerBox.add("小☺");
        pokerBox.add("大☠");

        // 洗牌： 随机打乱
        // Collections类  工具类  都是 静态方法
        // shuffer方法
        Collections.shuffle(pokerBox);

        // 发牌
        // 创建三个玩家集合和底牌集合
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for(int i = 0; i < pokerBox.size(); i++){
            // 抽牌
            String card = pokerBox.get(i);
            // 留底牌
            if(i >= 51){
                dipai.add(card);
            }else if(i % 3 == 0){
                player1.add(card);
            }else if(i % 3 == 1){
                player2.add(card);
            }else{
                player3.add(card);
            }

        }

        // 显示牌
        System.out.println("张三手牌:" + player1);
        System.out.println("李四手牌:" + player2);
        System.out.println("王五手牌:" + player3);
        System.out.println("底牌:" + dipai);

    }

}
