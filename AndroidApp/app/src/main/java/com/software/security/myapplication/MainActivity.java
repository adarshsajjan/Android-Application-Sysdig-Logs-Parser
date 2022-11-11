package com.software.security.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setCurrentTime();

        /*Button broadcastButton = findViewById(R.id.broadcastButton);
        broadcastButton.setOnClickListener(this);*/
    }

    /*@Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.broadcastButton:
                launchBroadcast();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }*/

    public void launchBroadcast(View view) {
        //Create a broadcast receiver that listen to an customized action. You may use any string for your action, such as “com.example.homework”
        //•When the intent is received, the receiver will show the current time and message embedded in the intent
        //•You may use a text view to show the message or a toast text
        //•Create the UI to send the broadcast intent and show the message sent to the receiver

        Intent in = new Intent("com.example.homework");
        sendBroadcast(in);
        Log.d("BROADCAST: ", "Broadcast sent successfully!");
    }

    public void launchService(View view) {

        Intent in = new Intent(this, ServiceActivity.class);
        startActivity(in);
    }

    public void launchContentProvider(View view) {

        Intent in = new Intent(this, ContentProviderActivity.class);
        startActivity(in);
    }

    private void setCurrentTime() {
        View time = findViewById(R.id.timeEditText);
        Calendar calendar;
        calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        String currDateTime = simpleDateFormat.format(calendar.getTime());
        ((TextView)time).setText(currDateTime);
    }


}