package com.alchemy.admin.retrofitapp;

import android.app.Application;

public class MyPreference extends Application {
    public static MyPreference myPreference;
    public static Constants constants;

    /*For creating the context of the Whole app.*/
    public static MyPreference getInstance() {
        return myPreference;
    }

    /*This is for getting the instance of the MyPreferenceManager class using the context of MyApp App.*/
    public static Constants getPreferenceManager() {
        if (constants == null) {
            constants = new Constants(getInstance());
        }

        return constants;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        myPreference = this;

    }

}
