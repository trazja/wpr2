package tryhut.wpr;

/**
 * Created by tryhu on 2018-08-23.
 */

public class Viewpoints {

    private String viewpointName;
    private String viewpointAddress;
    private String viewpointOpeningHours;
    private int imageResourceViewpointId;

    public Viewpoints(String viewpointName, String viewpointAddress, String viewpointOpeningHours, int imageResourceViewpointId) {
        this.viewpointName = viewpointName;
        this.viewpointAddress = viewpointAddress;
        this.viewpointOpeningHours = viewpointOpeningHours;
        this.imageResourceViewpointId = imageResourceViewpointId;
    }

    public String getViewpointName() {
        return viewpointName;
    }

    public String getViewpointAddress() {
        return viewpointAddress;
    }

    public String getViewpointOpeningHours() {
        return viewpointOpeningHours;
    }

    public int getImageResourceViewpointId() {
        return imageResourceViewpointId;
    }

    public static final Viewpoints[] viewpoints = {
            new Viewpoints("Wieża kościoła garnizonowego pw. Św. Elzbiety", "ul. św. Elżbiety 1",
                    "czynna codziennie, godz. 10.00-19.00 \n(nie ma wejść podczas deszczu i burzy)",
                    R.drawable.garnizonowy),
            new Viewpoints("Mostek Pokutnic  w kościele św. Marii Magdaleny", "ul. Szewska 10",
                    "czynny codziennie, godz. 10.00-19.00",
                    R.drawable.mostek_pokutnic),
            new Viewpoints("Taras widokowy w archikatedrze Św. Jana Chrzciciela", "plac Katedralny 18",
                    "poniedziałek - czwartek: 9.30 - 16.30 \n" +
                            "piątek - sobota: 9.30 - 17.00 \n" +
                            "w niedziele i święta: 14.00 - 16.00",
                    R.drawable.katedra),
            new Viewpoints("Punkt widokowy Sky Tower", "ul. Powstańców Śląskich 95",
                    "czynny codziennie, godz. 10.00-16.00",
                    R.drawable.skytower),
            new Viewpoints("Wzgórze Gajowickie (górka Pafawag)", "ul. Krucza",
                    "czynna codziennie",
                    R.drawable.pafawag)

    };

}
