public class SwitchDemo{
  public static void main(String[] args){
    /* 选择语句switch
    switch (表达式){
    case 常量1：
    语句体；
    break;
  }*/

  // 判断今天是星期几
  // int weekday = 5;
  // switch (weekday){
  //   case 1:
  //   System.out.println("今天是星期一");
  //   break;
  //
  //   case 2:
  //   System.out.println("今天是星期二");
  //   break;
  //
  //   case 3:
  //   System.out.println("今天是星期三");
  //   break;
  //
  //   case 4:
  //   System.out.println("今天是星期四");
  //   break;
  //
  //   case 5:
  //   System.out.println("今天是星期五");
  //   break;
  //
  //   case 6:
  //   System.out.println("今天是星期六");
  //   break;
  //
  //   case 7:
  //   System.out.println("今天是星期日");
  //   break;
  // }

  // 输出结果： 今天是星期五


  // case 的穿透性： 如果case 没写break,将出现穿透现象，也就是不会在判断下一个case的值，直接向后运
  // 行，直到遇到break，或者整体switch结束。

  int weekday = 5;
  switch (weekday){
    case 1:
    System.out.println("今天是星期一");


    case 2:
    System.out.println("今天是星期二");


    case 3:
    System.out.println("今天是星期三");


    case 4:
    System.out.println("今天是星期四");


    case 5:
    System.out.println("今天是星期五");


    case 6:
    System.out.println("今天是星期六");


    case 7:
    System.out.println("今天是星期日");

  }
// 输出结果：今天是星期五  今天是星期六  今天是星期日

  }
}
