package tryhut.wpr;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class TouristicInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touristic_information);
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TouristicInformationFragment fragment = new TouristicInformationFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.ti_fragment, fragment);
        transaction.commit();
    }
}
