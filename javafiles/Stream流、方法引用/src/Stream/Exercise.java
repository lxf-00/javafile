package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Exercise {
    /*
    集合元素处理（传统方式）:
        现在有两个 ArrayList 集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以下若干操作步骤：
            1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
            2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
            3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
            4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
            5. 将两个队伍合并为一个队伍；存储到一个新集合中。
            6. 根据姓名创建 Person 对象；存储到一个新集合中。
            7. 打印整个队伍的Person对象信息。
     */
    public static void main(String[] args){
        // 第一只队伍：ArrayList one
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        // 第二只队伍: ArrayList two
        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");


        // 获取流
        Stream<String> streamOne = one.stream();
        Stream<String> streamTwo = two.stream();

        // 传统方式： 问题一
//        List<String> oneNameThree = new ArrayList<>();
//        for(String s: one){
//            if(s.length() == 3){
//                oneNameThree.add(s);
//            }
//        }

        // Stream 写法
        Stream<String> res = streamOne.filter(s -> s.length() == 3).limit(3);


        // 传统方式：问题二
//        List<String> limitThree = new ArrayList<>();
//        for(int i = 0; i < 3; i++){
//            limitThree.add(oneNameThree.get(i));
//        }

        // stream 写法
        // Stream<String> res1 = res.limit(3);

        // 传统方式：问题三
//        List<String> twoNameZhang = new ArrayList<>();
//        for(String s: two){
//            if(s.startsWith("张")){
//                twoNameZhang.add(s);
//            }
//        }

        // stream 写法
        Stream<String> res1 = streamTwo.filter(s -> s.startsWith("张")).skip(2);


        // 传统方式： 问题四
//        List<String> skipTwo = new ArrayList<>();
//        for(int i = 2; i < twoNameZhang.size(); i++){
//            skipTwo.add(twoNameZhang.get(i));
//        }

//        Stream<String> res3 = res2.skip(2);

        // 传统方式:问题五
//        List<String> summary = new ArrayList<>();
//        summary.addAll(oneNameThree);
//        summary.addAll(skipTwo);

         Stream.concat(res, res1).map(Person::new).forEach(System.out::println);

        // 传统方式：问题六
//        List<Person> list = new ArrayList<>();
//        for(String s: summary){
//            Person p = new Person(s);
//            list.add(new Person(s));
//        }

        // 传统方式：问题七
//        for(Person p: list){
//            System.out.println("姓名：" + p.getName());
//        }
//        System.out.println(list.size());

    }

    static class Person{
        private String name;

        Person(){}
        Person(String name){
            this.name = name;
        }

        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
