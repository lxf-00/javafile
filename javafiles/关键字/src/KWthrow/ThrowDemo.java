package KWthrow;

public class ThrowDemo {
    /*
    异常处理机制： throw

    抛出一个指定的异常对象,步骤：
        1. 创建一个异常对象。封装一些提示信息(信息可以自己编写)。
        2. 需要将这个异常对象告知给调用者。怎么告知呢？怎么将这个异常对象传递到调用者处呢？通过关键字throw
        就可以完成。throw 异常对象。

    throw用在方法内，用来抛出一个异常对象，将这个异常对象传递到调用者处，并结束当前方法的执行。

    使用格式：
        throw new 异常类名(参数);

     */

    public static void main(String[] args){
        // 创建一个数组
        int[] arr = {1,4,6,8};
        // 根据索引找到对应的值
        int index = 4;
        System.out.println(getElement(arr,index));

    }

    // 定义方法： getElement()   参数： int[] arr, int index 返回值类型： int
    public static int getElement(int[] arr, int index){
        // 判断是否越界
        if(index < 0 || index > arr.length - 1){
            // 越界： 抛出异常
            // 结束当前方法的执行，并将异常告知给调用者
            throw new ArrayIndexOutOfBoundsException("越界了....");
        }
        return arr[index];
    }

}
