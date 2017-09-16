package com.shiva.app;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by OM on 15-09-2017.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void killActivities(){
        int pid = android.os.Process.myPid();
        android.os.Process.killProcess(pid);
        System.exit(0);
    }

}
