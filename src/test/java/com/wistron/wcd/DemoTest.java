package com.wistron.wcd; 

import org.junit.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.junit.Assert.*;

/** 
* Demo Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®ÔÂ 11, 2018</pre> 
* @version 1.0 
*/ 
public class DemoTest {
    @BeforeClass
    public static void  beforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("AfterClass");
    }

    @Before
    public void before(){
        System.out.println("Before.");
    }

/** 
* 
* Method: add1() 
* 
*/ 
@Test
public void testAdd1() throws Exception { 
assertEquals(1,Demo.add1());
assertThat(Demo.add1(),not("123"));
assertThat(Demo.add1(),is(1));
assertThat(Demo.add1(),greaterThanOrEqualTo (0));
}

    /**
     *
     * Method: divide()
     *
     */
//    @Ignore
    @Test(expected= java.lang.ArithmeticException.class)
    public void testDivided() throws Exception {
        float z = new Demo().divided(8,0);
    }



    /**
* 
* Method: add2() 
* 
*/ 
@Test
public void testAdd2() throws Exception {
    assertEquals(2,Demo.add2());
}

    @After
    public void after(){
        System.out.println("After.");
    }

} 
