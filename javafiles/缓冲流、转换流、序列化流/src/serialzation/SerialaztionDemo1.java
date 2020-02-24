package serialzation;

import serialzation.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialaztionDemo1 {
    /*
    反序列化操作1:
        对于JVM可以反序列化对象，它必须是能够找到class文件的类。如果找不到该类的class文件，则抛出一个ClassNotFoundException 异常。
    反序列化操作2:
        另外，当JVM反序列化对象时，能找到class文件，但是class文件在序列化对象之后发生了修改，那么反序列化操作也会失败，抛出一个 InvalidClassException 异常。

        原因：
            该类的序列版本号与从流中读取的类描述符的版本号不匹配
            该类包含未知数据类型
            该类没有可访问的无参数构造方法
    Serializable 接口给需要序列化的类，提供了一个序列版本号。 serialVersionUID 该版本号的目的在于验证序列化的对象和对应类是否版本匹配。
     */
    public static void main(String[] args){
        Employee e = new Employee();
        try{
            // 创建反序列化流
            FileInputStream fileIn = new FileInputStream("/Users/lxf/Desktop/test.txt");
            ObjectInputStream ois = new ObjectInputStream(fileIn);

            // 读取一个对象
            e = (Employee) ois.readObject();

            // 释放资源
            ois.close();
            fileIn.close();
        }catch(ClassNotFoundException t){
            t.printStackTrace();
        }catch(IOException t){
            t.printStackTrace();
        }

        // 无异常，打印结果
        System.out.println("name:" + e.name);
    }
}
