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


}
