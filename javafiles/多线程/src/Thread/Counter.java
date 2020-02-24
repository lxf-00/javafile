package Thread;

public class Counter {
    /*
    实现一个计数器，计数到100，在每个数字之间暂停1秒，每隔10个数字输出一个字符串
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 10 == 0){
                System.out.println(i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
