public class ArrayTraversal {
    public static void main(String[] args){
        // 数组的遍历
        // 循环获取数组中的每个元素
        int[] arr = {1, 2, 4, 6, 3, 9, 12};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        /* while 循环遍历
        int i = 0;
        while(i < arr.length){
            System.out.println(arr[i]);
            i++;
        }*/

        // 遍历运用1： 查找最大值/最小值
        // 假定max = 0，且arr[0] 为最大值，赋值给max;
        // 遍历获取数组的每个值，跟max比较如果比max大，就赋值给max,小就pass

        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

        // 遍历的运用2：数组的反转
        // 最大索引值
        /*
        索引值规律：索引值相加为数组长度-1，两个索引位置进行交换；实现反转
        如： arr = {1, 2, 3}  arr[0] 和 arr[2] 交换，实现反转；
        交换次数： arr.length / 2
        */
        // {1, 2, 4, 6, 3, 9, 12}

        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        // 数组的反转2： 确定最大索引值max_index 和最小索引值min_index, 依次交换max_index, min_index所代表的的数组值，max_index--; min_index++; 直到max = min;
        int max_index = arr.length - 1;
        int min_index = 0;
        while(max_index != min_index){
            int temp = arr[min_index];
            arr[min_index] = arr[max_index];
            arr[max_index] = temp;
            max_index--;
            min_index++;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
