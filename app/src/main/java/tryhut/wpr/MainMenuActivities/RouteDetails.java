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

    public static final RouteDetails [] routeDetails = {
            new RouteDetails("Fajna trasa", R.drawable.grobla1,R.drawable.grobla2,R.drawable.grobla3,R.drawable.grobla4 )
    };
}
