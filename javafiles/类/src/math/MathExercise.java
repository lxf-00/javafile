package math;

public class MathExercise {
    public static void main(String[] args){
        // Math 类练习1：计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
        double min = -10.8;
        double max = 5.9;

        // 定义整数变量保存整数的个数
        int count = 0;

        // 遍历判断是否满足条件
        for(double i = Math.ceil(max); i >= min; i--){
            if(Math.abs(i) > 6 || Math.abs(i) < 2.1){
                count++;
            }
        }
        System.out.println("满足条件的个数为：" + count + "个");
    }
}
