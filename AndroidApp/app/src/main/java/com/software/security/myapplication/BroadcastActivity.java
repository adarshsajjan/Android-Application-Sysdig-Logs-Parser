package com.software.security.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class BroadcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);

        //        Intent in = new Intent("com.example.homework");
//        sendBroadcast(in);
//        Log.d("BROADCAST: ", "Broadcast sent successfully!");
    }

    public void sendBroadcastButton(View view) {

        Log.d("<BROADCAST ACTIVITY: >", "Inside broadcast activity");
    }
}