package com.example.iteradmin.broadcastrecevierjune4project

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val br:BroadcastReceiver? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val br:BroadcastReceiver = MyBroadCastRECEVIER()
        val intentFilter:IntentFilter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        intentFilter.addAction(Intent.ACTION_POWER_CONNECTED)
        intentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED)
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(br,intentFilter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(br)
    }
}
