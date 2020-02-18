package innerclass;

public class InnerClass {
    // 内部类： 将类B定义到类A中，类B为内部类，类A为外部类；
    // 成员内部类： 类中方法外的类
    // 格式：
        // class 外部类名{
            // class 内部类名{}
        // }

    // 使用场景： 在描述事物时，一个事物还包含其他事物，既可以使用内部类这种结构；

    // 访问特点：
    // 内部类可以直接访问外部类成员，包括私有成员；
    // 外部类要访问内部类的成员，需要建立内部类对象；
    // 格式： 外部类名.内部类名 对象名 = new 外部类型().new 内部类型();

    private boolean live = true;
    class Heart{
        public void jump() {
            // 直接访问外部成员
            if (live) {
                System.out.println("心脏跳动！");
            }else{
                System.out.println("心脏位跳动！");
                live = false;
            }
        }
    }

    public boolean isLive(){
        return live;
    }

    public void setLive(boolean live){
        this.live = live;
    }

}
