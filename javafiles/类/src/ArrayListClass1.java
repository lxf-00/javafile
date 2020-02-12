import java.util.ArrayList;
public class ArrayListClass1 {
    // ArrayList 使用步骤
    // 1, java.util.ArrayList<E>: import 导包,<E> 表示一种指定的数据类型，叫做泛型。在出现 E 的地方，我们使用一种引用数据类型将其替换即可，表示我们将存储哪种引用类型的元素.
    // 示例1： ArrayList<String>; ArrayList<ArrayListClass>；

    // 2, 构造方法： public ArrayList();
    // 基本格式： ArrayList<String> list = new ArrayList<String>();

    // 3，成员方法
    // 常用的方法：增 删 查
    // public boolean add(E e): 将指定的元素添加到集合尾部
    // public E remove(int index): 移除集合上指定索引值上的元素，并返回删除的元素
    // public E get(int index): 返回集合中指定索引值上的元素
    // public int size(): 返回此集合中的元素个数, 遍历集合时，可以控制索引范围，防止越界。
    public static void main(String[] args){
        // 创建集合对象
        ArrayList<String> list = new ArrayList<String>();

        // 添加元素
        list.add("c语言");
        list.add("java");
        list.add("python");

        // 返回指定索引值上的元素
        System.out.println("get " + list.get(0));
        System.out.println("get " + list.get(1));
        System.out.println("get " + list.get(2));

        // 返回集合中元素的个数
        System.out.println("元素个数: " + list.size() + "个");

        // 删除指定索引值上的元素
        System.out.println("remove " + list.remove(0));

        // 返回集合中元素的个数
        System.out.println("元素个数: " + list.size() + "个");

        // 遍历输出
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // ArrayList对象不能存储基本类型，只能存储引用类型数据，类似 <int> 不能写，但是存储基本数据类型对应的
        // 包装类型是可以的。所以，想要存储基本类型数据， <> 中的数据类型，必须转换后才能编写，转换写法如下：
        //  基本类型         基本类型转换类
        //   byte            Byte
        //   short           Short
        //   int             Integer
        //   long            Long
        //   float           Float
        //   double          Double
        //   char            Character
        //   boolean         Boolean

        // ArrayList存储基本类型
        System.out.println("--------------------");
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        System.out.println(list1.size());
    }
}
