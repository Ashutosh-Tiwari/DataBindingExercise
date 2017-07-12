package com.example.ashutoshtiwari.databindingexercise;

import android.view.View;
import android.widget.Button;

/**
 * Created by Ashutosh.tiwari on 12/07/17.
 * A Handler class for custom click listeners
 */

public class Handler {
    public void onClick(View view) {
        if (view instanceof Button) {
            int times = Integer.parseInt(view.getTag().toString());
            times += 1;
            ((Button) view).setText("Clicked " + times);
            view.setTag(times);
        }
    }
}
