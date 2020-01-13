package net.azulite.subtoolapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var locked: Boolean = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.updateButton()

        val lock: Button = findViewById(R.id.lock)
        lock.setOnClickListener {
            this.updateButton()
        }
    }

    fun updateButton() {
        this.locked = !this.locked
        val lock: Button = findViewById(R.id.lock)
        if ( this.locked == true ) {
            window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
            lock.setText( "\uD83D\uDD12" )
        } else {
            window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
            lock.setText( "\uD83D\uDD13" )
        }
    }
}
