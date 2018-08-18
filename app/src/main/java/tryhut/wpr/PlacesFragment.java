package tryhut.wpr;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView placesRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_places, container, false);

        String[] placeName = new String[Places.places.length];
        for (int i = 0; i < placeName.length; i++) {
            placeName[i] = Places.places[i].getPlaceName();
        }

        String[] placeAddress = new String[Places.places.length];
        for (int i = 0; i < placeAddress.length; i++) {
            placeAddress[i] = Places.places[i].getPlaceAddress();
        }

        String[] placeDescription = new String[Places.places.length];
        for (int i = 0; i < placeDescription.length; i++) {
            placeDescription[i] = Places.places[i].getPlaceDescription();
        }

        int[] imgPlaces = new int[Places.places.length];
        for (int i = 0; i < imgPlaces.length; i++) {
            imgPlaces[i] = Places.places[i].getImageResourcePlaceId();
        }

        PlacesAdapter adapter =
                new PlacesAdapter(Places.places, getContext());
        placesRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        placesRecycler.setLayoutManager(layoutManager);

        return placesRecycler;

    }

}
