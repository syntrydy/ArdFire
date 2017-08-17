package cm.app.it.gasmyr.ardfire.view.breathing;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cm.app.it.gasmyr.ardfire.R;
import cm.app.it.gasmyr.ardfire.util.Utils;
import im.dacer.androidcharts.LineView;

public class BreathingRateFragment extends Fragment {
    private LineView lineView;

    public BreathingRateFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_breathing_rate, container, false);
        lineView = rootView.findViewById(R.id.line_view);
        Utils.buildTemperatureGraph(lineView,785,800);
        return rootView;
    }

}
