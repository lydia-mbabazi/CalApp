import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest2 {

     Calculator calc=new Calculator();
     @Test
     public void testDiv(){
         assertEquals(2.5,calc.div(5,2),1);
     }
 }

