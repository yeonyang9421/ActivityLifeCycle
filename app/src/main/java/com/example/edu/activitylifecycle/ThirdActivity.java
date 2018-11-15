package com.example.edu.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {
    final String tag="States";
    final String ACTITITY="ThirdActivity : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Log.e(tag,ACTITITY + " onCreate()");
    }

    @Override
    protected void onRestart() {
        Log.e(tag,ACTITITY + " onRestart()");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.e(tag,ACTITITY + " onStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e(tag,ACTITITY + " onResume()");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e(tag,ACTITITY + " onPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e(tag,ACTITITY + " onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e(tag,ACTITITY + " onDestroy()");
        super.onDestroy();
    }
}
