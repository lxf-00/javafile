package KWfinally;

public class FinallyDemo {
    /*
    finally：有一些特定的代码无论异常是否发生，都需要执行。另外，因为异常会引发程序跳转，导致有些语句执行
             不到。而finally就是解决这个问题的，在finally代码块中存放的代码都是一定会被执行的。

    finally的语法:
        try...catch....finally:自身需要处理异常,最终还得关闭资源;
     */
    public static void main(String[] args){
        try{
            double[] arr = {3.4,5.7,8.2};
            System.out.println(arr[4]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally{
            System.out.println("不管程序怎样，都要运行...");
        }
    }
}
