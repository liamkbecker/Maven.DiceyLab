import java.util.ArrayList;

public class Bins {

    private final int minimum;
    private final int maximum;
    ArrayList<Integer> bins;

    public Bins(int minimum, int maximum){
        this.minimum = minimum;
        this.maximum = maximum;
        this.bins = new ArrayList<Integer>(maximum - minimum + 1);
    }

}
