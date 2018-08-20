package tryhut.wpr;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import tryhut.wpr.MainMenuActivities.Route;
import tryhut.wpr.MainMenuActivities.RouteDetails;

public class RouteDetailsActivity extends AppCompatActivity {

    Context context;
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

        String routeDescription = RouteDetails.routeDetails[routeNo].getRouteDetailsDescription();
        TextView rDescription = (TextView)findViewById(R.id.description);
        rkm.setText(routeKm);

        //Glide.with(context)
//            .load(photo1ResourceId)
//                .apply(new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).centerCrop()).into(photo1Id);
//        Glide.with(context)
//            .load(photo2ResourceId)
//                .apply(new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).centerCrop()).into(photo2Id);
//        Glide.with(context)
//            .load(photo3ResourceId)
//                .apply(new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).centerCrop()).into(photo3Id);
    }

//
}
