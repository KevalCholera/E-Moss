package com.example.keval.e_moss;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(26.916418, 75.777640);
//
//        ArrayList<Double> latArray = new ArrayList();
//        latArray.add(26.916418);
//        latArray.add(26.925810);
//        latArray.add(26.836092);
//        latArray.add(26.928137);
//        latArray.add(26.888284);
//        latArray.add(26.922057);
//        latArray.add(26.941132);
//        latArray.add(26.881025);
//        latArray.add(26.874933);
//
//        ArrayList<Double> lonArray = new ArrayList();
//        lonArray.add(75.778338);
//        lonArray.add(75.792735);
//        lonArray.add(75.794057);
//        lonArray.add(75.657550);
//        lonArray.add(75.795695);
//        lonArray.add(75.683619);
//        lonArray.add(75.743351);
//        lonArray.add(75.767172);
//        lonArray.add(75.764415);
//
//        for (int i = 0; i < latArray.size() - 1; i++) {
//
//            sydney = new LatLng(latArray.get(i), lonArray.get(i));
//
//            mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Jaipur"));
//            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
//        }

        LatLng sydney = new LatLng(26.877451, 75.811652);

        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Jaipur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

    }
}
