public class LogicOS{
  public static void main(String[] args){
    // 逻辑运算符
    // 短路与： && 一边为false，另一边不运算，直接为false; 两边为true是true;
    System.out.println(1 < 2 && 3 < 4);   // true
    System.out.println(1 > 2 && 3 < 4 );  // false
    // 短路或： || 任意一边为true,其结果都为true,只有当两边为false, 结果为false
    System.out.println(1 < 2 || 3 > 4);    // true
    System.out.println(1 > 2 || 3 > 4);    // false
    // 取反 ： ！
    System.out.println(!(1 > 2));   // true

  }
}
