package com.example.ashutoshtiwari.databindingexercise;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Ashutosh.tiwari on 12/07/17.
 * Observable Model Class
 */

public class User extends BaseObservable {
    private String firstname;
    private String lastname;
    private String age;
    private String gender;

    User(String firstname, String lastname, String age, String gender) {
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
    public String getAge() {
        return age;
    }

    @Bindable
    public String getGender() {
        return gender;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
        notifyPropertyChanged(com.example.ashutoshtiwari.databindingexercise.BR.firstname);
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
        notifyPropertyChanged(com.example.ashutoshtiwari.databindingexercise.BR.lastname);
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(com.example.ashutoshtiwari.databindingexercise.BR.age);
    }

    public void setGender(String gender) {
        this.gender = gender;
        notifyPropertyChanged(com.example.ashutoshtiwari.databindingexercise.BR.gender);
    }

    /*@BindingAdapter("android:text")
    public static void setText(TextView view, int value) {
        if (view.getText() != String.valueOf(value)) {
            view.setText(String.valueOf(value));
        }
    }

    @InverseBindingAdapter(attribute = "android:text")
    public static int getText(TextView view) {
        return Integer.parseInt(view.getText().toString());
    }*/
}
