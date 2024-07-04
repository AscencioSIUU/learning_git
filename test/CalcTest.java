import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    @Test
    public void testMultiplicacion() {
        Calc calc= new Calc();
        Assert.assertEquals(6, (calc.multiplicacion(2,3)));
        Assert.assertEquals(9, (calc.multiplicacion(3, 3)));
        Assert.assertEquals(12, (calc.multiplicacion(3,4)));
    }

    @Test
    public void testResta() {
        Calc calc = new Calc();
        Assert.assertEquals(7, calc.resta(9,2));
        Assert.assertEquals(3, calc.resta(7,4));
        Assert.assertEquals(9, calc.resta(20, 11));
    }

    @Test
    public void testSuma() {
        Calc calc = new Calc();
        Assert.assertEquals(3, calc.suma(1,2));
        Assert.assertEquals(5, calc.suma(2,3));
        Assert.assertEquals(8, calc.suma(4,4));

    }
}
