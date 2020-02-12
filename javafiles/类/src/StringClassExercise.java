import java.util.Scanner;
public class StringClassExercise {
    public static void main(String[] args){
        // String 类练习1： 定义一个方法，把数组{1,2,3}按照指定个格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
        int[] arr = {1,2,3};
        String arr1 = arrayToString(arr);
        System.out.println(arr1);

        // String 类练习2： 键盘录入一个字符，统计字符串中大小写字母及数字字符个数

        // 创建Scanner 对象
        Scanner sc = new Scanner(System.in);
        // 后去用户输入的字符串
        System.out.println("请输入一个字符串");
        // 定义变量保存大写字母的个数；小写字母的个数； 数字个数；
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int integerCount = 0;

        String s = sc.nextLine();
        for(char c: s.toCharArray()){
            // 进行判断
            if(c >= 'A' && c <= 'Z'){
                upperCaseCount++;
            }else if(c >= 'a' && c <= 'z'){
                lowerCaseCount++;
            }else if(c >= '0' && c <= '9'){
                integerCount++;
            }else{
                System.out.println("非法输入！");
            }
        }

        // 显示结果
        System.out.println("输入的字符串为：" + s + " 其中大写字母个数：" + upperCaseCount + "个；小写字母个数：" + lowerCaseCount + "个；数字个数： "+ integerCount + "个");
    }

    // 定义方法：将指定数组按相应的格式拼接成一个字符串
    public static String arrayToString(int[] arr){
        // 创建新的字符串
        String arr1 = new String("[");
        // 一次取出arr中的元素进行拼接
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                arr1 = arr1.concat("word"+ arr[i] + "]");
            }else{
                arr1 = arr1.concat("word"+ arr[i] + "#");
            }
        }
        return arr1;
    }
}
