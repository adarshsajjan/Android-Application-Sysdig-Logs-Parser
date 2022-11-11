package com.software.security.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BroadcastActivityReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.d("RECEIVER: ", "Inside Broadcast Receiver");
        System.out.println("HEHEHEHEHEHEEH");
//        throw new UnsupportedOperationException("Not yet implemented");
    }
}