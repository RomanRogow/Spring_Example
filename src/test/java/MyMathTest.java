import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowExeption(){
        MyMath.divide(1,0);
    }
}
