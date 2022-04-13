package ro.fasttrack.lab8;

public class Email implements AdvertisingCompany{
    private String reclama;

    public Email (String reclama){
        this.reclama = reclama;
    }

    @Override
    public String advertise(){
        return reclama + " @Email";
    }

}
