package cm.app.it.gasmyr.ardfire.util;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import im.dacer.androidcharts.LineView;

/**
 * Created by gasmyr.mougang on 8/3/17.
 */

public class Utils {
    public static int getARandomValue(int min, int max){
        Random r = new Random();
        return  r.nextInt(max-min) + min;
    }

    public static void buildTemperatureGraph(LineView lineView, int min, int max) {
        ArrayList<String> labels = new ArrayList<>();
        labels.addAll(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"));

        lineView.setDrawDotLine(false);
        lineView.setShowPopup(LineView.SHOW_POPUPS_MAXMIN_ONLY);
        lineView.setBottomTextList(labels);
        lineView.setColorArray(new int[]{Color.BLACK, Color.GREEN, Color.GRAY, Color.CYAN});
        lineView.setDataList(getData(min,max));
    }

    private static ArrayList<ArrayList<Integer>> getData(int min, int max ) {
        ArrayList<ArrayList<Integer>> dataLists = new ArrayList<>();
        ArrayList<Integer> point = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            point.add(Utils.getARandomValue(min,max));
        }
        dataLists.add(point);
        return dataLists;
    }
}
