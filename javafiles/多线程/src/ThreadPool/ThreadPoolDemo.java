package ThreadPool;

public class ThreadPoolDemo {
    /*
    1, 线程间通信： 多个线程在处理同一个资源，但是处理的动作（线程的任务）却不相同。

    2， 等待唤醒机制： 保证线程间通信有效利用资源；
        多个线程间的一种协作机制；
        wait/notify: 就是在一个线程进行了规定操作后，就进入等待状态（wait()）， 等待其他线程执行完他们的指定代码过后 再将
                     其唤醒（notify()）;在有多个线程进行等待时， 如果需要，可以使用 notifyAll()来唤醒所有的等待线程。
        方法：
            （1）. wait：线程不再活动，不再参与调度，进入 wait set 中，因此不会浪费 CPU 资源，也不会去竞争锁了，这时
            的线程状态即是 WAITING。它还要等着别的线程执行一个特别的动作，也即是“通知（notify）”在这个对象
            上等待的线程从wait set 中释放出来，重新进入到调度队列（ready queue）中
            （2）. notify：则选取所通知对象的 wait set 中的一个线程释放；例如，餐馆有空位置后，等候就餐最久的顾客最先
            入座。
            （3）. notifyAll：则释放所通知对象的 wait set 上的全部线程。
        注意细节：
            wait方法与notify方法必须要由同一个锁对象调用；
            wait方法与notify方法是属于Object类的方法的；
            wait方法与notify方法必须要在同步代码块或者是同步函数中使用；
     */
    public static void main(String[] args){
        // 等待唤醒的案例
        BaoZi bz = new BaoZi();

        Customer c = new Customer("消费者", bz);
        BaoZiPu bzp = new BaoZiPu("包子铺", bz);

        c.start();
        bzp.start();
    }
}


// 资源类
class BaoZi{
   // 成员变量
    String pier;
    String xianer;
    boolean flag = false;  // 包子资源状态   false 不存在  true 存在
}

// 消费者线程
class Customer extends Thread{
    private BaoZi bz;

    Customer(String name, BaoZi bz){
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (bz) {
                if (bz.flag == false) {
                    // 包子未做好
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("消费者正在吃" + bz.pier + bz.xianer + "包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}


// 包子店线程
class BaoZiPu extends Thread{
    private BaoZi bz;

    BaoZiPu(String name, BaoZi bz){
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        // 制作包子
        while(true){
            // 同步
            synchronized (bz){
                if(bz.flag == true){
                    // 包子存在
                    try{
                        bz.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                // 包子不存在
                System.out.println("包子店正在做包子....");
                if(count % 2 == 0){
                    bz.pier = "冰皮";
                    bz.xianer = "五仁";
                }else{
                    bz.pier = "薄皮";
                    bz.xianer = "牛肉大葱";
                }
                count++;

                // 更改包子状态
                bz.flag = true;
                System.out.println("包子造好了:" + bz.pier + bz.xianer + "消费者可以吃了");
                // 唤醒消费者
                bz.notify();
            }
        }
    }
}