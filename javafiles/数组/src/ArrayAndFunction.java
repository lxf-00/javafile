public class ArrayAndFunction {
    public static void main(String[] args){
        // 数组作为方法参数进行传递，传递的参数是数组内存的地址。
        int[] arr1 = {3, 5, 9};
        printArray(arr1);

        // 数组作为方法的返回值
        // 接收得是数组的内存地址
        int[] arr = getArray();
        printArray(arr);
    }
    // 方法： 遍历数组（参数传递为数组）
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    // 方法： 返回一个数组
    public static int[] getArray(){
        int[] arr = {3, 5, 6};
        return arr;
    }
}
