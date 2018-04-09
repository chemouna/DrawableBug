package com.mounacheikhna.drawablebug

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        findViewById<Button>(R.id.button).setOnClickListener({
            val actionView = menu?.findItem(R.id.save_item)?.actionView
            val doneButton = actionView!!.findViewById<Button>(R.id.done_button)

            if(counter % 2 == 0) {
                doneButton.isEnabled = true
                doneButton.setOnClickListener({
                    Log.d("TEST", "TEST")
                })
            }
            else {
                doneButton.isEnabled = false
            }
            counter ++

        })
        return super.onPrepareOptionsMenu(menu)
    }

}
