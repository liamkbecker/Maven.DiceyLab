import java.util.ArrayList;

public class Bins {

    private final int minimum;
    private final int maximum;
    ArrayList<Integer> bins;

    public Bins(int minimum, int maximum){
        this.minimum = minimum;
        this.maximum = maximum;
        this.bins = new ArrayList<Integer>();

        for(int i = 0; i < maximum - minimum; i++){
            this.bins.add(0);
        }

    }

    public int getBins(int index){
        return this.bins.get(index - minimum);
    }

    public void incrementBin(int index){
        this.bins.set(index - minimum, this.bins.get(index - minimum) + 1);
    }

    public int getMinimum(){
        return this.minimum;
    }

    public int getSize(){
        return this.bins.size();
    }

}
