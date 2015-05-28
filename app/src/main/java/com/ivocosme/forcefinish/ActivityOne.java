package com.ivocosme.forcefinish;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class ActivityOne extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Logging...", "Entering activity one...");
        startActivity(new Intent(this, ActivityTwo.class));
        //Uncomment the line below to keep application from restarting
        //finish();
    }
}
