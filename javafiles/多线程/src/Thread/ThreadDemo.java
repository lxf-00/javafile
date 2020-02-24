package Thread;

public class ThreadDemo {
    /*
    并行： 同一时间同时发生
    并发：同一时间段内发生

    线程： java.lang.Thread
    所有的线程对象都必须是Thread类或其子类的实例。

    构造方法：
        public Thread() :分配一个新的线程对象。
        public Thread(String name) :分配一个指定名字的新的线程对象。
        public Thread(Runnable target) :分配一个带有指定目标新的线程对象。
        public Thread(Runnable target,String name) :分配一个带有指定目标新的线程对象并指定名字。

    常用的方法：
        public String getName() :获取当前线程名称。
        public void start() :导致此线程开始执行; Java虚拟机调用此线程的run方法。
        public void run() :此线程要执行的任务在此处定义代码。
        public static void sleep(long millis) :使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
        public static Thread currentThread() :返回对当前正在执行的线程对象的引用。

    Java中通过继承Thread类来创建并启动多线程的步骤如下：（方式一： 继承Thread类）
        1. 定义Thread类的子类，并重写该类的run()方法，该run()方法的方法体就代表了线程需要完成的任务,因此把
            run()方法称为线程执行体;
        2. 创建Thread子类的实例，即创建了线程对象;
        3. 调用线程对象的start()方法来启动该线程;
     */
    public static void main(String[] args){
        // 创建自定义线程对象
        MyThread mt = new MyThread("新的线程！");
        // 开启线程
        mt.start();

        for(int i = 0; i < 10; i++){
            System.out.println("main线程" + i);
        }
    }
}


// 定义线程类
class MyThread extends Thread{
    // 定义指定线程的名字
    public MyThread(String name){
        // 调用父类的String参数的构造方法，指定线程名字
        super(name);
    }
    // 重写run方法
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(getName() + ":正在执行！" + i);
        }
    }
}
