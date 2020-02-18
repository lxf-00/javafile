package Wrapper;

import innerclass.InnerClass;

public class WrapperClass {
    /*
    Java提供了两种类型系统，基本类型和引用类型；
    基本类型： 在于效率，会创建对象使用，因为对象可以做更多的功能，如果想要我们的基本类型像对象一样操作，就可以使用基本类型对应的包装类。

    基本类型               对应的包装类（java.lang包中）
    byte                        Byte
    short                       Short
    int                         Integer
    long                        Long
    float                       Float
    double                      Double
    char                        Character
    boolean                     Boolean

    装箱与拆箱： 基本类型与对应的包装类对象之间，来回转换的过程称为”装箱“与”拆箱
        装箱： 基本类型转换为对应的包装类对象；
        拆箱： 包装类对象转换为对应的基本类型；

    自动装箱与自动拆箱；


    基本类型与字符串之间的转换：三种方法
        1， 基本类型直接与 "" 相连；
        2, String.valueOf();
        3， 使用包装类的toString()方法

   字符串转基本类型：除Character包装类外，其他所有包装类都具有parseXxx静态方法可以将字符串参数转换为对应的基本类型，
            public static byte parseByte(String s)：将字符串参数转换为对应的byte基本类型。
            public static short parseShort(String s)：将字符串参数转换为对应的short基本类型。
            public static int parseInt(String s)：将字符串参数转换为对应的int基本类型。
            public static long parseLong(String s)：将字符串参数转换为对应的long基本类型。
            public static float parseFloat(String s)：将字符串参数转换为对应的float基本类型。
            public static double parseDouble(String s)：将字符串参数转换为对应的double基本类型。
            public static boolean parseBoolean(String s)：将字符串参数转换为对应的boolean基本类型。
     */

    public static void main(String[] args){
        // 基本类型转换为对应的包装类对象
        Integer i = new Integer(5);   // 使用构造函数
        Integer ii = Integer.valueOf(5);    // 使用包装类中valeOf()

        // 包装类对象转换为基本类型
        int num = i.intValue();

        // JDK 1.5 开始，基本类型与包装类的装箱，拆箱动作可以自动完成
        // 自动装箱
        Integer i1 = 5;
        // 自动拆箱
        int i2 = i1;

        // 基本类型转字符串
        int b = 2344;
        String s = b + "";  // 基本类型 + ""；
        System.out.println(s);

        String s1 = String.valueOf(b);  // String.valueOf()
        System.out.println(s1);

        String s2 = Integer.toString(b);  // 包装类toString()
        System.out.println(s2);

        // 字符串类型转基本类型
        int i4 = Integer.parseInt("10034");
        System.out.println(i4);

    }
}
