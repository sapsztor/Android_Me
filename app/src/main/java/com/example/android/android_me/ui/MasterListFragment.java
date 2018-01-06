package com.example.android.android_me.ui;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

/**
 * Created by PSX on 1/6/2018.
 */

public class MasterListFragment extends Fragment {
    
    
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        
        final View rootview = inflater.inflate(R.layout.fragment_master_list, container, false);;
    
        GridView gridview = (GridView) rootview.findViewById(R.id.gridview);
        
        gridview.setAdapter(new ImageAdapter(getActivity()));
        
        return rootview;
    }
    
    public MasterListFragment(){
    
    }
    
    
    public class ImageAdapter extends BaseAdapter {
        private Context mContext;
        private List<Integer> forras = AndroidImageAssets.getAll();
        
        public ImageAdapter(Context c) {
            mContext = c;
        }
        
        public int getCount() {
            return forras.size();
        }
        
        public Object getItem(int position) {
            return null;
        }
        
        public long getItemId(int position) {
            return 0;
        }
        
        // create a new ImageView for each item referenced by the Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) {
                // if it's not recycled, initialize some attributes
                imageView = new ImageView(mContext);
                //imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
                imageView.setAdjustViewBounds(true);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(8, 8, 8, 8);
            } else {
                imageView = (ImageView) convertView;
            }
            
            imageView.setImageResource(forras.get(position));
            return imageView;
        }
        
        // references to our images
        
        
    }
}
