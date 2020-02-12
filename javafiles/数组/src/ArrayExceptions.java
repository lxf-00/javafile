public class ArrayExceptions {
    public static void main(String[] args){
        // 数组中的一些常见异常问题

        // 数组越界异常
        // ArrayIndexOutOfBoundsException
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);

        // 数组空指针异常
        // NullPointerException
        int[] arr1 = {1, 2, 3};
        arr1 = null;
        System.out.println(arr1[1]);

    }
}
