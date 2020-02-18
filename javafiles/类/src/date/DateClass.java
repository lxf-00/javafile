package date;

import java.util.Date;
public class DateClass {
    /*
    Data 类： java.util.Date; 表示特定的时间，精确到毫秒；
    方法：
    public Date(): 分配Dated对象并初始化此对象，以表示分配它的时间；
    public Date(long date): 分配Date对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即1970年1月1日00:00:00 GMT）以来的指定毫秒数
    public long getTime(): 把日期对象转换为对应的时间毫秒值
     */

    public static void main(String[] args){
        // 显示当前时间
        // 由于println 默认调用对象toString(),Date 重写了toString()方法
        System.out.println(new Date());  // Mon Feb 17 14:11:28 CST 2020
        Date d = new Date();
        System.out.println(d.getTime()); // 1581919888883
    }
}
