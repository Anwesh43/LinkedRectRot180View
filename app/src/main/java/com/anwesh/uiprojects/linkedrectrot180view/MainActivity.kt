package com.anwesh.uiprojects.linkedrectrot180view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.rectrot180view.RectRot180View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        RectRot180View.create(this)
    }
}
