package tryhut.wpr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ShareActionProvider;
import android.widget.TextView;

import tryhut.wpr.MainMenuActivities.Route;

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




    }
}
