package collection;

import java.util.*;

public class PokerGame {
    /*
    集合方式实现发牌洗牌
     */
    public static void main(String[] args){
        // HashMap 对象存储整体牌
        HashMap<Integer,String> pokermap = new HashMap<>();

        // 花色
        List<String> colors = new ArrayList<>();
        // 数字
        List<String> numbers = new ArrayList<>();

        // 添加 花色， 数字
        Collections.addAll(colors, "♦", "♣", "♥", "♠");
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4",
                "3");

        // 组合牌
        int count = 1;
        pokermap.put(count++, "大王");
        pokermap.put(count++, "小王");
        for(String color: colors){
            for(String number: numbers){
                String card = color + number;
                pokermap.put(count++,card);
            }
        }

        // 打乱顺序
        Set<Integer> numberSet = pokermap.keySet();
        List<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        Collections.shuffle(numberList);

        // 创建玩家手牌 底牌 编号集合
        ArrayList<Integer> nop1 = new ArrayList<>();
        ArrayList<Integer> nop2 = new ArrayList<>();
        ArrayList<Integer> nop3 = new ArrayList<>();
        ArrayList<Integer> nodipai = new ArrayList<>();

        // 发牌
        for(int i = 0; i < numberList.size(); i++){
            // 获取当前牌的编号
            Integer cardno = numberList.get(i);
            if(i >= 51){
                nodipai.add(cardno);
            }else if(i % 3 == 0){
                nop1.add(cardno);
            }else if(i % 3 == 1){
                nop2.add(cardno);
            }else{
                nop3.add(cardno);
            }
        }


        // 转换
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for(int no: nodipai){
            String card = pokermap.get(no);
            dipai.add(card);
        }

        for(int no: nop1){
            String card = pokermap.get(no);
            player1.add(card);
        }

        for(int no: nop2){
            String card = pokermap.get(no);
            player2.add(card);
        }
        for(int no: nop3){
            String card = pokermap.get(no);
            player3.add(card);
        }


        System.out.println("张三" + player1);
        System.out.println("李四" + player2);
        System.out.println("王五" + player3);
        System.out.println("底牌" + dipai);

    }

}
