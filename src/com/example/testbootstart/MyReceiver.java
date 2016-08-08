package com.example.testbootstart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		//Intent intent = new Intent(MainActivity.class);
		if(arg1.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){
			Intent intent=new Intent(arg0,MainActivity.class);
			intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			arg0.startActivity(intent);
		}
	}

}
