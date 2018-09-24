package tryhut.wpr;

/**
 * Created by tryhu on 2018-08-19.
 */


public class Service {

    private String name;
    private String phoneNumber;
    private String openingHours;
    private String address;

    public Service(String name, String phoneNumber, String openingHours, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.openingHours = openingHours;
        this.address = address;
    }

    public static final Service[] services = {
            new Service("Stacja samoobsługowa","-","całodobowo","ul. Strzegomska 4ab"),
            new Service("Stacja samoobsługowa","-","całodobowo","Promenada Staromiejska"),
            new Service("Serwis Rowerowy JSR","603623476","codziennie 13:30 - 18:00","Szybowcowa 18"),
            new Service("Port Rowerowy - Sklep i Serwis","664417568","codziennie 10:00-18:00","Kleczkowska 32")
    };

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public String getAddress() {
        return address;
    }
}
