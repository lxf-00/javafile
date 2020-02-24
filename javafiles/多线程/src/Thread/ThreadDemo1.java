package Thread;

public class ThreadDemo1 {
    /*
    创建线程的方式二：实现Runnable接口方式,重写run方法即可
        1. 定义Runnable接口的实现类，并重写该接口的run()方法，该run()方法的方法体同样是该线程的线程执行体。
        2. 创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，该Thread对象才是真正
        的线程对象。
        3. 调用线程对象的start()方法来启动线程。


     Thread和Runnable的区别:
        总结： 实现Runnable接口比继承Thread类所具有的优势
            1. 适合多个相同的程序代码的线程去共享同一个资源。
            2. 可以避免java中的单继承的局限性。
            3. 增加程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立。
            4. 线程池只能放入实现Runnable或Callable类线程，不能直接放入继承Thread的类。

     */
    public static void main(String[] args){
        // 创建对象
        Thread1 t1 = new Thread1();
        // 创建线程对象
        Thread ot = new Thread(t1, "新线程");

        // 启动线程
        ot.start();

        for(int i = 0; i < 10; i++){
            System.out.println("main线程......" + i );
        }

        // 匿名内部类
        Runnable  r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i++){
                    System.out.println("线程。。。。。" + i);
                }
            }
        };

        new Thread(r, "新线程").start();
    }
}

// 定义实现Runnable接口的子类
class Thread1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + "...." + i);
        }
    }
}
