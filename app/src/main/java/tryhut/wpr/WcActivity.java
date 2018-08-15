package tryhut.wpr;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import tryhut.wpr.R;

public class WcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wc);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WcFragment fragment = new WcFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.wc_fragment, fragment);
        transaction.commit();
    }
}
