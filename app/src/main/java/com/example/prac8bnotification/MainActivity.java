package com.example.prac8bnotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendNotification(View view)
    {
        NotificationCompat.Builder nbuild=new NotificationCompat.Builder(this).setSmallIcon(R.drawable.ic_launcher_background).setContentText("you are notified").setContentTitle("Notify");
        Intent notification=new Intent(this,MainActivity.class);
        PendingIntent contentIntent=PendingIntent.getActivity(this,0,notification,PendingIntent.FLAG_UPDATE_CURRENT);
        nbuild.setContentIntent(contentIntent);
        NotificationManager not=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        not.notify(001,nbuild.build());
    }
}
