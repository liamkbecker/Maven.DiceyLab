import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void tossAndSumTest(){
        Dice die = new Dice(1);

        int x = die.tossAndSum();

        for(int i = 0; i < 50; i++) {
            Assert.assertTrue(1 <= x && x <= 6);
            x = die.tossAndSum();
        }
    }
}
