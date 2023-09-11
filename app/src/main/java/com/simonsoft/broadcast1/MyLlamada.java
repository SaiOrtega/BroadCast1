package com.simonsoft.broadcast1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class MyLlamada extends BroadcastReceiver {
private Context context;

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Acción sobre wifi ", Toast.LENGTH_LONG).show();

    boolean conection = intent.getBooleanExtra("connected",false);

        if (conection) {

            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:2664553747"));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(callIntent);
    }
}
}





