package com.anwesh.uiprojects.linkedrectrot180view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.anwesh.uiprojects.rectrot180view.RectRot180View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view : RectRot180View = RectRot180View.create(this)
        fullScreen()
        view.addOnAnimationListener({createToast("animation ${it + 1} is complete")},
                {createToast("animation ${it + 1} is reset")})
    }

    private fun createToast(msg : String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}

fun MainActivity.fullScreen() {
    supportActionBar?.hide()
    window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
}