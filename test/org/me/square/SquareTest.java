/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.square;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan
 */
public class SquareTest {
    
    public SquareTest() {
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

    /**
     * Test of square method, of class Square.
     */
    @Test
    public void testSquare_input_is_5() {
        System.out.println("square of 5");
        int number = 5;
        int expResult = 25;
        int result = Square.square(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of square method, of class Square.
     */
    @Test
    public void testSquare_input_is_3() {
        System.out.println("square of 3");
        int number = 3;
        int expResult = 9;
        int result = Square.square(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of square method, of class Square.
     */
    @Test
    public void testSquare_input_is_1() {
        System.out.println("square of 1");
        int number = 1;
        int expResult = 1;
        int result = Square.square(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of square method, of class Square.
     */
    @Test
    public void testSquare_input_zero() {
        System.out.println("square of 0");
        int number = 0;
        int expResult = 0;
        int result = Square.square(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of square method, of class Square.
     */
    @Test
    public void testSquare_input_minus_1() {
        System.out.println("square of minus 1");
        int number = -1;
        int expResult = 1;
        int result = Square.square(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of square method, of class Square.
     */
    @Test
    public void testSquare_input_minus_3() {
        System.out.println("square of minus 3");
        int number = -3;
        int expResult = 9;
        int result = Square.square(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of square method, of class Square.
     */
    @Test
    public void testSquare_input_minus_5() {
        System.out.println("square of 5");
        int number = -5;
        int expResult = 25;
        int result = Square.square(number);
        assertEquals(expResult, result);
    }
}
