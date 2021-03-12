public class Simulation {

    private final int numberOfDice;
    private final int numberOfTosses;
    Dice die;
    Bins binGroup;

    public Simulation(int numberOfDice, int numberOfTosses){
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;

        die = new Dice(numberOfDice);
        binGroup = new Bins(numberOfDice, (numberOfDice * 6));
    }

    public void runSimulation(){
        for(int i = 0; i < numberOfTosses; i++){
            int x = die.tossAndSum();
            binGroup.incrementBin(x);
        }
    }

    public void printResults(){
        for(int i = 0; i < binGroup.getSize(); i++){
            System.out.println("Bin " + (i + binGroup.getMinimum()) + ": " + binGroup.getBins(i + binGroup.getMinimum()));
        }
    }

}
