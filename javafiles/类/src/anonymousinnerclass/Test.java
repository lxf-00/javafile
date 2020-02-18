package anonymousinnerclass;

public class Test {
    // 测试匿名内部类： 接口
    public static void main(String[] args){
        AnonymousIC aic = new AnonymousIC() {
            @Override
            public void method1() {
                System.out.println("匿名内部类方法1");
            }
        };
        aic.method1();
        // 匿名内部函数作为方法参数引用
        method(aic);

        // 简化
        method(new AnonymousIC(){
            @Override
            public void method1() {
                System.out.println("匿名内部类方法2");
            }
        });
    }

    public static void method(AnonymousIC a){
        a.method1();
    }

}
