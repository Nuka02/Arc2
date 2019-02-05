package com.arcproject.arcriderapp.Helper;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustominfoWindow implements GoogleMap.InfoWindowAdapter {

    View myView;

    public CustominfoWindow(Context context) {
        myView = LayoutInflater.from(context)
                .inflate(R.layout.custom_rider_info_window, null);

    }

    @Override
    public View getInfoWindow(Marker marker) {
        TextView txtPickupTitle = ((TextView)myView.findViewById(R.id.txtPickupInfo);
        txtPickupTitle.setText(marker.getTitle());

        TextView txtPickupSnippet = ((TextView)myView.findViewById(R.id.txtPickupSnippet);
        txtPickupTitle.setText(marker.getSnippet());

        return myView;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
