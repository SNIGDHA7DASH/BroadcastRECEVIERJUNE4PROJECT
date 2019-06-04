package com.example.iteradmin.broadcastrecevierjune4project

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadCastRECEVIER:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val s: String? = intent?.action
        when (s) {
            Intent.ACTION_POWER_CONNECTED -> {
                Toast.makeText(context, "charging", Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_POWER_DISCONNECTED -> {
                Toast.makeText(context, "not charging", Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_AIRPLANE_MODE_CHANGED ->{
                Toast.makeText(context,"airplane_mode",Toast.LENGTH_LONG).show()

            }

        }

    }
}