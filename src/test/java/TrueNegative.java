import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class TrueNegative {
    @Before
    public void BeforeTrueNegative(){System.out.println("This is a True Negative Test");}
    @Test
    public void test_SqaureRoot() {
        Calculator C = new Calculator();
        assertNotEquals("False : Square Root of 36 is 2.0",2.0,C.SquareRoot(36),0.01);
    }

    @Test
    public void test_Factorial() {
        Calculator C = new Calculator();
        assertNotEquals("False : Factorial of 3 is 12",12.0,C.Factorial(3),0.01);
    }

    @Test
    public void test_NaturalLog() {
        Calculator C = new Calculator();
        assertNotEquals("False : Natural Log of 8 is 0.94",0.94,C.NaturalLog(8),0.01);
    }

    @Test
    public void test_PoW() {
        Calculator C = new Calculator();
        assertNotEquals("False : 2 raised to 3 is 10",10.0,C.PoW(2,3),0.01);
    }
}
