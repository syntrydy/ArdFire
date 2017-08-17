package cm.app.it.gasmyr.ardfire.view.temperature;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cm.app.it.gasmyr.ardfire.R;
import cm.app.it.gasmyr.ardfire.util.Utils;
import im.dacer.androidcharts.LineView;


public class TemperatureFragment extends Fragment {
    private LineView lineView;
    private int[] colorArray = {Color.parseColor("#922B21"),Color.parseColor("#34495E"),Color.parseColor("#839192")};


    public TemperatureFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_temperature, container, false);
        lineView = rootView.findViewById(R.id.line_view);
        lineView.setColorArray(colorArray);
        lineView.setDrawDotLine(true);
        Utils.buildTemperatureGraph(lineView,33,40);
        return rootView;
    }

}
