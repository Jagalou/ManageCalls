package com.example.managecalls;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AdminReceiver extends DeviceAdminReceiver {

    public void onEnabled(Context context, Intent intent){

       Toast.makeText(context,"Admin Permission Granted",Toast.LENGTH_SHORT).show();

    }
    public void onDisabled(Context context, Intent intent){

        Toast.makeText(context,"Admin Permission Denied",Toast.LENGTH_SHORT).show();
    }

}
