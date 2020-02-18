package innerclass;

public class InnerClassTest {
    public static void main(String[] args){
        // 创建外部类对象
        InnerClass ic = new InnerClass();
        // 调用内部类对象
        InnerClass.Heart h = ic.new Heart();

        // 调用内部类方法
        h.jump();
        // 调用外部类方法
        ic.setLive(false);
        // 调用外部类方法
        System.out.println(ic.isLive());
    }
}
