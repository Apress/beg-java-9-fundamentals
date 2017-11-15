// Calc.java
package com.jdojo.utility;

/**
 * A utility class to perform basic calculations on numbers. 
 * All methods in this class are <code>static</code>. It 
 * provides methods to perform addition, subtraction, 
 * multiplication and division.
 * {@index jdojo Visit www.jdojo.com for more info on Beginning Java 9 Fundamentals book!}
 * @author Kishori Sharan  
 * @since Version 1.0
 */
public final class Calc {
    /**
     * Stop someone from instantiating this class. This class is not 
     * meant for instantiation as all its methods are 
     * <code>static</code>.
     */
    private Calc() {
    }

    /**
     * Performs addition on two numbers. It returns the result of 
     * <code> n1 + n2 </code>as an <code>int</code>. If the result 
     * of <code>n1 + n2</code> exceeds the range of the 
     * <code>int</code> data type, it will not return the correct 
     * result. For bigger numbers, use {@link #add(long, long)}. 
     *
     * @param n1 The first number
     * @param n2 The second number
     * @return Returns the value of <code>n1 + n2</code>
     */
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    /**
     * Performs addition on two numbers. It returns the result of 
     * <code>n1 + n2</code> as a <code>long</code>. 
     * 
     * @param n1 The first number
     * @param n2 The second number
     * @return Returns the value of <code>n1 + n2</code>
     */
    public static long add(long n1, long n2) {
        return n1 + n2;
    }
    
    /**
     * Returns the result of <code>n1 - n2</code>. 
     *  
     * @param n1 The first number
     * @param n2 The second number
     * @return Returns the result of <code>n1 - n2</code>
     */
    public static int subtract(int n1, int n2) {
        return n1 - n2;
    }

    /**
     * Returns the result of multiplication of <code>n1</code> and 
     * <code>n2</code>. It may return incorrect result if the value of 
     * the multiplication of <code>n1</code> and <code>n2</code> 
     * exceeds the range of the <code>int</code> data type.
     *  
     * @param n1 The multiplicand 
     * @param n2 The multiplier
     * @return Returns the result of multiplication of 
     *         <code>n1</code> and <code>n2</code>
    */
    public static int multiply(int n1, int n2) {
        return n1 * n2;
    }

    /**
     * Returns the result of integer division of <code>n1</code> by
     * <code>n2</code>.
     * 
     * @param n1 The dividend
     * @param n2 The divisor
     * @return Returns the result of <code>n1 / n2</code>
     * @throws ArithmeticException If <code>n2</code> is zero.
     */
    public static int divide(int n1, int n2) throws ArithmeticException {
        return n1 / n2;
    }
}
