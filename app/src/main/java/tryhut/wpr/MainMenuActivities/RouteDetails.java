package tryhut.wpr.MainMenuActivities;

import tryhut.wpr.R;

/**
 * Created by tryhu on 2018-08-15.
 */

public class RouteDetails {
    private String routeDetailsDescription;
    private int photo1ResourceId;
    private int photo2ResourceId;
    private int photo3ResourceId;
    private int photo4ResourceId;

    public RouteDetails(String routeDetailsDescription, int photo1ResourceId, int photo2ResourceId, int photo3ResourceId, int photo4ResourceId) {
        this.routeDetailsDescription = routeDetailsDescription;
        this.photo1ResourceId = photo1ResourceId;
        this.photo2ResourceId = photo2ResourceId;
        this.photo3ResourceId = photo3ResourceId;
        this.photo4ResourceId = photo4ResourceId;
    }

    public String getRouteDetailsDescription() {
        return routeDetailsDescription;
    }

    public int getPhoto1ResourceId() {
        return photo1ResourceId;
    }

    public int getPhoto2ResourceId() {
        return photo2ResourceId;
    }

    public int getPhoto3ResourceId() {
        return photo3ResourceId;
    }

    public int getPhoto4ResourceId() {
        return photo4ResourceId;
    }

    public static final RouteDetails[] routeDetails = {
            new RouteDetails("Piękna, złota jesień to idealna okazja na rodzinną wycieczkę rowerową. Łatwa i przyjemna trasa przebiegająca przez wrocławskie parki i lasy: Las Pilczycki, Las Kuźnicki, Park Tysiąclecia czy mało znany, " +
                    "ale równie piękny Park Popowicki o tej porze roku są niesamowicie klimatyczne. Oprócz wrocławskiej flory doświadczymy również trochę miejskich akcentów, takich jak świetnie przygotowana ścieżka rowerowa na ul. Strzegomskiej." +
                    " Kulminacyjnym momentem trasy jest  tytułowa Grobla Kozanowska z komfortową, szutrową nawierzchnią. " +
                    " Dla fanów single tracków najciekawszy docinek znajduje się w Lesie Pilczyckim, gdzie zachęcamy również do krótkiego postoju przy Jazie Rędzin skąd rozprzestrzenia się niesamowity widok na Most Rędziński.&#xd;\n" +
                    "Trasa jest idealna dla każdego, również dla osób które nie jeżdżą na rowerze na co dzień.\n" +
                    "Na odcinku za Lasem Kuźnickim wymagane jest przeniesienie rowerów przez czynne torowisko kolejowe, dlatego prosimy o szczególną uwagę w trym miejscu :)&#xd;\n"
                    , R.drawable.grobla1, R.drawable.grobla2, R.drawable.grobla3, R.drawable.grobla3),
            new RouteDetails("", R.drawable.pkp1, R.drawable.pkp2, R.drawable.pkp3, R.drawable.pkp3)
    };
}
