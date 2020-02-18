package System;

public class SystemClass {
    /*
    System 类： 获取与系统相关的信息或系统级操作；

    常用的方法：
        public static long currentTimeMillis(): 返回以毫秒为单位的当前时间;
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length): 将数组中指定的数据拷贝到另一个数组中
                                            源数组      源数组起始索引  目标数组     目标数组起始索引   复制元素个数
     */

    public static void main(String[] args){
        // 使用currentTimeMillis 获取当前时间以毫秒为单位
        System.out.println(System.currentTimeMillis());


        // 定义两个数组
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9,10,11,12};
        System.arraycopy(arr1, 2, arr2, 3, 2);
        for(int i: arr1){
            System.out.print(i);
        }
        System.out.println("----------------");
        for(int i: arr2){
            System.out.print(i);
        }

    }
}
