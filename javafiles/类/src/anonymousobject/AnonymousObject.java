package anonymousobject;

import java.util.Scanner;
public class AnonymousObject {
    public static void main(String[] args){
        // 匿名对象： 创建对象时，只有创建对象的语句，没有将对象地址赋值给某个变量，
        // 格式： new 类名();
        // new Scanner(System.in);

        // 应用场景：有限，创建匿名对象，直接调用方法，没有变量名
        // 一旦调用两次方法，就是创建了两个对象，造成内存浪费，一个匿名对象只能使用一次
        // System.out.println("请输入一个整数:");
        // new Scanner(System.in).nextInt();

        // 匿名对象作为方法的参数
        // 普通方式
        Scanner sc = new Scanner(System.in);
        input(sc);

        // 匿名对象作为方法的参数
        input(new Scanner(System.in));

        // 匿名对象作为返回值
        Scanner sc1 = getScanner();

    }

    // 定义input方法
    public static void input(Scanner sc){
        System.out.println(sc);
    }

    // 定义getScanner方法
    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
}
