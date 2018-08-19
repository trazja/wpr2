package tryhut.wpr;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ShareActionProvider;
import android.widget.TextView;

import tryhut.wpr.MainMenuActivities.Route;
import tryhut.wpr.MainMenuActivities.RouteDetailsFragment;

public class RouteDetailsActivity extends AppCompatActivity {

    public static final String EXTRA_ROUTENO = "routeNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_details);


        int routeNo = (Integer)getIntent().getExtras().get(EXTRA_ROUTENO);
        String routeName = Route.routes[routeNo].getName();
        TextView rName = (TextView)findViewById(R.id.routedetalisname);
        rName.setText(routeName);

        String routeKm = Route.routes[routeNo].getKm();
        TextView rkm = (TextView)findViewById(R.id.routedetailskm);
        rkm.setText(routeKm);

        String routeLevel = Route.routes[routeNo].getLevel();
        TextView rlevel =(TextView)findViewById(R.id.routedetailslevel);
        rlevel.setText(routeLevel);

        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_ROUTENO,"routeNo");
        RouteDetailsFragment fragment = new RouteDetailsFragment();
        fragment.setArguments(bundle);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.routedetails_fragment,fragment);
        transaction.commit();
    }
}
