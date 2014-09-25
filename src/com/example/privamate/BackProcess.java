package com.example.privamate;

import android.app.IntentService;
import android.app.KeyguardManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.view.KeyEvent;

/**
 * Created by prasad on 9/24/14.
 */
public class BackProcess extends Service {

    BroadcastReceiver br;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override


    public void onCreate() {
        super.onCreate();



        IntentFilter filter=new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);

        br=new Receiver();
        registerReceiver(br,filter);


    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);



    }


}
