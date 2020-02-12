public class ArrayListClassTest {
    public static void main(String[] args){
        // 创建数组对象
        ArrayListClass[] al = new ArrayListClass[3];
        // 创建类对象
        ArrayListClass obj1 = new ArrayListClass("张三", 19);
        ArrayListClass obj2 = new ArrayListClass("李四", 20);
        ArrayListClass obj3 = new ArrayListClass("王五", 21);
        // 把创建的对象作为元素赋值给数组
        al[0] = obj1;
        al[1] = obj2;
        al[2] = obj3;

        // 遍历数组
        for(int i = 0; i < al.length; i++){
            ArrayListClass ao = al[i];
            System.out.println("名字：" + ao.getName() + "； 年龄： "+ ao.getAge());
        }
    }
}
