import java.util.ArrayList;
import java.util.Random;
public class ArrayListExercise {
    public static void main(String[] args){
        // ArrayList 练习1： 生成6个1~33之间的随机整数,添加到集合,并遍历
        // 1, 创建随机对象
        Random r = new Random();
        // 2， 创建存储整数的集合
        ArrayList<Integer> list = new ArrayList<>();
        // 3， 生成随机的1 ~ 33 之间的整数,并添加到集合中
        for(int i = 0; i <= 5; i++){
            list.add(r.nextInt(33) + 1);
        }
        // 4, 遍历集合
        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }

        // ArrayList 练习2： 定义4个职员对象，添加到集合中，并遍历
        // 定义 职员类,创建职员对象集合
        ArrayList<Employees> em = new ArrayList<>();

        // 创建职员类对象
        Employees obj1 = new Employees("张三", 19);
        Employees obj2 = new Employees("李四", 20);
        Employees obj3 = new Employees("王五", 21);
        Employees obj4 = new Employees("赵六", 19);

        // 添加到集合中
        em.add(obj1);
        em.add(obj2);
        em.add(obj3);
        em.add(obj4);

        // 遍历集合
        for(int i = 0; i < em.size(); i++){
            Employees s = em.get(i);
            System.out.println(s.getName() + "-----" + s.getAge());
        }

        // ArrayList 练习3：定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。格式参照 {元素
        //@元素@元素}。

        // 1， 创建ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        // 2, 添加元素
        list2.add("这是");
        list2.add("那是");
        list2.add("全部是");
        list2.add("全不是");
        // 调用方法打印ArrayList元素
        printArrayList(list2);

        // ArrayList 练习4： 定义获取所有偶数元素集合的方法(ArrayList类型作为返回值)

        // 1， 创建整数集合
        ArrayList<Integer> list3 = new ArrayList<>();
        // 2, 添加随机整数
        for(int k = 0; k < 20; k++){
            list3.add(r.nextInt(100));
        }
        // 3， 调用方法返回集合中的所有偶数元素
        ArrayList<Integer> list4 = getEvenNum(list3);
        System.out.println(list4);

    }

    // 定义按指定格式打印ArrayList方法
    public static void printArrayList(ArrayList list){
        System.out.print("{");
        for(int i = 0; i < list.size(); i++){
            System.out.print("@");
            System.out.print(list.get(i));
        }
        System.out.print("}");

    }

    // 定义返回集合中的偶数元素getEvenNum方法
    public static ArrayList<Integer> getEvenNum(ArrayList<Integer> list){
        // 定义新的集合保存原集合中的偶数元素
        ArrayList<Integer> el = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            Integer n = list.get(i);
            if(n % 2 == 0){
                el.add(n);
            }
        }
        return el;
    }
}
