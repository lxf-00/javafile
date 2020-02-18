package stringbuilder;

public class StringBuilderClass {
    /*
    StringBuilderClass 类： java.lang.StringBuilderClass (可变字符序列）； 类似于String的字符缓冲区，
    解决的问题：String 类的对象内容不可能更改，使用字符串拼接时，总会在内存中新建一个对象，耗时，浪费空间；

    构造方法：
        public StringBuilderClass(): 构造一个空的字符串容器；
        public StringBuilderClass(String str): 构造一个StringBuilder的容器，并将str添加进去。

    常用的方法：
        public StringBuilder append(): 添加任意类型数据的字符串形式，并返回当前对象本身；
        public String toString(): 将当前StringBuilder对象转换为字符串；
     */

    public static void main(String[] args){
        // 构造一个空的StringBuilder容器
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        // 构造一个新的StringBuilder容器，并将str 添加进去
        StringBuilder sb1 = new StringBuilder("kghkdh");
        System.out.println(sb1);

        // 使用append 向空StringBuilder中添加数据
        sb.append(233);
        sb.append("abdkg");
        sb.append('c');
        System.out.println(sb);

        // 使用toString方法将sb转换为String
        System.out.println(sb.toString());
    }
}
