import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    @Test
    public void getAndIncrementTest(){
        Bins binGroup = new Bins(2,12);

        binGroup.incrementBin(5);

        int x = binGroup.getBins(5);

        Assert.assertEquals(x, 1);
    }
}
