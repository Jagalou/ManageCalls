//package com.example.managecalls;
//
//import android.os.Build;
//import android.telecom.Connection;
//import android.telecom.ConnectionRequest;
//import android.telecom.ConnectionService;
//import android.telecom.PhoneAccountHandle;
//
//public class MyConnectionService extends ConnectionService {
//
//    @Override
//    public Connection onCreateIncomingConnection(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request) {
//        MyConnection incomingConnection = new MyConnection();
//        incomingConnection.setConnectionProperties(Connection.PROPERTY_SELF_MANAGED);
//        incomingConnection.setVideoState(request.getVideoState());
//
//        incomingConnection.accept();
//         return incomingConnection;
//    }
//}
