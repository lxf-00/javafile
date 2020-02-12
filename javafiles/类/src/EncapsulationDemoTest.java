public class EncapsulationDemoTest {
    public static void main(String[] args){
        EncapsulationDemo en = new EncapsulationDemo();
        // 无参构造使用
        en.setName("张三");
        en.setAge(19);
        System.out.println(en.getName());
        System.out.println(en.getAge());

        // 带参构造使用
        EncapsulationDemo en1 = new EncapsulationDemo("李四", 22);
        System.out.println(en1.getName());
        System.out.println(en1.getAge());
    }
}
