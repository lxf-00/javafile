package Interface;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 接口作为方法的参数和返回值
        // ArrayList 是java.util.List 的接口类
        // 定义方法：参数arraylist 返回集合中的偶数集合
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(34);
        list1.add(12);
        list1.add(1);
        list1.add(4);
        list1.add(21);
        list1.add(13);
        list1.add(31);
        list1.add(14);
        list1.add(8);

        System.out.println(getEvenNum(list1));



    }
    public static ArrayList<Integer> getEvenNum(ArrayList<Integer> list){
        ArrayList<Integer> evenList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                evenList.add(list.get(i));
            }
        }
        return evenList;
    }
}
