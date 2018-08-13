package tryhut.wpr;

/**
 * Created by tryhu on 2018-08-10.9
 */

public class TouristicInformation {

    private String name;
    private String phoneNumber;
    private String openingHours;
    private String address;
    private String email;


    public TouristicInformation(String name, String phoneNumber, String openingHours, String address, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.openingHours = openingHours;
        this.address = address;
        this.email = email;
    }

    public static final TouristicInformation[] touristicInformations = {
            new TouristicInformation("Centrum informacji Turystycznej", "+48713443111",
                    "poniedziałek-niedziela: 9.00 - 19.00", "Rynek 14, 50-101 Wrocław", "info@itwroclaw.pl"),

            new TouristicInformation("Dolnośląska Informacja Turystyczna/Krasnal info", "+48713422898",
                    "codziennie: 10.00-18.00", "Sukiennice 12, 50-107 Wrocław", "wroclaw-info@itwroclaw.pl"),
            new TouristicInformation("Informacja Turystyczna Dworzec Główny PKP", "+48519509337 ",
                    "poniedziałek-niedziela: 8.00 - 20.00 ","ul. Piłsudskiego 105", "it-dworzec@dot.org.pl"),
            new TouristicInformation("Informacja Turystyczna Lotnisko","+48519509336",
                    "poniedziałek-niedziela: 8.00 - 20.00 ","ul. Graniczna 190","it-lotnisko@dot.org.pl"),
            new TouristicInformation("Infocentrum na Ostrowie ","+48511087085",
                    "poniedziałek - piątek 10.00 - 19.00\n" +
                            "sobota 10.00 - 17.00\n" +
                            "niedziela 14.00 - 17.30","plac Katedralny 1","info@infocentrum.wroclaw.pl"),
            new TouristicInformation("Infopunkt Nadodrze ","+48883047310","poniedziałek - piątek 9.00 - 17.00",
                    "ul. Władysława Łokietka 5/1"," infopunkt@lokietka5.pl"),
            new TouristicInformation("Centrum Informacji Turystycznej i Rowerowej\n"+" w Dzielnicy Czterech Wyznań","+ 48713461534",
                    " poniedziałek – niedziela 9.00-20.00","ul. św. Antoniego 8","it@dzielnica4wyznan.info.pl")

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

    public String getEmail() {
        return email;
    }
}
