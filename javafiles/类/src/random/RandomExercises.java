package random;

import java.util.Scanner;
import java.util.Random;
public class RandomExercises {
    public static void main(String[] args){
        // 练习1：根据用户输入的整数 n, 返回0 ~ n之间的随机数（包括n)
        random_exer1();

        // 测试是否包含n
        for(int i = 0; i < 3; i++){
            random_exer1();
        }

        // 练习2：猜数字游戏
        guess_number_game();
    }

    public static void random_exer1(){
        System.out.println("请输入一个整数:");
        int i = new Scanner(System.in).nextInt();
        int j = new Random().nextInt(i+1);
        System.out.println("随机数:" + j);

    }

    public static void guess_number_game(){
        Scanner sc = new Scanner(System.in);
        // 1, 生成0 ~ 100 间的随机数一个； num
        int num = new Random().nextInt(100);
        while (true) {
            // 2, 让用户猜测数字：guess_num;
            System.out.println("猜猜随机数为多少？（0 ~ 100不包括100）");
            int guess_num = sc.nextInt();
            // 3, 比较num 和 guess_num: 相等，恭喜猜对结束；猜错说明是大了，还是小了
            if(guess_num == num) {
                System.out.println("恭喜猜对了！");
                // 4，直到用户猜对为止，程序结束
                break;
            }else if(guess_num < num){
                System.out.println("小了");
            }else{
                System.out.println("大了");
            }
        }
    }
}
