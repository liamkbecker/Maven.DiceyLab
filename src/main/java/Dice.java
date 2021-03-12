import java.util.Random;

public class Dice {

    private final int howMany;

    public Dice(int howMany){
        this.howMany = howMany;
    }

    public int tossAndSum(){
        int returnInt = 0;
        Random rand = new Random();
        for(int i = 0; i < howMany; i++){
            returnInt = returnInt + rand.nextInt(6) + 1;
        }
        return returnInt;
    }

}
