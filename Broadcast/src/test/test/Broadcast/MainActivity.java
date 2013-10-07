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
  public void call(View paramView)
  {
    Intent localIntent = new Intent("android.intent.action.CALL");
    localIntent.setData(Uri.parse("tel:8447056481"));
    startActivity(localIntent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.activity_main);
  }

  public class receive extends BroadcastReceiver
  {
    public receive()
    {
    }

    public void onReceive(Context paramContext, Intent paramIntent)
    {
      String str = paramIntent.getStringExtra("android.intent.extra.PHONE_NUMBER");
      Log.d(receive.class.getSimpleName(), paramIntent.toString() + ", call to: " + str);
      Toast.makeText(paramContext, "Outgoing call catched: " + str, 1).show();
    }
  }
}