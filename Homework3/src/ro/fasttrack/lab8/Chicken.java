package ro.fasttrack.lab8;

public class Chicken implements Homework3{
    private String name;

    public Chicken(String name){
        this.name = name;
    }

    @Override
    public String walk(){
        return name + " the chicken is walking";
    }

    @Override
    public String talk(){
        return "bwak...bwak...bwak!";
    }

    @Override
    public  String eat(){
        return name + " is eating cereal now";
    }

}
