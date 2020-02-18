package arrays;

import java.util.Arrays;
public class ArraysClass {
    // java.util.Arrays 包含用来操作数组的所有方法，比如排序和搜索，所有的方法均为静态方法，调用起来非常方便
    public static void main(String[] args) {
        // 操作数组的方法：

        // (1), public static String toString(int[] a) : 返回指定数组内容的字符串表现形式
        int[] arr1 = {1,2,3,4};
        // 打印arr1的地址
        System.out.println(arr1);
        // 进行字符串转换
        String s1 = Arrays.toString(arr1);
        // 输出转换后的内容
        System.out.println(s1);

        // (2), public static void sort(int[] a): 对指定的数组进行升序排序
        int[] arr2 = new int[]{5,2,1,6,3};
        // 打印排序前的数组顺序
        System.out.println("排序前的顺序为：" + Arrays.toString(arr2));
        // 升序排序
        Arrays.sort(arr2);
        // 打印排序后的结果
        System.out.println("排序后的顺序为：" + Arrays.toString(arr2));



    }
}
