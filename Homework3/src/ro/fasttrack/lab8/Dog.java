package ro.fasttrack.lab8;

public class Dog implements Homework3{

    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public String walk(){
        return name + " the dog is walking";
    }

    @Override
    public String talk(){
        return "Woof! Woof!";
    }

    @Override
    public  String eat(){
        return name + " is eating bones now";
    }

}
