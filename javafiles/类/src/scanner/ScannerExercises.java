package scanner;

import java.util.Scanner;
public class ScannerExercises {
    public static void main(String[] args) {
        // 键盘录入两个整数，并求和
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("两者之和为：" + sum);

        // 键入三个整数，返回其中的最大值
        getMax();

    }

    // 方法： 返回三个书中的最大值
    public static void getMax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数:");
        int c = sc.nextInt();

//        int max = a;
//        if(b > a || b > c){
//            return b;
//        }
//        if(c > a){
//            return  c;
//        }else{
//            return a;
//        }
        // 获取三个数中的最大值
        int temp = (a > b ? a : b);
        int max = (temp > c ? temp : c);
        System.out.println("最大值为:" + max);
    }
}
