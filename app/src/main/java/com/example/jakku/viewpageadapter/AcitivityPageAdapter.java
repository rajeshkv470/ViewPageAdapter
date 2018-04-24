package com.example.jakku.viewpageadapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by jakku on 4/23/2018.
 */

public class AcitivityPageAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater inflater;
    private Integer[] images= {R.drawable.appoinmentimage, R.drawable.backarrow, R.drawable.help_icon, R.drawable.stethoscope};

    public AcitivityPageAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    public Object instantiateItem(ViewGroup container, int position){
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.imageviewer, null);
        ImageView view1 = (ImageView) view.findViewById(R.id.imageView);
        view1.setImageResource(images[position]);


        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;

    }

    public void destroyItem(ViewGroup container, int position, Object object){
        ViewPager viewp = (ViewPager) container;
        View viewnt = (View) object;
        viewp.removeView(viewnt);
    }


}

