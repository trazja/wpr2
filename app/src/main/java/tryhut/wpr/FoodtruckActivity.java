package tryhut.wpr;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tryhut.wpr.R;

public class FoodtruckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtruck);

        FoodTruckFragment fragment = new FoodTruckFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.foodtruck_fragment, fragment);
        transaction.commit();
    }
}
