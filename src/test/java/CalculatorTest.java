import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lywar on 02.08.2017.
 */
public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calc = new Calculator();
        calc.add(1 , 2 );
        assertEquals(3, calc.getResult());
    }

    @Test(expected = MyException.class)
    public void divException() throws MyException {
        Calculator calc = new Calculator();
        calc.div();
        assertEquals(3, calc.getResult());
    }
    @Test
    public void multi(){
        Calculator calc = new Calculator();
        calc.multi(1,2,3);
        assertEquals(6, calc.getResult());
    }

    @Test
    public void sub(){
        Calculator calc = new Calculator();
        calc.sub(10,2,3);
        assertEquals(5, calc.getResult());
    }

    @Test
    public void div() throws MyException {
        Calculator calc = new Calculator();
        calc.div(9,3);
        assertEquals(3, calc.getResult());
    }
    @Test(expected = IllegalArgumentException.class)
    public void divRuntimeException() throws MyException {
        Calculator calc = new Calculator();
        calc.div(9,0);
        assertEquals(3, calc.getResult());
    }
}