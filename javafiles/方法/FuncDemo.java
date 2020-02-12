public class FuncDemo {
    public static void main(String[] args){
        // 打印出矩形的
        rect();
        // 求两个数的和
        int c = getSum(3, 5);
        System.out.println(c);
    }

    public static void rect(){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 7; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int getSum(int a, int b){
        return a + b;
    }
}
