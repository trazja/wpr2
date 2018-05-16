package tryhut.wpr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tryhut.wpr.MainMenuActivities.MapsActivity;
import tryhut.wpr.MainMenuActivities.PlacesMenuActivity;
import tryhut.wpr.MainMenuActivities.RouteActivity;
import tryhut.wpr.MainMenuActivities.WarningsActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button routeButton = findViewById(R.id.routeButton);
        routeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent routeIntent = new Intent(MainActivity.this, RouteActivity.class);
                MainActivity.this.startActivity(routeIntent);
            }
        });

        Button mapsButton = findViewById(R.id.mapButton);
        mapsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapsIntent = new Intent(MainActivity.this, MapsActivity.class);
                MainActivity.this.startActivity(mapsIntent);
            }
        });

        Button warningButton = findViewById(R.id.warningButton);
        warningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent warningIntent = new Intent(MainActivity.this, WarningsActivity.class);
                MainActivity.this.startActivity(warningIntent);
            }
        });

        Button placesGeneralButton = findViewById(R.id.placesGeneralButton);
        placesGeneralButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesGeneralIntent = new Intent(MainActivity.this, PlacesMenuActivity.class);
                MainActivity.this.startActivity(placesGeneralIntent);
            }
        });
    }
}
