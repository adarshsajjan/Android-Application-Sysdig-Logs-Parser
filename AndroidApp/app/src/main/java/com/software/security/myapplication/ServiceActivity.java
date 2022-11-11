package com.software.security.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ServiceActivity extends AppCompatActivity {

    private final IBinder mBinder = new LocalBinder();
    private HandlerThread mHandlerThread;
    private Handler mHandler;
    public class LocalBinder extends Binder {
        ServiceActivity getService() {
            return ServiceActivity.this;
        }
    }
    public ServiceActivity() {
    }

    Calendar calendar;
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
    }

    public void startTime(View view) {
        calendar = Calendar.getInstance();

        while(true) {
            View timeView = findViewById(R.id.serviceTime);
            String currDateTime = simpleDateFormat.format(calendar.getTime());
            ((TextView)timeView).setText(currDateTime);
        }
    }

    public void stopTime(View view) {
    }

    private void maintainTimeView(boolean flag) {
        while(flag) {
            View timeView = findViewById(R.id.serviceTime);
            String currDateTime = simpleDateFormat.format(calendar.getTime());
            ((TextView)timeView).setText(currDateTime);
        }
    }
}