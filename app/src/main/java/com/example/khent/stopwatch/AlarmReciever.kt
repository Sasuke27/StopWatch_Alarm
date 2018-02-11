package com.example.khent.stopwatch

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

/**
 * Created by khent on 2/11/2018.
 */
class AlarmReciever: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        Log.d("We are in the receiver!","Yay!")

        val getResult: String = intent!!.getStringExtra("extra")

        val service = Intent(context,RingService::class.java)
        service.putExtra("extra",getResult)
        context!!.startService(service)
    }
}