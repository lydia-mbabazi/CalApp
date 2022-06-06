import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest1  {
    Calculator calc=new Calculator();
     @Test
    public void testAdd()
     {
         assertEquals(4,calc.add(2,2));
     }
     @Test
     public void testSub()
     {
         assertEquals(4,calc.sub(6,2));
     }

}