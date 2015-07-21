package com.hujiang.testappfordemo;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;

import java.util.List;

/**
 * Function:
 * Create date on 15/7/1.
 *
 * @author Conquer
 * @version 1.0
 */
public class MyApplication extends Application {

    public static final String TAG = MyApplication.class.getSimpleName();
    private String mProcessName;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate" + "pid" + android.os.Process.myPid());

        mProcessName = getCurrentProcessName(this);
        Log.i(TAG, "onCreate" + "getProcessName：" + mProcessName);
        Log.i(TAG, "init_all_process");
        if(TextUtils.equals(mProcessName, getPackageName())){
            Log.i(TAG, "init_main_process");
         } else if(TextUtils.equals(getProcessName(this, android.os.Process.myPid()), "com.hujiang.test.servicea")){
            Log.i(TAG, "init_a_process");
         }else if(TextUtils.equals(getProcessName(this, android.os.Process.myPid()), "com.hujiang.test.servicec")){
            Log.i(TAG, "init_c_process");
         }
//        startService();
    }

    public void startService(){
        startService(new Intent(this, ServiceA.class));
        startService(new Intent(this, ServiceB.class));
        startService(new Intent(this, ServiceC.class));
        startService(new Intent(this, ServiceD.class));
    }
    @Nullable
    public static String getProcessName(Context context, int pid){
        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> runningApps = am.getRunningAppProcesses();
        if (runningApps != null && !runningApps.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo procInfo : runningApps) {
                if (procInfo.pid == pid) {
                    return procInfo.processName;
                }
            }
        }
        return null;
    }

    private String getCurrentProcessName(Context context) {
        int pid = android.os.Process.myPid();
        ActivityManager mActivityManager = (ActivityManager) context
                .getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningAppProcessInfo appProcess : mActivityManager
                .getRunningAppProcesses()) {
            if (appProcess.pid == pid) {
                return appProcess.processName;
            }
        }
        return null;
    }
}
