package Package_Calculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by tim_l on 09.01.2017.
 */
public class TestAppWindow {
    private static AppWindow window;

    @BeforeClass
    public static void setUp(){
        window = new AppWindow();
    }

    @AfterClass
    public static void tearDown(){
        window = null;
    }
}
