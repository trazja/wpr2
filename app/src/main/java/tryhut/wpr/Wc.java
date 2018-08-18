package tryhut.wpr;

/**
 * Created by tryhu on 2018-08-15.
 */

public class Wc {

    private String wcName;
    private String wcAddress;
    private String wcOpeningHours;

    public Wc(String wcName, String wcAddress, String wcOpeningHours) {
        this.wcName = wcName;
        this.wcAddress = wcAddress;
        this.wcOpeningHours = wcOpeningHours;
    }

    public String getWcName() {
        return wcName;
    }

    public String getWcAddress() {
        return wcAddress;
    }

    public String getWcOpeningHours() {
        return wcOpeningHours;
    }

    public static final Wc[] wcs = {
            new Wc("Toaleta publiczna","ul. Wita Stwosza","czynny od 10:00 do 18:00"),
            new Wc("Toaleta publicza","pl. Staszica","czynny od 8:00 do 20:00"),
            new Wc("Toaleta publiczna","ul. Drobnera","czynny od 10:00 do 18:00"),
            new Wc("Zadaszony parking rowerowy","ul. Bobuszowska 1", "całodobowy"),
    };
}
