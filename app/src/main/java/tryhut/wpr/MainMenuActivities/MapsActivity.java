package tryhut.wpr.MainMenuActivities;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import io.ticofab.androidgpxparser.parser.GPXParser;
import io.ticofab.androidgpxparser.parser.domain.Gpx;
import io.ticofab.androidgpxparser.parser.domain.Track;
import io.ticofab.androidgpxparser.parser.domain.TrackPoint;
import io.ticofab.androidgpxparser.parser.domain.TrackSegment;
import io.ticofab.androidgpxparser.parser.domain.Route;
import tryhut.wpr.R;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    GPXParser mParser = new GPXParser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng wroclaw = new LatLng(51.132, 16.989);
        mMap.addMarker(new MarkerOptions().position(wroclaw).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(wroclaw, 12));

   //     mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(51.13265, 16.98965), 4));

        Polyline line = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(51.13265, 16.98967), new LatLng(51.13265, 16.98968))
                .width(25)
                .color(Color.BLUE)
                .geodesic(true));


      //  PolylineOptions polylineOptions = new PolylineOptions()
     //           .clickable(true);
     //   Polyline polyline1 = mMap.addPolyline(polylineOptions);


        Gpx parsedGpx = null;
        try {
            InputStream in = getAssets().open("Grobla-Kozanowska.gpx");

            parsedGpx = mParser.parse(in);
        } catch (IOException | XmlPullParserException e) {
            // do something with this exception
            e.printStackTrace();
        }
        if (parsedGpx == null) {

        } else {

            List<Route> routeList = parsedGpx.getRoutes();
            List<Track> trackList = parsedGpx.getTracks();

            Track track = trackList.get(0);
            List<TrackSegment> trackSegmensList = track.getTrackSegments();
            TrackSegment trackSegment = trackSegmensList.get(0);
            List<TrackPoint> trackPointList = trackSegment.getTrackPoints();




            for (int l = 0; l < trackPointList.size(); l++) {
                TrackPoint trackPoint = trackPointList.get(l);
                double latitude = trackPoint.getLatitude();
                double longitude = trackPoint.getLongitude();



            Polyline grobla = mMap.addPolyline(new PolylineOptions().add(
                    new LatLng(trackPoint.getLatitude(), trackPoint.getLongitude()))
                    .width(100)
                    .color(Color.RED)
                    .geodesic(true));
        }

        }

    }

}
