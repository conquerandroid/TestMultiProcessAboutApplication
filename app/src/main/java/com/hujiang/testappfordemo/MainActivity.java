package com.hujiang.testappfordemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    private Intent mServiceA;
    private Intent mServiceB;
    private Intent mServiceC;
    private Intent mServiceD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mServiceA = new Intent(MainActivity.this.getApplicationContext(), ServiceA.class);
                startService(mServiceA);
                mServiceB = new Intent(MainActivity.this.getApplicationContext(), ServiceB.class);
                startService(mServiceB);
                mServiceC = new Intent(MainActivity.this.getApplicationContext(), ServiceC.class);
                startService(mServiceC);
                mServiceD = new Intent(MainActivity.this.getApplicationContext(), ServiceD.class);
                startService(mServiceD);

            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                     stopService(mServiceA);
                     stopService(mServiceB);
                     stopService(mServiceC);
                     stopService(mServiceD);
            }
        });
    }

}
