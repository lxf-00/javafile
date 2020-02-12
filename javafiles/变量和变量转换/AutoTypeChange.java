public class AutoTypeChange{
  public static void main(String[] args){
    // 范围小的与范围大的进行运算自动转换为范围大的
    byte b1 = 3;
    int a1 = 5;
    int s1 = b1 + a1;
    System.out.println(s1);

    // 转换规则
    // byte、short、char‐‐>int‐‐>long‐‐>float‐‐>double
    float f1 = 23.45F;
    double d1 = 335;
    double s2 = d1 / f1;
    System.out.println(s2);
  }
}
