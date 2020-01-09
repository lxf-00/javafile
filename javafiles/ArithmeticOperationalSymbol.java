public class ArithmeticOperationalSymbol{
  public static void main(String[] args){
    int a = 2;
    int b = 4;

    // 加法
    int s1 = a + b;
    System.out.println(s1);
    // 减法
    int s2 = b - a;
    System.out.println(s2);

    //乘法
    int s3 = a * b;
    System.out.println(s3);

    // 除法
    int s4 = b / a;
    System.out.println(s4);

    // 取余
    int s5 = b % 2;
    System.out.println(s5);

    // 自增 ++： 区别在变量前和在变量后
    // a++ : 先将变量a的值赋值后，在自身+1；
    // ++a ： 先进行+1操作，在赋值
    int s6 = a++;
    System.out.println(s6);
    System.out.println(a);

    int s7 = ++b;
    System.out.println(s7);
    System.out.println(b);

  }
}
