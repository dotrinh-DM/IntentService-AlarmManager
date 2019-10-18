package com.dotrinh.intentservicealarmmanager;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

// TODO: 2019-10-18 this class does not work in bg Android 7 above
public class MyTestService extends IntentService {
    public MyTestService() {
        super("MyTestService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i("MyTestService", "Service running");
    }


}