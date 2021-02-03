package com.example.map_houses_ucu;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

// Add a marker and move the camera
        LatLng Palacpalac = new LatLng(16.126704726370622, 120.53426749034611);
        LatLng Catablan = new LatLng(15.973758120942868, 120.50197230390951);
        LatLng SanNicolas = new LatLng(16.1257740745208, 120.78028552659539);
        LatLng UCU = new LatLng(15.98062441998489, 120.56061828120035);


        mMap.addMarker(new MarkerOptions().position(Palacpalac).title("Marker in Palacpalac Pozorrubio, Pangasinan"));
        mMap.addMarker(new MarkerOptions().position(Catablan).title("Marker in Catablan Urdaneta City, Pangasinan"));
        mMap.addMarker(new MarkerOptions().position(SanNicolas).title("Marker in San Nicolas, Pangasinan"));
        mMap.addMarker(new MarkerOptions().position(UCU).title("Marker in Urdaneta City University"));


        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.126704726370622, 120.53426749034611),

                        new LatLng(16.105156908891956, 120.56568761865354),
                        new LatLng(16.068210410392965, 120.59590001902355),
                        new LatLng(16.043795564612832, 120.5835404006904),
                        new LatLng(15.990996485364507, 120.57392736420898),
                        new LatLng(15.994296836850793, 120.5584778412925),


                        new LatLng(15.98062441998489, 120.56061828120035))
                .width(8)
                .color(Color.GREEN));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.973758120942868, 120.50197230390951),

                        new LatLng(15.977718877520084, 120.50257311868961),
                        new LatLng(15.982092121838157, 120.52600489511292),
                        new LatLng(15.975986056162672, 120.56368456489261),
                        new LatLng(15.979946768645327, 120.56334124216114),

                        new LatLng(15.98062441998489, 120.56061828120035))

                .width(8)
                .color(Color.BLUE));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.1257740745208, 120.78028552659539),

                        new LatLng(16.080254454456497, 120.77891223566942),
                        new LatLng(16.00766539351558, 120.7486998352994),
                        new LatLng(15.983243135755258, 120.69514148918888),
                        new LatLng(16.00436526282387, 120.66767567067069),
                        new LatLng(15.97639446716023, 120.61034077451397),
                        new LatLng(15.9757343419337, 120.57034367052145),
                        new LatLng(15.980025115648424, 120.57051533188721),


                        new LatLng(15.98062441998489, 120.56061828120035))
                .width(8)
                .color(Color.BLACK));


        CameraPosition cameraPosition= new CameraPosition.Builder()
                .target(UCU)
                .zoom(10)
                .build();
        mMap.animateCamera(CameraUpdateFactory. newCameraPosition(cameraPosition));

    }
    }