package tryhut.wpr.MainMenuActivities;

import tryhut.wpr.R;

/**
 * Created by tryhu on 2018-07-07.
 */

public class Route {
    private String name;
    private String km;
    private String level;
    private int imageResourceId;

    private Route (String name, String km, String level, int imageResourceId) {
        this.name = name;
        this.km = km;
        this.level = level;
        this. imageResourceId = imageResourceId;
    }

    public static final Route[] routes = {
            new Route("Grobla Kozanowska", "22.85", "średnia", R.drawable.front1),
            new Route("Okolice Dworca Głównego PKP", "22.85", "łatwa", R.drawable.front2),
            new Route("Stare Miasto", "22.85", "łatwa", R.drawable.front3),
            new Route("Wielka Wyspa i wieża w Kotowicach", "22.85", "trudna", R.drawable.front4),

    };

    public String getName() {
        return name;
    }

    public String getKm() {
        return km;
    }

    public String getLevel() {
        return level;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }


}
