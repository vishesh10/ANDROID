package test.test.Broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class receive extends BroadcastReceiver
{
 
	@Override
	public void onReceive(Context context, Intent intent) {
		String phoneNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
		Log.d(receive.class.getSimpleName(), intent.toString() + ", call to: " + phoneNumber);
		Toast.makeText(context, "Outgoing call catched: " + phoneNumber, Toast.LENGTH_LONG).show();
		//TODO: Handle outgoing call event here
	}



}
