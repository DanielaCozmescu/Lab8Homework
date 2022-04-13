package ro.fasttrack.lab8;

public class Duck implements Homework3{
    private String name;

    public Duck(String name){
        this.name = name;
    }

    @Override
    public String walk(){
        return name + " the duck is walking";
    }

    @Override
    public String talk(){
        return "quack...quack!";
    }

    @Override
    public  String eat(){
        return name + " is eating cereal now";
    }
}
