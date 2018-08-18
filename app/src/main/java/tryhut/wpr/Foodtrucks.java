package tryhut.wpr;

import android.os.Bundle;

/**
 * Created by tryhu on 2018-08-18.
 */

public class Foodtrucks {
    private String foodtruckName;
    private String foodtruckAddress;
    private String foodtruckOpeningHours;
    private String foodtruckWebsite;
    private int imageResourceFoodtruckId;

    public Foodtrucks(String foodtruckName, String foodtruckAddress, String foodtruckOpeningHours, String foodtruckWebsite, int imageResourceFoodtruckId) {
        this.foodtruckName = foodtruckName;
        this.foodtruckAddress = foodtruckAddress;
        this.foodtruckOpeningHours = foodtruckOpeningHours;
        this.foodtruckWebsite = foodtruckWebsite;
        this.imageResourceFoodtruckId = imageResourceFoodtruckId;
    }

    public String getFoodtruckName() {
        return foodtruckName;
    }

    public String getFoodtruckAddress() {
        return foodtruckAddress;
    }

    public String getFoodtruckOpeningHours() {
        return foodtruckOpeningHours;
    }

    public String getFoodtruckWebsite() {
        return foodtruckWebsite;
    }

    public int getImageResourceFoodtruckId() {
        return imageResourceFoodtruckId;
    }

    public static final Foodtrucks[] foodtrucks = {
            new Foodtrucks("Pasibus", "Powstańców Śląskich 5", "codziennie 12:00-20:00",
                    "https://pasibus.pl/", R.drawable.pasibus),
            new Foodtrucks("Nienażarty", "Traktatowa 54", "codziennie 11:00-15:00",
                    "https://nienazarty.wroclaw.pl/", R.drawable.nienazarty),
            new Foodtrucks("Greenbus", "Stanisława Dubois 2/1A",
                    "codziennie 12:00-21:00", "https://pl-pl.facebook.com/greenbus.wege/about", R.drawable.greenbus),
            new Foodtrucks("Happy Little Truck", "Kazimierza Wielkiego 39", "codziennie 12:00-23:00",
                    "https://happylittletruck.format.com/", R.drawable.happy_little_truck),
            new Foodtrucks("PizzaMobile", "ul. Bajana 1", "codziennie 12:00-21:00",
                    "https://www.pizzamobile.pl/", R.drawable.pizzamobile)


    };
}
