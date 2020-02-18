package Calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarClass {
    /*
    Calendar 类： java.util.Calendar; Date类之后出现，替换了许多Date方法，将所有可能用到的时间信息封装为静态成员变量；
    方便获取；方便获取时间属性的类。

    抽象类，并非直接创建对象，通过静态方法创建，返回子类对象；
        public static Calendar getInstance(): 使用默认时区和语言环境获取一个日历；

    常用的方法：
        public int get(int field): 返回给定日历字段的值；
        public void set(int field, int value): 将给定日志字段设置为给定值；
        public abstract void add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量；
        public Date getTime(): 返回一个表示该日历的时间值的Date对象；

    Calendar 中成员变量
          字段值              含义
           YEAR               年
           MONTH              月(从0开始，可以+1使用）
        DAY_OF_MONTH          月中的天（几号）
           HOUR               时（12小时制）
       HOUR_OF_DAY            时（24小时制）
          MINUTE              秒
       DAY_OF_WEEK            周中的几天（周几，周日为1，可以-1使用）

    get / set 方法：get方法用来获取指定字段的值，set方法用来设置指定字段的值
     */

    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        System.out.println(ca);
        System.out.println(ca.getTime());
        // 获取年字段的值
        int year = ca.get(Calendar.YEAR);
        System.out.println(year);
        // 获取月字段的值
        int month = ca.get(Calendar.MONTH) + 1;
        System.out.println(month);  // 2

        // 设置
        ca.set(Calendar.MONTH, 4);
        int month1 = ca.get(Calendar.MONTH) + 1;
        System.out.println(month1); // 5

        // 使用add 方法
        ca.add(Calendar.YEAR, 2);
        int year1 = ca.get(Calendar.YEAR);
        System.out.println(year1);

        // 使用getTime(): 返回值为Date对象
        Date d1 = ca.getTime();
        System.out.println(d1);
        System.out.println(d1.getTime());

    }

}
