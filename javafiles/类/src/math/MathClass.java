package math;

public class MathClass {
    // java.lang.Math 包含用于执行基本数学运算的方法，初等指数，对数，平方根等
    // 均为静态方法，调用方便
    public static void main(String[] args){
        // public static double abs(double a): 返回double 类型a的绝对值
        double d1 = Math.abs(-6);  // 6.0
        double d2 = Math.abs(9);  // 9.0
        System.out.println(d1);
        System.out.println(d2);

        // public static double ceil(double a): 返回大于等于参数的最小整数
        double d3 = Math.ceil(4.5);  // 5.0
        double d4 = Math.ceil(4.9);  // 5.0
        double d5 = Math.ceil(5.1);  // 6.0
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

        // public static double floor(double a): 返回小于等于参数的最大整数
        double d6 = Math.floor(4.5);  // 4.0
        double d7 = Math.floor(4.9);  // 4.0
        double d8 = Math.floor(5.1);  // 5.0
        System.out.println(d6);
        System.out.println(d7);
        System.out.println(d8);

        // public static long round(double a) : 返回最接近参数的long(四舍五入）
        long l1 = Math.round(6.5);  // 7
        long l2 = Math.round(6.4);  // 6
        System.out.println(l1);
        System.out.println(l2);
    }


}
