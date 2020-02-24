public class RecursionDemo {
    /*
    递归： 指在当前方法内调用自己的这种现象。

    递归的分类:
        递归分为两种，直接递归和间接递归。
        直接递归称为方法自身调用自己。
        间接递归可以A方法调用B方法，B方法调用C方法，C方法调用A方法

    注意事项：
        递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
        在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出。
        构造方法,禁止递归


     */
    public static void main(String[] args){
        b(1);
    }

    private static void b(int i){
        System.out.println(i);

        if(i == 5000){
            return;
        }
        b(++i);
    }
}
