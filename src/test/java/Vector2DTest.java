import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;

public class Vector2DTest {
    @Test
    public void newVectorShouldHaveZeroLength() {
        Vector2D v1 = new Vector2D(); //action

        //assertiob
        //1e-9 == 0.0000000001 - точность
        Assert.assertEquals(0,v1.length(),1e-9);
    }
    @org.junit.jupiter.api.Test
    public void newVectorShouldHaveZeroX(){
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0,v1.getX(),1e-9);
    }
    @Test
    public void newVectorShouldHaveZeroY(){
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0,v1.getY(),1e-9);
    }
}
