package com.w4developers.library.NotificationUtils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class ShowToast
{
    public static void DeveloperToast(Context context, String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        Log.d("TAG", "DeveloperToast: " + message);
    }
}
