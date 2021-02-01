/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptioncondition;

import javax.management.RuntimeErrorException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Panji Setiawan
 */
public class ExceptionConditionTest {
    
    public ExceptionConditionTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of illegalArgument method, of class ExceptionCondition.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgument() {
        System.out.println("illegalArgument");
        int a = -1;
        int b = -1;
        ExceptionCondition instance = new ExceptionCondition();
        instance.illegalArgument(a, b);
        
    }
    @Test(expected = AssertionError.class)
    public void testAssertion(){
        System.out.println("Assertion");
        ExceptionCondition e = new ExceptionCondition();
        int result = e.jumlah(10, 10);
        int excepted = 15;
        assertEquals(excepted, result);
    }
    @Test(expected = RuntimeException.class)
    public void runtimeError(){
        System.out.println("Runtime error");
        ExceptionCondition e =new ExceptionCondition();
        int a= 10;
        int b= 0;
        e.pembagian(a, b);
    }
    @Test(expected = StackOverflowError.class)
    public void testStackOverflow(){
        System.out.println("Stack Overflow");
        ExceptionCondition e =new ExceptionCondition();
        int a= 10;
        e.stackOverflow(a);
    }
    @Test(expected = ArithmeticException.class)
    public void testMath(){
        System.out.println("Math test");
        ExceptionCondition e =new ExceptionCondition();
        int a= 10;
        int b= 0;
        e.pembagian(a, b);
    }
    @Ignore("test ini sudah diskip")
    @Test
    public void testSkip(){
        System.out.println("skip test ini");
    }
    @Test(timeout = 10)
    public void testTimeout(){
        ExceptionCondition e = new ExceptionCondition();
        e.looping();
    }
    /**
     * Test of main method, of class ExceptionCondition.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ExceptionCondition.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
