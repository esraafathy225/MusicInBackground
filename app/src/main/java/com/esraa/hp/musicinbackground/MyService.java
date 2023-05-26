package com.esraa.hp.musicinbackground;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import androidx.annotation.Nullable;

/**
 * Created by WIN7SP1 on 02/04/2018.
 */

public class MyService extends Service {
    MediaPlayer player;

    public MyService() {
        super();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                player= MediaPlayer.create(MyService.this, R.raw.diamonds);
                player.start();
            }
        }).start();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        player.stop();
        super.onDestroy();
    }
}
