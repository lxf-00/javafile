public class VariablesDemo {
    /*
    在JDK1.5之后，如果我们定义一个方法需要接受多个参数，并且多个参数类型一致，我们可以对其简化成如下格式:
        修饰符 返回值类型 方法名(参数类型... 形参名){ }
        修饰符 返回值类型 方法名(参数类型[] 形参名){ }

    后者这种定义，在调用时必须传递数组，而前者可以直接传递数据即可。

    JDK1.5以后。出现了简化操作。... 用在参数上，称之为可变参数。
    同样是代表数组，但是在调用这个带有可变参数的方法时，不用创建数组(这就是简单之处)，直接将数组中的元素
    作为实际参数进行传递，其实编译成的class文件，将这些元素先封装到一个数组中，在进行传递。这些动作都在编
    译.class文件时，自动完成了
     */

    public static void main(String[] args){
        int[] arr = {2,3,5,7,1};
        int sum = getSum(arr);
        System.out.println(sum);

        // 另一种表现形式
        int sum2 = getSum(2,3,5,7,1);
        System.out.println(sum2);

    }

    // 可变参数的写法
    public static int getSum(int... arr){
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        return sum;
    }
}
