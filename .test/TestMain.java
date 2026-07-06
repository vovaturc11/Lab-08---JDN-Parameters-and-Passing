import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestMain {
    @Test
    @DisplayName("8/26/1918")
    public void testCatherineJohnson() {
        Class clazz = null;
        try
        {
            clazz = Class.forName("Main");
        } catch (ClassNotFoundException e)
        {
            fail("No main class found");
        }
        Method method = null;
        try
        {
            method = clazz.getDeclaredMethod("calcJulianDate", int.class, int.class, int.class);
        } catch (NoSuchMethodException e)
        {
            fail("No method named calcJulianDate found with three int arguments");
        }
        try
        {
            assertEquals(2421832, method.invoke(null, new Object[] {8, 26,1918}));
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e)
        {
            fail(e.getCause().getMessage());
        }
    }

    @Test
    @DisplayName("2/8/2021")
    public void testToday() {
        Class clazz = null;
        try
        {
            clazz = Class.forName("Main");
        } catch (ClassNotFoundException e)
        {
            fail("No main class found");
        }
        Method method = null;
        try
        {
            method = clazz.getDeclaredMethod("calcJulianDate", int.class, int.class, int.class);
        } catch (NoSuchMethodException e)
        {
            fail("No method named calcJulianDate found with three int arguments");
        }
        try
        {
            assertEquals(2459254, method.invoke(null, new Object[] {2,8,2021}));
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e)
        {
            fail(e.getCause().getMessage());
        }

    }
}