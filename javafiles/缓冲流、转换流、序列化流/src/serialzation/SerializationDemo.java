package serialzation;

import java.io.*;

public class SerializationDemo {
    /*
    Java 提供了一种对象序列化的机制:
        用一个字节序列可以表示一个对象，该字节序列包含该 对象的数据 、 对象的类型 和 对象中存储的属性 等信息。字节序列写出到文件之后，相当于文件中持久保存了一个对象的信息;
        反之，该字节序列还可以从文件中读取回来，重构对象，对它进行反序列化.

    ObjectOutputStream类: java.io.ObjectOutputStream 类，将Java对象的原始数据类型写出到文件,实现对象的持久存储
        构造方法:
            public ObjectOutputStream(OutputStream out) ： 创建一个指定OutputStream的ObjectOutputStream。

        序列化的作用：
          1，简单又可扩展的对象存储机制；
          2，远程调用，方便对对象编码解码；
          3，将对象持久化到介质中；
          4，允许对象自定义外部存储格式；

        序列化操作:
            1. 一个对象要想序列化，必须满足两个条件:
                该类必须实现 java.io.Serializable 接口， Serializable 是一个标记接口，不实现此接口的类将不会使任何状态序列化或反序列化，会抛出 NotSerializableException 。
                该类的所有属性必须是可序列化的。如果有一个属性不需要可序列化的，则该属性必须注明是瞬态的，使用transient 关键字修饰。

   ObjectInputStream类： 反序列化流，将之前使用ObjectOutputStream序列化的原始数据恢复为对象
        构造方法：
            public ObjectInputStream(InputStream in) ： 创建一个指定InputStream的ObjectInputStream。

        反序列化操作1：
            如果能找到一个对象的class文件，我们可以进行反序列化操作，调用 ObjectInputStream 读取对象的方法
            public final Object readObject () : 读取一个对象。
     */
    public static void main(String[] args){
        Employee e = new Employee();
        e.name = "张三";
        e.address = "北京市";
        e.age = 21;

        try (
            // 创建序列化对象
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/lxf/Desktop/test.txt"));
        ){
            // 写出对象
            oos.writeObject(e);

        }catch (FileNotFoundException t){
            t.printStackTrace();
        }catch (IOException t){
            t.printStackTrace();
        }


    }
}
