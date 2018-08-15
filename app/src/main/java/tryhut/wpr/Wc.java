package tryhut.wpr;

/**
 * Created by tryhu on 2018-08-15.
 */

public class Wc {

    private String wcAddress;
    private String wcOpeningHours;

    public Wc(String wcAddress, String wcOpeningHours) {
        this.wcAddress = wcAddress;
        this.wcOpeningHours = wcOpeningHours;
    }

    public String getWcAddress() {
        return wcAddress;
    }

    public String getWcOpeningHours() {
        return wcOpeningHours;
    }

    public static final Wc[] wcs = {
            new Wc("ul.Wita Stwosza", "czynny od 10:00 do 18:00"),
            new Wc("plac Solny", "czynny od 10:00 do 18:00"),
    };
}
