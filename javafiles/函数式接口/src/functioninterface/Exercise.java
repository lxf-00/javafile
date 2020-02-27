package functioninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exercise {
    /*
    练习： 使用 Supplier 接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。提示：接口的泛型请使用，java.lang.Integer 类。
          格式化打印信息：下面的字符串数组当中存有多条信息，请按照格式“ 姓名：XX。性别：XX。 ”的格式将信息打印出来。要求将打印姓
                        名的动作作为第一个 Consumer 接口的Lambda实例，将打印性别的动作作为第二个 Consumer 接口的Lambda实
                        例，将两个 Consumer 接口按照顺序“拼接”到一起

          集合信息筛选：数组当中有多条“姓名+性别”的信息如下，请通过 Predicate 接口的拼装将符合要求的字符串筛选到集合ArrayList 中，需要同时满足两个条件：
                        1. 必须为女生；
                        2. 姓名为4个字。

        请使用 Function 进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
            String str = "赵丽颖,20";
            1. 将字符串截取数字年龄部分，得到字符串；
            2. 将上一步的字符串转换成为int类型的数字；
            3. 将上一步的int数字累加100，得到结果int数字
     */
    public static void main(String[] args){
        int[] arr = {3,6,1,7,2,9};
        // 调用getMax方法
       int maxNum =  getMax(() ->{
           int max = arr[0];
           for(int i: arr){
               if(i > max){
                   max = i;
               }
           }
           return max;
       });
       System.out.println(maxNum);

        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };
        printInfo(s -> System.out.print("姓名：" + s.split(",")[0]),
                  s -> System.out.print("。 性别：" + s.split(",")[1] + "。"),array);


        String[] array1 = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        List<String> list = filter(array1, s -> "女".equals(s.split(",")[1]),
                    s -> s.split(",")[0].length() == 4);

        System.out.println(list);

        String str = "赵丽颖,20";
        int age = demoFunction(str, s -> s.split(",")[1],
                s -> Integer.parseInt(s),
                n -> n += 100
                );
        System.out.println(age);
    }

    // 定义方法： 参数传递supplier, 泛型使用Integer
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    //定义方法
    private static void printInfo(Consumer<String> one, Consumer<String> two, String[] array){
        for(String info: array){
            one.andThen(two).accept(info);
        }
    }

    private static List<String> filter(String[] arry, Predicate<String> one, Predicate<String> two ){
        List<String> list = new ArrayList<>();
        for(String info: arry){
            if(one.and(two).test(info)){
                list.add(info);
            }
        }
        return list;
    }

    private static int demoFunction(String str, Function<String, String> one, Function<String, Integer>two,
                                     Function<Integer, Integer> three){
        return one.andThen(two).andThen(three).apply(str);

    }
}
