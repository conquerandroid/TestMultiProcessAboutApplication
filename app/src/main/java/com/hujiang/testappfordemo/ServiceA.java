package com.hujiang.testappfordemo;

import android.app.Service;
import android.content.Intent;
import android.os.*;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Function:
 * Create date on 15/7/1.
 *
 * @author Conquer
 * @version 1.0
 */
public class ServiceA extends Service {

    public static final String TAG = ServiceA.class.getSimpleName();
    @Override
    public void onCreate() {
//        super.onCreate();
        Log.i(TAG,"onCreate" + "pid：" + android.os.Process.myPid());
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"onStartCommand" + "pid：" + android.os.Process.myPid());
//        return super.onStartCommand(intent, flags, startId);
        return START_NOT_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
