public class FUOS{
  public static void main(String[] args){
    // 赋值运算符： =
    int i = 5;
    System.out.println(i);
    // +=: i = i + 5(先运算后赋值)
    i+= 5;
    System.out.println(i);  // 输出结果10

    i = 5;    // i 已经定义，重新赋值
    // -=： i = i -5
    i-= 5;
    System.out.println(i);  // 输出结果0

    float b = 12.2F;
    // /=
    b/= 2;
    System.out.println(b); // 输出结果6.1

  }
}
