package com.example.android.android_me.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;


public class BodyPartFragment extends Fragment {
    
    View rootView;
    
    public BodyPartFragment() {
        // Required empty public constructor
    }
    
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_body_part, container, false);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        
        return rootView;
    }
    
    public void setBodyPart(int bp) {
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(bp));
        
    }
    
}
