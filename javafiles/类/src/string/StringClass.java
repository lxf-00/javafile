package string;

public class StringClass {
    public static void main(String[] args){
        // String 类： 代表字符串
        // 特点：1，字符串不变，字符串的值在创建后不能被更改；
        String s1 = "abc";
        s1 += "d";
        System.out.println(s1); // 内存中有"abc"  "abcd" 两个对象，s1从指向"abc",改变指向"abcd"

        // 特点2, 由于其不可变性，所以可以被共享
        String s2 = "ab";
        String s3 = "ab";
        // 内存中只有一个"ab"对象被创建，同时被s1 和 s2 共享

        // 特点3,  "abc" 等价于 char[] date = {'a', 'b', 'c'}
        String s4 = "abcde";
        System.out.println(s4);

        char[] data = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(data);

        // 使用String类步骤：
        // 1, 导包（可以省略）： import java.lang.String
        // 2, 查看构造方法： public String(): 初始化新建的String对象，使其表示空字符序列；
        //                 public String(char[] value): 通过当前的字符数组来构造新的String;
        //                 public String(byte[] value): 通过使用平台默认的字符集解码当前参数中的字节数组来构造新的String

        // 无参构造
        String s5 = new String();

        // 通过字符数组进行创建
        char[] c1 = {'v', 'b', 'n', 'm'};
        String s6 = new String(c1);
        System.out.println(s6);

        // 通过字节数组进行创建
        byte[] b1 = {97, 98, 99};
        String s7 = new String(b1);
        System.out.println(s7);

        // 3, 成员方法：
        // （1）, 判断功能的方法
        // public boolean equals(object anObject) : 将此字符串与指定对象进行比较；
        // public boolean equalsIgnoreCase(String anotherString): 将此字符串与指定对象进行比较，忽略大小写；

        // 创建String 对象
        String s8 = "hello";
        String s9 = "hello";
        String s10 = "Hello";

        // boolean equals()
        System.out.println(s8.equals(s9));  // true
        System.out.println(s8.equals(s10)); // false

        // boolean equalsIgnoreCase()
        System.out.println(s8.equalsIgnoreCase(s9));  // True
        System.out.println(s8.equalsIgnoreCase(s10)); // True

        // (2), 获取功能的方法:
        // public int length() : 返回此字符串的长度
        // public String concat(String str): 将指定的字符串连接到该字符串的末尾
        // public char charAt(int index): 返回指定索引值上的char值
        // public int indexOf(String str): 返回指定字符串第一次出现在该字符串中的索引
        // public String substring(int beginIndex): 返回一个子字符串，从beginIndex开始到末尾
        // public String substring(int beginIndex, int endIndex):返回一个字符串，从beginIndex开始到endIndex结束；

        // int length()
        System.out.println("s8字符串的长度：" + s8.length());

        // String concat()
        System.out.println(s8.concat(s10));

        // char charAt()
        System.out.println(s8.charAt(2));

        // int indexOf()
        System.out.println(s8.indexOf("o"));

        // String substring()
        System.out.println(s8.substring(2));
        System.out.println(s8.substring(2, 3));

        // (3), 转换功能的方法
        // public char[] toCharArray() : 将此字符串转换为新的字符数组
        // public byte[] getBytes() : 使用平台默认字符集将该字符串编码转换成新的字节数组
        // public String replace(CharSequence target, CharSequence replacement): 将于target匹配的字符串用replacement字符串替代

        // char[] toCharArray()
        String s11 = "bcfg";
        char[] s12 = s11.toCharArray();
        for(int i = 0; i < s11.length(); i++){
            System.out.println(s12[i]);
        }

        // byte[] getBytes()
        byte[] b2 = s11.getBytes();
        for(int j = 0; j < s11.length(); j++){
            System.out.println(b2[j]);
        }

        // String replace()
        String s13 = s11.replace("bc", "gh");
        System.out.println(s13);

        // (4), 分割功能的方法
        // public String[] split(String regex): 将该字符串按给定的正则表达式拆分为字符串数组

        String s14 = "aa|bb|cc";
        String[] arr = s14.split("|"); // {'a', 'a', '|', 'b', 'b', '|', 'c', 'c'}
        for(String s: arr){
            System.out.println(s);
        }
    }
}
