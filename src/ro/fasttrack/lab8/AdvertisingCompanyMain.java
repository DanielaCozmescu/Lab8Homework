package ro.fasttrack.lab8;

public class AdvertisingCompanyMain {
    public static void main(String[] args) {
        Facebook redBull = new Facebook("Red Bull gives you wings. ");
        System.out.println(redBull.advertise());
        AdvertisingCompany kFC = new Email("Finger Lickin’ Good. ");
        System.out.println(kFC.advertise());
        AdvertisingCompany mcDonald = new Print("I'm Lovin It! ");
        System.out.println(mcDonald.advertise());

    }
}
