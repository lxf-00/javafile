public class ConstantVariableOperation{
  public static void main(String[] args){
    // 常量和变量的运算
    byte b1 = 1;
    byte b2 = 2;
    byte b3 = 1 + 2;   // 常量固定不变，java编译器在编译时确定了后面值不超过byte范围，不会报错；
    // byte b4 = b1 + b2;  // 变量相加，变量范围类型不固定，编译器不确定后面结果是什么，采用默认int类型，报错int转byte;

    System.out.println(b3);
    // System.out.println(b4);
  }
}
