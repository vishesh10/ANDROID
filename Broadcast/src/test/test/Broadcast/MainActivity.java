package test.test.Broadcast;


import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity
{
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
}

	 
	 public void call(View view)
	  {
	    Intent localIntent = new Intent("android.intent.action.CALL");
	    localIntent.setData(Uri.parse("tel:8447056481"));
	    startActivity(localIntent);
	  }
	 
}