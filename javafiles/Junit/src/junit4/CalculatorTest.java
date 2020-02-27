package junit4;

public class CalculatorTest {
    public static void main(String[] args) {
        // 创建对象
        Calculator c = new Calculator();
        // 调用方法
        /*int res = c.add(4,3);
        System.out.println(res);*/

        int res = c.sub(5,2);
        System.out.println(res);
    }
}
