package ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo1 {
    /*
    1， 线程池： 线程复用；其实就是一个容纳多个线程的容器，其中的线程可以反复使用，省去了频繁创建线程对象的操作，无需反复创建线程而消耗过多资源

    2， 好处：
            降低资源消耗；
            提高响应速度；
            提高线程的可管理性；

    3，使用：
            线程池的顶级接口是 java.util.concurrent.Executor；但是严格意义上讲 Executor 并不是一个线程
            池，而只是一个执行线程的工具。真正的线程池接口是 java.util.concurrent.ExecutorService

    4，创建线程池的方法：
            public static ExecutorService newFixedThreadPool(int nThreads) ：返回线程池对象。(创建的是有界线
            程池,也就是池中的线程个数可以指定最大数量)；

            public Future<?> submit(Runnable task) :获取线程池中的某一个线程对象，并执行；（Future接口：用来记录线程任务执行完毕后产生的结果。线程池创建与使用。
    5， 使用线程的步骤：
             创建线程池对象。
             创建Runnable接口子类对象。(task)
             提交Runnable接口子类对象。(take task)
             关闭线程池(一般不做)。
     */

    public static void main(String[] args){
        // 创建线程池对象： 包含两个线程对象
        ExecutorService service = Executors.newFixedThreadPool(2);
        // 创建Runnable 实例对象: 多态方式
        Runnable r = new MyRunnable();
        // Thread t = new Thread(r, "新线程");
        // t.start();
        // 从线程池中获取线程对象，然后调用MyRunnable中的run方法
        service.submit(r);
        // 再次调用
        service.submit(r);
        service.submit(r);
        service.submit(r);

        // 关闭线程池
        service.shutdown();
    }
}


// Runnable 实现类
class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("我需要一个教练....");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("教练来了" + Thread.currentThread().getName());
    }
}


