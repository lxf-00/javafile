package Exception;

import javax.security.auth.login.LoginException;

public class ExceptionDemo {
    /*
    异常 ：指的是程序在执行过程中，出现的非正常的情况，最终会导致JVM的非正常停止;
    异常体系: 根类是 java.lang.Throwable;其下有两个子类：java.lang.Error 与 java.lang.Exception ，
             平常所说的异常指 java.lang.Exception;


   Throwable体系：
        Error:严重错误Error，无法通过处理的错误，只能事先避免，好比绝症。
        Exception:表示异常，异常产生后程序员可以通过代码的方式纠正，使程序继续运行，是必须要处理的.

   Throwable中的常用方法：
        public void printStackTrace() :打印异常的详细信息。
        包含了异常的类型,异常的原因,还包括异常出现的位置,在开发和调试阶段,都得使用printStackTrace。
        public String getMessage() :获取发生异常的原因。
        提示给用户的时候,就提示错误原因。
        public String toString() :获取异常的类型和异常描述信息(不用)

    异常的分类：
        编译时期异常:checked异常。在编译时期,就会检查,如果没有处理异常,则编译失败。(如日期格式化异常)
        运行时期异常:runtime异常。在运行时期,检查异常.在编译时期,运行异常不会编译器检测(不报错)。(如数学异
        常)

    异常的处理：
        Java异常处理的五个关键字：try、catch、finally、throw、throws

   异常的注意事项：
        1， 多个异常：一次捕获，多次处理；
           try{
                编写可能会出现异常的代码
            }catch(异常类型A e){ 当try中出现A类型异常,就用该catch来捕获.
                处理异常的代码
                //记录日志/打印异常信息/继续抛出异常
            }catch(异常类型B e){ 当try中出现B类型异常,就用该catch来捕获.
                处理异常的代码
                //记录日志/打印异常信息/继续抛出异常
            }
       2， 运行时异常被抛出可以不处理。即不捕获也不声明抛出；
       3， 如果finally有return语句,永远返回finally中的结果,避免该情况；
       4， 如果父类抛出了多个异常,子类重写父类方法时,抛出和父类相同的异常或者是父类异常的子类或者不抛出异常。
       5， 父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出

    自定义异常：
        在开发中根据自己业务的异常情况来定义异常类.
        自定义一个业务逻辑异常: RegisterException。一个注册异常类。

    异常类如何定义:
        1. 自定义一个编译期异常: 自定义类 并继承于 java.lang.Exception 。
        2. 自定义一个运行时期的异常类:自定义类 并继承于 java.lang.RuntimeException 。
     */
    private static String[] names = {"bilili", "iqy", "tencent"};
    public static void main(String[] args) throws RegisterException{
        // 模拟登陆：数据库已存在相关账户
        try{
            // 可能出现异常
            checkUserName("bilili");
            System.out.println("注册成功");
        }catch (RegisterException e){
            e.printStackTrace();
        }
    }
   public static boolean checkUserName(String name) throws RegisterException{
        for(String n: names){
            if(n.equals(name)){
                // 抛出异常
                throw new RegisterException("已经被注册了");
            }
        }
        return true;
   }
}


// 自定义异常类：继承 java.lang.Exception
class RegisterException extends Exception{
    // 空参构造
    RegisterException(){}
    // 异常提醒
    RegisterException(String message){
        super(message);
    }
}


