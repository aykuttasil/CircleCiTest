package com.aykutasil.circlecitest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.crashlytics.android.Crashlytics

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnFabricTest).setOnClickListener {
            Crashlytics.getInstance().crash()
        }
    }
}
