package Static;

import Static.StaticKeyWord;


public class StaticKeyWordTest {
    public static void main(String[] args){
        StaticKeyWord skw1 = new StaticKeyWord("张三", 19);
        StaticKeyWord skw2 = new StaticKeyWord("李四", 20);
        StaticKeyWord skw3 = new StaticKeyWord("王五", 21);
        StaticKeyWord skw4 = new StaticKeyWord("赵六", 22);

        skw1.show();
        skw2.show();
        skw3.show();
        skw4.show();

        // 访问静态变量
        System.out.println(StaticKeyWord.numberID);
        // 调用静态方法
        StaticKeyWord.showNum();
    }
}
