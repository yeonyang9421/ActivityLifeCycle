package com.example.edu.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String tag="States";
    final String ACTITITY="First Activity : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
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
