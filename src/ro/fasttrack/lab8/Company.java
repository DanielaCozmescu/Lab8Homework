package ro.fasttrack.lab8;

public class Company implements Homework1 {

    private String reclama;

    public Company(String reclama) {
        this.reclama = reclama;
    }

    @Override
    public String facebook(){
        return "Reclama facebook: " + reclama;
    }

    @Override
    public  String email(){
        return  "Reclama pe email: " + reclama;
    }

    @Override
    public String print(){
        return  "Reclama: " + reclama;
    }

}
