package random;

import java.util.Random;
public class RandomClass {
    // Random 类生成伪随机数
    public static void main(String[] args){
        Random r = new Random();
        for(int i = 0; i < 5; i++) {
            // 默认从零开始（包括）     终点数（不包括）之间的随机数
            int j = r.nextInt(5);
            System.out.println("第" + (i+1) + "次" + "的随机数是:" + j);
        }
    }
}
