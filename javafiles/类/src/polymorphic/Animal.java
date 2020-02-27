package polymorphic;

// public class  类名 和 class 类名
// public class 定义的类可以被其他包导入使用，单要求其类名与文件名一致；
// class 定义的类，只能在同一包内使用，无法被其他包导入使用，可以与文件名不一致；

// 定义父类： Animal
public abstract class Animal {
    // 定义抽象方法：只有方法声明，无方法主体；使用abstract 修饰
    public abstract void eat();
}


// 定义子类： Cat
class Cat extends Animal{
    // 重写抽象方法
    @Override
    public void eat() {
        System.out.println("吃鱼！");
    }

    // 定义特有方法
    public void catchMouse(){
        System.out.println("抓老鼠!");
    }
}

// 定义子类： Dog
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("吃骨头！");
    }

    // 定义特有方法
    public void guardHouse(){
        System.out.println("看家护院！");
    }
}

// 测试类： test