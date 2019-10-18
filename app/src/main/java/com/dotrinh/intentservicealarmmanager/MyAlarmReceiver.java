package com.dotrinh.intentservicealarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyAlarmReceiver extends BroadcastReceiver {
    public static final int REQUEST_CODE = 12345;
    public static final String ACTION = "com.dotrinh.intentservicealarmmanager";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: 2019-10-18 old and new os
        Log.i("MyAlarmReceiver", "onReceive running");
        MyJobIntentService.enqueueWork(context, new Intent());
    }

    //https://stackoverflow.com/questions/46445265/android-8-0-java-lang-illegalstateexception-not-allowed-to-start-service-inten
}