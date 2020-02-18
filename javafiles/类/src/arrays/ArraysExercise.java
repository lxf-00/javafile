package arrays;

import java.util.Arrays;
public class ArraysExercise {
    public static void main(String[] args){
        // Arrays 练习1： 将一个随机字符串中的所有字符升序排列，并倒序打印

        // 定义随机字符串
        String s = "ghjdlgja45";
        // 将字符串转换为字符数组
        char[] c = s.toCharArray();
        // 升序排序
        Arrays.sort(c);
        System.out.println("升序排序后的结果：" + Arrays.toString(c));
        // 倒序打印1： 先进行反转，后依次打印
        char[] c1 = revseChar(c);
        System.out.print("倒序打印：");
        for(char c2: c1){
            System.out.print(c2);
        }

        // 倒序打印2： 从最末为index开始打印， index-- 直到>= 0;
        System.out.print("倒序打印：");
        for(int index = c.length - 1; index >= 0; index--){
            System.out.print(c[index]);
        }
    }

    // 定义反转方法： reverseChar
    public static char[] revseChar(char[] arr){
        // 定义临时变量保存交换值
        char temp = ' ';
        // 进行反转
        for(int i = 0; i <= arr.length / 2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        // 返回字符数组
        return arr;
    }
}
