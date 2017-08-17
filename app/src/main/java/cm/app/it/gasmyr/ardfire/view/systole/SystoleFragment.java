package cm.app.it.gasmyr.ardfire.view.systole;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cm.app.it.gasmyr.ardfire.R;
import cm.app.it.gasmyr.ardfire.util.Utils;
import im.dacer.androidcharts.LineView;

public class SystoleFragment extends Fragment {

private LineView lineView;
    public SystoleFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_systole, container, false);
        lineView = rootView.findViewById(R.id.line_view);
        Utils.buildTemperatureGraph(lineView,489,541);
        return rootView;
    }

}
