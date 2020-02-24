package TryCatch;

public class TryCatchDemo {
    /*
    捕获异常： try catch

    如果异常出现的话,会立刻终止程序,所以我们得处理异常:
        1. 该方法不处理,而是声明抛出,由该方法的调用者来处理(throws)。
        2. 在方法中使用try-catch的语句块来处理异常。
    语法：
        try{
            编写可能会出现异常的代码
        }catch(异常类型 e){
            处理异常的代码
            //记录日志/打印异常信息/继续抛出异常
        }
     */

    public static void main(String[] args){
        try {
            // 编写可能出现异常的代码
            char[] arr = {'d', 'r', 't'};
            // 数组越界
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            // 抛出异常
            System.out.println(e);
        }
        System.out.println("over");

    }
}
