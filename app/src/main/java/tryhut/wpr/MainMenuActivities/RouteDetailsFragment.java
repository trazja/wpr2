package tryhut.wpr.MainMenuActivities;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tryhut.wpr.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RouteDetailsFragment extends Fragment {


    public RouteDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView routeDetailsRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_route_details, container, false);

        String[] routeDescriptions = new String [RouteDetails.routeDetails.length];
        for (int i = 0; i < routeDescriptions.length; i++) {
            routeDescriptions[i] = RouteDetails.routeDetails[i].getRouteDetailsDescription();
        }

        int[] photos1 = new int[RouteDetails.routeDetails.length];
        for (int i = 0; i < photos1.length; i++) {
            photos1[i] = RouteDetails.routeDetails[i].getPhoto1ResourceId();
        }
        int[] photos2 = new int[RouteDetails.routeDetails.length];
        for (int i = 0; i < photos2.length; i++) {
            photos2[i] = RouteDetails.routeDetails[i].getPhoto2ResourceId();
        }
        int[] photos3 = new int[RouteDetails.routeDetails.length];
        for (int i = 0; i < photos3.length; i++) {
            photos3[i] = RouteDetails.routeDetails[i].getPhoto3ResourceId();
        }
        int[] photos4 = new int[RouteDetails.routeDetails.length];
        for (int i = 0; i < photos4.length; i++) {
            photos4[i] = RouteDetails.routeDetails[i].getPhoto4ResourceId();
        }
        RouteDetailsAdapter adapter =
                new RouteDetailsAdapter(RouteDetails.routeDetails, getContext());
        routeDetailsRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        routeDetailsRecycler.setLayoutManager(layoutManager);

return routeDetailsRecycler;
    }

}
