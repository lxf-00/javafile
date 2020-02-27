package Refect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import domain.Person;

public class ReflectDemo5 {
    /**
     * 框架类
     * 不改变该类的任何代码的情况下，可以创建任意类的对象，并且执行其中任意方法
     * 配置文件 反射
     */
    public static void main(String[] args) throws Exception{
        // 1, 加载配置文件
            // 1.1 创建properties对象
        Properties pro = new Properties();
            // 1.2 加载配置文件，转换为集合
                // 1.2.1 获取class目录下的配置文件
        ClassLoader classLoader = ReflectDemo5.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);


        // 2， 获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");


        // 3， 加载该类进内存，
        Class cls = Class.forName(className);
        // 创建对象
        Object obj = cls.getConstructor().newInstance();
        // 获取方法对象
        Method method = cls.getMethod(methodName);
        // 执行方法
        method.invoke(obj);
    }
}
