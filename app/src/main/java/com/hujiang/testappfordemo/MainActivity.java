package com.hujiang.testappfordemo;

import android.content.Intent;
import android.os.AsyncTask;
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

        (new TestMyTask()).excute();


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
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, TestJSActivity.class));
            }
        });



    }




    public class TestAsyncTask extends AsyncTask<String,Integer,Long>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Long doInBackground(String... params) {
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Long s) {
            super.onPostExecute(s);
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
        }

        @Override
        protected void onCancelled(Long s) {
            super.onCancelled(s);
        }
    }

    public class TestMyTask extends TestTask<Integer,String,Long>{

        @Override
        protected void onPreExcute() {
            super.onPreExcute();
        }

        @Override
        protected Long doInBackground(Integer... params) {
            return null;
        }

        @Override
        protected void onProgressUpdate(String s) {
            super.onProgressUpdate(s);
        }

        @Override
        protected void onPostExcute(Long aLong) {
            super.onPostExcute(aLong);
        }

        @Override
        protected void onCanceled() {
            super.onCanceled();
        }

        @Override
        protected void onCanceled(Long aLong) {
            super.onCanceled(aLong);
        }
    }

}
