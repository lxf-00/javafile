// API : Application Programming Interface 应用程序编程接口
// 导包： import 包名.类名;(使用import 关键字导包，在类的所有代码之前导包，java.lang包下的所有类无需导入）
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        // 创建对象：数据类型 变量名 = new 数据类型(参数列表);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        // 调用方法： 变量名.方法名();
        int i = sc.nextInt();    // 接收一个键盘录入的整数
        System.out.println("你输入的数字是:" + i);
    }
}
