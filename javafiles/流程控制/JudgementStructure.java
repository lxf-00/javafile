public class JudgementStructure{
  public static void main(String[] args){
    /* if 语句
    if （关系表达式）{
    执行语句；
    ....
  }*/

  if ( 1 != 2){
    System.out.println("不相等");
  }

  /* if - else 语句
  if (关系表达式){
  执行语句
}else{
  执行语句
}*/
  if ( 1 == 2){
    System.out.println("相等");
  }else{
    System.out.println("no equal");
  }

// if else 语句和三元运算符

  /* if (){}
  else if (){}
  else{}
  */

  int a = 65;

  if ( a >= 90 ) {
    System.out.println("优秀！");
  } else if (a >= 70 && a < 90){
    System.out.println("良");
  } else if (a < 70 && a >= 60){
    System.out.println("及格");
  }else {
    System.out.println("再接再厉");
  }

  }
}
