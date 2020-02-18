package System;

public class Exercise {
    /*
    验证for循环打印数字1-9999所需要使用的时间（毫秒）
     */
    public static void main(String[] args){
        // 获取当前时间
       long start_time = System.currentTimeMillis();
       // 开始循环
        for(int i = 1; i <= 9999; i++){
            System.out.println(i);
        }
        // 获取结束时间
        long end_time = System.currentTimeMillis();
        // 显示结果
        System.out.println("总共耗时：" + (end_time - start_time)+ "毫秒");
    }
}
