package test;

import junit4.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /**
     * 初始化方法
     * 用于资源请求，所有的测试方法在执行前都会执行该方法
     */
    @Before
    public void init(){
        System.out.println("init.....");
    }

    /**
     * 释放资源的方法
     * 在所有测试方法执行完后都会执行该方法
     */
    @After
    public void close(){
        System.out.println("close.....");
    }
    /**
     * 测试add方法
     */
    @Test
    public void testAdd(){
        // 创建对象：Calculator
        Calculator c = new Calculator();
        // 调用add方法
        // int i = 3 / 0;
        int res = c.add(2,4);
        // System.out.println(res);
        // 一般使用断言:Assert.assertEquals()
        Assert.assertEquals(6, res);
    }

    @Test
    public void testSub(){
        Calculator c = new Calculator();
        int res = c.sub(1,2);
        Assert.assertEquals(-1, res);
    }
}
