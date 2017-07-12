package com.example.ashutoshtiwari.databindingexercise;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.widget.TextView;

/**
 * Created by Ashutosh.tiwari on 12/07/17.
 * Observable Model Class
 */

public class User extends BaseObservable {
    private String firstname;
    private String lastname;
    private int age;
    private String gender;

    User(String firstname, String lastname, int age, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
    }

    @Bindable
    public String getFirstname() {
        return firstname;
    }

    @Bindable
    public String getLastname() {
        return lastname;
    }

    @Bindable
    public int getAge() {
        return age;
    }

    @Bindable
    public String getGender() {
        return gender;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
        notifyPropertyChanged(BR.firstname);
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
        notifyPropertyChanged(BR.lastname);
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    public void setGender(String gender) {
        this.gender = gender;
        notifyPropertyChanged(BR.gender);
    }

    @BindingAdapter("android:text")
    public static void setText(TextView view, int value) {
        view.setText(Integer.toString(value));
    }

    @InverseBindingAdapter(attribute = "android:text")
    public static int getText(TextView view) {
        return Integer.parseInt(view.getText().toString());
    }
}
