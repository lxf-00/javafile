public class RecursionDemo1 {
    /*
    递归累加： 计算1 ~ n的和
     */
    public static void main(String[] args){
       int sum =  getSum(3);
       System.out.println(sum);
    }

    public static int getSum(int num){
        if(num == 1){
            return 1;
        }else{
            return num + getSum( num - 1);
        }
    }
}
