package com.example.ashutoshtiwari.databindingexercise;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by Ashutosh.tiwari on 12/07/17.
 * A Handler class for custom click listeners
 */

public class Handler {
    public void onButtonClick(View view) {
        if (view instanceof Button) {
            int times = Integer.parseInt(view.getTag().toString());
            times += 1;
            ((Button) view).setText("Clicked " + times);
            view.setTag(times);
        }
    }

    public void onRadioButtonChecked(View view, User user) {
        if (view instanceof RadioButton) {
            if (((RadioButton) view).isChecked()) {
                if (view.getTag() == "male") {
                    user.setGender(view.getTag().toString());
                } else {
                    user.setGender(view.getTag().toString());
                }
            }
        }
    }
}