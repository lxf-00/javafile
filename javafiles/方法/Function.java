// 类
public class Function{
  public static void main(String[] args){
    // 主方法
    // 方法定义在主方法外部
    methodName();
  }
  
  public static void methodName(){
      // 方法： 抽取功能，解决代码冗杂
      // 简单定义，格式：
      /*
      修饰符 返回值类型 方法名 （参数列表）｛
      代码...
      return ;
      ｝
      */
      // 方法的调用： 主方法main中调用定义的方法，直接在其中写调用的方法名称
      System.out.println("这是一个简单的方法");
    }
}
