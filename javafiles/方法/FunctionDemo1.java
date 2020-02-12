public class FunctionDemo1 {
    public static void main(String[] args){
        // 比较两个整数是否相同
        boolean s = isEqual(6, 6 );
        System.out.println(s);

        // 计算1+2+3+4+....+100
        getSum(100);

        // 实现不定次数打印
        printHello(5);

    }

    public static boolean isEqual(int a, int b){
        if (a == b){
            return true;
        }else{
            return false;
        }
    }

    public static void getSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printHello(int n){
        for (int i = 1; i <= n; i++){
            System.out.print("hello");
        }
    }

}
