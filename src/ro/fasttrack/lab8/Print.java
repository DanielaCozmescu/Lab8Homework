package ro.fasttrack.lab8;

public class Print implements AdvertisingCompany{
    private String reclama;

    public Print (String reclama){
        this.reclama = reclama;
    }

    @Override
    public String advertise(){
        return reclama + " *Print";
    }

}
