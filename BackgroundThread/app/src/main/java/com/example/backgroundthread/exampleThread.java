package com.example.backgroundthread;

import android.util.Log;
import android.util.Log;

class exampleThread extends Thread{
    private static final String TAG = "MainActivity";
    int seconds;
    exampleThread(int seconds){
        this.seconds = seconds;
    }
    @Override
    public void run() {
        for (int i = 0; i <seconds; i++){
        Log.d(TAG, "onClick: " +i);
            try {
                Thread.sleep(1000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
            }
        }
}

