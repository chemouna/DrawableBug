package com.mounacheikhna.drawablebug

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class MainActivity : AppCompatActivity() {

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
            doneButton.isEnabled = !doneButton.isEnabled
        })
        return super.onPrepareOptionsMenu(menu)
    }
}
