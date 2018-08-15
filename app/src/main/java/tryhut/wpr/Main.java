package tryhut.wpr;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import tryhut.wpr.MainMenuActivities.Route;

/**
 * Created by tryhu on 2018-08-15.
 */

public class Main {
    public static void main(final String[] args) {
        List<Route> routes = new ArrayList<Route>();

        Route groblaKozanowska = new Route("Grobla Kozanowska", "22.85", "średnia", R.drawable.front1);
        Route dworzecPKP = new Route("Okolice Dworca Głównego PKP", "22.85", "łatwa", R.drawable.front2);
        Route stareMiasto = new Route("Stare Miasto", "22.85", "łatwa", R.drawable.front3);
        Route kotowice = (new Route("Wielka Wyspa i wieża w Kotowicach", "22.85", "trudna", R.drawable.front4));
        routes.add(groblaKozanowska);
        routes.add(dworzecPKP);
        routes.add(stareMiasto);
        routes.add(kotowice);
    }
}

