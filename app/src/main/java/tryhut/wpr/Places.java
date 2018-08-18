package tryhut.wpr;

/**
 * Created by tryhu on 2018-08-18.
 */

public class Places {
    private String placeName;
    private String placeAddress;
    private String placeDescription;
    private int imageResourcePlaceId;


    public Places(String placeName, String placeAddress, String placeDescription, int imageResourcePlaceId) {
        this.placeName = placeName;
        this.placeAddress = placeAddress;
        this.placeDescription = placeDescription;
        this.imageResourcePlaceId = imageResourcePlaceId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public int getImageResourcePlaceId() {
        return imageResourcePlaceId;
    }

    public static final Places[] places = {
            new Places("Stary Ratusz we Wrocławiu", "Rynek Ratusz 1",
                    "Późnogotycki budynek na wrocławskim Rynku, jeden z najlepiej zachowanych historycznych ratuszy w Polsce, " +
                            "zarazem jeden z głównych zabytków architektonicznych Wrocławia.", R.drawable.rynek3),
            new Places("Hala Stulecia", "ul. Wystawowa 1",
                    "hala widowiskowo-sportowa we Wrocławiu, na Zalesiu, w parku Szczytnickim, ekspresjonistyczna, wzniesiona w latach 1911–1913 według projektu Maxa Berga.\n" +
                            "\n" +
                            "W 2006 roku hala została uznana za obiekt światowego dziedzictwa UNESCO. " +
                            "Wpisana do rejestru zabytków w 1962 oraz ponownie w 1977, wraz z zespołem architektonicznym obejmującym m.in. Pawilon Czterech Kopuł, Pergolę i Iglicę", R.drawable.hala_stulecia2),
            new Places("Hala Targowa", "ul. Piaskowa 17",
                    "Setki stoisk, kolorów i świeżych produktów. Gwar rozmów i pełne skarbów architektury wnętrze.  Zabytkowa Hala Targowa przy ul. Piaskowej od ponad stu lat zachwyca swoją magią.", R.drawable.targowa),
            new Places("Muzeum Współczesne Wrocław", "pl. Strzegomski 2a",
                    "Cylindryczny wolnostojący schron przeciwlotniczy, w którym mieści się siedziba Muzeum Współczesnego Wrocław, został wybudowany w 1942 roku, według projektu znanego wrocławskiego architekta Richarda Konwiarza. To największy spośród kilku powstałych w tamtym czasie naziemnych schronów przeciwlotniczych dla ludności cywilnej. Wszystkie otrzymały bardzo interesującą formę architektoniczną, m.in. po to, by zamaskować ich prawdziwą funkcję. Pozostałe znajdują się przy ul. Stalowej, Ładnej i Ołbińskiej.",
                    R.drawable.mmw),
            new Places("Zamek w Leśnicy", "pl. Świętojański 1",
                    "Zamek jest budowlą murowaną z cegły, tynkowaną, dwuskrzydłową, trójkondygnacyjną, podpiwniczoną. Wokół pałacu znajduje fosa z tworzącymi taras fortyfikacjami bastejowymi z ambrazurami. W piwnicach znajdują się relikty zamku z 1271 roku.", R.drawable.lesnica),
            new Places("Wieża ciśnień przy alei Wiśniowej", "ul. Sudecka 125A",
                    "Wieża ma 62 m wysokości, 20 m szerokości i 13 poziomów. W środku są dwie windy. Na samej górze jest punkt widokowy. Powstała w latach 1903-1904 według projektu Karla Klimma.", R.drawable.wieza_cisnien_wisniowa)

    };
}
