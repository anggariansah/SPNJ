package com.example.angga.spnjl2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread logoTimer = new Thread() {
            public void run () {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    Log.d ("xception","Exception"+e);
                } finally {
                    startActivity(new Intent(MainActivity.this, Home.class));
                }
                finish();
            }
        };
        logoTimer.start();
    }

}
