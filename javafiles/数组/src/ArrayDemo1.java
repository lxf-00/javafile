public class ArrayDemo1 {
    public static void main(String[] args) {
        // 数组的格式
        // 方式一：
        // 数组存储的数据类型 [] 数组名字 = new 数组存储的数据类型[长度]
        int[] arr = new int[3];
        // 数组内存图（数组在内存中的位置)
        // 数组在内存中的存储
        // 方法区：存储可以运行的class文件
        // 堆内存：存储对象或数组，new来创建
        // 方法栈：方法运行时使用的内存，如main方法运行时，先进入方法栈中执行
        System.out.println(arr);

        // 方式二：
        // 数据类型 []数组名 = new 数据类型[]{元素1， 元素2， 元素3....}
        int[] arr1 = new int[]{3, 4, 5, 6};
        System.out.println(arr1);

        // 方式三：
        // 数据类型[] 数组名 = {元素1， 元素2， 元素3......}
        int[] arr2 = {5, 7, 8, 2};
        System.out.println(arr2);

        // 数组的访问： 索引
        // 数组名[索引]
        System.out.println(arr1[2]);
        System.out.println(arr2[2]);

        // 数组的长度： .length
        System.out.println(arr1.length);
        // 数组的最大索引值： length - 1
        System.out.println(arr2.length - 1);

        // 数组名[索引值] = 数值    为数组中的元素赋值
        arr1[0] = 0;
        System.out.println(arr1[0]);


        // 变量 = 数组名[索引]   获取数组中的值
        int c = arr2[3];
        System.out.println(c);

        // 两个变量指向同一个数组
        int[] arr3 = new int[3];
        arr3[0] = 5;
        arr3[1] = 6;
        arr3[2] = 7;
        System.out.println(arr3[1]);

        int[] arr4 = arr3;
        arr4[1] = 10;
        System.out.println(arr3[1]);
    }

}
