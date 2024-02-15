package com.example.managecalls;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    private static final int Permission_Req_Code = 100;


    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        reqModPer();
    }

    private void reqModPer() {

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.MODIFY_PHONE_STATE) != PackageManager.PERMISSION_GRANTED ||
                ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.MODIFY_PHONE_STATE, Manifest.permission.READ_PHONE_STATE, Manifest.permission.ANSWER_PHONE_CALLS}, Permission_Req_Code);
            Toast.makeText(this, "Permission ", Toast.LENGTH_SHORT).show();

        }
//        else {
//            Toast.makeText(this, "Entering Active mode", Toast.LENGTH_SHORT).show();
//            CallReceiver callReceiver = new CallReceiver();
//            Intent intent = new Intent(TelephonyManager.ACTION_PHONE_STATE_CHANGED);
//            callReceiver.onReceive(this, intent);
//        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == Permission_Req_Code) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }


//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Button actbtn = findViewById(R.id.activate);
//        actbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                activateConnectionService();
//            }
//        });
//    }
//
//    private void activateConnectionService() {
//        Intent intent = new Intent(this, MyConnectionService.class);
//        startService(intent);
//    }

}