package com.mounacheikhna.drawablebug

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
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
            //doneButton.isEnabled = !doneButton.isEnabled
            counter ++
            if(counter in 7..11){
                doneButton.isEnabled = !doneButton.isEnabled
            } else doneButton.isEnabled = counter !in 12..16
        })
        return super.onPrepareOptionsMenu(menu)
    }
}
