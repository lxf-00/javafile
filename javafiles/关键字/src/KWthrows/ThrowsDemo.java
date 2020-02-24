package KWthrows;

import java.io.FileNotFoundException;

public class ThrowsDemo {
    /*
    声明异常： throws

    声明异常：将问题标识出来，报告给调用者。如果方法内通过throw抛出了编译时异常，而没有捕获处理，
            那么必须通过throws进行声明，让调用者去处理。

    关键字throws运用于方法声明之上,用于表示当前方法不处理异常,而是提醒该方法的调用者来处理异常(抛出异常).

    声明异常的格式：
        修饰符 返回值类型 方法名(参数) throws 异常类名1,异常类名2…{ }

   throws用于进行异常类的声明，若该方法可能有多种异常情况产生，那么在throws后面可以写多个异常类，用逗
号隔开。
     */
    public static void main(String[] args) throws FileNotFoundException {
        read("b.txt");

    }

    public static void read(String path) throws FileNotFoundException{
        if(!path.equals("a.txt")){
            // 不是 a.txt文件
            throw new FileNotFoundException("文件不存在");
        }
    }
}
