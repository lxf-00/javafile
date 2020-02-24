package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericsType {
    /*
    泛型： 可以在类或方法中预支地使用未知的类型；用来灵活地将数据类型应用到不同的类、方法、接口当中。将数据类型作为参数进行传递。
    好处：
        将运行时期的ClassCastException，转移到了编译时期变成了编译失败；
        避免了类型强转的麻烦。

    泛型是数据类型的一部分，我们将类名与泛型合并一起看做数据类型;
    自定义泛型格式： 修饰符 class 类名<代表泛型的变量> {}

    含有泛型的方法：
        修饰符 <代表泛型的变量> 返回值类型 方法名(参数){}
        使用格式：调用方法时，确定泛型的类型

     含有泛型的接口：
        修饰符 interface接口名<代表泛型的变量> {  }

     泛型通配符：
        当使用泛型类或者接口时，传递的数据中，泛型类型不确定，可以通过通配符<?>表示。
        但是一旦使用泛型的通配符后，只能使用Object类中的共性方法，集合中元素自身方法无法使用。

     */

    public static void main(String[] args){
        // 多态方式：创建ArrayList对象
        Collection<String> coll = new ArrayList<>();

        // 添加元素
        coll.add("jdk");
        coll.add("dggk");
        // coll.add(76); 当集合明确类型后，存放类型不一致就会编译报错
        // 集合已经明确具体存放的元素类型，那么在使用迭代器的时候，迭代器也同样会知道具体遍历元素类型
        Iterator<String> it = coll.iterator();
        for(String s: coll){
            System.out.println(s);
        }

        // 创建泛型为String的类
        MyGeneric<String> mg = new MyGeneric<>();
        // 调用set
        mg.setMVP("小眼咪咪");
        // 调用getMVP
        String s = mg.getMVP();
        System.out.println(s);


        MyGenericMethod mgm = new MyGenericMethod();
        mgm.show("aaa");
        System.out.println(mgm.show2("bbb"));

    }
}


// 自定义泛型类型
class MyGeneric<MVP> {
    //  没有MVP类型，在这里代表 未知的一种数据类型 未来传递什么就是什么类型
    private MVP mvp;

    public void setMVP(MVP mvp) {
        this.mvp = mvp;
    }

    public MVP getMVP() {
        return mvp;
    }
}

// 含泛型的接口
class MyGenericMethod {
    public <BPS> void show(BPS bps) {
        System.out.println(bps.getClass());
    }

    public <BPS> BPS show2(BPS bps) {
        return bps;
    }
}

// 含泛型的接口
interface GenericInter<GIV>{
    public abstract void add(GIV giv);
    public abstract GIV getGIV();
}