/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Noel.OGorman
 */
public class utilityClassTest {
    
    public utilityClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
  public void concatWords_inputStringsHelloWorld_OutputsOneString() {
        System.out.println("concatWords");
        utilityClass myutilityObj = new utilityClass();
        String result = myutilityObj.concatWords("Hello", ", ", "world", "!");
        String expResult = "Hello, world!";
         assertEquals(expResult, result);
    }

@Test
        public void computeFactorial_Factorial5_Is120(){
          System.out.println("ComputeFactorial 5");
          utilityClass myutilityObj = new utilityClass();
        assertEquals("120",myutilityObj.computeFactorial(5));
    }

//@Test(timeout=1000)
//    public void computeFactorial_ComputesFactorialOfRandomNo_CalculatesFactorialOrTimesOut() {     
//
//    System.out.println("ComputeFactorial with time out");
//    final int factorialOf = 1 + (int) (30000 * Math.random());
//    System.out.println("computing " + factorialOf + '!'+ " =" );
//    System.out.println(utilityClass.computeFactorial(factorialOf));
//    }

    
      @Test (expected=IllegalArgumentException.class)
            public void computeFactorial_FactorialNegative5_ThrowsException() {
            System.out.println("computeFactorial of -5");
            final int factorialOf = -5;
             utilityClass myutilityObj = new utilityClass();
        System.out.println(factorialOf + "! = " + myutilityObj.computeFactorial(factorialOf));
}

    /**
     * Test of computeFactorial method, of class utilityClass.
     */
  
    
}
