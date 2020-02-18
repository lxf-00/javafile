package polymorphic;

public class Test {
    public static void main(String[] args){
        // 多态形式，创建对象
        // 向上转型:默认
        Animal a1 = new Cat();
        // 调用子类的方法:Cat
        a1.eat();   // 吃鱼

        Animal a2 = new Dog();
        a2.eat();   // 吃骨头

        System.out.println("----------------------------");
        // 多态形式，创建对象
        Cat c = new Cat();
        showCatEat(c);

        Dog d = new Dog();
        showDogEat(d);

        // 以上都可以用showAnimalEat()代替，且执行结果一样
        showAnimalEat(a1);


        // 调用子类特有的方法
        // 向下转型
        Cat c1 = (Cat) a1;
        c1.catchMouse();

        // instanceof 测试
        System.out.println(c1 instanceof Cat);   // true
        System.out.println(c1 instanceof Animal); // true
        // System.out.println(c1 instanceof Dog);  编译无法通过
    }
    // 测试： 父类类型作为形式参数，进行方法调用
    public static void showCatEat(Cat c){
        c.eat();
    }

    public static void showDogEat(Dog d){
        d.eat();
    }

    public static void showAnimalEat(Animal a){
        a.eat();
    }
}
