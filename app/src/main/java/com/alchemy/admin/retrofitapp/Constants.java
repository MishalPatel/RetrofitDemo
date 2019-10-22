package com.alchemy.admin.retrofitapp;

import android.content.Context;
import android.content.SharedPreferences;

public class Constants {
    public static final String PREF_NAME = "CentPref";
    public static final String KEY_ACCESS_TOKEN = "access-token";
    private static final String KEY_ID = "id";
    Context context;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public Constants(Context context) {
        this.context = context;

        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.apply();
    }

    public void putString(String key, String value) {

        editor.putString(key, value);

        editor.apply();

    }

    public String getString(String key) {

        return sharedPreferences.getString(key, null);

    }

    //Method to clear the login data of the application.
    public void clearLoginData() {

        editor.remove(KEY_ID);
        editor.remove(KEY_ACCESS_TOKEN);
        editor.apply();

    }

}
