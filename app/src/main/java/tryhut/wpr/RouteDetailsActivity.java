package tryhut.wpr;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import tryhut.wpr.MainMenuActivities.MapsActivity;
import tryhut.wpr.MainMenuActivities.PlacesMenuActivity;
import tryhut.wpr.MainMenuActivities.Route;
import tryhut.wpr.MainMenuActivities.RouteDetails;

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

        int photo1ResourceId = RouteDetails.routeDetails[routeNo].getPhoto1ResourceId();
        ImageView photo1Id = (ImageView)findViewById(R.id.photo1);
        photo1Id.setImageResource(photo1ResourceId);

        int photo2ResourceId = RouteDetails.routeDetails[routeNo].getPhoto2ResourceId();
        ImageView photo2Id = (ImageView)findViewById(R.id.photo2);
        photo2Id.setImageResource(photo2ResourceId);

        int photo3ResourceId = RouteDetails.routeDetails[routeNo].getPhoto3ResourceId();
        ImageView photo3Id = (ImageView)findViewById(R.id.photo3);
        photo3Id.setImageResource(photo3ResourceId);

        int photo4ResourceId = RouteDetails.routeDetails[routeNo].getPhoto4ResourceId();
        ImageView photo4Id = (ImageView)findViewById(R.id.photo4);
        photo4Id.setImageResource(photo3ResourceId);

        String routeDescription = RouteDetails.routeDetails[routeNo].getRouteDetailsDescription();
        TextView rDescription = (TextView)findViewById(R.id.description);
        rDescription.setText(routeDescription);

        Button button = (Button) findViewById(R.id.routedetailshowonmapbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent routeIntent = new Intent(RouteDetailsActivity.this, MapsActivity.class);
                RouteDetailsActivity.this.startActivity(routeIntent);
            }
        });

        Glide.with(this)
            .load(photo1ResourceId)
                .apply(new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).centerCrop()).into(photo1Id);
        Glide.with(this)
            .load(photo2ResourceId)
                .apply(new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).centerCrop()).into(photo2Id);
        Glide.with(this)
            .load(photo3ResourceId)
                .apply(new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).centerCrop()).into(photo3Id);

        Glide.with(this)
                .load(photo4ResourceId)
                .apply(new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).centerCrop()).into(photo4Id);
    }

//
}
