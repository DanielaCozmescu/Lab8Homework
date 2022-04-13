package ro.fasttrack.lab8;

public class BRD implements Homework2 {
    private int money;

    public BRD (int money){
        this.money = money;
    }

    @Override
    public String deposit(){
        return "--You have just deposited " + money +" LEI to BRD--";
    }

    @Override
    public String withdraw(){
        return "--You have just withdrawn " + money +" LEI from BRD--";
    }
}
