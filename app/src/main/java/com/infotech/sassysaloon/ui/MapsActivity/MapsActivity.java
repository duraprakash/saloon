package com.infotech.sassysaloon.ui.MapsActivity;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.infotech.sassysaloon.R;
import com.infotech.sassysaloon.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sassy Saloon and move the camera
        LatLng sassyLocation = new LatLng(27.683835, 84.433273);
        mMap.addMarker(new MarkerOptions().position(sassyLocation).title("Sassy Saloon"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sassyLocation));
        // zoom in at sassy location
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sassyLocation,16f));
    }
}