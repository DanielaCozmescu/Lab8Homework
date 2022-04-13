package ro.fasttrack.lab8;

public class Mouse implements Homework3{
    private String name;

    public Mouse(String name){
        this.name = name;
    }

    @Override
    public String walk(){
        return name + " the mouse is walking";
    }

    @Override
    public String talk(){
        return "Squeak!";
    }

    @Override
    public  String eat(){
        return name + " is eating cheese now";
    }
}
