package com.example.ashutoshtiwari.databindingexercise;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.ashutoshtiwari.databindingexercise.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        user = new User("First Name", "Last Name", "22", "Gender");

        final ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setUser(user);
        activityMainBinding.setHandler(new Handler());
        activityMainBinding.buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityMainBinding.textviewFirstname.setText(activityMainBinding.edittextFirstname.getText().toString());
                activityMainBinding.textviewLastname.setText(activityMainBinding.edittextLastname.getText().toString());
            }
        });

        activityMainBinding.buttonNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}
