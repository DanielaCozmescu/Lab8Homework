package ro.fasttrack.lab8;

public class ING implements Homework2{

    private int money;

    public ING (int money){
        this.money = money;
    }

    @Override
    public String deposit(){
        return "You have just deposited " + money +" LEI to ING. Have a nice day!";
    }

    @Override
    public String withdraw(){
        return "You have just withdrawn " + money +" LEI from ING. Have a nice day!";
    }

}
