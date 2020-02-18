package Static;

public class StaticKeyWord {
    // static 关键字： 可以用来修饰成员变量和成员方法，被修饰的成员是属于类的，而不是单单是属
    //于某个对象的。也就是说，既然属于类，就可以不靠创建对象来调用了。
    // 类变量： 使用static 关键字修饰的的成员变量，全局变量（全局静态变量）
    // 格式： static 数据类型 变量名;
    // 示例： static int numberID;

    private String name;
    private int age;

    // 学生id
    private int sid;
    // 类变量，记录学生数量，分配学号
    public static int numberID = 0;

    // 有参构造方法
    public StaticKeyWord(String name, int age){
        this.name = name;
        this.age = age;
        // 通过类变量给学生分配学号
        this.sid = ++numberID;
    }

    // 成员方法： 打印属性值
    public void show(){
        System.out.println("Name:" + name + " Age:" + age + "Sid:" + sid);
    }

    // 静态方法： static 修饰成员方法时，该方法被称为类方法；建议使用类名调用
    // 调用方式： .类方法

    // 定义格式：
    /*
    修饰符 static 返回值类型 方法名（参数列表）{
        // 执行语句
    }
     */

    // 注意事项： 静态方法可以直接访问类变量和静态方法
    //           静态方法不能直接访问普通成员变量或成员方法，反之，成员方法可以直接访问类变量或静态方法
    //           静态方法中不能使用this关键字

    // 调用格式： 类名.类变量名; 类名.静态方法名(参数);
    public static void showNum(){
        System.out.println("num: " + numberID);
    }

    // 静态原理： static 修饰的内容
    // (1), 随着类的加载而加载，且只加载一次，
    // (2), 存储于一个块固定的内存区域（静态区），可以直接被类名直接调用，
    // (3), 优先于对象存在，被同一类的所有对象共享。

    // 静态代码块： 定义在成员位置，使用static修饰的代码块{},
    // 位置： 类中方法外
    // 执行： 随着类的加载而执行且执行一次，优先于main方法和构造方法的执行。

    // 在使用的过程中，其主要目的还是想在不创建对象的情况下，去调用方法


}
