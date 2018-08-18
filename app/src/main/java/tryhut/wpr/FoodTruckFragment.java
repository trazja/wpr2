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
public class FoodTruckFragment extends Fragment {


    public FoodTruckFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView foodtruckRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_food_truck, container, false);

        String[] foodtruckName = new String[Foodtrucks.foodtrucks.length];
        for (int i = 0; i < foodtruckName.length; i++) {
            foodtruckName[i] = Foodtrucks.foodtrucks[i].getFoodtruckName();
        }

        String[] foodtruckAddress = new String[Foodtrucks.foodtrucks.length];
        for (int i = 0; i < foodtruckAddress.length; i++) {
            foodtruckAddress[i] = Foodtrucks.foodtrucks[i].getFoodtruckAddress();
        }

        String[] foodtruckOpeningHours = new String[Foodtrucks.foodtrucks.length];
        for (int i = 0; i < foodtruckOpeningHours.length; i++) {
            foodtruckOpeningHours[i] = Foodtrucks.foodtrucks[i].getFoodtruckOpeningHours();
        }

        String[] foodtruckWebsite = new String[Foodtrucks.foodtrucks.length];
        for (int i = 0; i < foodtruckWebsite.length; i++) {
            foodtruckWebsite[i] = Foodtrucks.foodtrucks[i].getFoodtruckWebsite();
        }

        int[] imgFoodtruck = new int[Foodtrucks.foodtrucks.length];
        for (int i = 0; i < imgFoodtruck.length; i++) {
            imgFoodtruck[i] = Foodtrucks.foodtrucks[i].getImageResourceFoodtruckId();
        }

        FoodtruckAdapter adapter =
                new FoodtruckAdapter(Foodtrucks.foodtrucks, getContext());
        foodtruckRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        foodtruckRecycler.setLayoutManager(layoutManager);

        return foodtruckRecycler;


    }

}
