# javafile
some exercise of learning java

# 主要知识点
Java基础知识，Java高级，网络编程


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
### 10. 
