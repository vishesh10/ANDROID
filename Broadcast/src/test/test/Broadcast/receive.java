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
  public void call(View paramView, Context paramContext)
  {
    Intent localIntent = new Intent("android.intent.action.CALL");
    localIntent.setData(Uri.parse("tel:8447056481"));
    paramContext.startActivity(localIntent);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("android.intent.extra.PHONE_NUMBER");
    Log.d(receive.class.getSimpleName(), paramIntent.toString() + ", call to: " + str);
    Toast.makeText(paramContext, "Outgoing call catched: " + str, 1).show();
  }
}
