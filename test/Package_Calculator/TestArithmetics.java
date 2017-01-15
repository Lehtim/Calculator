package Package_Calculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by tim_l on 09.01.2017.
 */
public class TestArithmetics {
    private static Arithmetics arithmetics;

    @BeforeClass
    public static void setUp(){
        arithmetics = new Arithmetics();
    }

    @AfterClass
    public static void tearDown(){
        arithmetics = null;
    }

    @Test
    public void testAdd(){
        arithmetics.changeCodeSystem(0);
        arithmetics.writeNumber("1000");
        arithmetics.writeOperand("+");
        arithmetics.writeNumber("500");
        arithmetics.doWork();
        assertTrue("1500".equals(arithmetics.getStrLHS()));
        arithmetics.clearAll();
    }

    @Test
    public void testSubtract(){
        arithmetics.changeCodeSystem(0);
        arithmetics.writeNumber("1000");
        arithmetics.writeOperand("-");
        arithmetics.writeNumber("500");
        arithmetics.doWork();
        assertTrue("500".equals(arithmetics.getStrLHS()));
        arithmetics.clearAll();
    }

    @Test
    public void testMultiply(){
        arithmetics.changeCodeSystem(0);
        arithmetics.writeNumber("1000");
        arithmetics.writeOperand("*");
        arithmetics.writeNumber("500");
        arithmetics.doWork();
        assertTrue("500000".equals(arithmetics.getStrLHS()));
        arithmetics.clearAll();
    }

    @Test
    public void testDivide(){
        arithmetics.changeCodeSystem(0);
        arithmetics.writeNumber("1000");
        arithmetics.writeOperand("/");
        arithmetics.writeNumber("500");
        arithmetics.doWork();
        assertTrue("2".equals(arithmetics.getStrLHS()));
        arithmetics.clearAll();
    }

    @Test
    public void testBinToDec(){
        arithmetics.changeCodeSystem(1);
        arithmetics.writeNumber("110");
        arithmetics.changeCodeSystem(0);
        assertTrue("6".equals(arithmetics.getStrLHS()));
        arithmetics.clearAll();
    }

    @Test
    public void testDecToBin(){
        arithmetics.changeCodeSystem(0);
        arithmetics.writeNumber("6");
        arithmetics.changeCodeSystem(1);
        assertTrue("110".equals(arithmetics.getStrLHS()));
        arithmetics.clearAll();
    }

    @Test
    public void testHexToDec(){
        arithmetics.changeCodeSystem(2);
        arithmetics.writeNumber("2F");
        arithmetics.changeCodeSystem(0);
        assertTrue("47".equals(arithmetics.getStrLHS()));
        arithmetics.clearAll();
    }

    @Test
    public void testDecToHex(){
        arithmetics.changeCodeSystem(0);
        arithmetics.writeNumber("47");
        arithmetics.changeCodeSystem(2);
        assertTrue("2F".equals(arithmetics.getStrLHS()));
        arithmetics.clearAll();
    }

    @Test
    public void testBinToHex(){
        arithmetics.changeCodeSystem(1);
        arithmetics.writeNumber("10000100");
        arithmetics.changeCodeSystem(2);
        assertTrue("84".equals(arithmetics.getStrLHS()));
        arithmetics.clearAll();
    }

    @Test
    public void testHexToBin(){
        arithmetics.changeCodeSystem(2);
        arithmetics.writeNumber("84");
        arithmetics.changeCodeSystem(1);
        assertTrue("10000100".equals(arithmetics.getStrLHS()));
        arithmetics.clearAll();
    }

    @Test
    public void testSquare(){
        arithmetics.changeCodeSystem(0);
        arithmetics.writeNumber("3");
        arithmetics.square();
        assertTrue("9".equals(arithmetics.getStrLHS()));
        arithmetics.clearAll();
    }

    @Test
    public void testSquareRoot(){
        arithmetics.changeCodeSystem(0);
        arithmetics.writeNumber("9");
        arithmetics.squareRoot();
        assertTrue("3".equals(arithmetics.getStrLHS()));
        arithmetics.clearAll();
    }
}
