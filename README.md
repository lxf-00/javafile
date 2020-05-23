# javafile
some exercise of learning java

# 主要知识点
Java基础知识，Java高级，网络编程
<<<<<<< HEAD


###### 说明：很早之前学习的基础和高级，网络编程部分，当时没怎么整理。后面整理的。顺序之类可能有出入。重新整理并回顾一遍。

### 1. 变量和变量转换
- 变量：[byte int long short float double boolean char](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%8F%98%E9%87%8F%E5%92%8C%E5%8F%98%E9%87%8F%E8%BD%AC%E6%8D%A2/VariableDemo.java)
- [强制类型转换（大 -> 小）、自动类型转换（小 -> 大)](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%8F%98%E9%87%8F%E5%92%8C%E5%8F%98%E9%87%8F%E8%BD%AC%E6%8D%A2/StrictTypeChange.java)

### 2. 流程控制
- 顺序结构：从上往下按编写顺序执行
- 判断语句： [if - else; if - else if - else](https://github.com/lxf-00/javafile/blob/master/javafiles/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/JudgementStructure.java)
- 选择语句：[switch - case](https://github.com/lxf-00/javafile/blob/master/javafiles/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/SwitchDemo.java)
- 循环语句：
  - [while 语句;不确定循环次数使用](https://github.com/lxf-00/javafile/blob/master/javafiles/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/WhileDemo.java)
  - [do - while 语句;如上](https://github.com/lxf-00/javafile/blob/master/javafiles/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/DoWhileDemo.java)
  - [for 语句](https://github.com/lxf-00/javafile/blob/master/javafiles/%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6/ForDemo.java)
  - while和for语句的区别：
    - 应用场景方面考虑：已知循环次数用for,循环次数是未知的最好用while
    - 从内存角度考虑： 控制条件语句控制的那个变量，在for循环后不能被访问；被回收；而while循环后可以被访问；
### 3. 数组
- [定义、使用](https://github.com/lxf-00/javafile/blob/master/javafiles/%E6%95%B0%E7%BB%84/src/ArrayDemo1.java)
- [遍历与反转](https://github.com/lxf-00/javafile/blob/master/javafiles/%E6%95%B0%E7%BB%84/src/ArrayTraversal.java)
- [数组与方法：作为参数传递或返回值](https://github.com/lxf-00/javafile/blob/master/javafiles/%E6%95%B0%E7%BB%84/src/ArrayAndFunction.java)
- [数组使用中常见异常](https://github.com/lxf-00/javafile/blob/master/javafiles/%E6%95%B0%E7%BB%84/src/ArrayExceptions.java)

### 4. 类与对象、构造方法 封装、继承、多态
- 类：是一组相关属性和行为的集合；对象：是一类事物的具体体现
  - 类是对一类事物的描述，是抽象的。
  - 对象是一类事物的实例，是具体的。
  - 类是对象的模板，对象是类的实体。
- [封装: this封装优化、构造方法封装优化](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/encpasulation/Encapsulation.java)
- [继承: extends继承、super调用父类方法](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/inheritance/Inheritance.java)
- [多态:前提、体现、向上/下转型、instanceof判断](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/polymorphic/polymorphic.java)

### 5. Scanner、Random、ArrayList类、String类
- [Scanner 简单使用](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/scanner/ScannerClass.java)
- [Random 简单使用](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/random/RandomClass.java)
- [ArrayList 简单使用、只能存储引用类型数据](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/arraylist/ArrayListClass1.java)
- [String 常用方法演示](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/string/StringClass.java)

### 6. Arrays类、Math类
- [Arrays类 操作数组 排序 搜索](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/arrays/ArraysExercise.java)
-[Math 类 abs ceil（向上取整） floor(向下取整) round(四舍五入)](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/math/MathClass.java)
### 7. 抽象类static 接口interface
- [抽象类](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/Abstract/AbstractClass.java)
- [接口](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%85%B3%E9%94%AE%E5%AD%97/src/InterfaceImplements/InterfaceKeyWord.java)
- [接口的多实现](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/Interface/Interface.java)
### 8. Object类和常用API
- [Object 类、toString、equals](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/object/ObjecClass.java)
### 9. File类、System类、Wrapper类
- [File类相关](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/File/FileDemo.java)
- [System.currentTimeMillis](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/System/SystemClass.java)
- [Wrapper: 基本类型和包装类对象](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%B1%BB/src/Wrapper/WrapperClass.java)
### 10. 集合： Collection Map
- [常见的数据结构](https://github.com/lxf-00/javafile/blob/master/javafiles/%E9%9B%86%E5%90%88%E6%B3%9B%E5%9E%8B/src/dataStructure/%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E7%AE%80%E4%BB%8B)
- [Collection:简单介绍、单列集合及相关操作](https://github.com/lxf-00/javafile/blob/master/javafiles/%E9%9B%86%E5%90%88%E6%B3%9B%E5%9E%8B/src/collection/CollectionInterface.java)
- [Collection 子接口：list](https://github.com/lxf-00/javafile/blob/master/javafiles/%E9%9B%86%E5%90%88%E6%B3%9B%E5%9E%8B/src/collection/ListDemo.java)
- [Collection 子接口：set](https://github.com/lxf-00/javafile/blob/master/javafiles/%E9%9B%86%E5%90%88%E6%B3%9B%E5%9E%8B/src/collection/SetDemo.java)
- [双列集合Map简单介绍](https://github.com/lxf-00/javafile/blob/master/javafiles/%E9%9B%86%E5%90%88%E6%B3%9B%E5%9E%8B/src/collection/MapDemo.java)
- [Map 子接口：HashMap 存储自定义类型](https://github.com/lxf-00/javafile/blob/master/javafiles/%E9%9B%86%E5%90%88%E6%B3%9B%E5%9E%8B/src/collection/HashMapDemo.java)
- [Collections 集合工具类部分方法](https://github.com/lxf-00/javafile/blob/master/javafiles/%E9%9B%86%E5%90%88%E6%B3%9B%E5%9E%8B/src/Collections/CollectionsDemo.java)

### 11. 遍历Iterator、泛型
- [遍历相关](https://github.com/lxf-00/javafile/blob/master/javafiles/%E9%9B%86%E5%90%88%E6%B3%9B%E5%9E%8B/src/iterator/IteratorInterface.java)
- [泛型](https://github.com/lxf-00/javafile/blob/master/javafiles/%E9%9B%86%E5%90%88%E6%B3%9B%E5%9E%8B/src/generics/GenericsType.java)


### 12. 异常
- [异常体系,异常处理](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%BC%82%E5%B8%B8/src/Exception/ExceptionDemo.java)
- [I/O异常的处理](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%BC%82%E5%B8%B8/src/ExceptionHandling/Handling.java)

### 13. 线程
- [线程相关,多线程方式一：继承Thread](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%A4%9A%E7%BA%BF%E7%A8%8B/src/Thread/ThreadDemo.java)
- [多线程方式二： 实现Runnable接口方式](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%A4%9A%E7%BA%BF%E7%A8%8B/src/Thread/ThreadDemo1.java)
- [线程安全](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%A4%9A%E7%BA%BF%E7%A8%8B/src/Thread/ThreadSafety.java)
- [线程间的通信 wait notify](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%A4%9A%E7%BA%BF%E7%A8%8B/src/ThreadPool/ThreadPoolDemo.java)
- [线程池](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%A4%9A%E7%BA%BF%E7%A8%8B/src/ThreadPool/ThreadPoolDemo1.java)

### 14， 递归
- [递归](https://github.com/lxf-00/javafile/blob/master/javafiles/%E9%80%92%E5%BD%92/src/RecursionDemo.java)

### 15. 字节流、字符流
- [I/O](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%AD%97%E8%8A%82%E6%B5%81%E3%80%81%E5%AD%97%E7%AC%A6%E6%B5%81/src/IO/IO)
- [字节流: 输出流、文件输出流](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%AD%97%E8%8A%82%E6%B5%81%E3%80%81%E5%AD%97%E7%AC%A6%E6%B5%81/src/bytestream/ByteStreamDemo.java)
- [字节流：输入流、文件输入流](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%AD%97%E8%8A%82%E6%B5%81%E3%80%81%E5%AD%97%E7%AC%A6%E6%B5%81/src/bytestream/ByteStreamDemo1.java)
- [字符流：输入流、 FileReader](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%AD%97%E8%8A%82%E6%B5%81%E3%80%81%E5%AD%97%E7%AC%A6%E6%B5%81/src/characterstream/CharacterStreamDemo.java)
- [字符流：输出流、FileWriter](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%AD%97%E8%8A%82%E6%B5%81%E3%80%81%E5%AD%97%E7%AC%A6%E6%B5%81/src/characterstream/CharacterSteamDemo1.java)

### 16. 缓冲流、转换流、序列化流、打印流
- [字节缓冲流: 输入、输出](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%BC%93%E5%86%B2%E6%B5%81%E3%80%81%E8%BD%AC%E6%8D%A2%E6%B5%81%E3%80%81%E5%BA%8F%E5%88%97%E5%8C%96%E6%B5%81/src/bufferedstream/BSDemo.java)
- [字节缓冲流： 输入、输出](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%BC%93%E5%86%B2%E6%B5%81%E3%80%81%E8%BD%AC%E6%8D%A2%E6%B5%81%E3%80%81%E5%BA%8F%E5%88%97%E5%8C%96%E6%B5%81/src/bufferedstream/BSDemo1.java)
- [转换流：编码、解码](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%BC%93%E5%86%B2%E6%B5%81%E3%80%81%E8%BD%AC%E6%8D%A2%E6%B5%81%E3%80%81%E5%BA%8F%E5%88%97%E5%8C%96%E6%B5%81/src/covertedstream/CSDemo.java)
- [序列化流： 序列化](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%BC%93%E5%86%B2%E6%B5%81%E3%80%81%E8%BD%AC%E6%8D%A2%E6%B5%81%E3%80%81%E5%BA%8F%E5%88%97%E5%8C%96%E6%B5%81/src/serialzation/SerializationDemo.java)
- [序列化流： 反序列化](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%BC%93%E5%86%B2%E6%B5%81%E3%80%81%E8%BD%AC%E6%8D%A2%E6%B5%81%E3%80%81%E5%BA%8F%E5%88%97%E5%8C%96%E6%B5%81/src/serialzation/SerialaztionDemo1.java)
- [打印流](https://github.com/lxf-00/javafile/blob/master/javafiles/%E7%BC%93%E5%86%B2%E6%B5%81%E3%80%81%E8%BD%AC%E6%8D%A2%E6%B5%81%E3%80%81%E5%BA%8F%E5%88%97%E5%8C%96%E6%B5%81/src/printstream/PrintStreamDemo.java)

### 17. 网络编程相关
- [网络编程基础](https://github.com/lxf-00/javafile/blob/master/javafiles/NetProgram/src/%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B%E5%9F%BA%E7%A1%80)
- [TCP 客户端](https://github.com/lxf-00/javafile/blob/master/javafiles/NetProgram/src/TCP/ClientTCP.java)
-[TCP 服务端](https://github.com/lxf-00/javafile/blob/master/javafiles/NetProgram/src/TCP/ServerTCP.java)

### 18. 函数式接口
- [函数式编程： Lambda](https://github.com/lxf-00/javafile/blob/master/javafiles/%E5%87%BD%E6%95%B0%E5%BC%8F%E6%8E%A5%E5%8F%A3/src/functioninterface/FunInterface.java)

### 19. Stream流、方法引用
- [Stream 流](https://github.com/lxf-00/javafile/blob/master/javafiles/Stream%E6%B5%81%E3%80%81%E6%96%B9%E6%B3%95%E5%BC%95%E7%94%A8/src/Stream/StreamDemo.java)
- [方法引用](https://github.com/lxf-00/javafile/blob/master/javafiles/Stream%E6%B5%81%E3%80%81%E6%96%B9%E6%B3%95%E5%BC%95%E7%94%A8/src/FunctionReference.java)

### 20. Junit
- [junit4](https://github.com/lxf-00/javafile/tree/master/javafiles/Junit/src)

### 21. 反射
- [知识点](https://github.com/lxf-00/javafile/blob/master/javafiles/reflect/src/%E5%8F%8D%E5%B0%84)
- [获取class对象的三种方法](https://github.com/lxf-00/javafile/blob/master/javafiles/reflect/src/Refect/ReflectDemo1.java)
- [获取成员方法们](https://github.com/lxf-00/javafile/blob/master/javafiles/reflect/src/Refect/ReflectDemo2.java)
-[获取构造方法们](https://github.com/lxf-00/javafile/blob/master/javafiles/reflect/src/Refect/ReflectDemo3.java)
- [获取成员方法们](https://github.com/lxf-00/javafile/blob/master/javafiles/reflect/src/Refect/ReflectDemo4.java)
- [简单案例: properties类的使用](https://github.com/lxf-00/javafile/blob/master/javafiles/reflect/src/Refect/ReflectDemo5.java)

#### ==》 [数据库相关的学习](https://github.com/lxf-00/JavaWeb)
