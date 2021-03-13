import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TruePositive {
    @Before
    public void BeforeTrueNegative(){System.out.println("This is a True Positive Test");}
    @Test
    public void test_SqaureRoot() {
        Calculator C = new Calculator();
        assertEquals("True : Square Root of 25 is 5",5.0,C.SquareRoot(25),0.01);
    }

    @Test
    public void test_Factorial() {
        Calculator C = new Calculator();
        assertEquals("True : Factorial of 5 is 120",120.0,C.Factorial(5),0.1);
    }

    @Test
    public void test_NaturalLog() {
        Calculator C = new Calculator();
        assertEquals("True : Natural Log of 7 is ",1.94,C.NaturalLog(7),0.01);
    }

    @Test
    public void test_PoW() {
        Calculator C = new Calculator();
        assertEquals("True: 3 raised to 2 is 9",9.0,C.PoW(3,2),0.01);
    }
}
