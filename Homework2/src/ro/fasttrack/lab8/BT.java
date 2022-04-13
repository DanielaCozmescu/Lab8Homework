package ro.fasttrack.lab8;

public class BT implements Homework2{
    private int money;

    public BT (int money){
        this.money = money;
    }

    @Override
    public String deposit(){
        return "You have just deposited " + money +" LEI to BT.";
    }

    @Override
    public String withdraw(){
        return "You have just withdrawn " + money +" LEI from BT.";
    }
}
