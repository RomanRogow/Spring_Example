import org.junit.*;
import org.junit.Assert;

public class Vector2DTest {
    private static Vector2D v1;
    private final double EPS = 1e-9;
    @BeforeClass
    public static void setUpBeforeClass(){
        v1 = new Vector2D();
    }
    @Test
    public void newVectorShouldHaveZeroLength() {
//        Vector2D v1 = new Vector2D(); //action

        //assertiob
        //1e-9 == 0.0000000001 - точность
        Assert.assertEquals(0,v1.length(),EPS);
    }
    @org.junit.jupiter.api.Test
    public void newVectorShouldHaveZeroX(){
//        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0,v1.getX(),EPS);
    }
    @Test
    public void newVectorShouldHaveZeroY(){
//        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0,v1.getY(),EPS);
    }
//    @Test     // Можно и так, но не желательно, т.к. не сможем с точностью определить где именно Баг(если будет)
//    public void newVectorShouldHaveZeroZAndX(){
//        Assert.assertEquals(0,v1.getY(),EPS);
//        Assert.assertEquals(0,v1.getX(),EPS);
//    }
}
