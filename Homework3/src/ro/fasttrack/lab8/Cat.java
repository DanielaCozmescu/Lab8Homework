package ro.fasttrack.lab8;

public class Cat implements Homework3{

    private String name;

    public Cat (String name){
        this.name = name;
    }

    @Override
    public String walk(){
        return name + " the cat is walking";
    }

    @Override
    public String talk(){
        return "Meooooow!";
    }

    @Override
    public  String eat(){
        return name + " is eating fish now";
    }

}
