public class LambdaExercise1 {
    /*

    使用Lambda标准格式（有参有返回）

    给定一个计算器 Calculator 接口，内含抽象方法 calc 可以将两个int数字相加得到和值：

    省略规则:
        小括号内参数的类型可以省略；
        如果小括号内有且仅有一个参，则小括号可以省略；
        如果大括号内有且仅有一个语句，则无论是否有返回值，都可以省略大括号、return关键字及语句分号。
     */
    public  static void main(String[] args){
        // TODO 请在此使用Lambda【标准格式】调用invokeCalc方法来计算120+130的结果ß
        invokeCalc(120, 130, (int a, int b) ->{
            return a + b;
        });

        // 简略写法
        invokeCalc(120, 130, (a, b) -> a + b);

    }
    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }

}


interface Calculator{
    int calc(int a, int b);
}