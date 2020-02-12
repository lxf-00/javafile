public class EncapsulationDemo {
    // JavaBean java 编码规范要求类必须是具体的公共的，并且具有无参数构造方法
    // 提供用来操作成员变量的get, set 方法
    // 成员变量
    private String name;
    private int age;

    // 无参构造方法  --- 必须
    public EncapsulationDemo(){}
    // 有参构造方法  --- 建议
    public EncapsulationDemo(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 成员方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
