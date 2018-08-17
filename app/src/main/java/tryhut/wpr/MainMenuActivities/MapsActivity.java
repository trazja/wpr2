package tryhut.wpr.MainMenuActivities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
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

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnPolylineClickListener {

    private GoogleMap mMap;

    GPXParser mParser = new GPXParser();

    //ciekawe miejsca
    private static final LatLng Ratusz = new LatLng(51.109722, 17.031667);
    private static final LatLng HalaStulecia = new LatLng(51.107222, 17.076944);
    private static final LatLng HalaTargowa = new LatLng(51.1125, 17.04);
    private static final LatLng MuzeumWspolczesne = new LatLng(51.113333, 17.005);
    private static final LatLng ZamekLesnica = new LatLng(51.146383, 16.870611);
    private static final LatLng WiezaWisniowa = new LatLng(51.085278, 17.0175);

    //Informacja turystyczna
    private static final LatLng CiTiR = new LatLng(51.108801, 17.026189);
    private static final LatLng ITLotnisko = new LatLng(51.109973, 16.880748);
    private static final LatLng KrasnalInfo = new LatLng(51.109801, 17.031779);
    private static final LatLng ITZoo = new LatLng(51.105607, 17.076381);
    private static final LatLng ITPkp = new LatLng(51.098649, 17.036418);

    //Foodtrucki
    private static final LatLng PizzaMobile = new LatLng(51.130597, 16.964362);
    private static final LatLng Nienazarty = new LatLng(51.112271, 17.007158);
    private static final LatLng HappyLittleTruck = new LatLng(51.107388, 17.030037);
    private static final LatLng Pasibus = new LatLng(51.100033, 17.027582);
    private static final LatLng GreenBus = new LatLng(51.116764, 17.033111);
    //Wc
    private static final LatLng toaletaWyspaSlodowa = new LatLng(51.116396, 17.039025);
    private static final LatLng toaletaPrzyBulwarze = new LatLng(51.111577, 17.044511);
    private static final LatLng toaletaNaDworcu = new LatLng(51.098994, 17.036643);
    private static final LatLng toaletaNaPlacuStaszica = new LatLng(51.122512, 17.030657);
    private static final LatLng toaletaNaPlacuSolnym = new LatLng(51.109648, 17.029424);
    //Stojaki

    //Punkty widokowe

    private static final LatLng kosciolGarnizonowy = new LatLng(51.111447, 17.030046);
    private static final LatLng mostekPokutnic = new LatLng(51.109609, 17.034670);
    private static final LatLng wiezaKatedry = new LatLng(51.114088, 17.047299);
    private static final LatLng SkyTower = new LatLng(51.094495, 17.019629);
    private static final LatLng wzgorzeGajowickie = new LatLng(51.093611, 16.996667);
    //Stacje naprawy rowerów

    private static final LatLng samoobslugowaStrzegomska = new LatLng(51.113184, 16.995230);
    private static final LatLng samoobslugowaPromenadaStaromiejska = new LatLng(51.107948, 17.040842);
    private static final LatLng samoobslugowaWyszynskiego = new LatLng(51.113510, 17.050759);
    private static final LatLng serwisRowerowyJSR = new LatLng(51.127655, 16.972635);
    private static final LatLng portRowerowySklepISerwis = new LatLng(51.129563, 17.017542);

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
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(wroclaw, 12));

        //     mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(51.13265, 16.98965), 4));
        Marker mRatusz = mMap.addMarker(new MarkerOptions()
                .position(Ratusz)
                .title("Ratusz Wrocławski")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        Marker mHalaStulecia = mMap.addMarker(new MarkerOptions()
                .position(HalaStulecia)
                .title("Hala Stulecia")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        Marker mHalaTargowa = mMap.addMarker(new MarkerOptions()
                .position(HalaTargowa)
                .title("Hala Targowa")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        Marker mMuzeumWspolczesne = mMap.addMarker(new MarkerOptions()
                .position(MuzeumWspolczesne)
                .title("Muzeum Współczesne (dawny bunkier)")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        Marker mZamekLesnica = mMap.addMarker(new MarkerOptions()
                .position(ZamekLesnica)
                .title("Zamek Leśnica")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        Marker mWiezaWisniowa = mMap.addMarker(new MarkerOptions()
                .position(WiezaWisniowa)
                .title("Wieża ciśnień przy al. Wiśniowej")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        //Informacja turystyczna
        Marker mCiTiR = mMap.addMarker(new MarkerOptions()
                .position(CiTiR)
                .title("Centrum Informacji Turystycznej i Rowerowej")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        Marker mITLotnisko = mMap.addMarker(new MarkerOptions()
                .position(ITLotnisko)
                .title("Informacja Turystyczna Port Lotniczy Wrocław")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        Marker mKrasnalInfo = mMap.addMarker(new MarkerOptions()
                .position(KrasnalInfo)
                .title("Informacja Turystyczna KRASNAL INFO")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        Marker mITZoo = mMap.addMarker(new MarkerOptions()
                .position(ITZoo)
                .title("Informacja Turystyczna ZOO")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        Marker mITPkp = mMap.addMarker(new MarkerOptions()
                .position(ITPkp)
                .title("Informacja Turystyczna Dworzec Główny PKP")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        //Foodtrucki

        Marker mPizzaMobile = mMap.addMarker(new MarkerOptions()
                .position(PizzaMobile)
                .title("PizzaMobile")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        Marker mNienazarty = mMap.addMarker(new MarkerOptions()
                .position(Nienazarty)
                .title("NieNaŻarty FoodTruck")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        Marker mHappyLittleTruck = mMap.addMarker(new MarkerOptions()
                .position(HappyLittleTruck)
                .title("Happy Little Truck")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        Marker mPasibus = mMap.addMarker(new MarkerOptions()
                .position(Pasibus)
                .title("Pasibus")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        Marker mGreenBus = mMap.addMarker(new MarkerOptions()
                .position(GreenBus)
                .title("GreenBus")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        //WC

        Marker mtoaletaWyspaSlodowa = mMap.addMarker(new MarkerOptions()
                .position(toaletaWyspaSlodowa)
                .title("Toaleta publiczna na Wyspie Słodowej")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        Marker mtoaletaPrzyBulwarze = mMap.addMarker(new MarkerOptions()
                .position(toaletaPrzyBulwarze)
                .title("Toaleta przy Bulwarze")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        Marker mtoaletaNaDworcu = mMap.addMarker(new MarkerOptions()
                .position(toaletaNaDworcu)
                .title("Toaleta na Dworcu Głównym PKP")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        Marker mtoaletaNaPlacuStaszica = mMap.addMarker(new MarkerOptions()
                .position(toaletaNaPlacuStaszica)
                .title("Toaleta na Placu Staszica")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        Marker mtoaletaNaPlacuSolnym = mMap.addMarker(new MarkerOptions()
                .position(toaletaNaPlacuSolnym )
                .title("Toaleta na Placu Solnym")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        //punkty widokowe

        Marker mkosciolGarnizonowy = mMap.addMarker(new MarkerOptions()
                .position(kosciolGarnizonowy)
                .title("Wieża Kościoła Garnizonowego p.w. św. Elżbiety")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        Marker mmostekPokutnic = mMap.addMarker(new MarkerOptions()
                .position(mostekPokutnic)
                .title("Mostek Pokutnic w Katedrze św. Marii Magdaleny.")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        Marker mwiezaKatedry = mMap.addMarker(new MarkerOptions()
                .position(wiezaKatedry)
                .title("Wieża Katedry św Jana Chrzciciela")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        Marker mSkyTower = mMap.addMarker(new MarkerOptions()
                .position(SkyTower)
                .title("SkyTower")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        Marker mwzgorzeGajowickie = mMap.addMarker(new MarkerOptions()
                .position(wzgorzeGajowickie )
                .title("Wzgórze Gajowickie")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        //serwisy i stacje samoobsługowe

        Marker msamoobslugowaStrzegomska  = mMap.addMarker(new MarkerOptions()
                .position(samoobslugowaStrzegomska )
                .title("Stacja samoobsługowa przy Strzegomskiej")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        Marker msamoobslugowaPromenadaStaromiejska  = mMap.addMarker(new MarkerOptions()
                .position(samoobslugowaPromenadaStaromiejska )
                .title("Stacja samoobsługowa przy Promenadzie Staromiejskiej")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        Marker msamoobslugowaWyszynskiego  = mMap.addMarker(new MarkerOptions()
                .position(samoobslugowaWyszynskiego )
                .title("Stacja samoobsługowa przy ulicy Wyszyńskiego")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        Marker mserwisRowerowyJSR  = mMap.addMarker(new MarkerOptions()
                .position(serwisRowerowyJSR )
                .title("Serwis Rowerowy JSR")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        Marker mportRowerowySklepISerwis  = mMap.addMarker(new MarkerOptions()
                .position(portRowerowySklepISerwis  )
                .title("Port Rowerowy - sklep i serwis")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));


        //parsowanie tras
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

            List<Route> routeListg = parsedGpx.getRoutes();
            List<Track> trackListg = parsedGpx.getTracks();

            Track track = trackListg.get(0);
            List<TrackSegment> trackSegmensList = track.getTrackSegments();
            TrackSegment trackSegment = trackSegmensList.get(0);
            List<TrackPoint> trackPointList = trackSegment.getTrackPoints();


            PolylineOptions poliOptionsg = new PolylineOptions();

            for (int l = 0; l < trackPointList.size(); l++) {
                TrackPoint trackPoint = trackPointList.get(l);
                double latitude = trackPoint.getLatitude();
                double longitude = trackPoint.getLongitude();

                poliOptionsg.add(new LatLng(trackPoint.getLatitude(), trackPoint.getLongitude()));
            }

            Polyline grobla = mMap.addPolyline(
                    poliOptionsg
                            .width(7)
                            .color(Color.RED)
                            .geodesic(true)
                            .clickable(true));
            grobla.setTag("grobla");

        }


        try {
            InputStream in = getAssets().open("pkp.gpx");

            parsedGpx = mParser.parse(in);
        } catch (IOException | XmlPullParserException e) {
            // do something with this exception
            e.printStackTrace();
        }
        if (parsedGpx == null) {

        } else {

            List<Route> routeListp = parsedGpx.getRoutes();
            List<Track> trackListp = parsedGpx.getTracks();

            Track track = trackListp.get(0);
            List<TrackSegment> trackSegmensList = track.getTrackSegments();
            TrackSegment trackSegment = trackSegmensList.get(0);
            List<TrackPoint> trackPointList = trackSegment.getTrackPoints();


            PolylineOptions poliOptionsp = new PolylineOptions();

            for (int l = 0; l < trackPointList.size(); l++) {
                TrackPoint trackPoint = trackPointList.get(l);
                double latitude = trackPoint.getLatitude();
                double longitude = trackPoint.getLongitude();

                poliOptionsp.add(new LatLng(trackPoint.getLatitude(), trackPoint.getLongitude()));
            }

            Polyline pkp = mMap.addPolyline(
                    poliOptionsp
                            .width(7)
                            .color(Color.BLUE)
                            .geodesic(true)
                            .clickable(true));
            pkp.setTag("pkp");

        }


        try {
            InputStream in = getAssets().open("stare_miasto_wielka_wyspa.gpx");

            parsedGpx = mParser.parse(in);
        } catch (IOException | XmlPullParserException e) {
            // do something with this exception
            e.printStackTrace();
        }
        if (parsedGpx == null) {

        } else {

            List<Route> routeLists = parsedGpx.getRoutes();
            List<Track> trackLists = parsedGpx.getTracks();

            Track track = trackLists.get(0);
            List<TrackSegment> trackSegmensList = track.getTrackSegments();
            TrackSegment trackSegment = trackSegmensList.get(0);
            List<TrackPoint> trackPointList = trackSegment.getTrackPoints();


            PolylineOptions poliOptionsS = new PolylineOptions();

            for (int l = 0; l < trackPointList.size(); l++) {
                TrackPoint trackPoint = trackPointList.get(l);
                double latitude = trackPoint.getLatitude();
                double longitude = trackPoint.getLongitude();

                poliOptionsS.add(new LatLng(trackPoint.getLatitude(), trackPoint.getLongitude()));
            }

            Polyline stareMiasto = mMap.addPolyline(
                    poliOptionsS
                            .width(7)
                            .color(Color.GREEN)
                            .geodesic(true)
                            .clickable(true));
            stareMiasto.setTag("stareMiasto");


        }


        try {
            InputStream in = getAssets().open("zachodnie_osiedla.gpx");

            parsedGpx = mParser.parse(in);
        } catch (IOException | XmlPullParserException e) {
            // do something with this exception
            e.printStackTrace();
        }
        if (parsedGpx == null) {

        } else {

            List<Route> routeListZ = parsedGpx.getRoutes();
            List<Track> trackListZ = parsedGpx.getTracks();

            Track track = trackListZ.get(0);
            List<TrackSegment> trackSegmensList = track.getTrackSegments();
            TrackSegment trackSegment = trackSegmensList.get(0);
            List<TrackPoint> trackPointList = trackSegment.getTrackPoints();


            PolylineOptions poliOptionsZ = new PolylineOptions();

            for (int l = 0; l < trackPointList.size(); l++) {
                TrackPoint trackPoint = trackPointList.get(l);
                double latitude = trackPoint.getLatitude();
                double longitude = trackPoint.getLongitude();

                poliOptionsZ.add(new LatLng(trackPoint.getLatitude(), trackPoint.getLongitude()));
            }

            Polyline zachodnieOsiedla = mMap.addPolyline(
                    poliOptionsZ
                            .width(7)
                            .color(Color.rgb(255, 153, 0))
                            .geodesic(true)
                            .clickable(true));

            zachodnieOsiedla.setTag("zachodnieOsiedla");

        }


        try {
            InputStream in = getAssets().open("zawalna.gpx");

            parsedGpx = mParser.parse(in);
        } catch (IOException | XmlPullParserException e) {
            // do something with this exception
            e.printStackTrace();
        }
        if (parsedGpx == null) {

        } else {

            List<Route> routeListZw = parsedGpx.getRoutes();
            List<Track> trackListZw = parsedGpx.getTracks();

            Track track = trackListZw.get(0);
            List<TrackSegment> trackSegmensList = track.getTrackSegments();
            TrackSegment trackSegment = trackSegmensList.get(0);
            List<TrackPoint> trackPointList = trackSegment.getTrackPoints();


            PolylineOptions poliOptionsZw = new PolylineOptions();

            for (int l = 0; l < trackPointList.size(); l++) {
                TrackPoint trackPoint = trackPointList.get(l);
                double latitude = trackPoint.getLatitude();
                double longitude = trackPoint.getLongitude();

                poliOptionsZw.add(new LatLng(trackPoint.getLatitude(), trackPoint.getLongitude()));
            }

            Polyline zawalna = mMap.addPolyline(
                    poliOptionsZw
                            .width(7)
                            .color(Color.rgb(255, 0, 255))
                            .geodesic(true)
                            .clickable(true));


            zawalna.setTag("zawalna");
        }


        googleMap.setOnPolylineClickListener(this);
    }

    @Override
    public void onPolylineClick(Polyline polyline) {
        if (polyline.getTag() == "grobla") {
            Intent intent = new Intent(MapsActivity.this, RouteDetails.class);
        }
    }


}
