package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafety {
    /*
    如果有多个线程在同时运行，而这些线程可能会同时运行这段代码。程序每次运行结果和单线程运行的结果是一样
    的，而且其他的变量的值也和预期的是一样的，就是线程安全的;

    线程安全问题都是由全局变量及静态变量引起的。若每个线程中对全局变量、静态变量只有读操作，而无写
    操作，一般来说，这个全局变量是线程安全的；若有多个线程同时执行写操作，一般都需要考虑线程同步，
    否则的话就可能影响线程安全。

    线程同步： 当我们使用多个线程访问同一资源的时候，且多个线程中对资源有写的操作，就容易出现线程安全问题。
              要解决上述多线程并发访问一个资源的安全性问题:也就是解决重复票与不存在票问题，Java中提供了同步机制
             (synchronized)来解决。

    三种同步机制：
        1. 同步代码块。 synchronized 关键字
            synchronized(同步锁){
                    需要同步操作的代码
                }
        2. 同步方法。使用synchronized修饰的方法,就叫做同步方法,保证A线程执行该方法的时候,其他线程只能在方法外等着。
            public synchronized void method(){
                    可能会产生线程安全问题的代码
                }
        3. 锁机制。java.util.concurrent.locks.Lock 机制提供了比synchronized代码块和synchronized方法更广泛的锁定操作,
                    同步代码块/同步方法具有的功能Lock都有,除此之外更强大,更体现面向对象。
           public void lock() :加同步锁。
           public void unlock() :释放同步锁。



     线程状态             导致状态发生条件
    NEW(新建)             线程刚被创建，但是并未启动。还没调用start方法。
    Runnable(可运行)      线程可以在java虚拟机中运行的状态，可能正在运行自己代码，也可能没有，这取决于操作系统处理器。
    Blocked(锁阻塞)       当一个线程试图获取一个对象锁，而该对象锁被其他的线程持有，则该线程进入Blocked状态；当该线程持有锁时，该线程将变成Runnable状态。
    Waiting(无限等待)     一个线程在等待另一个线程执行一个（唤醒）动作时，该线程进入Waiting状态。进入这个状态后是不能自动唤醒的，必须等待另一个线程调用notify或者notifyAll方法才能够唤醒。
    TimedWaiting(计时等待)  同waiting状态，有几个方法有超时参数，调用他们将进入Timed Waiting状态。这一状态将一直保持到超时期满或者接收到唤醒通知。带有超时参数的常用方法有Thread.sleep 、Object.wait。
    Terminated(被终止)     因为run方法正常退出而死亡，或者因为没有捕获的异常终止了run方法而死亡。
     */
    public static void main(String[] args){
        // 创建线程任务对象
        Ticket ticket = new Ticket();
        // 创建线程对象
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        // 同时启动
        t1.start();
        t2.start();
        t3.start();
    }
}


class Ticket implements Runnable{
    private static int ticket = 100;
    Object lock = new Object();
    Lock lock1 = new ReentrantLock();

    @Override
    public void run() {
        // 同步代码块 synchronized
        // synchronized (lock) {


        while (true) {
            // 上锁
            if (ticket > 0) {
                try {
                    // 获取当前线程的名字
                    lock1.lock();
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在出售" +  ticket--);
                    // ticket--;
                    lock1.unlock();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                break;
            }
        }
    }
}
