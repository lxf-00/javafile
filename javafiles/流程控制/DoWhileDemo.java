public class DoWhileDemo{
  public static void main(String[] args){
    // 循环语句： do.. while 语句
    /* 初始化表达式
      do {
      循环体；
      步进表达式；
    }while(布尔表达式)；*/

    // 求0 ~ 100 之间的和
    int sum = 0;
    int i = 1;
    do{
      sum += i;
      i++;
    }while(i<=100);
    System.out.println(sum);

    // for 和 while 的区别
    // 控制条件语句控制的那个变量，在for 循环后不能被访问；被回收；而while循环后可以被访问；
  }
}
