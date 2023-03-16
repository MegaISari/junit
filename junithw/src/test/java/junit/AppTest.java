package junit;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AppTest {
    private App jTest = new App();

    @Rule
    public TestName testName = new TestName();

    @Before
    public void setup() {
        jTest = new App();
        System.out.println("Start " + testName.getMethodName());
    }

    @Test
    public void addTest() {
        assertEquals("Error()", -7, App.add(-3, -4));
        assertEquals("Error()", 5, App.add(2, 3));
    }

    @Test
    public void subTest() {
        assertEquals("Error()", 5, App.sub(10, 5));
        assertEquals("Error()", -7, App.sub(-9, -2));
    }

    @Test
    public void returnBooleanTrueTest() {
        boolean shouldReturnTrue = jTest.returnABoolean("Save");
        assertTrue(shouldReturnTrue);
    }

    @Test
    public void returnBooleanFalseTest() {
        boolean shouldReturnFalse = jTest.returnABoolean("Nothing");
        assertFalse(shouldReturnFalse);
    }

    @Test
    public void voidTest() throws IllegalAccessException {
        try {
            jTest.voidCheck("Check");
        } catch (Exception e) {
            fail("It should not throw an exception");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void voidExceptionTest() throws IllegalAccessException {
        jTest.voidCheck("Nothing");
    }
}
