package Final;

public class Final {
    // final 关键字： 修饰不可改变的内容
    // 用来修饰类，方法， 变量
    // 类： 被修饰的类，不能被继承；
    // 方法： 被修饰的方法不能被重写；
    // 变量： 被修饰的变量不能重新赋值；

    // 格式：
        // final class 类名{}
        // 修饰符 final 返回值类型 方法名(参数列表){}
        // 修饰变量：final 数据类型 变量名;


    public static void main(String[] args){
        // 修饰局部变量  --- 基本类型

        // 声明变量： final 修饰
        final int a;
        // 第一次赋值
        a = 4;  // 通过
        // 第二次赋值
        // a = 5;   报错

        // 循环中的体现: 以下编译出错
//        final int b = 0;
//        for(int i = 0; i < 5; i++){
//            b = i;
//            System.out.println(b);
//        }

        // 循环中的体现： 以下会通过
        for(int i = 0; i < 5; i++){
            final int b = i;
            System.out.println(b);
        }
        // 后面一种，每次循环都是新的变量b;

        // 修饰局部变量 --- 引用类型

        // 引用类型的局部变量，被final修饰后，只能指向一个对象，地址不能再更改；不影响内部成员变量的修改
        // 创建一个User对象，用final 修饰
        final User u = new User();
        // 创建第二User对象
        // u = new User(); 报错，指向了新的对象，地址值发生改变
        u.setName("张三");
        System.out.println(u.getName());

        // 修饰成员变量

        // 涉及到初始化问题：
        // 1， 显示初始化： final String USERNAME = "张三";
        // 2， 构造方法初始化： final String USERNAME; public 类名(String username){// }
        // 被final修饰的常量，一般所有字母都大写；
    }

}
