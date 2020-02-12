public class StrictTypeChange{
  public static void main(String[] args){
    // 强制类型转换： 强制将范围大的类型转换为范围小的
    int a1 = 3;
    short b1 = 2;
    short s1 = (short)(a1 * b1);
    System.out.println(s1);


    // 大范围赋值到小范围变量上
    // int i = 1.45  编译报错
    // 正确的转换格式：数据类型 变量名 = （数据类型）被转数据值；
    int i = (int)1.45;
    System.out.println(i);
  }
}
