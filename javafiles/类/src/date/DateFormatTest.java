package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {
    /*
    DateFormatTest 类： java.text.DateFormat; 日期、时间格式化的子类；通过此类可以将日期和文本进行转换；（Date对象，String对象）
    格式化：按照指定的格式，将Date对象转换为String对象;
    解析： 按照指定的格式，将String对象转换为Date对象;

    构造方法：
    DateFormat 为抽象类，不能直接使用；需要使用子类java.text.SimpleDateFormat. 这个类需要一个模式来指定格式化或解析标准；
    public SimpleDateFormat(String pattern): 用以给定的模式和语言环境的日期格式符号构造SimpleDateFormat。
    参数pattern:字符串，代表日期时间的自定义格式；

    格式规则：
        标识字母(区分大小写)     含义
            y                  年
            M                  月
            d                  天
            H                  时
            m                  分
            s                  秒

     常用的方法：
     public String format(Date date）：将Date对象格式化字符串；
     public Date parse(String source): 将字符串解析为Date对象; 方法声明中添加throws ParseException
     */
    public static void main(String[] args)throws ParseException{

        // 将Date 对象转换为String
        Date d1 = new Date();
        DateFormat df1 = new SimpleDateFormat("yyyy年MM月dd日");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        System.out.println(df1.format(d1));


        DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日");
        String str = "2018年12月11日";
        Date date = df2.parse(str);
        System.out.println(date);
    }
}
