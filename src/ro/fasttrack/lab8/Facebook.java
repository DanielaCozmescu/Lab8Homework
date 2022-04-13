package ro.fasttrack.lab8;

public class Facebook implements AdvertisingCompany {

    private String reclama;

    public Facebook (String reclama){
        this.reclama = reclama;
    }

    @Override
    public String advertise(){
        return reclama + " #Facebook";
    }

}
