package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;


public class DateExercise {
    /*
    请使用日期时间相关的API，计算出一个人已经出生了多少天。
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生年月日:(2020-1-3)");
        String s = sc.nextLine();
        getDays(s);
    }

    // 定义方法：计算天数 传入参数String s(出生年月日）
    public static void getDays(String s) throws ParseException {
        // 获取当前时间
        Date now_date = new Date();
        // 定义模式
        DateFormat template = new SimpleDateFormat("yyyy-MM-dd");
        // String s ==> Date
        Date start_date = template.parse(s);
        // 计算天数: 将日期转为毫秒值
        long days = now_date.getTime() - start_date.getTime();
        if(days <= 0){
            System.out.println("还没出生呢？");
        }else{
            System.out.println(days/1000/60/60/24 + "天");
        }
    }
}
