package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo1 {
    /*
    计算一个字符串中每个字符出现次数。

     */
    public static void main(String[] args){
        // 输入字符串
        System.out.println("请输入要确认的字符串：");
        String str = new Scanner(System.in).nextLine();
        // 调用方法
        findChar(str);
    }

    // 定义私有方法：计算字符串中，每个字符出现次数
    private static void findChar(String str){
        // 创建HashMap 对象存储： 字符串（键） 出现次数（值）
        Map<Character, Integer> map = new HashMap<>();

        // 遍历：字符串
        for(char c: str.toCharArray()){
            // 判断map 是否含有该键值
            if(!map.containsKey(c)){
                // 代表第一次出现： 存入集合，值为1
                map.put(c, 1);
            }else{
                // 代表重复出现： 值加1
                Integer count  = map.get(c);
                count++;
                // 再次存入map
                map.put(c, count);
            }
        }
        // 显示结果
        System.out.println(map);
    }
}
