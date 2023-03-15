import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    public static final double DELTA = 1e-3;
    private Calculator calcTest;
    @Before
    public void setUp() {
        calcTest= new Calculator();
    }
    @Test
    public void testAdd() {
        double a = 15.0;
        double b = 20.0;
        double expectedResult = 35.0;
        double result = calcTest.addition(a, b);
        Assert.assertEquals(expectedResult, result, 0.00);
    }
    @Test
    public void testSubtract() {
        double a = 25.0;
        double b = 20.0;
        double expectedResult = 5.0;
        double result = calcTest.subtraction(a, b);
        Assert.assertEquals(expectedResult, result, 0.00);
    }

    @Test
    public void testMultiply() {
        double a = 10.0;
        double b = 25.0;
        double expectedResult = 250.0;
        double result = calcTest.multiplication(a, b);
        Assert.assertEquals(expectedResult, result, 0.00);
    }

    @Test
    public void testDivide() {
        double a = 56.0;
        double b = 10.0;
        double expectedResult = 5.6;
        double result = calcTest.division(a, b);
        Assert.assertEquals(expectedResult, result, 0.00005);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        double a = 15;
        double b = 0;
        calcTest.division(a, b);
    }

    @Test
    public void testFactorial() {
        double n = 5.0;
        double expectedResult = 120.0;
        double result = calcTest.factorial(n);
        Assert.assertEquals(expectedResult, result, 0.00005);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegFact() {
        double n = -5.0;
        calcTest.factorial(n);
    }


    @Test
    public void testNatLogA() {
        double a = 5.0;
        double expectedResult = 1.6094379124341003;
        double result = calcTest.natLogA(a);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegNatLogA() {
        double a = 0.0;
        calcTest.natLogA(a);
    }

    @Test
    public void testSqrt() {
        double n = 4.0;
        double expectedResult = 2.0;
        double result = calcTest.sqrt(n);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegSqrt() {
        double n = -3.0;
        calcTest.sqrt(n);
    }

    @Test
    public void testSquared() {
        double n = 4.0;
        double expectedResult = 16.0;
        double result = calcTest.squared(n);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test
    public void testPowN() {
        double a = 4.0;
        double b = 2.0;
        double expectedResult = 16.0;
        double result = calcTest.pow(a, b);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test
    public void testSin() {
        double x = 4.0;
        double expectedResult = -0.7568024953079282;
        double result = calcTest.sin(x);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test
    public void testCos() {
        double x = 4.0;
        double expectedResult = -0.6536436208636119;
        double result = calcTest.cos(x);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test
    public void testTan() {
        double x = 4.0;
        double expectedResult = 1.1578212823495775;
        double result = calcTest.tan(x);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }




//    @Test
//    public void sumTruePositive() {
//        assertEquals("Finding Sum for True positive", 20, calcTest.addition(15,5), DELTA);
//        assertEquals("Finding Sum for True positive", 10, calcTest.addition(20,-10), DELTA);
//    }
//    @Test
//    public void sumFalsePositive() {
//        assertNotEquals("Finding Sum for False positive", 10, calcTest.addition(15,5), DELTA);
//        assertNotEquals("Finding Sum for False positive", 30, calcTest.addition(20,-10), DELTA);
//    }
//
//    @Test
//    public void subtractTruePositive() {
//        assertEquals("Finding difference for True positive", 10, calcTest.subtraction(15,5), DELTA);
//        assertEquals("Finding difference for True positive", 30, calcTest.subtraction(20,-10), DELTA);
//    }
//    @Test
//    public void subtractFalsePositive() {
//        assertNotEquals("Finding difference for False positive", 20, calcTest.multiplication(15,5), DELTA);
//        assertNotEquals("Finding difference for False positive", 10, calcTest.multiplication(20,-10), DELTA);
//    }
//
//    @Test
//    public void multiplyTruePositive() {
//        assertEquals("Finding multiply for True positive", 75, calcTest.multiplication(15,5), DELTA);
//        assertEquals("Finding multiply for True positive", -200, calcTest.multiplication(20,-10), DELTA);
//    }
//    @Test
//    public void multiplyFalsePositive() {
//        assertNotEquals("Finding multiply for False positive", 100, calcTest.multiplication(15,5), DELTA);
//        assertNotEquals("Finding multiply for False positive", 200, calcTest.multiplication(20,-10), DELTA);
//    }
//
//    @Test
//    public void divideTruePositive() {
//        assertEquals("Finding divide for True positive", 3, calcTest.division(15,5), DELTA);
//        assertEquals("Finding divide for True positive", -2, calcTest.division(20,-10), DELTA);
//    }
//    @Test(expected = ArithmeticException.class)
//    public void divideWithZeroTruePositive() {
//        calcTest.division(15,0);
//    }

//    @Test
//    public void divideFalsePositive() {
//        assertNotEquals("Finding divide for False positive", 10, calcTest.division(15,5), DELTA);
//        assertNotEquals("Finding divide for False positive", 30, calcTest.division(20,-10), DELTA);
//    }

}
