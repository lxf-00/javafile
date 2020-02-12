public class Operator_01{
public static void main(String[] args){
    // += 扩展
    // 一般来说：范围小的赋值到范围大的类型上会自动转换，反之不强制转换会报错
    // 以下代码不会报错：+= 会自动强制转换
    short a = 1;
    a+= 5;
    System.out.println(a);
  }
}
