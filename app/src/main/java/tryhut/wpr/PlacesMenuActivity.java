package tryhut.wpr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import tryhut.wpr.PlacesMenuActivities.FoodtruckActivity;
import tryhut.wpr.PlacesMenuActivities.ItActivity;
import tryhut.wpr.PlacesMenuActivities.PlacesActivity;
import tryhut.wpr.PlacesMenuActivities.ServicesActivity;
import tryhut.wpr.PlacesMenuActivities.ViewpointsActivity;
import tryhut.wpr.PlacesMenuActivities.WcActivity;


public class PlacesMenuActivity extends AppCompatActivity {

    @BindView(R.id.placesButton)
    Button placesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_menu);

        ButterKnife.bind(this);

        placesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesIntent = new Intent(PlacesMenuActivity.this, PlacesActivity.class);
                PlacesMenuActivity.this.startActivity(placesIntent);
            }
        });

        Button viewpointsButton = findViewById(R.id.viewpointsButton);
        viewpointsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewpointsIntent = new Intent(PlacesMenuActivity.this, ViewpointsActivity.class);
                PlacesMenuActivity.this.startActivity(viewpointsIntent);
            }
        });

        Button itButton = findViewById(R.id.itButton);
        itButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itIntent = new Intent(PlacesMenuActivity.this, ItActivity.class);
                PlacesMenuActivity.this.startActivity(itIntent);
            }
        });

        Button foodtrucksButton = findViewById(R.id.foodtruckButton);
        foodtrucksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodtruckIntent = new Intent(PlacesMenuActivity.this, FoodtruckActivity.class);
                PlacesMenuActivity.this.startActivity(foodtruckIntent);
            }
        });

        Button wcButton = findViewById(R.id.wcButton);
        wcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wcIntent = new Intent(PlacesMenuActivity.this, WcActivity.class);
                PlacesMenuActivity.this.startActivity(wcIntent);
            }
        });

        Button servicesButton = findViewById(R.id.servicesButton);
        servicesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(PlacesMenuActivity.this, ServicesActivity.class);
                PlacesMenuActivity.this.startActivity(serviceIntent);
            }
        });

    }

}
