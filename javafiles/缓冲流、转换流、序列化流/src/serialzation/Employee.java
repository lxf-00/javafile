package serialzation;

public class Employee implements java.io.Serializable{
    public String name;
    public String address;
    transient int age;   // transient 修饰的成员变量不会被序列化

    public void addressCheck(){
        System.out.println(address + "......checked ....." + name);
    }

}

